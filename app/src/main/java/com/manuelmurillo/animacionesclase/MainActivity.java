package com.manuelmurillo.animacionesclase;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView miimagen;
    View vpprincipal;
    float escalay;

    Drawable imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.getSupportActionBar().setDisplayShowHomeEnabled(true);
        this.getSupportActionBar().setIcon(R.mipmap.ic_padre);

        miimagen = (ImageView)findViewById(R.id.imageViewimagen);
        escalay=0.1f;
        vpprincipal=(View)findViewById(R.id.viewPrincipal);
        imagen = getResources().getDrawable(R.drawable.animal3);
    }

    public void funcionboton1(View view) {
        //Toast.makeText(this, "Id:"+R.drawable.perro, Toast.LENGTH_SHORT).show();
        miimagen.setImageResource(R.drawable.animal3);
        escalay=1f;
        miimagen.setScaleY(escalay);

    }

    public void funcionboto2(View view) {
        miimagen.setImageResource(R.drawable.perro);
        escalay=1f;
        miimagen.setScaleY(escalay);
    }

    public void funcionfitcenter(View view) {
        miimagen.setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    public void funcioncentercrow(View view) {

        miimagen.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    public void funcionescalamas(View view) {
        escalay += 0.1f;
        miimagen.setScaleY(escalay);

    }

    public void funcionescalamenos(View view) {
        escalay -= 0.1f;
        miimagen.setScaleY(escalay);
    }

    public void funcioncambiofondo(View view) {
        vpprincipal.setBackgroundResource(R.drawable.fondo2);
    }

    public void funcioncambioclase(View view) {
        vpprincipal.setBackground(imagen);
        miimagen.setImageDrawable(imagen);
    }
}
