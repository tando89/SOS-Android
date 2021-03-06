package com.example.tan089.sos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class confirmEmergencyPage extends AppCompatActivity {
    private Button confirmButton, cancelButton, getMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_emergency_page);

        confirmButton = (Button) findViewById(R.id.confirmBnt);
        cancelButton = (Button) findViewById(R.id.cancelBnt);
        getMessage = (Button) findViewById(R.id.getMessage);
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent confirm = new Intent(confirmEmergencyPage.this, ReportPage.class);
                startActivity(confirm);
            }
        });
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(confirmEmergencyPage.this, MainActivity.class);
                startActivity(intent);
            }
        });

        getMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(confirmEmergencyPage.this, GetLiveMessage.class);
                startActivity(intent);
            }
        });
    }
}
