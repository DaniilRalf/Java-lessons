package basics;

public class DoWhile {
    static public void main(String[] args){

        int value = 5;

        while (value != 10){
            System.out.println("Value is not 10");
            value++;
        }

        // тоже самое только сначала выполняет инструкции а потом проверяет условие
        do{
            System.out.println("Value is not 10");
            value++;
        }while (value != 10);

    }
}
