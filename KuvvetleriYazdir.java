import java.util.Scanner;

public class KuvvetleriYazdir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir sayı girmesini iste
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        // 2'nin kuvvetlerini yazdır
        System.out.println("2'nin kuvvetleri:");
        for (int i = 0; Math.pow(2, i) <= sayi; i++) {
            System.out.println((int) Math.pow(2, i));
        }

        // 4'ün kuvvetlerini yazdır
        System.out.println("4'ün kuvvetleri:");
        for (int i = 0; Math.pow(4, i) <= sayi; i++) {
            System.out.println((int) Math.pow(4, i));
        }

        // 5'in kuvvetlerini yazdır
        System.out.println("5'in kuvvetleri:");
        for (int i = 0; Math.pow(5, i) <= sayi; i++) {
            System.out.println((int) Math.pow(5, i));
        }

        scanner.close(); // Scanner'ı kapat
    }
}
