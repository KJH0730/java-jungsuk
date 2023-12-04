package practice;

public class Practice7_25 {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner ii = o.new Inner();
        System.out.println(ii.iv);

        Outer.staticInner si = new Outer.staticInner();
        System.out.println(si.iv);
    }
}

class Outer {
    class Inner {
        int iv=100;
    }

    static class staticInner {
        int iv=200;
    }
}


