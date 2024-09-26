package array_task1;

import java.util.Arrays;
// Write a Java program to sort a numeric array and a string array.
public class SortNumAndString {
    public static void main(String[] args) {
// sort numbers Array

        int[] num = {20, 5, 16, 7, 18, 12};
        Arrays.sort(num);
        System.out.println("sorted numeric array");
        for (int i:num){
            System.out.println(i+ " ");
        }
// sort string array
        String[] names = { "Sacramento", "Chicago", "Berkeley", "Algers", "Paris "};
        Arrays.sort(names);
        System.out.println(" sorted String array");
        for (String name : names){
            System.out.println(name+ " ");
        }
    }
}
