
import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        Scanner c=new Scanner(System.in);
     try {
        int a=c.nextInt();
        int b=c.nextInt();
        int res=a/b;
        System.out.println("result is:"+res);
     } catch ( Exception e) {
        System.out.println("went wrong");
     } c.close();}}