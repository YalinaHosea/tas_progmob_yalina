package com.example.tas_progmob;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Toolbar;


import androidx.appcompat.app.AppCompatActivity;

public class CRUD_Mahasiswa extends AppCompatActivity {
    private Toolbar toolbar;
    private EditText inputNama;
    private EditText inputNim;
    private EditText inputEmail;
    private static EditText inputAlamat;
    private EditText inputFoto;
    private Button buttonsaveMhs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crud_mahasiswa_layout);
        inputNama = (EditText) findViewById(R.id.editnama);
        inputNim = (EditText) findViewById(R.id.editnim);
        inputEmail = (EditText) findViewById(R.id.editEmail);
        inputAlamat = (EditText) findViewById(R.id.editalamat);
        buttonsaveMhs = (Button) findViewById(R.id.buttonsaveMhs);

        buttonsaveMhs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SimpanData();
            }
        });
    }

    /**
     * Validasi form
     */
    private void SimpanData() {
        if (!validateNama()) {
            return;
        }

        if (!validateNim()) {
            return;
        }

        if (!validateEmail()) {
            return;
        }
        if (!validatAlamat()) {
            return;

            Toast.makeText(getApplicationContext(), "Thank You!", Toast.LENGTH_SHORT).show();
        }

    }

    private boolean validateNama() {
        if (inputNama.getText().toString().trim().isEmpty()) {
            EditText.setError(getString(R.string.hint_name));
            requestFocus(inputNama);
            return false;
        } else {
            inputNama.setError(false);
        }

        return true;
    }
    private boolean validateNim() {
        if (inputNim.getText().toString().trim().isEmpty()) {
            EditText.setError(getString(R.string.hint_name));
            requestFocus(inputNim);
            return false;
        } else {
            inputNim.setError(false);
        }
    }


    private boolean validatAlamat() {
        if (inputAlamat.getText().toString().trim().isEmpty()) {
            EditText.setError(getString(R.string.hint_name));
            requestFocus(inputAlamat);
            return false;
        } else {
            inputAlamat.setError(false);
        }
    }
}

    private static boolean validateEmail(String email) {
        return !TextUtils.isEmpty(email) && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    private static void requestFocus(View view) {
        if (view.requestFocus()) {
            getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
        }
    }
}
