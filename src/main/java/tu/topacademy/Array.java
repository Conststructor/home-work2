package tu.topacademy;

import java.util.Random;

public class Array implements ISort {
    Random random = new Random();
    int[] arr = random.ints(10, -100, 100).toArray();

    public void sortAsc() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public void sortDesc() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public void printArray() {
        System.out.println();
        for (int number : arr) {
            System.out.print(number + " ");
        }
    }
}
