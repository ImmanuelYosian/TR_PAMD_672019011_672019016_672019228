package com.example.tr_672019011_672019016_672019228;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class DeskripsiProductActivity extends AppCompatActivity {

    Button btnPesan;
    EditText etNamaAlat;
    EditText etWaktuPesan;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    DataPesan dataPesan;
    String userId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi_product);

        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("pesan");

        btnPesan = (Button) findViewById(R.id.pesan);
        etNamaAlat = (EditText) findViewById(R.id.Namaalat);
        etWaktuPesan = (EditText) findViewById(R.id.Waktupesan);

        btnPesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dataPesan = new DataPesan(etNamaAlat.getText().toString(),etWaktuPesan.getText().toString());
                setFirebase();
            }
        });



    }

    private void setFirebase() {
        userId = databaseReference.push().getKey();
        Log.d("DataPesan", dataPesan.toString());

        databaseReference.child(userId).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                // inside the method of on Data change we are setting
                // our object class to our database reference.
                // data base reference will sends data to firebase.
                databaseReference.child(userId).setValue(dataPesan);

                // after adding this data we are showing toast message.
                Toast.makeText(DeskripsiProductActivity.this, "data added", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                // if the data is not added or it is cancelled then
                // we are displaying a failure toast message.
                Toast.makeText(DeskripsiProductActivity.this, "Fail to add data " + error, Toast.LENGTH_SHORT).show();
            }
        });
    }


}