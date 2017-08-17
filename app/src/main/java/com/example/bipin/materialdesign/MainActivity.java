package com.example.bipin.materialdesign;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Fade;
import android.transition.Scene;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TransitionManager mTransitionManager;
    private Scene mScene1;
    private Scene mScene2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new TransitionFragment())
                    .commit();
        }

        ViewGroup container = (ViewGroup) findViewById(R.id.container);
        TransitionInflater transitionInflater = TransitionInflater.from(this);
        mTransitionManager = transitionInflater.inflateTransitionManager(R.transition.transition_manager, container);
        mScene1 = Scene.getSceneForLayout(container, R.layout.fragment_transition_scene_1, this);
        mScene2 = Scene.getSceneForLayout(container, R.layout.fragment_transition_scene_2, this);
    }

    public void goToScene1(View view) {
        mTransitionManager.transitionTo(mScene1);
    }

    public void goToScene2(View view) {
        mTransitionManager.transitionTo(mScene2);
    }

}


