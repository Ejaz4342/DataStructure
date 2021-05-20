package BubbleSort;

import java.util.Scanner;

public class BubbleSortDemo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of an array ");
        int size= sc.nextInt();
        int[] arr=new int[size];
        int temp;
        System.out.println("Enter "+size+" integer elements");
        for (int i=0;i<=size-1;i++){
            arr[i]= sc.nextInt();
        }

        // start sorting
        for (int i=0;i<size-1;i++){
            for (int j=0;j<size-1-i;j++){

                if (arr[j]>arr[j+1]){  // Swapping
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("****Sorted Array is***");
        // printing sorted array
        for (int i=0;i<size;i++){
            System.out.print(arr[i]+"\t");
        }
    }

}

