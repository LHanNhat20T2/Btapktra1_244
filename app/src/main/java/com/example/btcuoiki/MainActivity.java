package com.example.btcuoiki;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lvsinger;
    ArrayList<Singer> singer = new ArrayList<>();
    SingerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    public void initView(){
        lvsinger = (ListView) findViewById(R.id.lv);
        lvsinger.setSelected(true);
        singer.add(new Singer(R.drawable.sontung,"Nguyễn Thanh Tùng","Sơn Tùng MTP","Việt Nam","*****"));
        singer.add(new Singer(R.drawable.dongnhi,"Mai Hồng Ngọc","Đông Nhi","Việt Nam","****"));
        singer.add(new Singer(R.drawable.erik,"Lê Trung Thành","Erik","Việt Nam","*****"));
        singer.add(new Singer(R.drawable.chiphu,"Nguyễn Thùy Chi","ChiPu","Việt Nam","****"));
        singer.add(new Singer(R.drawable.phuocthinh,"Nguyễn Phước Thịnh","Noo Phước Thịnh","Việt Nam","*****"));
        singer.add(new Singer(R.drawable.mytam,"Phan Thị Mỹ Tâm","Mỹ Tâm","Việt Nam","*****"));
        adapter = new SingerAdapter(MainActivity.this, singer);
        lvsinger.setAdapter(adapter);

        lvsinger.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            }
        });


    }
}
