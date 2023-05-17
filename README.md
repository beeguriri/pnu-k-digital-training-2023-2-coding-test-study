# 부산대학교 K-Digital Training 2023-2 Coding Test Study

<br/>

## Week07 과제 
### [백준 동적계획법1 단계별로 풀어보기](https://www.acmicpc.net/step/16)

<br /> 

### Sync fork하고 PR 보내주세요!!

<br />

> 교재 
- 이것이 취업을 위한 코딩 테스트다 with 파이썬(한빛미디어 나동빈 지음)
- [유튜브 채널 동빈나](https://www.youtube.com/@dongbinna)
- [교재 Java 소스코드(ndb796/python-for-coding-test)](https://github.com/ndb796/python-for-coding-test)

<br />

> 플랫폼
- [백준](https://www.acmicpc.net/)
- [프로그래머스](https://programmers.co.kr/)

<br />

## 이번 주 정기 스터디 시간에 풀 문제
##### 매주 화요일 업데이트!


<br />

## 이번 주 과제 
> 백준 
- 다이나믹프로그래밍
> 프로그래머스
- Lv.1 하루 2문제 

<br />

## 4월의 목표
- 교재 - PART 02 한 chapter씩 
- 백준 - 교재 파트 따라서 단계별로 풀어보기 진행
- 프로그래머스 - Lv.1 하루 2문제

<br />

## 진행 상황
<table>
 <tr>
    <td>진행 기간</td>
    <td>2023.03.30 ~</td>
  </tr>
  <tr>
    <td>정기 스터디 시간</td>
    <td>매주 화요일 18:00 ~ 20:00 [2h]</td>
  </tr>
</table>

<br />

|주차|날짜|교재|백준|
|---|---|---|---|
|Week00|2023.03.30|OT| |
|Week01|2023.04.04 ~ 2023.04.10|03 그리디|그리디 알고리즘|
|Week02|2023.04.11 ~ 2023.04.17|06 정렬|정렬|
|Week03|2023.04.18 ~ 2023.04.24|07 이진 탐색|이분 탐색|
|Week04|2023.04.25 ~ 2023.05.01|중간 점검|그리디, 정렬, 이분 탐색|
|Week05|2023.05.02 ~ 2023.05.08|05 DFS/BFS|그래프와 순회|
|Week06|2023.05.09 ~ 2023.05.15|08 다이나믹 프로그래밍|동적 계획법1|
|Week07|2023.05.16 ~ 2023.05.22|08 다이나믹 프로그래밍|동적 계획법1|

<br/>

## 진행 방식
- 정기 스터디 시간 전까지 유튜브 강의 보기
- 교재 내용 코딩하면서 이해하기 -> 자신의 Repository에 코드 올리기
- 과제로 나온 문제 중 이해 안되는 문제 같이 풀어보기
- 정기 스터디 시간에 1 ~ 2문제 각자 풀기
- 다 푼 후 자신이 푼 알고리즘 방식 설명(2 ~ 3명)
- 교재 내용 순서대로 한 주에 한 챕터 진행
- 월요일까지 PR
<br />

## 백준 제출 시 포맷
> 자바 입출력 포맷 예시
```java
// package 지우고 제출

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main { // 클래스명 Main으로 변경
    static class Node { // inner class 사용 -> 패키지 내 중복 방지
        private int x;
        private int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
    ...
    
    
    public static void main(String[] args) throws IOException {
        // 일반적인 입력
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        // 시간 초과를 대비한 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()); // 한 줄씩 입력(br.readLine()) -> String
       
        int n = Integer.parseInt(st.nextToken()); // String -> int
        int m = Integer.parseInt(st.nextToken()); 
        
        String array[] = br.reandLine().split(" "); // 공백마다 데이터 끊어서 배열에 넣음
        
        ArrayList<Integer> list = new ArrayList<>();
        while (st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        
        ...
        
        
        String s = "abc";
        
        // 일반적인 출력
        System.out.println(s); // abc
        
        // 시간 초과를 대비한 출력
        bw.write(s + "\n"); // String으로 출력, 줄바꿈 필요 시 "\n"
        // 출력 결과
        // a
        // b
        // c
        bw.close(); // 스트림 닫음

        // StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("abc");
        sb.append("def");
        System.out.println(sb); // abcdef -> StringBuilder
        System.out.println(sb.toString()); // abcdef -> String

        bw.write(sb.toString()); // abcdef
        bw.close();
    }
}
```

<br />

> 파이썬 입력 예시
```python
// 일반적인 입력
s = input()
n, m = map(int, input().split())

// 시간 초과를 대비한 입력
import sys
s = sys.stdin.readline().rstrip()
n, m = map(int, sys.stdin.readline().split())


// 출력
print()
```

<br />

## GitHub Repository 폴더 구조 (제출 양식 맞춰주세요!)
#### <이름>/<백준문제분류>/<파일명.java>

> 예시
- byeongmin/그리디알고리즘/ATM.java
- byeongmin/그래프와순회/바이러스.java

<br />

## Pull Request Message 
#### <주차> <백준문제분류> <(푼 문제 수)n문제> <완료>

> 예시
- Week01 그리디알고리즘 5문제 완료

<br />


## Commit & Branch & Pull Request 
> Commit
```
git add .
```
```
git commit -m "commit message"
```
```
git push origin main
```

<br />

> Branch (branch 명이 study일 때)
- branch 확인
```
git branch 
```
- branch 변경
```
git checkout study
```
- branch 변경 후 commit
```
git add .
git commit -m "commit message"
git push origin study
```

<br />

> Pull Requests
- New pull request
- Create pull request
- [fork해서 Pull Request 보내는 법](https://wayhome25.github.io/git/2017/07/08/git-first-pull-request-story/)
- [fork된 레포지토리 최신상태 유지하는 법](https://jybaek.tistory.com/775)

<br />

### 참고한 GitHub Repository
- https://github.com/ellynhan/challenge100-codingtest-study
- https://github.com/Seongho0503/Algo_Study
- https://github.com/CodeTest-StudyGroup/Code-Test-Study
- https://github.com/b1urrrr/Algorithm-Study
- https://github.com/CodeSquad-2023-BE-Study/Algorithm-Study
- https://github.com/tony9402/baekjoon
