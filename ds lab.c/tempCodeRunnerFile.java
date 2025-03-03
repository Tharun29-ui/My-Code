
import java.util.Scanner;


public class pattern {
    public static void main(String[] args) {
        Scanner patterns=new Scanner(System.in);
        int n=patterns.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print("");
            }
             for(j=1;j<=i;j++)
             {
                System.out.print("*");
             }
             System.out.println();
        }
    }
    
}
