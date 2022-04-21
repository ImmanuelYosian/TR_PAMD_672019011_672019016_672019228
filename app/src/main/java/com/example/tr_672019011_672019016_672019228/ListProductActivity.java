package com.example.tr_672019011_672019016_672019228;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListProductActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_product);
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button8);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListProductActivity.this, DeskripsiProductActivity.class);
                intent.putExtra("title",getString(R.string.namaproduct1));
                intent.putExtra("hargaproduct",getString(R.string.hargaproduct1));
                intent.putExtra("deskripsiproduct",getString(R.string.DeskripsiProduct1));
                intent.putExtra("url", getString(R.string.fotoproduct1));
                startActivity(intent);

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListProductActivity.this, DeskripsiProductActivity.class);
                intent.putExtra("title",getString(R.string.namaproduct2));
                intent.putExtra("hargaproduct",getString(R.string.hargaproduct2));
                intent.putExtra("deskripsiproduct",getString(R.string.DeskripsiProduct2));
                intent.putExtra("url", getString(R.string.fotoproduct2));
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListProductActivity.this, DeskripsiProductActivity.class);
                intent.putExtra("title",getString(R.string.namaproduct3));
                intent.putExtra("hargaproduct",getString(R.string.hargaproduct3));
                intent.putExtra("deskripsiproduct",getString(R.string.DeskripsiProduct3));
                intent.putExtra("url", getString(R.string.fotoproduct3));
                startActivity(intent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListProductActivity.this, DeskripsiProductActivity.class);
                intent.putExtra("title",getString(R.string.namaproduct4));
                intent.putExtra("hargaproduct",getString(R.string.hargaproduct4));
                intent.putExtra("deskripsiproduct",getString(R.string.DeskripsiProduct4));
                intent.putExtra("url", getString(R.string.fotoproduct4));
                startActivity(intent);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListProductActivity.this, DeskripsiProductActivity.class);
                intent.putExtra("title",getString(R.string.namaproduct5));
                intent.putExtra("hargaproduct",getString(R.string.hargaproduct5));
                intent.putExtra("deskripsiproduct",getString(R.string.DeskripsiProduct5));
                intent.putExtra("url", getString(R.string.fotoproduct5));
                startActivity(intent);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListProductActivity.this, DeskripsiProductActivity.class);
                intent.putExtra("title",getString(R.string.namaproduct6));
                intent.putExtra("hargaproduct",getString(R.string.hargaproduct6));
                intent.putExtra("deskripsiproduct",getString(R.string.DeskripsiProduct6));
                intent.putExtra("url", getString(R.string.fotoproduct6));
                startActivity(intent);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListProductActivity.this, DeskripsiProductActivity.class);
                intent.putExtra("title",getString(R.string.namaproduct7));
                intent.putExtra("hargaproduct",getString(R.string.hargaproduct7));
                intent.putExtra("deskripsiproduct",getString(R.string.DeskripsiProduct7));
                intent.putExtra("url", getString(R.string.fotoproduct7));
                startActivity(intent);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListProductActivity.this, DeskripsiProductActivity.class);
                intent.putExtra("title",getString(R.string.namaproduct8));
                intent.putExtra("hargaproduct",getString(R.string.hargaproduct8));
                intent.putExtra("deskripsiproduct",getString(R.string.DeskripsiProduct8));
                intent.putExtra("url", getString(R.string.fotoproduct8));
                startActivity(intent);
            }
        });
    }
}