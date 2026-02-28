package com.example.lab1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

    private int count = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button btnbonjour = findViewById(R.id.btnbonjour);
        Button btncount = findViewById(R.id.button_count);
        TextView text_count = findViewById(R.id.text_count);

        btnbonjour.setOnClickListener(v->{
            Toast.makeText(this,"Bonjour !",Toast.LENGTH_SHORT).show();
        });

        btncount.setOnClickListener(v->{
            this.count++;
            text_count.setText(String.valueOf(this.count));
        });









        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}