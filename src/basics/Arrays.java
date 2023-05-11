package basics;

public class Arrays {

    public static void main(String[] args) {

        /*? Одномерный массив*/
        int[] numberArray = {1, 2, 3}; /**создание массива*/
//        System.out.println(numberArray[1]);
        int[] numberArray2 = new int[5]; /**создание пустого массива*/
//        System.out.println(numberArray2[1]);

        /*? Двумерный массив*/
        int[][] numberArrayMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8}};
//        System.out.println(numberArrayMatrix[2][1]);
        String[][] numberArrayMatrix2 = new String[5][2];
//        System.out.println(numberArrayMatrix2[2][1]);
    }


}
