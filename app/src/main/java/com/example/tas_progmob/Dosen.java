package com.example.tas_progmob;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Dosen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_dosen);

        ImageButton btn = findViewById(R.id.imgdatadiriDosen);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dosen.this, Data_diri_Dosen.class);
                startActivity(i);

                ImageButton btn = findViewById(R.id.imgkrsDosen);
                btn.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Dosen.this, CRUD_KRS.class);
                        startActivity(i);

                        ImageButton btn = findViewById(R.id.imgkelasDosen);
                        btn.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View v) {
                                Intent i = new Intent(Dosen.this, Data_Kelas.class);
                                startActivity(i);
                            }
                        });
                    }
                })
                ;}
        });
    }
}