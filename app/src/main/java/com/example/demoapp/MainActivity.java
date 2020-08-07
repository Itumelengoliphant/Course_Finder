package com.example.demoapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import id.ionbit.ionalert.IonAlert;

public class MainActivity extends AppCompatActivity {

    Button btnCollege,btnUni,btnUniTech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCollege = findViewById(R.id.btnTVET);
        btnUni = findViewById(R.id.btnUni);
        btnUniTech = findViewById(R.id.btnUniTech);

       /* AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        // Get the layout inflater
        LayoutInflater inflater = requireActivity().getLayoutInflater();

        // Inflate and set the layout for the dialog
        // Pass null as the parent view because its going in the dialog layout
        builder.setView(inflater.inflate(R.layout.dialog_signin, null))
                // Add action buttons
                .setPositiveButton(R.string.signin, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // sign in the user ...
                    }
                })
                .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        LoginDialogFragment.this.getDialog().cancel();
                    }
                });
        return builder.create(); */

        btnCollege.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               Intent intent = new Intent(MainActivity.this,TvetPage.class);
                startActivity(intent);

              //  ionSuccessMessage(MainActivity.this,"Successful","Your message was delivered");
            }
        });

        btnUni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 /* Intent intent = new Intent(MainActivity.this,Universities.class);
                startActivity(intent);*/
                ionWarningMessage(MainActivity.this,"Not Successful","Your message was Not delivered");
            }
        });

        btnUniTech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               /* Intent intent = new Intent(MainActivity.this,Technikons.class);
                startActivity(intent);*/

               ionErrorMessage(MainActivity.this,"Warning","Your message is to be delivered");
            }
        });


    }

   public void ionMessage(Context c, String message){

        new IonAlert(c)
                .setTitleText(message)
                .show();
    }

    public void ionMessageWithText(Context c, String message, String content){
        new IonAlert(c)
                .setTitleText(message)
                .setContentText(content)
                .show();
    }

    public void ionErrorMessage(Context c, String message, String content){
        new IonAlert(c, IonAlert.WARNING_TYPE)
                .setTitleText(message)
                .setContentText(content)
                .show();
    }

    public void ionWarningMessage(Context c, String message, String content){
        new IonAlert(c, IonAlert.ERROR_TYPE)
                .setTitleText(message)
                .setContentText(content)
                .show();
    }

    public void ionSuccessMessage(Context c, String message, String content){
        new IonAlert(c, IonAlert.SUCCESS_TYPE)
                .setTitleText(message)
                .setContentText(content)
                .show();
    }

    public void ionSuccessIconMessage(Context c, String message, String content) {
        new IonAlert(MainActivity.this, IonAlert.SUCCESS_TYPE)
                .setTitleText(message)
                .setContentText(content)
                .setCustomImage(R.drawable.info)
                .show();
    }
}
