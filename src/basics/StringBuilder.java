package basics;

public class StringBuilder {
    public static void main(String[] args) {

        /** переменная типа String не изменяемая, так работать не будет необходимо переопределять переменную*/
        String x1 = "hello";
        x1.toUpperCase();
        System.out.println(x1); //hello

        /** вот так будет работать*/
        String x2 = "hello";
        x2 = x2.toUpperCase();
        System.out.println(x2); //HELLO

        /** пример с конкретиначией что ниже очень снижаетя производительность
         * и чтобы избежать эту проблему используют СтрингБилдер*/
        String y1 = "Hellow ";
        String y2 = "my ";
        String y3 = "friends";
        String all = y1 + y2 + y3;
        System.out.println(all);

        java.lang.StringBuilder sb = new java.lang.StringBuilder("hello");
        sb.append(" my").append(" friends");
        System.out.println(sb);
    }
}
