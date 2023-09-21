import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20,total,firstPrice = 10;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz: ");
        km = input.nextInt();

        total = firstPrice + (km * perKm);
        if (total < 20){
            total =20;
        }
        if (km == 0){
            total = 10;
            System.out.println("Açılış ücretimiz " + total + " Türk Lirasıdır.");
            return;
        }
        System.out.println("Ödenecek Tutar: " + total + " Türk Lirası");

    }
}