package com.edgebasis.androidcirclemenu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Intent intent = getIntent();
        ImageView imageView;
        imageView = (ImageView)findViewById(R.id.brandLogo);
        String brandname = intent.getStringExtra("brandname");

        if(brandname.equals("BMW")){
            imageView.setImageResource(R.drawable.bmw);
        }else if (brandname.equals("Nissan")){
            imageView.setImageResource(R.drawable.nissan);
        }else if(brandname.equals("Toyota")){
            imageView.setImageResource(R.drawable.nissan);

        }else if (brandname.equals("Dodge")){
            imageView.setImageResource(R.drawable.dodge);

        }else{
            imageView.setImageResource(R.drawable.mazda);

        }
    }
}
