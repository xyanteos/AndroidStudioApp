package com.example.studentwsb.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private TextView pLList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pLList = findViewById(R.id.tv_pl_names);
        String[] names = {"Maciej","Nowacki"};
        for (String name:names)
            pLList.append("\n"+name);
    }

}
