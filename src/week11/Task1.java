package week11;

import java.util.Arrays;

public class Task1<T extends Comparable<T>> {
    public void sort(T arr[]) {
        for(int i = 0; i < arr.length - 1; ++i)
            for(int j = i + 1; j < arr.length; ++j)
            if (arr[i].compareTo(arr[j]) > 0)
                exch(arr, i, j);
    }
    
    private void exch(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        
        Integer arr[] = {3, 4, 1, 5};
        System.out.println("Truoc khi sap xep: " + Arrays.toString(arr));
        t1.sort(arr);
        System.out.println("Sau khi sap xep: " + Arrays.toString(arr));
        
        Double doubleArr[] = {3.05, 4.6, 4.25, 5.45};
        System.out.println("Truoc khi sap xep: " + Arrays.toString(doubleArr));
        t1.sort(doubleArr);
        System.out.println("Sau khi sap xep: " + Arrays.toString(doubleArr));
        
    } 
}
