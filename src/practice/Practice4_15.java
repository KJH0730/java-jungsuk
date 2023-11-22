package practice;

import java.util.Scanner;

public class Practice4_15 {
    public static void main(String[] args) {
        System.out.print("숫자를 입력해주세요: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int tmp = number;

        int result=0;

        while(tmp != 0) {
            result = result*10 + tmp % 10;
            tmp /= 10;
        }

        if(number == result)
            System.out.println(number + "는 회문수 입니다.");
        else
            System.out.println(number + "는 회문수가 아닙니다.");
    }
}
