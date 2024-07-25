package com.example.unitconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //declaring widgets
    EditText editText;
    TextView textView,textView2,textView4,valueinPounds;
    Button button ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //instantiating widgets

      textView = findViewById(R.id.textView);
      textView2 = findViewById(R.id.textView2);
      textView4 = findViewById(R.id.textView4);
      valueinPounds = findViewById(R.id.valueOfPounds);

      editText = findViewById(R.id.editTextNumber);

      button = findViewById(R.id.button);

      // adding a click event for button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //calling ConvertFromKiloToPounds method

                ConvertFromKiloToPounds();
            }
        });
    }

    private void ConvertFromKiloToPounds() {
        // this method will convert value entered in editText
        // from kilo to Pounds

        String valueEnteredinKILO = editText .getText().toString();

        // converting string to number
        double Kilo = Double.parseDouble(valueEnteredinKILO);

        // converting kilo to Pounds

        double pounds = Kilo * 2.205 ;

        // displaying the value resulted in TextView
        valueinPounds.setText(" " + pounds);

    }
}