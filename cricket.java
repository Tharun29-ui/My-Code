import java.util.Scanner;

public class cricket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int n = 5;  
        int temp;
        int large=0;
        int small=99999;
        int sum=0;
        int avg;
        int[] array = new int[n];
        
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }     
        
     
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {

                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        
        System.out.println("Sorted score:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");  
        }
        for(int i=0;i<n;i++)
        {
            if(array[i]>large)
            {
                large=array[i];
            }
            if(array[i]<small)
            {
                small=array[i];
            }
        }
        System.out.println("maximum run scored is:"+large);
        System.out.println("minimum run scored is:"+small);
        for(int i=0;i<n;i++)
        {
           sum=sum+array[i];
        }
        System.out.println("Total run scored is:"+sum);
       avg=sum/n;
       System.out.println("average runs sccored by the batsmen is :"+avg);
    }
    }
