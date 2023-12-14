package chapter09;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cnt = 0;
        int totalSum = 0;

        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            Scanner sc2 = new Scanner(line).useDelimiter(",");
            int sum = 0;

            while(sc2.hasNextInt()) {
                sum += sc2.nextInt();
            }
            System.out.println(line + ", sum = " + sum);
            totalSum += sum;
            cnt++;
        }
        System.out.println("Line: " + cnt + ", Total: " + totalSum);
    }
}
