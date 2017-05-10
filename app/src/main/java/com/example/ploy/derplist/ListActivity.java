package com.example.ploy.derplist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.ploy.derplist.Adapter.DerpAdapter;
import com.example.ploy.derplist.Model.DerpData;

public class ListActivity extends AppCompatActivity {

    private RecyclerView recView;
    private DerpAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        recView=(RecyclerView)findViewById(R.id.rec_list);

        recView.setLayoutManager(new LinearLayoutManager(this));

        adapter=new DerpAdapter(DerpData.getListData(),this);
        recView.setAdapter(adapter);


    }
}
