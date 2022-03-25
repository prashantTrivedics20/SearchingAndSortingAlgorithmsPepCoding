import java.util.Scanner;

public class SelectionSort {
    public static void SelectionSort(int arr[]) {
        int min;
        int temp=0;
        for (int i = 0; i <arr.length ; i++) {
            min=i;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
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
