package com.example.odstask;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

        ImageView imagesheet;

        Spinner spinner;
        String[] data= {"ramakrishna_boddula"};
        ArrayAdapter<String> arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        spinner = findViewById(R.id.spinner);
        arrayAdapter = new ArrayAdapter<>(MainActivity2.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, data);
        spinner.setAdapter(arrayAdapter);

    }
}