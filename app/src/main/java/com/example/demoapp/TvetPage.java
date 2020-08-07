package com.example.demoapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class TvetPage extends AppCompatActivity {

    Button btnPubCollege,btnFacts,btnPrivateCollege,btnOK;
    Dialog popDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tvet_col);

        btnPubCollege = findViewById(R.id.btnPubCollege);


        btnFacts = findViewById(R.id.btnFacts);

        btnPrivateCollege = findViewById(R.id.btnPrivateCollege);

        btnPrivateCollege.setOnClickListener(v -> {
            popDialog = new Dialog(this);
            popDialog.setContentView(R.layout.pop_up);
            btnOK = popDialog.findViewById(R.id.btnOK);
            btnOK.setOnClickListener(view -> {
                popDialog.dismiss();
            });
            popDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            popDialog.show();
        });

        btnPubCollege.setOnClickListener(v -> {

            Intent intent = new Intent(TvetPage.this, Public_Colleges.class);
            startActivity(intent);
        });

        btnFacts.setOnClickListener(v -> {

            LayoutInflater inflater = getLayoutInflater();
            final View view = inflater.inflate(R.layout.pop_up,null);

            //textInputLayout = view.findViewById(R.id.edt_name);

            AlertDialog.Builder dialog = new AlertDialog.Builder(this);
            //dialog.setTitle(R.string.search_col);
            dialog.setView(view);
            //dialog.setIcon(R.mipmap.school);

            dialog.setPositiveButton("MORE FACTS", (dialog12, which) -> {


            });

            dialog.setNegativeButton("Cancel", (dialog1, which) -> {

            });

            dialog.show();
        });

    }

    public void onFactsSelection(View v){

    }
}

