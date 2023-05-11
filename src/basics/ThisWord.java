package basics;

public class ThisWord {
    public static void main(String[] args) {

        Human human1 = new Human();
        human1.setName("Name1");
        human1.setAge(15);

        human1.getInfo();
    }
}

/** ничего особенного вроде, тот жек контекст что и в джс*/

class Human {
    private String name;
    private int age;

    public void setName(String inputName) {
        this.name = inputName;
    }
    public void setAge(int inputAge) {
        this.age = inputAge;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }

    public void getInfo() {
        System.out.println(name + " " + age);
    }
}
