package com.example.tas_progmob;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Admin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);


        ImageButton btn = findViewById(R.id.buttonimgdaftardosen);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(Admin.this, CRUD_Dosen.class);
                startActivity(i);


                ImageButton btn = findViewById(R.id.buttonimgkrs);
                btn.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Admin.this, CRUD_KRS.class);
                        startActivity(i);

                        ImageButton btn = findViewById(R.id.buttonimgmatkul);
                        btn.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View v) {
                                Intent i = new Intent(Admin.this, CRUD_Matkul.class);
                                startActivity(i);

                                ImageButton btn = findViewById(R.id.buttonimgMhs);
                                btn.setOnClickListener(new View.OnClickListener() {

                                    @Override
                                    public void onClick(View v) {
                                        Intent i = new Intent(Admin.this, CRUD_Mahasiswa.class);
                                        startActivity(i);
                                    }
                                });
                            }
                        })
                        ; }
                });
            }
        })
        ;}}