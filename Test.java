/*
import java.util.Scanner ;
class Test
{
    public static void main(String[] args) {
        System.out.print("enter n number");
        Scanner Tharun =new Scanner(System.in);
        int a= Tharun.nextInt();
        int i,sum=0;
        for(i=1; i<a; i++)
        {
           sum=sum+i;
        }
        System.out.print(sum+"is the sum of "+a+"numbers");
        Tharun.close();
    }
}*/
/* 
import java.util.Scanner ;
class Test
{
    public static void main(String[] args) {
        System.out.print("enter the number");
        Scanner Tharun =new Scanner(System.in);
        int a= Tharun.nextInt();
        int i,flag=0;
        for(i=2; i<a; i++)
        {
           if(a%i==0)
           {
            flag=1;
            break;
           }
        }
        if(flag==0)
        {
            System.out.print(a+"is a prime number");
        }
        else{
            System.out.print(a+"is not a prime number");
        }
        Tharun.close();
    }
}*/
/* 
import java.util.Scanner ;
class Test
{
    public static void main(String[] args) {
        System.out.print("enter the number");
        Scanner Tharun =new Scanner(System.in);
        int a= Tharun.nextInt();
        int i,sum=0,b;
        for(i=0; i<a; i++)
        {
           b=a%10;
           sum=sum+b;
           a=a/10;
        }
        System.out.print("the sum of digits of given number is "+sum);
        Tharun.close();
    }
}
 *//* 
import java.util.Scanner ;
class Test
{
    public static void main(String[] args) {
        System.out.print("enter n numbers");
        Scanner Tharun =new Scanner(System.in);
        int a= Tharun.nextInt();
        int i,j;
        for(i=2; i<=a; i++)
        {
            int flag=1;
           for(j=2;j<i;j++)
           {
            if(i%j==0)
            {
              flag=0;
              break;
            }
           }
           if(flag==1)
           {
            System.out.print(i);
           }
        }
        Tharun.close();
    }
}*/
/* 
import java.util.Scanner ;
class Test
{
    public static void main(String[] args) {
        System.out.print("enter n numbers");
        Scanner Tharun =new Scanner(System.in);
        int a= Tharun.nextInt();
        int i,j;
        for(i=2; i<=a; i++)
        {
            int flag=1;
           for(j=2;j<i;j++)
           {
            if(i%j==0)
            {
              flag=0;
              break;
            }
           }
           if(flag==1)
           {
            System.out.print(i);
           }
        }
        Tharun.close();
    }*/
   /* Find area of circle*/ 
   /*import java.util.Scanner ;
   class Test
   {
       public static void main(String[] args) {
           System.out.print("enter the radius");
           Scanner Tharun =new Scanner(System.in);
           int a= Tharun.nextInt();
           float ar= (3.14f*a*a);
           System.out.print("area is"+ar);
           Tharun.close();
       }
    }
 */
/* 
import java.util.Scanner ;
class Test
{
    public static void main(String[] args) {
        System.out.print("enter the value in indian currency to covert it into usd ");
        Scanner Tharun =new Scanner(System.in);
        float a= Tharun.nextFloat();
        float convert=(a/90);
        System.out.print("the converted usd value is :"+convert+"dollars");
        Tharun.close();
    }
 } 
*/
/* 
import java.util.Scanner ;
class Test
{
    public static void main(String[] args) {
        System.out.print("enter the year to check for leap year:");
        Scanner Tharun =new Scanner(System.in);
        int a= Tharun.nextInt();
       if((a%4== 0 && a%100!=0)|| a%400==0 )
       {
        System.out.print("it is an leap year");
       }
       else{
        System.out.print("it is not an leap year");
       }
        Tharun.close();
    }
 } 
 */
/* 
import java.util.Scanner ;
class Test
{
    public static void main(String[] args) {
        System.out.print("enter the number:");
        Scanner Tharun =new Scanner(System.in);
        int a= Tharun.nextInt();
        int i,large=0,small=9999999,b;
       for(;a!=0;a/=10)
       {
         b=a%10;
         if(b>large)
         {
            large=b;
         }
         if(small>b)
         {
        small=b;
         }
       }
       System.out.println("large:"+large);
       System.out.print("small:"+small);
        Tharun.close();
    }
 }*/
/* 
 import java.util.Scanner ;
 class Test
 {
     public static void main(String[] args) {
         System.out.print("enter the number:");
         Scanner Tharun =new Scanner(System.in);
         int a= Tharun.nextInt();
         int b = Tharun.nextInt();
         int c = Tharun.nextInt();
         if(a>b && a>c){
             System.out.println("A is largest");
         }
         else if(b>a && b>c){
             System.out.println("B is largest");
         }
         else {
             System.out.println("C is largest");
         }
 
         Tharun.close();
     }
  }
*/
/* 
import java.util.Scanner ;
 class Test
 {
     public static void main(String[] args) {
         System.out.print("enter the number:");
         Scanner Tharun =new Scanner(System.in);
         int a= Tharun.nextInt();
         switch(a) {
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("tueday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("saturday");
            break;
            case 7:
            System.out.println("sunday");
            break;
            default :
            System.out.println("invalid day number");
            break;
            }
            
         Tharun.close();
     }
    }
*/
/* 
 *  public class Test

 {
     public static void main(String[] args)
     {
        Test bg=new Test();
        bg.add();
     }
     public void add(){

int a=5,b=7;    
int c=a+b;
System.out.println("the sum is :"+c);
}

    }
   
*/
