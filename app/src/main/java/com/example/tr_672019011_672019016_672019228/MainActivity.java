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
    public void bookingsekarang(View v){
        Intent intent = new Intent(MainActivity.this, DeskripsiProductActivity.class);
        intent.putExtra("title",getString(R.string.namaproduct6));
        intent.putExtra("hargaproduct",getString(R.string.hargaproduct6));
        intent.putExtra("deskripsiproduct",getString(R.string.DeskripsiProduct6));
        intent.putExtra("url", getString(R.string.fotoproduct6));
        startActivity(intent);
    }
    public void listproduct(View v){
        Intent intent1 = new Intent(getApplicationContext(),ListProductActivity.class);
        startActivity(intent1);
    }
}