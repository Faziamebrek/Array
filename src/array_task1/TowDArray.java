package array_task1;

public class TowDArray {
    public static void main(String[] args) {

        int arr[][] = {{7, 8, 9}, {10, 11, 12,}, {60, 30, 20}};


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j] + " ");
            }
        }
    }
}
