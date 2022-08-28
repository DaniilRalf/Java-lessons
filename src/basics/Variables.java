package basics;

public class Variables {
    static public void main(String [] args){

        //примитивные--------------------------------
        int myInt = 123; //32 bit
        short myShort = 123; //16 bit (-32000 - 32000)
        long myLong = 123; //64 bit

        double myDouble = 123.5; //64 bit
        float myFloat = 123.5f; //32 bit

        char myChar = 'c'; //one symbol
        boolean myBoolean = true;

        byte muByte = 123; //8 bit / 1 byte (-128 - 127)


        //ссылочные---------------------------------

        //строковые--------------------------
        String myString1 = "test";
        String myString2 = new String("test");
          // разница подходом в том что во втором лсучае выеляется
          // область памяти на которую будетссылаться переменная

        //массивы-----------------------------
        int[] array1 = new int[5]; //инициализация массива содержашего целые числа, с 5 ячейками
                                  //каждая ячейка до инициализации равна 0

        int[] array2 = {1, 2, 3, 4, 5}; //нициаизация ячеек массива при создании

        for (int i = 0; i < array1.length; i++){  //нициализация ячеек массива через цикл
            array1[i] = i + 5;
            System.out.println(array1[i]);
        }



    }
}
