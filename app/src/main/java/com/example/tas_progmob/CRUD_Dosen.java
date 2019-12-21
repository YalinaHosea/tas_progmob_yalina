package com.example.tas_progmob;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CRUD_Dosen extends AppCompatActivity {
    EditText nama, nidn, gelar, alamat, foto;
    Button simpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crud_dosen_layout);
        nama = (EditText) findViewById(R.id.editnama);
        nidn = (EditText) findViewById(R.id.editnidn);
        gelar = (EditText) findViewById(R.id.editgelar);
        alamat = (EditText) findViewById(R.id.editalamat);
        simpan = (Button)findViewById(R.id.buttonsavedosen);




        simpan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(nama.getText().toString().length()==0){

                    nama.setError("Nama belum di isi!");
                }else if(nidn.getText().toString().length()==0){

                    nidn.setError("NIDN belum di isi!!");
                }else if(gelar.getText().toString().length()==0){

                    gelar.setError("Gelar belum di isi!");

                }else if(alamat.getText().toString().length()==0){

                    alamat.setError("Alamat belum di isi!");

                }else {

                    Toast.makeText(getApplicationContext(), "Data Tersimpan Terimakasih",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}

