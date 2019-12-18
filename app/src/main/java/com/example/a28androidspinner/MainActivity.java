package com.example.a28androidspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    Spinner spinner;
    ArrayList<QuocGia> arrayList;
    QuocGiaAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        arrayList = new ArrayList<>();
        arrayList.add(new QuocGia(R.mipmap.campuchia, "Cam Pu Chia", 1000));
        arrayList.add(new QuocGia(R.mipmap.lao, "Lào", 2000));
        arrayList.add(new QuocGia(R.mipmap.thailan, "Thái Lan", 3000));
        arrayList.add(new QuocGia(R.mipmap.vietnam, "Việt Nam", 4000));
        arrayList.add(new QuocGia(R.mipmap.campuchia, "Cam Pu Chia", 1000));
        arrayList.add(new QuocGia(R.mipmap.lao, "Lào", 2000));
        arrayList.add(new QuocGia(R.mipmap.thailan, "Thái Lan", 3000));
        arrayList.add(new QuocGia(R.mipmap.vietnam, "Việt Nam", 4000));
        arrayList.add(new QuocGia(R.mipmap.campuchia, "Cam Pu Chia", 1000));
        arrayList.add(new QuocGia(R.mipmap.lao, "Lào", 2000));
        arrayList.add(new QuocGia(R.mipmap.thailan, "Thái Lan", 3000));
        arrayList.add(new QuocGia(R.mipmap.vietnam, "Việt Nam", 4000));
        arrayList.add(new QuocGia(R.mipmap.campuchia, "Cam Pu Chia", 1000));
        arrayList.add(new QuocGia(R.mipmap.lao, "Lào", 2000));
        arrayList.add(new QuocGia(R.mipmap.thailan, "Thái Lan", 3000));
        arrayList.add(new QuocGia(R.mipmap.vietnam, "Việt Nam", 4000));
        arrayList.add(new QuocGia(R.mipmap.campuchia, "Cam Pu Chia", 1000));
        arrayList.add(new QuocGia(R.mipmap.lao, "Lào", 2000));
        arrayList.add(new QuocGia(R.mipmap.thailan, "Thái Lan", 3000));
        arrayList.add(new QuocGia(R.mipmap.vietnam, "Việt Nam", 4000));
        arrayList.add(new QuocGia(R.mipmap.campuchia, "Cam Pu Chia", 1000));
        arrayList.add(new QuocGia(R.mipmap.lao, "Lào", 2000));
        arrayList.add(new QuocGia(R.mipmap.thailan, "Thái Lan", 3000));
        arrayList.add(new QuocGia(R.mipmap.vietnam, "Việt Nam", 4000));
        arrayList.add(new QuocGia(R.mipmap.campuchia, "Cam Pu Chia", 1000));
        arrayList.add(new QuocGia(R.mipmap.lao, "Lào", 2000));
        arrayList.add(new QuocGia(R.mipmap.thailan, "Thái Lan", 3000));
        arrayList.add(new QuocGia(R.mipmap.vietnam, "Việt Nam", 4000));
        arrayList.add(new QuocGia(R.mipmap.campuchia, "Cam Pu Chia", 1000));
        arrayList.add(new QuocGia(R.mipmap.lao, "Lào", 2000));
        arrayList.add(new QuocGia(R.mipmap.thailan, "Thái Lan", 3000));
        arrayList.add(new QuocGia(R.mipmap.vietnam, "Việt Nam", 4000));


        adapter = new QuocGiaAdapter(MainActivity.this, R.layout.dong_quoc_gia, arrayList);
        spinner.setAdapter(adapter);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {

            }
        });
    }
}
