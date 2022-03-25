import java.util.Scanner;
public class InsertionSort {
    public static void SelectionSort(int arr[]) {
        int temp;
        int j;
        for (int i = 1; i <arr.length; i++) {
            temp=arr[i];
            j=i;
            while(j>0&&arr[j-1]>temp)
            {
                arr[j]=arr[j-1];
                j=j-1;
            }
            arr[j]=temp;

        }

    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i <arr.length; i++) {
            arr[i]=readme.nextInt();
        }
        SelectionSort(arr);
    }
}
