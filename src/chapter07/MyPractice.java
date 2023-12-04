package chapter07;

public class MyPractice {
    public static void main(String[] args) {

        TestInterface ts = new TestInterface() {
            @Override
            String output() {
                return "안녕";
            }
        };

        System.out.println(ts.output());




    }
}

class TestInterface {
    String output() { return "안녕하세요"; }
}
