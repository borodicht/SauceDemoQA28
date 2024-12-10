package tests;

public class Test {

    @org.testng.annotations.Test
    public void test() {
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tusew");
                break;
            default:
                System.out.println("HUI");
        }

        System.out.println(day);
    }
}
