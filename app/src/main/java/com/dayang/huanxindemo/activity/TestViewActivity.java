package com.dayang.huanxindemo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.dayang.huanxindemo.Adapter.MaxAdapter;
import com.dayang.huanxindemo.R;
import com.dayang.huanxindemo.view.MaxHeightRecyclerView;

import java.util.ArrayList;

public class TestViewActivity extends AppCompatActivity {

    private MaxHeightRecyclerView max;
    private Button delete;
    private Button add;
    ArrayList<String> list;
    private MaxAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_view);
        max = (MaxHeightRecyclerView) findViewById(R.id.max);
        add = (Button) findViewById(R.id.add);
        list = new ArrayList<>();
        list.add("");
        adapter = new MaxAdapter(list, this);
        max.setLayoutManager(new LinearLayoutManager(this));
        max.setAdapter(adapter);
        max.setItemAnimator(new DefaultItemAnimator());
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.add("");
                adapter.notifyDataSetChanged();
            }
        });
        delete = (Button) findViewById(R.id.delete);
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (list.size() > 0) {
                    list.remove(list.size() - 1);
                    adapter.notifyItemRemoved(list.size() - 1);
                } else {
                    Toast.makeText(getApplicationContext(), "已经删光了", 0).show();
                }
            }
        });
    }

}
