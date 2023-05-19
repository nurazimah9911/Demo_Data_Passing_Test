package sg.edu.rp.c346.id22037444.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FourthActivity extends AppCompatActivity {

    TextView tvAnswer3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tvAnswer3 = findViewById(R.id.textView3);
        Intent intentReceived3 = getIntent();
        double value = intentReceived3.getDoubleExtra("value", 0);
        tvAnswer3.setText("Double value received is: " + value);
    }
}