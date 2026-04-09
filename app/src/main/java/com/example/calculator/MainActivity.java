package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(0xFF000000);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate called");

        Button btnAdd = findViewById(R.id.btnAdd);
        Button btnSub = findViewById(R.id.btnSub);
        Button btnMul = findViewById(R.id.btnMul);
        Button btnDiv = findViewById(R.id.btnDiv);

        btnAdd.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, AddActivity.class)));
        btnSub.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, SubActivity.class)));
        btnMul.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, MulActivity.class)));
        btnDiv.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, DivActivity.class)));
    }

    @Override protected void onStart() { super.onStart(); Log.d(TAG, "onStart called"); }
    @Override protected void onResume() { super.onResume(); Log.d(TAG, "onResume called"); }
    @Override protected void onPause() { super.onPause(); Log.d(TAG, "onPause called"); }
    @Override protected void onStop() { super.onStop(); Log.d(TAG, "onStop called"); }
    @Override protected void onRestart() { super.onRestart(); Log.d(TAG, "onRestart called"); }
    @Override protected void onDestroy() { super.onDestroy(); Log.d(TAG, "onDestroy called"); }
}
