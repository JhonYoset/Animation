package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.btn);
        ImageView imageView=findViewById(R.id.caminata);
        imageView.setBackgroundResource(R.drawable.imagenes_lista);
        final AnimationDrawable animationDrawable;
        animationDrawable = (AnimationDrawable)imageView.getBackground();
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                animationDrawable.start();
            }
        });
    }
}
