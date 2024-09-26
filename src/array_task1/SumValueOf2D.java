package array_task1;

public class SumValueOf2D {
    public static void main(String[] args) {
        int a[][] = {{12, 2, 5}, {4, 3, 8}, {9, 16, 20}};

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int c = 0; c < a[0].length; c++) {

                sum = sum+ a[i][c];

            }
        }
        System.out.println( sum);
    }
}