import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Desen için lütfen bir sayı giriniz : ");

        int number = scanner.nextInt();



        for (int a = 1; a <= number; a++) {               // 1. Yarısını Çizdir
            for (int b = 1; b <= number - a; b++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= 2 * a - 1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int a = number - 1; a >= 1; a--) {            // 2. Yarısını Çizdirme
            for (int b = 1; b <= number - a; b++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= 2 * a - 1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
