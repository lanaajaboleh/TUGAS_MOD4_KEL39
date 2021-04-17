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
            //TIKET KE BOYOLALI//
            else if (try1 == 2) {

                back="a";

                pendefinisi.cetak6("Boyolali");
                pendefinisi.cetak8();

                String back2 ="z";

                while(back2=="z"){
                    pendefinisi.cetak3();
                    int try2 = scan.nextInt();
                    pendefinisi.cetak8();

                    switch (try2) {
                        case (1): hargasatuan = 90000;
                            pendefinisi.cetak2(penumpang,hargasatuan);
                            back2="a";
                            break;
                        case (2): hargasatuan = 140000;
                            pendefinisi.cetak2(penumpang,hargasatuan);
                            back2="a";
                            break;
                        case (3): hargasatuan = 180000;
                            pendefinisi.cetak2(penumpang,hargasatuan);
                            back2="a";
                            break;
                        default: pendefinisi.cetak5();
                            back2="z";
                            break;
                    }
                }
            }

            //TIKET KE SALATIGA//
            else if (try1 == 3) {

                back="a";

                pendefinisi.cetak6("Salatiga");
                pendefinisi.cetak8();

                String back2 ="z";

                while(back2=="z"){
                    pendefinisi.cetak3();
                    int try2 = scan.nextInt();
                    pendefinisi.cetak8();

                    switch (try2) {
                        case (1): hargasatuan = 115000;
                            pendefinisi.cetak2(penumpang,hargasatuan);
                            back2="a";
                            break;
                        case (2): hargasatuan = 165000;
                            pendefinisi.cetak2(penumpang,hargasatuan);
                            back2="a";
                            break;
                        case (3): hargasatuan = 215000;
                            pendefinisi.cetak2(penumpang,hargasatuan);
                            back2="a";
                            break;
                        default: pendefinisi.cetak5();
                            back2="z";
                            break;
                    }
                }
            }

            else {
                pendefinisi.cetak5();
                back="y";
            }
        }

        pendefinisi.cetak8();
        System.out.print("\n");

        //SCANNER UNTUK ARRAY YANG AKAN DIISI NAMA
        Scanner inputary = new Scanner(System.in);

        //INISIALISASI ARRAY KOLOM 0
        String [][] ary = new String[2][2];
        ary[0][0] = "Nama       : ";
        ary[1][0] = "NIM        : ";

        for (int i=1;i<=penumpang;i++) {
            System.out.println("Silahkan lengkapi identitas penumpang ke-" +i);

            System.out.print(ary[0][0]);
            ary[0][1] = inputary.nextLine();

            System.out.print(ary[1][0]);
            ary[1][1] = inputary.nextLine();

            System.out.print("\n");
        }

            //PENUTUP//
            System.out.print("\n");
            pendefinisi.cetak8();
            System.out.println("  TERIMAKASIH TELAH MENGGUNAKAN LAYANAN KAMI");
            System.out.println("       TIKET ANDA AKAN SEGERA KAMI PROSES");
            pendefinisi.cetak8();
        }
    }
