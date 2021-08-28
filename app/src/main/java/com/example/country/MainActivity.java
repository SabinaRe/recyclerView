package com.example.country;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcview;
    TextView countryN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Countries");

        rcview = findViewById(R.id.rcview);
        rcview.setLayoutManager(new LinearLayoutManager(this));


        String cname[] = {"Nepal", "India", "Phillipines", "Thailand", "China", "Portugal",
        "Poland", "Spain", "Korea", "Japan"};

        String setcode[] = {"+977", "+91", "+33", "+44", "+55", "+66", "+77", "+88", "+99", "+100"};

        int image[] = {R.drawable.nepal, R.drawable.in, R.drawable.phi, R.drawable.thai,R.drawable.nepal, R.drawable.in, R.drawable.phi, R.drawable.thai,R.drawable.phi, R.drawable.thai};

        rcview.setAdapter(new Adapter(cname,setcode,image));






    }
}