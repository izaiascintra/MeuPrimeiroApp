package br.senac.go.IzaiasCintra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CronogramaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cronograma);

        final Intent intent = getIntent();

        if (intent.hasExtra( "teste")){
            Bundle extras = intent.getExtras();
            int argInt = extras.getInt("teste", -1);
            if (argInt == -1){
                throw new IllegalArgumentException("Arquivo não é inteiro");

            }
            TextView textObeld = findViewById(argInt);
            textObeld.setTypeface(null, Typeface.BOLD);

//             Toast.makeText(this, "este pega o arquivo", + arq, Toast.LENGTH_SHORT).show();
        }

//        Button openBT = findViewById(R.id.button);
//        openBT.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
//                startActivity(intent);
//            }
//        });
    }
}
