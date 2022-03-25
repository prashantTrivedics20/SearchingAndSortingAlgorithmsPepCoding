import java.util.Scanner;

class QuickSelectKthSmallestElementOfAnArray {

    public static int quickSelect(int[]arr,int lo,int hi,int k)
    {
        int pivot=arr[hi];
        int pi=partition(arr,pivot,lo,hi);
        if(k>pi)
        {
           return quickSelect(arr,pi+1,hi,k);
        }
        else if(k<pi)
        {
            return quickSelect(arr,lo,pi-1,k);
        }
        else
        {
            return arr[pi];
        }

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
        //System.out.println("pivot index->"+ (j-1));
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
        System.out.println("Enter the k th smallest element that you want to find");
        int k=readme.nextInt();
       int result= quickSelect(arr,0,arr.length-1,k-1);
        System.out.println(result);
        //print(arr);
    }

}
