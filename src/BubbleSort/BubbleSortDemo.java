package BubbleSort;

public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] arr={50,30,40,60,20,10};
        int temp;
        int n=arr.length;
        // start sorting
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-1-i;j++){

                if (arr[j]>arr[j+1]){  // Swapping
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        // printing sorted array
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
    }

}
