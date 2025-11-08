package com.example.schedule_app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button infoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        infoButton = findViewById(R.id.infoButton);

        infoButtonClickListener();
    }

    private void infoButtonClickListener() {
        infoButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Info.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY | //не добавляет в историю стека
                    Intent.FLAG_ACTIVITY_CLEAR_TOP | //закрывает предыдущие
                    Intent.FLAG_ACTIVITY_SINGLE_TOP);//не создаёт новую activity
            startActivity(intent);
        });
    }
}