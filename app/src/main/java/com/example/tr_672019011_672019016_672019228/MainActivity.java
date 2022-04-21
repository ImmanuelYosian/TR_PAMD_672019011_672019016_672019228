package com.example.tr_672019011_672019016_672019228;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void cobalogin(View v){
        Intent intent1 = new Intent(getApplicationContext(),LoginActivity.class);
        startActivity(intent1);
    }
    public void listproduct(View v){
        Intent intent1 = new Intent(getApplicationContext(),ListProductActivity.class);
        startActivity(intent1);
    }
}