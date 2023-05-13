package basics;

public class FinalWord {
    public static void main(String[] args) {

    }
}

/** final - переменная которой можно присвоить значение только 1 раз
 * она может быть как статической так и обычной
 * */

class Test {
    public final int CONSTANT;

    public Test(int CONSTANT) {
        this.CONSTANT = CONSTANT;
    }

    /** так соответственно сделать не получиться*/
//    public void setCONSTANT(int i) {
//        this.CONSTANT = i;
//    }
}
