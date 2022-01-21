import java.util.Scanner;

public class RecursiveIndex {
    int n;
    int arr[];
    RecursiveIndex(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        n = s.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        s.close();
    }

    public int indexFinder(int []a, int k){

    }

}
