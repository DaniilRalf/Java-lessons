package basics;

/** Очень походая модель на js но тут класс является языковой конструкцией*/

public class StaticWord {
    public static void main(String[] args) {
        Humannn.description = "test description";
//        System.out.println(Humannn.description);

        Humannn h1 = new Humannn("asdasdasd", 23);
        h1.printStatic();
    }

}

class Humannn {
    private String name;
    private int age;

    public static String description;

    public Humannn(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /** отличие от класов в джс в том что через методы экземляров класса тоже можно достучаться к статическим свойствам класса
     * в джс так сделавть нельзя и пришлось бь явно вызывать класс и его статический метод через точку*/
    public void printStatic() {
        System.out.println(description);
    }

}

