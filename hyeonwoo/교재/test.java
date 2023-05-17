package 교재;


import java.util.*;

public class test {
    public static int binsearch(int[] a ,int target){
        int s = 0;
        int e = a.length-1;
        while(s <= e){
            int mid = (s + e) /2;
            if (target == a[mid]) return 1;// 있으면 1 반환
            if(target < a[mid] ){ // 왼쪽 부분
                e = mid - 1;
            }else s = mid + 1;
        }
        return 0; // 없으면 0;
    }

    public static void main(String[] args) {
//        int[] n = { 0 , 2,5, 6, 7,8,9,19};
//        System.out.println(binsearch(n, 3));
//        System.out.println(binsearch(n, 5));
//        System.out.println(binsearch(n, 6));
//        System.out.println(binsearch(n, 7));
//        System.out.println(binsearch(n, 8));
//        System.out.println(binsearch(n, 9));
//        System.out.println(binsearch(n, 10));
//        System.out.println(binsearch(n, 11));
//        System.out.println(binsearch(n, 19));

        int[] a = {457, 539, 743, 802};

        int sum = 200;
//        System.out.println(Arrays.binarySearch(a, sum*1));
//        System.out.println(Arrays.binarySearch(a, sum*2));
//        System.out.println(Arrays.binarySearch(a, sum*3));
//        System.out.println(Arrays.binarySearch(a, sum*4));

        int temp = a[a.length-1] / 200; // 마지막 값은 얼마나 나눌수 있는가?

        int[] t = new int[temp];
        for (int i = 0; i < temp; i++) { //

            int bs_val = Arrays.binarySearch(a, (i+1)*200);
            if(bs_val == -1) bs_val =0;
            else if (bs_val < 0) bs_val = bs_val*(-1) -1;
            t[i] =bs_val;
        }
        for (int i :t) {
            System.out.println(i);
        }
//        System.out.println(sum);
    }
}
