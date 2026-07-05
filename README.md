# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input interaktif pilihan menu dari user untuk menampilkan katalog buah segar serta memproses transaksi pembelian. Sistem akan otomatis menghitung total harga belanjaan dan memperbarui jumlah sisa stok buah di toko setelah transaksi berhasil.

Aplikasi ini mengimplementasikan ke-14 konsep penting dalam pemrograman berorientasi objek (OOP) sesuai lembar penilaian UAS, yaitu: Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Polymorphism (Overriding), Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan di dalam proyek BuahShop:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Buah`, `BuahPrimeum`, dan `MahasiswaBeraksi` adalah contoh dari class.

```bash
public class Buah {
    ...
}

public class BuahPremium extends Buah {
    ...
}

public class TokoBuahMain {
    ...
}

2.Object adalah instance dari class yang dibuat di memori komputer. Pada kode ini, objek dibuat di dalam class main saat mengisi array.
```java
daftarBuah[0] = new Buah("Melon", 12500, 45);
daftarBuah[3] = new BuahPremium("Apel", 60000, 45, "jepang");
```

3. **Atribut** adalah variabel atau karakteristik data yang dimiliki oleh class. Pada class Buah, terdapat atribut nama, harga, dan stok.
```bash
private String nama;
private int harga;
private int stok;;
```

4. **Constructor** adalah method yang pertama kali dijalankan secara otomatis pada saat pembuatan/inisialisasi object.
```bash
public Buah(String nama, int harga, int stok) {
    this.nama = nama;
    this.harga = harga;
    this.stok = stok;
}

public BuahPremium(String nama, int harga, int stok, String asalNegara) {
    super(nama, harga, stok);
    this.asalNegara = asalNegara;
}
```

5. **Mutator** atau setter digunakan untukmengubah/memodifikasi nilai dari suatu atribut private. Di sini digunakan untuk mengurangi stok setelah dibeli.
```bash
public void setStok(int stok) {
    this.stok = stok;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut private yang terbungkus.
```bash
public String getNama() { return nama; }
public int getHarga() { return harga; }
public int getStok() { return stok; }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses via method. Pada class Buah, semua atribut dienkapsulasi demi keamanan data.
```bash
private String nama;
private int harga;
private int stok;
```

8. **Inheritance**(Pewarisan) adalah konsep di mana sebuah class anak mewarisi properti dan method dari class induk. Di sini BuahPremium menjadi class anak yang mewarisi class Buah.
```baash
public class BuahPremium extends Buah {
    ...
}
```

9. **Polymorphism** (Khususnya Method Overriding) adalah konsep di mana nama method yang sama pada class anak menimpa perilaku method class induknya. Pada kode ini, method tampilkanInfo() di-override agar cetakan buah premium menyertakan asal negaranya.
```bash
@Override
public void tampilkanInfo() {
    System.out.println(getNama() + " (" + asalNegara + ") \t| Rp" + getHarga() + "/kg \t| Stok: " + getStok() + " kg");
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` bertingkat untuk percabangan menu utama, validasi nomor buah, dan validasi kecukupan stok buah.

```bash
if (menu == 1) {
    ...
} else if (menu == 2) {
    if (indeks >= 0 && indeks < daftarBuah.length) {
        if (jumlahBeli > 0 && jumlahBeli <= daftarBuah[indeks].getStok()) {
            ...
        }
    }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `while` agar aplikasi terus berjalan, dan loop 'for' untuk menjelajahi array katalog buah.

```bash
while (aplikasiJalan) {
    ...
}

for (int i = 0; i < daftarBuah.length; i++) {
    daftarBuah[i].tampilkanInfo();
}
```

12. **Input Output Sederhana** digunakan untukinteraksi dengan user. Digunakan class Scanner untuk input, dan System.out.println untuk output teks ke layar terminal.

```bash
Scanner input = new Scanner(System.in);
int menu = input.nextInt();
System.out.println("Total Belanjaan Anda: Rp" + totalHarga);
```

13. **Array** (Array of Object) adalah struktur data terurut untuk menampung banyak data sejenis. Di sini dipakai menampung 7 objek buah di satu variabel.

```bash
Buah[] daftarBuah = new Buah[7];
```

14. **Error Handling** digunakan untuk mencegah aplikasi crash jika terjadi runtime error. Menggunakan blok try-catch untuk mengantisipasi kesalahan ketik user (misal input huruf pada angka).

```bash
try {
    int menu = input.nextInt();
    ...
} catch (InputMismatchException e) {
    System.out.println("\n ERROR: input harus berupa angka bulat!");
    input.next();
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama:Moh Hafiz Anshari 
NPM: 2410010142
