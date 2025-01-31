package com.example.homework7;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
public void btnClick (View view)
{
    ImageView iv1 = (ImageView) findViewById(R.id.iv);
    ImageButton btn1 = (ImageButton) findViewById(R.id.btn);
    Random random = new Random();
    int randomNumber = random.nextInt(3) + 1;

    if (randomNumber == 1) {
        btn1.setImageResource(R.drawable.num1);
        iv1.setImageResource(R.drawable.image1);
    } else if (randomNumber == 2) {
        btn1.setImageResource(R.drawable.num2);
        iv1.setImageResource(R.drawable.image2);
    } else if (randomNumber == 3) {
        btn1.setImageResource(R.drawable.num3);
        iv1.setImageResource(R.drawable.image3);
    }

    iv1.setVisibility(View.VISIBLE);
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        };
    }
