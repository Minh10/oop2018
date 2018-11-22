package week11;

import java.util.Arrays;

public class Task2<T extends Comparable<T>> {
    public T findMax(T arr[]) {
        T max = arr[0];
        for(int i = 1; i < arr.length; ++i)
            if (arr[i].compareTo(max) >= 0)
                max = arr[i];

        return max;
    }

    public static void main(String[] args) {
        Task2 t2 = new Task2();


        Integer intArr[] = {3, 4, 1, 5};
        System.out.println(Arrays.toString(intArr));
        System.out.println("Max: " + t2.findMax(intArr));

        Double doubleArr[] = {3.05, 4.6, 4.25, 5.45};
        System.out.println(Arrays.toString(doubleArr));
        System.out.println("Max: " + t2.findMax(doubleArr));

    }
}
