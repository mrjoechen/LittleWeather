package com.quintet.littleweather.fragment;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import com.quintet.littleweather.R;

/**
 * Created by CHENQIAO.
 */
public class AboutFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.preference_about);

    }
}
