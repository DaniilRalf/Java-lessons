package basics;

public class Object {
    public static void main(String[] args) {
        Test3 t1 = new Test3("test name", 31);
        System.out.println(t1); //будет выведено название класса и хеш-код переменной обьекта

    }
}

/** ксати каждый класс который мысоздаем неявно наследуется от класса Object*/
class Test3 {
    private String name;
    private int age;

    public Test3(String name, int age) {
        this.age = age;
        this.name = name;
    }

}
