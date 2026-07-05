
package BuahShop;

//  INHERITANCE (Pewarisan dari class Buah)
public class BuahPremium extends Buah {
    private String asalNegara; 

    public BuahPremium(String nama, int harga, int stok, String asalNegara) {
        super(nama, harga, stok); // Memanggil constructor class induk
        this.asalNegara = asalNegara;
    }

    // 9. POLYMORPHISM (Overriding)
    @Override
    public void tampilkanInfo() {
       System.out.println(getNama() + " (" + asalNegara + ") \t| Rp" + getHarga() + "/kg \t| Stok: " + getStok() + " kg");
    }
}
