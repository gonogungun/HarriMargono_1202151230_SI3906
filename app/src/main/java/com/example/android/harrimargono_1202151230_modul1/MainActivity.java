package com.example.android.harrimargono_1202151230_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //    -------------------------pendeklarasian variabel;
    Button Abnormal, Eatbus;
    EditText makanan, porsi;
    //    -------------------------pendeklarasian variabel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  -------------------------Pencarian menggunakan id
        Eatbus = (Button)findViewById(R.id.btn_eatbus);
        Abnormal = (Button)findViewById(R.id.btn_abnormal);
        makanan = (EditText)findViewById(R.id.namamakanan);
        porsi = (EditText)findViewById(R.id.jumlahmakanan);
        //  -------------------------Pencarian menggunakan id

        //  -------------------------Fungsi Button ABNORMAL
        Abnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this, Main2Activity.class);
                String tempat = Abnormal.getText().toString();
                pindah.putExtra("makanan", makanan.getText().toString());
                pindah.putExtra("tempat", tempat);
                pindah.putExtra("porsi", porsi.getText().toString());
                startActivity(pindah);
            }
        });
        //  -------------------------Fungsi Button ABNORMAL

        //---------------------------Fungsi Button EATBUS
        Eatbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this,Main2Activity.class);
                String tempat = Eatbus.getText().toString();
                pindah.putExtra("makanan", makanan.getText().toString());
                pindah.putExtra("tempat", tempat);
                pindah.putExtra("porsi", porsi.getText().toString());
                startActivity(pindah);
            }
        });
        //---------------------------Fungsi Button EATBUS
    }
}