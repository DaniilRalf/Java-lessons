package basics.interfaces;

/** класс может быть определен скольки угодно интерфейсами - implements
 * но так-жек класс может наследоваться только от одного другого класса - extends*/

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("bob");
        animal1.sleep();
        person1.sayHello();
        animal1.showInfo();
        person1.showInfo();

        /** Поскольку Animal и Person реализуют интерфес Info мы можем записать вот так*/
        Info animal2 = new Animal(2);
        Info person2 = new Person("bob");
        /** но на animal2 и person2 мы сможем вызвать только 1 метод - showInfo()
         * посколкьу интерфейс Info предпологает только этот метод*/
    }
}
