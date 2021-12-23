package Educat;

public class Example3 {

    public static void main(String[] args) {
        switch (Example2.VERSION) {
            case "1.0.1":
                System.out.println("123");
                break;
            case "1.0.2":
                System.out.println("abc");
                break;

            default:
                System.out.println("default");
        }
    }
}
