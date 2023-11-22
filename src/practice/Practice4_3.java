package practice;

public class Practice4_3 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i=1; i<=10; i++) {
          for(int j=1; j<=i; j++) {
              sum += j;
          } // 안쪽 for
        } // 바깥쪽 for

        System.out.println(sum);
    } // main

} // class
