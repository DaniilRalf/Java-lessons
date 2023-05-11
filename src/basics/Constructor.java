package basics;

public class Constructor {
    public static void main(String[] args) {
        Humann person1 = new Humann("testName", 15);
    }
}

class Humann {
    private String name;
    private int age;

    /** конструктор, он должен быть с тем же названием что и класс*/
    public Humann(String inputName, int inputAge) {
        this.name = inputName;
        this.age = inputAge;
    }

    public void setName(String inputName) {
        this.name = inputName;
    }
    public void setAge(int inputAge) {
        this.age = inputAge;
    }
}
