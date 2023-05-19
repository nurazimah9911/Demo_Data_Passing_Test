package sg.edu.rp.c346.id22037444.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnPassInteger;
    Button btnPassChar;
    TextView btnPassDouble;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("MainActivity", "onCreate() called.");

        btnPassInteger = findViewById(R.id.buttonPassInteger);
        btnPassChar = findViewById(R.id.buttonPassChar);
        btnPassDouble = findViewById(R.id.PassDouble);

        btnPassInteger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("value", 1);
                startActivity(intent);
            }
        });

        btnPassChar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, ThirdActivity.class);
                intent2.putExtra("value", "a");
                startActivity(intent2);
            }
        });

        btnPassDouble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this, FourthActivity.class);
                intent3.putExtra("value", 99.99);
                startActivity(intent3);
            }
        });
    }
}