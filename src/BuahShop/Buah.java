
package BuahShop;
//CLASS & 7. ENCAPSULATION

public class Buah {
   // ATRIBUT
   private String nama;
   private int harga;
   private int stok;
   // Constructor
   public Buah(String nama, int harga, int stok){
       this.nama = nama;
       this.harga = harga;
       this.stok = stok;
      
   }
   //accesor (getter)
   public String getNama(){return nama;}
   public int getHarga(){return harga;}
   public int getStok(){return stok;}
   // Mutator (setter)
   public void setStok(int stok){ this.stok = stok;}
   // POLYMORPHISM (Method Dasar)
   public void tampilkanInfo(){
      System.out.println(nama + " \t\t| Rp" + harga + "/kg \t| Stok: " + stok + " kg");
   }
}
