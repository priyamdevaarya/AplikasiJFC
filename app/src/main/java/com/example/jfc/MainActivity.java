package com.example.jfc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Model> main_list;
    RecyclerView.Adapter adapter;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_list:
                break;
            case R.id.action_grid:
                break;
            case R.id.action_cardview:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main_list=new ArrayList<>();
        recyclerView=findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        main_list.add(new Model(R.drawable.pajay1,"Pajay1","Paket Pajay1 adalah paket hemat unggulan yang berisi nasi, ayam dan es teh. Ayam yang bisa dipilih antara lain yaitu ayam bagian paha bawah atau sayap"));
        main_list.add(new Model(R.drawable.pajay2,"Pajay2","Paket Pajay2 adalah paket hemat unggulan yang berisi nasi, ayam dan es teh. Ayam yang bisa dipilih antara lain yaitu ayam bagian dada atau paha atas"));
        main_list.add(new Model(R.drawable.pajay3,"Pajay3","Paket Pajay3 adalah paket hemat unggulan yang berisi chiken burger, kentang, dan es teh"));
        main_list.add(new Model(R.drawable.pajay4,"Pajay4","Paket Pajay4 adalah paket hemat unggulan yang berisi beef burger, kentang, dan es teh"));
        main_list.add(new Model(R.drawable.pajay5,"Pajay5","Paket Pajay5 adalah paket hemat unggulan yang berisi chicken sosis, kentang, dan es teh"));
        main_list.add(new Model(R.drawable.pajay6,"Pajay6","Paket Pajay6 adalah paket hemat unggulan yang berisi beef sosis, kentang, dan es teh"));
        adapter=new AdapterCustom(main_list,getApplicationContext());
        recyclerView.setAdapter(adapter);
    }
}