import java.util.Scanner;

public class SelectionSortIFWeHaveStringArray {
    public static void SelectionSort(String  arr[]) {
        int min;
        String temp="";
        for (int i = 0; i <arr.length ; i++) {
            min=i;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[j].compareTo(arr[min])<0)
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
        String []arr=new String[n];
        for (int i = 0; i <arr.length; i++) {
            arr[i]=readme.next();
        }
        SelectionSort(arr);
    }
}
