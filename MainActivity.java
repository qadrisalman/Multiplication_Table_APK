package com.salmanqadri.multiplicationtable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextNumber;
    TextView textView;
    Button button;
    int result = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNumber = findViewById(R.id.editTextNumber);
        textView = (TextView) findViewById(R.id.textView);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    StringBuffer buffer = new StringBuffer();
                    int res;
                    String s = editTextNumber.getText().toString();
                    int num = Integer.parseInt(s);
                    int i;
                    for (i = 1; i <= 10; i++) {
                        result = i * num;
                        buffer.append(num + " X " + i + " = " + result + "\n\n");
                    }
                    textView.setText(buffer);

            }
        });
    }
}