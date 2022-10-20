package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rec_Makanan;
    private ArrayList <Kuliner> listMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rec_Makanan = findViewById(R.id.rec_Makanan);
        initData();

        // memanggil class KulinerAdapter agar menu muncul
        rec_Makanan.setAdapter(new KulinerAdapter(listMakanan));
        rec_Makanan.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData() {
        this.listMakanan = new ArrayList<>();
        listMakanan.add(new Kuliner("Nasi Goreng",
                "Rp. 12.000",
                "Nasi goreng adalah makanan berupa nasi yang digoreng dan dicampur dalam minyak goreng, margarin atau mentega. Biasanya ditambah kecap manis, bawang merah, bawang putih, asam jawa, lada dan bahan lainnya; seperti telur, daging ayam, dan kerupuk." +
                        "Nasi Goreng sangat populer di Indonesia. Banhkan banyak orang luar negeri yang menyukai nasi goreng",
                R.drawable.img));

        listMakanan.add(new Kuliner("Gudeg",
                "Rp. 10.000",
                "Gudeg (bahasa Jawa: ꦒꦸꦝꦼꦒ꧀, translit. Gudhěg) adalah hidangan khas Provinsi Yogyakarta dan Jawa Tengah yang terbuat dari nangka muda yang dimasak dengan santan." +
                        "Perlu waktu berjam-jam untuk membuat hidangan ini. Warna coklat biasanya dihasilkan oleh daun jati yang dimasak bersamaan.",
                R.drawable.gudeg));

        listMakanan.add(new Kuliner("Rendang",
                "Rp. 20.000",
                "Rendang atau randang dalam bahasa Minangkabau (Jawi: رندڠ) adalah Masakan Minangkabau yang berbahan dasar daging yang berasal dari Sumatera Barat, Indonesia. " +
                        "Masakan ini dihasilkan dari proses memasak suhu rendah dalam waktu lama dengan menggunakan aneka rempah-rempah dan santan.",
                R.drawable.rendang));
        listMakanan.add(new Kuliner("Soto Ayam",
                "Rp. 12.000",
                "Soto ayam adalah makanan khas Indonesia yang berupa sejenis sup ayam dengan kuah yang berwarna kekuningan. Warna kuning ini dikarenakan oleh kunyit yang digunakan sebagai bumbu. " +
                        "Soto ayam banyak ditemukan di daerah-daerah di Indonesia dan Singapura.",
                R.drawable.sotoayam));
        listMakanan.add(new Kuliner("Rawon",
                "Rp. 15.000",
                "Rawon adalah masakan Indonesia berupa sup daging berkuah hitam sebagai campuran bumbu khas yang mengandung kluwek. " +
                        "Rawon, meskipun dikenal sebagai masakan khas Jawa Timur, dikenal pula oleh masyarakat Jawa Tengah sebelah timur.",
                R.drawable.rawon));
        listMakanan.add(new Kuliner("Pempek",
                "Rp. 10.000",
                "Pempek adalah salah satu makanan tradisional asal Palembang provinsi Sumatera Selatan. " +
                        "Makanan ini terbuat dari bahan dasar sagu dan ikan karena di Bangka masyarakatnya mayoritas nelayan dan merupakan provinsi tetangga dari Palembang, oleh karena itu pempek mudah ditemui di kepulauan Bangka Belitung.",
                R.drawable.pempek));
    }



}