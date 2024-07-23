
import java.util.*;
public class threejava {
    public static void main(String[] args) {
        int[] numbers = { 5,10,10,3,8,8,1};
        int max = 0;
        int secondMax = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >max ) {
                secondMax = max;
                max = numbers[i];
            }
            else if (numbers[i] > secondMax && numbers[i] != max) {
                secondMax = numbers[i];
            }

        }
        System.out.println("The largest number is: " + secondMax);
    }

}