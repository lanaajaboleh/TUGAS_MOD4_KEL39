public class pendefinisi {

    //CETAK 1 - berisi 3 stasiun kereta yang akan dituju
        public static void cetak1(String kereta1, String kereta2, String kereta3){
            System.out.println("1 ->" +kereta1);
            System.out.println("2 ->" +kereta2);
            System.out.println("3 ->" +kereta3);
        }

    //CETAK 3 - berisi kelas kereta yang akan dipilih
        public static void cetak3() {
            System.out.println("1 -> Ekonomi");
            System.out.println("2 -> Bisnis");
            System.out.println("3 -> Eksekutif");
            System.out.print("Pilih jenis tiket sesuai dengan nomor   : ");
        }

    //CETAK 5 - berisi peringatan ketika pengguna memasukkan angka selain 1-3
        public static void cetak5() {
            System.out.println("Pilih angka 1-3");
        }

    //CETAK 6 - menampilkan kota tujuan yang telah dipilih pengguna
        public static void cetak6(String kalimat6) {
            System.out.print("-------Kota tujuan anda adalah " + kalimat6);
            System.out.print("-------- \n");
        }

    //CETAK 2 - Menampilkan ringkasan harga tiket yang dibeli
        public static void cetak2(int nilai1, int nilai2){

            int nilai3 = nilai1 * nilai2;
            System.out.println("Jumlah penumpang   : " +nilai1);
            System.out.println("Harga satuan tiket : " +nilai2);
            System.out.println("Harga total tiket  : " +nilai3);
        }

    //CETAK 8 - menampilkan garis putus putus
        public static void cetak8(){
            System.out.println("===============================================");
        }

    //KEMBALI - untuk mengembalikan ke menu awal
        public static void kembali(String variabel, String nilainya){
            variabel = nilainya;
        }
}
