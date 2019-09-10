# Laporan Praktikum #2 - Class dan Object

## Kompetensi

- 1 Mahasiswa dapat memahami deskripsi dari class dan object
- 2 Mahasiswa memahami implementasi dari class 
- 3 Mahasiswa dapat memahami implementasi dari attribute 
- 4 Mahasiswa dapat memahami implementasi dari method 
- 5 Mahasiswa dapat memahami implementasi dari proses instansiasi 
- 6 Mahasiswa dapat memahami implementasi dari try-catch 
- 7 Mahasiswa dapat memahami proses pemodelan class diagram menggunakan UML 

## Ringkasan Materi

- Class adalah abstraksi dari sebuah object (nyata ataupun tdk nyata) (roger s pressman).
- Method adalah suatu blok dari program yang berisi kode program nama dan properti yang       dapat digunakan kembali. Method dapat mempunyai nilai balik atau tidak. Kata kunci untuk    mengembalikan/mengeluarkan suatu nilai adalah return 
- Proses pembuatan Object dari suatu Class disebut instansiasi.
- Untuk menangani error di Java, digunakan sebuah statement yang bernama try - catch.         Statement tersebut digunakan untuk mengurung eksekusi yang menampilkan error dan dapat      membuat program tetap berjalan tanpa dihentikan secara langsung
- Unified Modeling Language ( UML ) adalah tujuan umum, perkembangan, bahasa pemodelan di     bidang rekayasa perangkat lunak , yang dimaksudkan untuk menyediakan cara standar untuk     memvisualisasikan desain sistem.
- Class diagram adalah sebuah class yang menggambarkan struktur dan penjelasan class, paket, `dan objek serta hubungan satu sama lain seperti pewarisan, asosiasi, dan lainlain.




## Percobaan

### Percobaan 1

Kita dapat mengetahui pengurangan dan pertambahan kecepatan jika terjadi pergantian gear dan pengeriman rem.

`contoh screenshot yang benar, menampilkan 3 komponen, yaitu struktur project, kode program, dan hasil kompilasi`

![contoh screenshot](img/ssss.png)



### Percobaan 2

Membuat dan mengakses anggota suatu classs

![contoh screenshot](img/sss.png)

Contoh link kode program : [TestMahasiswa1841720070yayak](../../src/2_Class_dan_Object/TestMahasiswa1841720070yayak.java)

Jelaskan pada bagian mana proses pendeklarasian atribut pada program diatas!
- Seluruh Atribut dideklarasikan dengan public pada class Mahasiswa

Jelaskan pada bagian mana proses pendeklarasian method pada program diatas!
- Seluruh method dideklarasikan pada class Mahasiswa

Berapa banyak objek yang di instansiasi pada program diatas!
- 1 

 Apakah yang sebenarnya dilakukan pada sintaks program “mhs1.nim=101” ?
- atribut mhs,nim bernilai 101 

 Apakah yang sebenarnya dilakukan pada sintaks program “mhs1.tampilBiodata()” ?
- Memanggil method tampilBiodata pada mhs1

Instansiasi 2 objek lagi pada program diatas!
- Syntax :

        Mahasiswa1841720070yayak mhs1=new Mahasiswa1841720070yayak();
        mhs1.nim=101;
        mhs1.nama="cahya";
        mhs1.alamat="Tulungagung";
        mhs1.kelas="TI2C";
        mhs1.tampilBiodata1841720070yayak();
    }
        
        

### Percobaan 3

Menulis method yang memiliki argument/parameter dan memiliki return

![contoh screenshot](img/ss2.png)

Link kode program :

[Barang1841720070yayak.java](../../src/2_Class_dan_Object/Barang1841720070yayak.java)

[TestBarang1841720070yayak.java](../../src/2_Class_dan_Object/TestBarang1841720070yayak.java)

 Apakah fungsi argumen dalam suatu method
 - Untuk menambahkan data dari luar method
 
 Ambil kesimpulan tentang kegunaan dari kata kunci return , dan kapan suatu method harus memiliki return!
 - return berfungsi untuk mengembalikkan nilai akhir dari suatu method return dapat digunakan hanya pada method yang memiliki nilai misalnya meethod bertipe integer
 
 

## Tugas

## Tugas1
![contoh screenshot](img/ss1.png)


### Tugas2

![contoh screenshot](img/sstg2.png)

Link kode program :

[Tokosewa1841720070yayak.java](../../src/2_Class_dan_Object/Tokosewa1841720070yayak.java)

[testtoko1841720070yayak.java](../../src/2_Class_dan_Object/testtoko1841720070yayak.java)

### Tugas3

![contoh screenshot](img/sstg3.png)

Link kode program :

[T3Lingkaran1841720143yayak.java](../../src/2_Class_dan_Object/T3Lingkaran1841720143yayak.java)

[T3TestLingkaran181720070yayak.java](../../src/2_Class_dan_Object/T3TestLingkaran181720070yayak.java)

### Tugas4

![contoh screenshot](img/sstg4.png)

Link kode program :

[T4Barang_tgas1841720070yayak.java](../../src/2_Class_dan_Object/T4Barang_tgas1841720070yayak.java)

[T4BarangTugasMain1841720143yayak.java](../../src/2_Class_dan_Object/T4BarangTugasMain1841720143yayak.java)

## Kesimpulan

program ialah fungsi variabel yang bersatu.

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

Cahya Abdillah