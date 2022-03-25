import java.util.Scanner;

public class MerageTwoSortedArray {
    public static int[] mergeTwoSortedArrays(int[]a,int[]b)
    {
        int res[]=new int[a.length+b.length];
        int i=0;
        int j=0;
        int  k=0;
        while(i<a.length&&j<b.length)
        {
            if(a[i]<b[j])
            {
                res[k]=a[i];
                i++;
                k++;
            }
            else
            {
                res[k]=b[j];
                j++;
                k++;
            }
        }
        while(i<a.length)
        {
            res[k]=a[i];
            i++;
            k++;

        }
        while(j<b.length)
        {
            res[k]=b[j];
            j++;
            k++;

        }
        return res;


    }
    public static void print(int arr[])
    {
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        int []arr1=new int[n];
        for (int i = 0; i <n; i++) {
            arr1[i]=readme.nextInt();
        }
        int m=readme.nextInt();
        int []arr2=new int[m];
        for (int i = 0; i <m ; i++) {
            arr2[i]=readme.nextInt();
        }
        int []merageArray=mergeTwoSortedArrays(arr1,arr2);
        print(merageArray);
    }
}
