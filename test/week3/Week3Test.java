package week3;

public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void maxTest(){
        assertEquals(3, Week3.max(2,3));
        assertEquals(10, Week3.max(10, 6));
        assertEquals(5, Week3.max(5, 0));
        assertEquals(9, Week3.max(9, 9));
        assertEquals(100,Week3.max(1, 100));
    }
    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void minofarrayTest(){
        int[] arr1 = {5, 4, 3, 2, 1};
        assertEquals(1, Week3.minOfArray(arr1));
        int[] arr2 = {5, 4, 0, 2, 1};
        assertEquals(0, Week3.minOfArray(arr2));
        int[] arr3 = {100, 4, 9, 7, 10, 7};
        assertEquals(4, Week3.minOfArray(arr3));
        int[] arr4 = {90, 70, 60, 50, 50, 10, 88};
        assertEquals(10, Week3.minOfArray(arr4));
        int[] arr5 = {999, 888, 777, 666, 555, 444, 333, 222, 1};
        assertEquals(1, Week3.minOfArray(arr5));
    }
    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void calculatebmiTest(){
        assertEquals("binh thuong", Week3.calculatebmi(56,1.6));
        assertEquals("thieu can", Week3.calculatebmi(40, 1.56));
        assertEquals("thua can", Week3.calculatebmi(70, 1.59));
        assertEquals("beo phi", Week3.calculatebmi(100, 1.69));
        assertEquals("binh thuong", Week3.calculatebmi(56, 1.67));
    }
    

    
}
