package array_task1;

public class SpecificNumber {
    public static void main(String[] args) {
        int[] numbers = {100, 20, 15, 6, 16};
        int SearchNumber = 30;
        boolean exist = false;

        for (int a : numbers) {
            if (a == SearchNumber) {
                exist = true;

            }
        }

        if (exist) {
            System.out.println(SearchNumber + " is exist in the array.");
        } else {
            System.out.println(SearchNumber+ " is not exist in the array.");
        }
    }
}




















