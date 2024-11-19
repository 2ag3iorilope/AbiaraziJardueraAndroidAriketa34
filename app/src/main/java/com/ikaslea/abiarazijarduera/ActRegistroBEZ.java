package com.ikaslea.abiarazijarduera;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActRegistroBEZ extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radio1, radio2, radio3;
    TextView  textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_registro_bez);

        Intent intent = getIntent();
        double inportea = intent.getDoubleExtra("INPORTEA", 0);
        radio1 = findViewById(R.id.radioButton);
        radio2 = findViewById(R.id.radioButton2);
        radio3 = findViewById(R.id.radioButton3);
        radioGroup = findViewById(R.id.RadioGroup);
        textView4 = findViewById(R.id.textView4);

        radioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            double Bez = 0;


            if (checkedId == R.id.radioButton) {
                Bez = 0.04;
            } else if (checkedId == R.id.radioButton2) {
                Bez = 0.10;
            } else if (checkedId == R.id.radioButton3) {
                Bez = 0.21;
            }


            double Bezkalkulatua = inportea * Bez;
            double totalaBezarekin = inportea + Bezkalkulatua;


            textView4.setText("BEZ: " + Bezkalkulatua + "\nTotala BEZ-arekin: " + totalaBezarekin);
        });



    }
}