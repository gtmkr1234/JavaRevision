import java.util.Scanner;
public class anagram {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String a = inp.next();
        String b = inp.next();
        char []c = a.toCharArray();
        char []d = b.toCharArray();
        int flag =0;
        if (a.length()==b.length()){
        for(int i=0; i<a.length();i++){
            for(int j=0 ; j<a.length();j++){
                if(c[i]==d[j]){
                    flag++;
                }
            }
        }
        if(flag==a.length()){
            System.out.println("Strings are anagram");
        }
        else{
            System.out.println("Strings are not anagram");
        }
        }
        else{
            System.out.println("Strings are not anagram");
        }
    }
}
