
package BuahShop;

import java.util.Scanner;
import java.util.InputMismatchException;
public class TokoBuahMain {
    public static void main(String[]args){
        // IO SEDERHANA (Scanner) 
        Scanner input = new Scanner ( System.in);
        // ARRAY ( Ukuran 7 karena diisi 7 buah)
        Buah[] daftarBuah = new Buah[7];
        // OBJECT INSTANSISASI
        daftarBuah[0] = new Buah("Melon", 12500, 45);
        daftarBuah[1] = new Buah("Rambutan",5000, 30);
        daftarBuah[2] = new Buah("Anggur", 45000, 50);
        daftarBuah[3] = new BuahPremium("Apel", 60000, 45, "jepang");
        daftarBuah[4] = new BuahPremium("Stoberi", 75000, 55, "korea");
        daftarBuah[5] = new BuahPremium("Chery", 100000, 45, "Landon");
        daftarBuah[6] = new BuahPremium("Guava", 30000, 60, "Jepang");
        
        boolean aplikasiJalan= true;
        // PERULANGAN (While loop)
        while (aplikasiJalan){
            System.out.println("\n=====================");
            System.out.println("      BUAHSHOP HAFIZ  ");
            System.out.println("\n======================");
            System.out.println("1. Tampilkan Katalog Buah");
            System.out.println("2. Transaksi Pembelian");
            System.out.println("3. Keluar Dari Aplikasi");
            System.out.print("Pilih menu (1/2/3):");
        // ERROR HANDLING (Try-Catch)
          try{
            int menu = input.nextInt();
            //SELEKSI (If_else)
            if (menu == 1){
                System.out.println("\n--KATALOG BUAH HARI INI --");
                //PERULANGAN (For loop untuk menampilkan isi array)
                for (int i = 0; i <daftarBuah.length; i ++){
                    System.out.print((i + 1)+ ". ");
                    daftarBuah[i]. tampilkanInfo();
                }
            }
            else if (menu == 2){
                System.out.println("\nMasukkan nomor yang ingin dibeli (1-7:)");
                int nomorPilih = input.nextInt();
                int indeks = nomorPilih - 1;
                // SELEKSI
                if ( indeks >= 0 && indeks < daftarBuah.length){
                    System.out.print("Berapa kg"+ daftarBuah [indeks].getNama().trim()+"yang mau dibeli? :");
                    int jumlahBeli = input.nextInt();
                // SELEKSI
                if ( jumlahBeli > 0 && jumlahBeli <= daftarBuah[indeks].getStok()){
                int totalHarga = jumlahBeli * daftarBuah[indeks].getHarga();
                 // MOTATOR (Setter untuk mengubah stok)
                 daftarBuah[indeks].setStok(daftarBuah[indeks].getStok() - jumlahBeli);
                 System.out.println("\n PEMBELIAN BERHASIL!");
                 System.out.println("Total Belanjaan Anda: Rp" + totalHarga);
                 System.out.println("Sisa stok sekarang: "+ daftarBuah[indeks].getStok()+ "kg");
                
                }else{
                    System.out.println("\n TRANSAKSI GAGAL : Astok tidak cukup atau input salah");
                   
                }
                        
            }else{
                    System.out.println("\n Nomor buah tidak terdaftar!");
                } 
            }else if (menu == 3){
                  aplikasiJalan = false;
                  System.out.println("\nTerima kasih sudah berbelanja di BuahShop!");
                  
            }
            else { 
                System.out.println("n Menu tidak ditemukan! ");
                  
        }
        }catch (InputMismatchException e){
            System.out.println("\n ERROR: input harus berupa angka bulat!");
            input.next(); // Bersihkan buffer input
        }
                
    }
        input.close();
       } 
}
