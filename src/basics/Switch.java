package basics;

public class Switch {
    static public void main(String[] args){
        int value = 3;
        switch (value){
            case 0 :
                System.out.println("value = " + value);
            case 3 :
                System.out.println("value = " + value);
            default:
                System.out.println("No result"); //не одно условие не подошло
        }
    }
}
