package com.example.cmtoinch;import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText inputCm;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputCm = findViewById(R.id.inputCm);
        Button convertButton = findViewById(R.id.convertButton);
        result = findViewById(R.id.result);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertCmToInch();
            }
        });
    }

    private void convertCmToInch() {
        String cmString = inputCm.getText().toString();

        if (!TextUtils.isEmpty(cmString)) {
            double cm = Double.parseDouble(cmString);
            double inches = cm / 2.54;
            result.setText(String.format("%.2f", inches));
        } else {
            result.setText("Please enter a number");
        }
    }
}
