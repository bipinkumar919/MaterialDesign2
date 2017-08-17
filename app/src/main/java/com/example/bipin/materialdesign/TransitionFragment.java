package com.example.bipin.materialdesign;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by bipin on 7/8/17.
 */

public class TransitionFragment extends Fragment {
    public TransitionFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
    View rootView=inflater.inflate(R.layout.fragment_transition_scene_1,container,false);
        return rootView;
    }
}
