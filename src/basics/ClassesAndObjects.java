package basics;

public class ClassesAndObjects {
    public static void main(String[] args) {

        /** создадим обьект типа "Person"*/
        Person person1 = new Person();
        person1.age = 50;
        person1.name = "Igor";

        /** создадим обьект типа "Person"*/
        Person person2 = new Person();
        person2.age = 40;
        person2.name = "Roman";

        /** проверка данных*/
        System.out.println(person1.name);
        System.out.println(person2.name);
        person1.speak();
        person2.speak();
        person1.calculateYears();
        person2.calculateYears();

        person1.setNameAngAge("NewName1", 31);
        person1.setUserName("@Person1");
    }
}

class Person {
    private String userName;
    String name;
    int age;

    /** пример Сеттеров и Геттеров*/
    /** по сути тоже самое что и обычные методы, они не имеют особого синтаксиса*/
    public void setUserName(String inputUserName) {
        userName = inputUserName;
    }
    public String getUserName() {
        return userName;
    }

    /** пример стандартных методов*/
    void speak() {
        System.out.println("My name is " + name + " i am " + age + " years old");
    }

    void setNameAngAge(String inputName, int inputAge) {
        name = inputName;
        age = inputAge;
    }

    int calculateYears() {
        int years = 65 - age;
        System.out.println(years);
        return years;
    }
}
