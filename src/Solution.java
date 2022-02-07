import java.util.Scanner;

class Solution {
    public static int arrayMax(int [] arr){
        int max = 0;
        for(int res: arr){
            if (res>max){
                max = res;
            }
        }
        return max;
    }

    public static int arrayMin(int [] arr){
        int minArray =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<minArray){
                minArray = arr[i];
            }
        }
        return minArray;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        int res = arrayMax(a);
        int index = arrayMin(a);
        System.out.println(index);
        System.out.println(res);
    }
}
