package com.ikaslea.abiarazijarduera;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Act_produktu_Produktua extends AppCompatActivity {

    EditText artikuluatxt, inporteatxt;
    Button butonBez;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_produktua);

        artikuluatxt = findViewById(R.id.editTextText);
        inporteatxt = findViewById(R.id.editTextText2);
        butonBez = findViewById(R.id.button);

        butonBez.setOnClickListener(view -> {
            String artikulua = artikuluatxt.getText().toString().trim();
            String inporteaStr = inporteatxt.getText().toString().trim();

            if (artikulua.isEmpty() || inporteaStr.isEmpty()) {
                Toast.makeText(this, "Mesedez, artikulua eta inportea bete.", Toast.LENGTH_SHORT).show();
            } else {
                try {

                    double inportea = Double.parseDouble(inporteaStr);


                    Intent intent = new Intent(this, ActRegistroBEZ.class);
                    intent.putExtra("INPORTEA", inportea);
                    startActivity(intent);

                } catch (NumberFormatException e) {
                    Toast.makeText(this, "Inportea zenbaki bat izan behar da.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
