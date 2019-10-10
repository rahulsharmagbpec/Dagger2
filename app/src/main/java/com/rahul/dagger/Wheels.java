package com.rahul.dagger;

import android.util.Log;

import javax.inject.Inject;

public class Wheels {

    private static final String TAG = "Wheels";

    @Inject
    Wheels() {
        Log.e(TAG, "Wheels constructor ");
    }
}
