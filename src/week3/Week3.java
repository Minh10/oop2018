package week3;

public class Week3 {
    public static int max(int m, int n) {
        // todo: tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhất
        if(m > n)   return m;
        else
            return n;
    }

    public static int minOfArray(int[] array) {
        // todo: tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần tử)
        int min = array[0];
        for(int i = 1; i < array.length; i++){
            if( array[i] < min ) min = array[i];
        }
        return min;
    }

    /**
     * chương trình tính chỉ số bmi và in ra kết quả đánh giá
     * @param weight cân nặng
     * @param height chiều cao
     * @return thiếu cân, bình thường, thừa cân, béo phì
     */
    public static String calculatebmi(double weight, double height) {
        // todo: viết chương trình tính chỉ số bmi và in ra kết quả đánh giá
        double bmi;
        bmi = weight/(height*height);
        if(bmi < 18.5)  return"thieu can";
        if(bmi >= 18.5 && bmi <= 24.99) return"binh thuong";
        if(bmi >= 25 && bmi <30) return"thua can";
        else if(bmi > 30) return"beo phi";
        return null;
    }
}
