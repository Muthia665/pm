package com.example.user.pm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    ListView ListView;


    String nama[] = {
            "doraemon", "hellokity", "kiko", "pororo", "tsum"
    };

    int gambar[] ={
            R.drawable.doraemon, R.drawable.hellokity, R.drawable.kiko, R.drawable.pororo, R.drawable.tsum
    };


    int keterangan[] = {
            R.string.ketdoraemon, R.string.kethellokity, R.string.ketkiko, R.string.ketpororo, R.string.kettsum
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView = findViewById(R.id.ListView);

        AdapterList adapterList = new AdapterList(this,nama,gambar,keterangan);
        ListView .setAdapter(adapterList);
        ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent q = new Intent(getApplicationContext(),detail.class);
                q.putExtra("nama",nama[position]);
                q.putExtra("gambar",gambar[position]);
                q.putExtra("keterangan", keterangan[position]);

                startActivity(q);
            }
        });
    }
}

