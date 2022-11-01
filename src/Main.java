public class Main {
    public static void main(String[] args) {
        // homework 06 started
        // chapter 1, task 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // chapter 1, task 2
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        // chapter 1, task 3
        for (int i = 0; i < 8; i++) {
            System.out.println(i + (i + 2));
        }

        // chapter 1, task 4
        for (int i = 10; i > - 11; i--) {
            System.out.println(i);
        }

        // chapter 2, task 1
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " year is leap.");
        }

        // chapter 2, task 2
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        // chapter 2, task 3
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        // chapter 3, task 1
        int deposit = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + deposit;
            System.out.println("Month " + i + " amount of savings equals " + total + " rubles");
        }

        //chapter 3, task 2
        double deposit1 = 29000;
        double total1 = 0;
        for (int i = 1; i <= 12; i++) {
            total1 = total1 + total1/100;
            total1 = total1 + deposit1;
            String round = String.format("%.2f", total1);
            System.out.println("Month " + i + " amount of savings equals " + round + " rubles");
        }
    }
}