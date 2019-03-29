package com.rishab.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private void goToSecondActivity() {

        Intent intent = new Intent(this, SecondActivity.class);

        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.onClickListener() {

            @Override

            public void onClick(View v) {

                goToSecondActivity();

            }

        });
    }
}
