package com.restrepo.ricardo.multimedia;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity implements View.OnClickListener {

    ImageView Imagen;
    Button girar;
    Button mover;
    Button ampliar;
    Button tran;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Imagen= (ImageView) findViewById(R.id.ImageV);
        girar= (Button) findViewById(R.id.bGirar);
        mover= (Button) findViewById(R.id.bMover);
        ampliar= (Button) findViewById(R.id.bAmpliar);
        tran= (Button) findViewById(R.id.bTransparente);

        girar.setOnClickListener(this);
        mover.setOnClickListener(this);
        ampliar.setOnClickListener(this);
        tran.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){

            case R.id.bMover:
                Animation muevo;
                muevo = AnimationUtils.loadAnimation(this, R.animator.mover);
                muevo.reset();
                Imagen.startAnimation(muevo);
                break;
            case R.id.bAmpliar:
                Animation amplio;
                amplio =AnimationUtils.loadAnimation(this, R.animator.ampliar);
                amplio.reset();
                Imagen.startAnimation(amplio);
                break;
            case R.id.bTransparente:
                Animation transparente;
                transparente =AnimationUtils.loadAnimation(this, R.animator.transparencia);
                transparente.reset();
                Imagen.startAnimation(transparente);
                break;
            case R.id.bGirar:
                Animation giro;
                giro =AnimationUtils.loadAnimation(this, R.animator.girar);
                giro.reset();
                Imagen.startAnimation(giro);
                break;
            default:
                break;



        }

    }
}
