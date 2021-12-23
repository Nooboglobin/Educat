package Educat;

public class Example {

    public static void main(String[] args) {

        int i = 1011;

        Integer x = Integer.valueOf(1011);

        System.out.println("x=" + x);
        System.out.println("i=" + i);


        if (i == x) {
            System.out.println("Equils");
        } else {
            System.out.println("Not equils");
        }

        String strInt = "123";
        int intTest = 123;
        System.out.println("StrInt " + strInt);
        System.out.println("intTest " + intTest);
    }
}
