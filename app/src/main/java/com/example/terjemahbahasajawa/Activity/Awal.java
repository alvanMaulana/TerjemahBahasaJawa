package com.example.terjemahbahasajawa.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.terjemahbahasajawa.MainActivity;
import com.example.terjemahbahasajawa.R;

public class Awal extends Activity {
    private int waktu_loading=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awal);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke home activity
                Intent home=new Intent(Awal.this, MainActivity.class);
                startActivity(home);
                finish();

            }
        },waktu_loading);
    }
}
