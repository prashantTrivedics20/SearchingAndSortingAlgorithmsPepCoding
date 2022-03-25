import java.util.Scanner;

public class OddEvenSeperate {
        public static void partition(int[]arr)
        {
            // three region
            // 0 to j-1->  <= pivot
            // j to i-1-> > pivot
            // i to end -> unknown
            int i=0;
            int j=0;
            while(i<arr.length)
            {
                if(arr[i]%2==1)
                {
                    i++;
                }
                else
                {
                    swap(arr,i,j);
                    i++;
                    j++;
                }
            }

        }
        // used for swapping ith and jth element of an array
        public static void swap(int []arr,int i,int j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        public static void print(int []arr)
        {
            for (int i = 0; i <arr.length ; i++) {
                System.out.println(arr[i]+" ");
            }
            System.out.println();
        }
        public static void main(String[] args) {
            Scanner readme=new Scanner(System.in);
            int n=readme.nextInt();
            int arr[]=new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i]=readme.nextInt();
            }
            partition(arr);
            print(arr);
        }
}
