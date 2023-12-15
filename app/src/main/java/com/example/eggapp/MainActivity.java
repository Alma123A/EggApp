package com.example.eggapp;

import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter = 10;
        TextView counterTextView = findViewById(R.id.Textview_counter);
        counterTextView.setText("" + counter);

    }

    public void knock(View view) {
        if (counter > 0) {
            counter--;
            TextView counterTextView = findViewById(R.id.Textview_counter);
            counterTextView.setText("" + counter);
            if (counter == 0) {
                ImageView eggImageView = findViewById(R.id.ImageView_egg);
                eggImageView.setImageResource(R.drawable.suprize);
            }

        }
    }

    public void reset(View view) {
        counter = 10;
        TextView counterTextView = findViewById(R.id.Textview_counter);
        counterTextView.setText("");
        ImageView eggImageView = findViewById(R.id.ImageView_egg);
        eggImageView.setImageResource(R.drawable.egg);
    }
}
