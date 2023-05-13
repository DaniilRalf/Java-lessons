package basics.interfaces;

/** реализуем интерфейс Info*/
public class Person implements Info {

    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    /** реализуем интерфейс Info*/
    public void showInfo() {
        System.out.println("infooooooooo");
    }
}
