import java.util.Scanner;

public class hargatiket {

    public static void main(String[] args) {

        pendefinisi objek = new pendefinisi();
        Scanner scan = new Scanner(System.in);

        //TAMPILAN AWAL
        pendefinisi.cetak8();
        System.out.println("----------------PT KAI PEKALONGAN--------------");
        System.out.println("  SELAMAT DATANG DI LAYANAN PT KAI PEKALONGAN");
        pendefinisi.cetak8();
        System.out.print("\n");

        System.out.print("Berapa penumpang yang akan membeli tiket? : ");
        int penumpang = scan.nextInt();


