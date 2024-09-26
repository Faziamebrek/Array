package array_task1;

public class EvenAndOdd {
    public static void main(String[] args) {
        int num[] = {2, 7, 15, 24, 30, 67};
        for (int arr : num) {
            if (arr % 2 == 0) {
                System.out.println(arr + " is oven");
            } else {
                System.out.println(arr + "is odd");
            }
        }

    }
}