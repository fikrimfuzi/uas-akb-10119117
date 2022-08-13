package com.example.fikri_10119117;
//nama      = fikri muhamad fauzi
//nim       = 10119117
//kelas     = if-3

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class MainMenuActivity2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu2);

        Button btnNote             = findViewById(R.id.btnNote);
        Button btnAbout             = findViewById(R.id.btnAbout);
        Button btnLogout             = findViewById(R.id.btnLogout);

        btnNote.setOnClickListener(this);
        btnAbout.setOnClickListener(this);
        btnLogout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnNote:
                Intent movei1 = new Intent(MainMenuActivity2.this, MainActivity.class);
                startActivity(movei1);
                break;
            case R.id.btnAbout:
                Intent movei12 = new Intent(MainMenuActivity2.this, AboutActivity2.class);
                startActivity(movei12);
                break;
            case R.id.btnLogout:

                final FirebaseAuth mAuth;
                mAuth = FirebaseAuth.getInstance();
                mAuth.signOut();
                Toast.makeText(MainMenuActivity2.this,
                        "Successfully Logged Out",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainMenuActivity2.this, LoginActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                break;
        }
    }

}