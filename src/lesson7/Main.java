package lesson7;

public class Main {

    public static void main(String[] args) throws ReflectiveOperationException {
        Tester.start(ForTester.class);
        System.out.println("TestActivated");
        Tester.start("lesson7.ForTester");
    }
}