package com.example.tr_672019011_672019016_672019228;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = (Button)findViewById(R.id.login);

        login.setOnClickListener(v -> {
            Intent intent1 = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent1);
        });
    }
}