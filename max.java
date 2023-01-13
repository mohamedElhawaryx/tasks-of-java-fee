import java.util.Scanner;
public class max {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int max;
        int []arr =new int[10];
        max=arr[0];
        for (int i=1; i<arr.length; i++) {
            arr[i]=input.nextInt(); }
        for (int i=1; i<arr.length; i++)
        {
            if(arr[i]>max)
                max=arr[i];   }
        System.out.println("the max value \n " +  max);
        
    }
]
}
