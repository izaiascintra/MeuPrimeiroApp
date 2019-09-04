package br.senac.go.IzaiasCintra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        if (intent.hasExtra( "teste")){
            Bundle extras = intent.getExtras();
            int argInt = extras.getInt("teste", -1);
            if (argInt == -1){
                throw new IllegalAccessException("Arquivo não é inteiro");

            }
            TextView textObeld = findViewById(argInt);
//            textObeld.settextViewL2a(null,textViewL2a.BOLD );
            textObeld.setTypeface(null, Typeface.BOLD;

        }
        Button openBT = findViewById(R.id.bt_open);
        openBT.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent
            }
        }) {

        });
    }
}
