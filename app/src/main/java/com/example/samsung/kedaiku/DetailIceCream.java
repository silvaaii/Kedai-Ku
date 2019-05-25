package com.example.samsung.kedaiku;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

/**
 * Created by samsung on 21/11/2017.
 */
public class DetailIceCream extends AppCompatActivity {
    int hargasatuan = 10000;
    int jumlahpesanan = 0;
    String et_nama;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView(R.layout.activity_detail_ice_cream);

    }


    public void pesanClick(View view) {
        TextView tv_detailPesanan =(TextView) findViewById(R.id.tv_detailPesanan);
        int hargaBayar = hargasatuan * jumlahpesanan;
        EditText nama = (EditText)findViewById(R.id.et_nama);
        String et_nama = nama.getText().toString().trim();

        CheckBox cb_chocolate = (CheckBox) findViewById(R.id.cb_chocolate);
        CheckBox cb_strawberry = (CheckBox)findViewById(R.id.cb_strawberry);
        CheckBox cb_vanilla = (CheckBox)findViewById(R.id.cb_vanilla);
        CheckBox cb_mocca = (CheckBox)findViewById(R.id.cb_mocca);


        if(cb_chocolate.isChecked()){
            hargaBayar = hargaBayar ;
        }

        if(cb_strawberry.isChecked()){
            hargaBayar = hargaBayar ;
        }

        if(cb_vanilla.isChecked()){
            hargaBayar = hargaBayar + 5000 ;
        }

        if(cb_mocca.isChecked()){
            hargaBayar = hargaBayar + 5000 ;
        }

        tv_detailPesanan.setText(Integer.toString(hargaBayar));
        tv_detailPesanan.setText("" +
                "Nama : " + et_nama + "\n" +
                "Total Jumlah Yang Harus Dibayar : " + hargaBayar + "\n" +
                "Selamat Menikmati"
        );
    }

    public void tambahClick(View view) {
        jumlahpesanan = jumlahpesanan + 1;
        tampilkanJumlahPesanan();
    }

    public void kurangClick(View view) {
        jumlahpesanan = jumlahpesanan - 1;
        tampilkanJumlahPesanan();
    }

    private void tampilkanJumlahPesanan(){
        TextView tv_banyakPesanan = (TextView) findViewById(R.id.tv_banyakPesanan);
        tv_banyakPesanan.setText(Integer.toString(jumlahpesanan));
    }



}
