package com.example.android.uamp.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.os.Handler;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.LinearLayout;

import com.example.android.uamp.R;


public class SplashActivity extends AppCompatActivity {

    private LinearLayout layoutPlay,layoutAbout,layoutMoreApps,layoutRatings;
    private ConstraintLayout baseLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        init();

        layoutPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                collapse();
            }
        });

        layoutAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showInfoDialog();
            }
        });


    }

    private void init() {
        baseLayout= (ConstraintLayout) findViewById(R.id.splash_baselayout);
        layoutPlay= (LinearLayout) findViewById(R.id.splash_layoutplay);
        layoutMoreApps= (LinearLayout) findViewById(R.id.splash_layoutmore);
        layoutAbout= (LinearLayout) findViewById(R.id.splash_layoutabout);
        layoutRatings= (LinearLayout) findViewById(R.id.splash_layoutratings);

    }

    private void collapse() {
        int cx = baseLayout.getWidth()/2;
        int cy = baseLayout.getHeight()/2;

        float initialRadius = (float) Math.hypot(cx, cy);

        Animator anim =
                ViewAnimationUtils.createCircularReveal(baseLayout, cx, cy, initialRadius, 0);
        anim.setDuration(500);

        anim.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                Intent starter = new Intent(SplashActivity.this, MusicPlayerActivity.class);
                startActivity(starter);
                finish();
                baseLayout.setVisibility(View.GONE);
               // super.onAnimationEnd(animation);
            }
        });
        anim.start();
    }


    private void showInfoDialog() {
        DialogInfo info = new DialogInfo();
        info.show(getSupportFragmentManager(), "info");
    }
}
