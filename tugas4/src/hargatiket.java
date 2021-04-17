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

//Variabel hargasatuan nantinya akan digunakan untuk menghitung harga total tiket
        int hargasatuan;

        //Variabel back nantinya digunakan untuk kembali ke menu awal ketika input pengguna salah
        String back = "y";

        while (back=="y"){
            pendefinisi.cetak1(" Solo", " Boyolali", " Salatiga");
            System.out.print("Pilih tiket kereta yang akan anda beli    : ");
            int try1 = scan.nextInt();
            System.out.print("\n");
            pendefinisi.cetak8();

            //TIKET KE SOLO//
            if (try1 == 1) {

                //back = a menandakan bahwa program tidak akan diulang
                back="a";

                pendefinisi.cetak6("Solo");
                pendefinisi.cetak8();

                //Variabel back2 digunakan untuk kembali ke menu awal
                String back2 ="z";

                while(back2=="z"){
                    pendefinisi.cetak3();
                    int try2 = scan.nextInt();
                    pendefinisi.cetak8();

                    switch (try2) {
                        case (1): hargasatuan = 100000;
                            pendefinisi.cetak2(penumpang,hargasatuan);
                            back2="a";
                            break;
                        case (2): hargasatuan = 150000;
                            pendefinisi.cetak2(penumpang,hargasatuan);
                            back2="a";
                            break;
                        case (3): hargasatuan = 200000;
                            pendefinisi.cetak2(penumpang,hargasatuan);
                            back2="a";
                            break;
                        default: pendefinisi.cetak5();
                            back2="z";
                            break;
                    }
                }
            }
