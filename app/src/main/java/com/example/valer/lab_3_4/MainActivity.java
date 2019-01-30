package com.example.valer.lab_3_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static String aika;
    private EditText text_editor;
   

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.start_button).setOnClickListener(this);
        text_editor = findViewById(R.id.text_editor);

    }

    @Override
    public void onClick(View v) {
            Intent intent = new Intent(this,CountdownActivity.class);
            String aika = text_editor.getText().toString();
            intent = intent.putExtra("aika", aika);
            startActivity(intent);
    }
}