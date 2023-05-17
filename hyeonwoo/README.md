##  매주 과제
> 백준  단계별로 풀어보기

-
## DFS / BFS
> 재귀함수로 DFS 를 구현하면 컴퓨터 시스템 동작 특성상 수행시간이 느려질 수 있음 <br/>
> 많은 연산을 필요로 할 때 DFS(Stack) 보다는 BFS(Queue) 구현이 조금 더 빠르다.


<br>

## 정렬
> 선택 정렬, 삽입 정렬의 경우 시간 복잡도가 O(N**2)
<hr/>

## BinarySearch
> 퀵 정렬과 비슷. 일반적인 경우 n*log(n) 의 시간 복잡도
> 

## 다이나믹프로그래밍
    1. 다이나믹 프로그래밍 문제인지 확인 (완전 탐색으로 풀수 없을 경우)
    2. 우선 재귀로 효율성 떨어지는 완전탐색으로 구현
    3. 작은 문제가 큰 문제를 푸는데 쓰일것같다면 코드 개선
    
<hr/>

## 백준 못푼 문제

###  1654 랜선자르기 & 1072 게임
     upper/lower bound 구현해야함

### _1339_단어수학 - 미결
     예제입력은 다 통과
     예외 케이스를 모르겠음


<hr/>

##   에러 처리

<hr>

### _2805_ 나무자르기 (이진탐색) &
    upperbound / int cnt -> long cnt
    int 로 할 경우 숫자 초과되면 음수를 반환

### _10816_숫자카드2 (이진탐색)
    upperbound 메서드는 target 보다 큰 수의 인덱스 반환

### _18870_좌표압축 (정렬)
    시간초과 => 출력 시에  println 말고 BufferedWriter, StringBuilder 사용하면 됨
    unsupportedoperationexception
      => List.copyOf(참조) 한 List 는 Collections.sort 안됨

    Integer VS Integer 는 equals 써야함
      =>  `==` 쓰면 참조값을 가져와서 다음 인덱스로 넘어감

### _1181_단어정렬 (정렬) - 중복 제거 / 정렬
      Set으로 중복 제거 => List 형변환 => sort
```java
class set{
    public static void main(String[] args) {
    Set<String> set = new HashSet<>();
    set.add("data");
    List<String> list = new ArrayList<>(set);
        Collections.sort(list, new Comparator<String>(){
            // Comparator 구현
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }
                return o1.length() - o2.length();
            }
         });
    }
}
```


### _10610_30 런타임 에러 NumberFormatException - 해결
    - String 으로 출력해야 함 
    - 10의 배수가 아닐때에도 -1 을 출력하게 해야 함
### _1541_잃어버린괄호 index 에러
    - test case 마다 배열 크기가 다르므로 예외처리 line 30
### _11047_동전0
    - 동전하나로 딱 나누어 떨어질때 예외 처리 line 24
### _1931_회의실 배정
    - Comparator
