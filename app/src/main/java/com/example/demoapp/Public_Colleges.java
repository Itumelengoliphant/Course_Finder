package com.example.demoapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Application;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;
import java.util.List;

public class Public_Colleges extends AppCompatActivity implements CollegeAdapter.ItemClicked {

    Spinner spProv;
    Button btnOk;
    TextInputEditText textInputLayout;
    RecyclerView rvProv;
    RecyclerView.Adapter myAdapter;
    RecyclerView.LayoutManager layoutManager;
    Dialog popDialog;

    TextView tvName,tvTel,tvMail,tvProv,tvCity,tvWeb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_public__colleges);

        popDialog = new Dialog(this);
        popDialog.setContentView(R.layout.pop_up_descr_layout);

        tvName = popDialog.findViewById(R.id.tvName);
        tvTel = popDialog.findViewById(R.id.tvTel);
        tvMail = popDialog.findViewById(R.id.tvMail);
        tvProv = popDialog.findViewById(R.id.tvProv);
        tvCity = popDialog.findViewById(R.id.tvCity);
        btnOk = popDialog.findViewById(R.id.btnOk);
        tvWeb = popDialog.findViewById(R.id.tvWeb);

        tvWeb.setMovementMethod(LinkMovementMethod.getInstance());

        rvProv = findViewById(R.id.rvProv);
        rvProv.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        rvProv.setLayoutManager(layoutManager);

        myAdapter = new CollegeAdapter(Public_Colleges.this, ApplicationClass.CollegeList);
        rvProv.setAdapter(myAdapter);

    }

    public void onSearchSelected(View v){

        LayoutInflater inflater = getLayoutInflater();
        final View view = inflater.inflate(R.layout.college_names_layout,null);

        textInputLayout = view.findViewById(R.id.edt_name);

        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle(R.string.search_col);
        dialog.setView(view);
        dialog.setIcon(R.mipmap.school);

        dialog.setPositiveButton("OK", (dialog12, which) -> {


        });

        dialog.setNegativeButton("Cancel", (dialog1, which) -> {

        });

        dialog.show();

    }

    public void onFilterSelected(View v){

        LayoutInflater inflater = getLayoutInflater();
        final View view = inflater.inflate(R.layout.province_layout_dialog,null);


        spProv = view.findViewById(R.id.spProv);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.province_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spProv.setAdapter(adapter);

        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("Filter through province");
        dialog.setView(view);
        dialog.setIcon(R.mipmap.school);

        dialog.setPositiveButton("OK", (dialog12, which) -> {


        });

        dialog.setNegativeButton("Cancel", (dialog1, which) -> {

        });

        dialog.show();
    }


    @Override
    public void onItemClicked(int index) {

        tvName.setText(ApplicationClass.CollegeList.get(index).getName());
        tvTel.setText(ApplicationClass.CollegeList.get(index).getTel());
        tvMail.setText(ApplicationClass.CollegeList.get(index).getMail());
        tvCity.setText(ApplicationClass.CollegeList.get(index).getCity());
        tvProv.setText(ApplicationClass.CollegeList.get(index).getProvince());
        tvWeb.setText(" "+ApplicationClass.CollegeList.get(index).getWeb());


        btnOk.setOnClickListener(view -> {
            popDialog.dismiss();
        });

        popDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        popDialog.show();




    }
}
