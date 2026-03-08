package com.vinz.prank;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnExit = findViewById(R.id.btnExit);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Ini satu-satunya cara keluar
            }
        });
    }

    // MATIIN TOMBOL BACK
    @Override
    public void onBackPressed() {
        Toast.makeText(this, "AKSES DITOLAK! GUNAKAN TOMBOL MERAH!", Toast.LENGTH_SHORT).show();
    }
}
