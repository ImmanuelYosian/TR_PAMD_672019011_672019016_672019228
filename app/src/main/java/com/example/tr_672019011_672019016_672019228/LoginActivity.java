package com.example.tr_672019011_672019016_672019228;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView nama =(TextView) findViewById(R.id.nama);
        TextView pass =(TextView) findViewById(R.id.pass);



        login = (Button)findViewById(R.id.login);

        login.setOnClickListener(v -> {
            if(nama.getText().toString().equals("admin") &&  pass.getText().toString().equals("12345")){
                Toast.makeText(LoginActivity.this,"Login Suskes",Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent1);
            }else {
                Toast.makeText(LoginActivity.this, "Login Gagal", Toast.LENGTH_SHORT).show();
            }
        });
    }
}