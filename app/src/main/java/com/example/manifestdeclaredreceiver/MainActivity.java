package com.example.manifestdeclaredreceiver;

import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.b_bcast);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = findViewById(R.id.et_message);
                String message = editText.getText().toString();
                Intent intent = new Intent();
                intent.setAction("com.example.manifestdeclaredreceiver.ACTION_SIMPLEST_BCAST");
                intent.putExtra("MESS", message);
                sendBroadcast(intent);
            }
        });
    }
}
