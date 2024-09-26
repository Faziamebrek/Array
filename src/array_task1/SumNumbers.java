package array_task1;
//Write a Java program to count sum values of an integer array.
public class SumNumbers {
    public static void main(String[] args) {
        int [] numbers= {15,20,2,7,12,10};
        int total = 0;
        for (int sum: numbers){
            total+= sum;
            System.out.println(total);
        }
       // System.out.println(total);
    }

}
