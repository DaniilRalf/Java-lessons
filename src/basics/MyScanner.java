package basics;

import java.util.Scanner;


public class MyScanner {
    static public void main(String[] args){
        
        Scanner scan = new Scanner(System.in); //указываем стандартный системный поток в аргументах
        //2 способа создания обьекта, работает также впринципе и со стринг, да и с любыми обьектами

        System.out.println("Inter text");
        String text = scan.nextLine();
        System.out.println("Your text = " + text);

    }
}
