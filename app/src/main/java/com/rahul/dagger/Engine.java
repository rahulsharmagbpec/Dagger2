package com.rahul.dagger;

import android.util.Log;

import javax.inject.Inject;

public class Engine {

    private static final String TAG = "Engine";

    @Inject
    Engine() {
        Log.e(TAG, "Engine: constructor");
    }
}
