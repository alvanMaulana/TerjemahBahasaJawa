package com.example.terjemahbahasajawa.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.terjemahbahasajawa.Adapter.TerjemahanAdapter;
import com.example.terjemahbahasajawa.R;


public class Detail extends AppCompatActivity {

    private TextView  indonesia,ngoko,krama,ngokoHalus,kata;
    private String INDONESIA,NGOKO,KRAMA,NGOKOHALUS,KATA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        indonesia = (TextView)findViewById(R.id.indonesia);
        ngoko = (TextView)findViewById(R.id.ngoko);
        ngokoHalus =(TextView)findViewById(R.id.halus);
        krama = (TextView)findViewById(R.id.kromo);
        kata=(TextView)findViewById(R.id.kata);


       INDONESIA  = getIntent().getStringExtra(TerjemahanAdapter.TAG_INDONESIA);
       NGOKO = getIntent().getStringExtra(TerjemahanAdapter.TAG_NGOKO);
      NGOKOHALUS = getIntent().getStringExtra(TerjemahanAdapter.TAG_HALUS);
      KRAMA = getIntent().getStringExtra(TerjemahanAdapter.TAG_KROMO);
      KATA = getIntent().getStringExtra(TerjemahanAdapter.TAG_KATA);


      indonesia.setText(INDONESIA);
      ngoko.setText(NGOKO);
      krama.setText(KRAMA);
      ngokoHalus.setText(NGOKOHALUS);
      kata.setText(KATA);








    }
}
