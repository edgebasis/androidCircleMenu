package com.edgebasis.androidcirclemenu;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;



public class MainActivity extends AppCompatActivity {

    String carBrandsArray[]={
            "BMW",
            "Nissan",
            "Toyota ",
            "Dodge",
            "Mazda"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CircleMenu carBrandsMenu = (CircleMenu)findViewById(R.id.circleMenu);
        carBrandsMenu.setMainMenu(Color.parseColor("#258CFF"), R.drawable.ic_camera_black_24dp, R.drawable.ic_launcher_background)
        .addSubMenu(Color.CYAN, R.drawable.bmw)
        .addSubMenu(Color.CYAN, R.drawable.nissan)
        .addSubMenu(Color.CYAN, R.drawable.toyota)
        .addSubMenu(Color.CYAN, R.drawable.dodge)
        .addSubMenu(Color.CYAN, R.drawable.mazda)
        .setOnMenuSelectedListener(new OnMenuSelectedListener() {
            @Override
            public void onMenuSelected(int i) {
                Intent intent = new Intent(MainActivity.this, Details.class);
                intent.putExtra("brandname", carBrandsArray[i]);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "you selected "+carBrandsArray[i], Toast.LENGTH_SHORT).show();
            }
        });

    }
}
