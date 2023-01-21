package tu.topacademy;

import java.util.Arrays;
import java.util.Random;

public class Array implements IMath {

    Random random = new Random();
    int[] arr = random.ints(10, -100, 100).toArray();

    public float Avg() {
        float sum = 0;
        for (int number : arr) {
            sum += number;
        }
        return sum / arr.length;
    }

    public int Max() {
        return Arrays.stream(this.arr).max().getAsInt();
    }

    public int Min() {
        return Arrays.stream(this.arr).min().getAsInt();
    }

    public void printArray() {
        for (int number :
                arr) {
            System.out.print(number + " ");
        }
    }
}
