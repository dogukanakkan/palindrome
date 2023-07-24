import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir kelime girin: ");
        String kelime = scanner.nextLine();

        if (isPalindrom(kelime)) {
            System.out.println(kelime + " bir palindromiktir.");
        } else {
            System.out.println(kelime + " bir palindromik değildir.");
        }

        scanner.close();
    }

    public static boolean isPalindrom(String kelime) {
        // Boşlukları ve büyük/küçük harf farkını yok sayarak kelimeyi düzenleyelim
        kelime = kelime.replaceAll("\\s+", "").toLowerCase();

        int uzunluk = kelime.length();
        for (int i = 0; i < uzunluk / 2; i++) {
            if (kelime.charAt(i) != kelime.charAt(uzunluk - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
