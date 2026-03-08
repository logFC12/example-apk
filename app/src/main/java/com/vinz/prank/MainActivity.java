package com.vinz.prank;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // AKTIFKAN LOCKDOWN: Ngunci Home, Recent, & Taskbar
        try {
            startLockTask();
        } catch (Exception e) {
            Toast.makeText(this, "Fitur Pinning Belum Aktif!", Toast.LENGTH_SHORT).show();
        }

        Button btnExit = findViewById(R.id.btnExit);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // LEPAS KUNCI sebelum keluar biar HP normal lagi
                stopLockTask();
                finish();
            }
        });
    }

    // MATIIN TOMBOL BACK
    @Override
    public void onBackPressed() {
        Toast.makeText(this, "SYSTEM CRITICAL: ACCESS DENIED!", Toast.LENGTH_SHORT).show();
    }
}
