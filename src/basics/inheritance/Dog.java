package basics.inheritance;

public class Dog extends Animal{

    /** переопределяем свойство*/
    String name = "Dog name";

    public void bark() {
        System.out.println("I am barking");
    }

    /** тут мы переопределяем родительский метод eat*/
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void showName() {
        System.out.println(name);
    }

}
