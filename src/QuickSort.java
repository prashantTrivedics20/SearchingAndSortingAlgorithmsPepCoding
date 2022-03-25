import java.util.Scanner;

public class QuickSort {
    public static void quickSort(int[]arr,int lo,int hi)
    {
//        if(lo>hi)// it will  partition all element also
//        {
//            return;
//        }
       if(lo>hi)// it will  partition all element also
       {
            return;
       }
       // write your code here
        int  pivot=arr[hi];
        int pi=partition(arr,pivot,lo,hi);
        quickSort(arr,lo,pi-1);// 0 to (pivot-1)
        quickSort(arr,pi+1,hi);
    }
    public static int partition(int[]arr,int pivot,int lo,int hi)
    {
        // three region
        // 0 to j-1->  <= pivot
        // j to i-1-> > pivot
        // i to end -> unknown
        int i=lo;
        int j=lo;
        while(i<=hi)
        {
            if(arr[i]<=pivot)
            {
                swap(arr,i,j);
                i++;
                j++;
            }
            else
            {
                i++;
            }
        }
        System.out.println("pivot index->"+ (j-1));
        return (j-1);


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
        partition(arr,arr[n-1],0,arr.length-1);
        quickSort(arr,0, arr.length-1);
        print(arr);
    }

}
