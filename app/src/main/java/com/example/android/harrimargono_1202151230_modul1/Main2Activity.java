package com.example.android.harrimargono_1202151230_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Integer.parseInt;

public class Main2Activity extends AppCompatActivity {
    //------------------Pendeklarasian variable uang saku
    int uangSaku = 65000; int biaya, total, hargaTotal;
    //------------------Pendeklarasian variable uang saku

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView Makanan = (TextView)findViewById(R.id.namamakanan);
        TextView Qty = (TextView)findViewById(R.id.jumlahporsi);
        TextView lokasi = (TextView)findViewById(R.id.dengan2);
        TextView hasil = (TextView)findViewById(R.id.harga);

        //--------------------Intent dari layout 1
        Intent i = getIntent();
        //--------------------Intent dari layout 1

        //--------------------Penerimaan DAta
        String makanan = i.getStringExtra("makanan");
        String Lokasi = i.getStringExtra("tempat");
        String qty = i.getStringExtra("porsi");
        //--------------------Penerimaan DAta

        //--------------------Display
        Makanan.setText(makanan);
        Qty.setText(qty);
        lokasi.setText(Lokasi);

        switch (Lokasi){
            case "EATBUS":
                biaya = 50000;
                break;
            case "ABNORMAL":
                biaya = 30000;
                break;
        }

        //------------------Perhitungan
        total = parseInt(qty) * biaya;
        String hargaTotal = Integer.toString(total);
        if(uangSaku < total){
            hasil.setText("Rp"+hargaTotal);
            Toast.makeText(this, "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_SHORT).show();
        }else{
            hasil.setText("Rp"+hargaTotal);
            Toast.makeText(this, "Disini Aja makan malamnya", Toast.LENGTH_SHORT).show();
        }
    }
}