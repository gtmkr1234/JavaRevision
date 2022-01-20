import java.util.Scanner;

public class arraysmall {
    int n;
    int [] arr = new int [n];
    public void createArray(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        n = s.nextInt();
        System.out.println("Enter "+ n + " elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
    }


}
