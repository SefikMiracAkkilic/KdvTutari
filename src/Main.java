
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Kdv Tutarını Giriniz : ");
        tutar = input.nextDouble();

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("*********************************");
        System.out.println("KDV'siz TUTAR :" + tutar);
        System.out.println("KDV ORANI :" + kdvOran);
        System.out.println("KDV TUTARI :" + kdvTutar);
        System.out.println("KDV'Lİ TUTARI :" + kdvliTutar);
        System.out.println("*********************************");


    }
}