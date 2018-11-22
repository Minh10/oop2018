
public class task1 <T extends Comparable<T>> {

    private void exch(T a[], int i, int j) {
        T swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    public void sort(T arr[]){
        for(int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    exch(arr, i, j);
                }
            }
        }

    }

    public static void main(String[] args){
        task1 t = new task1();

        Integer arr[] = {1, 2 ,3 ,4, 0};

        t.sort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        Double a[] = {4.5, 5.6, 1.3};
        t.sort(a);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }

}
