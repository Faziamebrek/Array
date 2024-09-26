package array_task1;

public class MaximumMinimum {
    public static void main(String[] args) {
 //       // serche minimum
        int a[]= {13,5,23,90,75,200};
        int min= a[0];
        for (int i=0;i< a.length;i++){
            if (a[i]<min){
                min= a[i];
            }
        }
        System.out.println(min);
  //       search Maximum
        int max= a[0];
        for (int i=0;i< a.length;i++){
            if(a[i]>max){
                max= a[i];
            }
        }
        System.out.println(max);
    }
}
