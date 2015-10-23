package com.example.uribarrena.beatbox;

import android.os.Bundle;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class BeatBoxActivity extends SingleFragmentActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    protected Fragment createFragment() {
        return BeatBoxFragment.newInstance();
    }
}
