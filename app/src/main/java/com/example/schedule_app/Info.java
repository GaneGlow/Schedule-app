package com.example.schedule_app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Info extends AppCompatActivity {

    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_info);

        backButton = findViewById(R.id.backButton);

        backButtonClickListener();
    }

    private void backButtonClickListener() {
        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(Info.this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                    Intent.FLAG_ACTIVITY_CLEAR_TOP |
                    Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(intent);
        });
    }
}