package com.example.calculator;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class AddActivity extends AppCompatActivity {
    private static final String TAG = "AddActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        Log.d(TAG, "onCreate called");
        setTitle(R.string.title_activity_add);

        final EditText input1 = findViewById(R.id.Input1);
        final EditText input2 = findViewById(R.id.Input2);
        final Button button = findViewById(R.id.Button);
        final TextView result = findViewById(R.id.Result);
        final TextView symbol = findViewById(R.id.OperatorSymbol);
        symbol.setText("+");

        button.setOnClickListener(v -> {
            String s1 = input1.getText().toString();
            String s2 = input2.getText().toString();
            if (s1.isEmpty() || s2.isEmpty()) { result.setText(getString(R.string.invalid_input)); return; }
            try {
                double res = Double.parseDouble(s1) + Double.parseDouble(s2);
                result.setText(String.valueOf(res));
            } catch (NumberFormatException e) { result.setText(getString(R.string.invalid_input)); }
        });
    }

    @Override protected void onStart() { super.onStart(); Log.d(TAG, "onStart called"); }
    @Override protected void onResume() { super.onResume(); Log.d(TAG, "onResume called"); }
    @Override protected void onPause() { super.onPause(); Log.d(TAG, "onPause called"); }
    @Override protected void onStop() { super.onStop(); Log.d(TAG, "onStop called"); }
    @Override protected void onDestroy() { super.onDestroy(); Log.d(TAG, "onDestroy called"); }
}

