package com.rahul.dagger;

import android.util.Log;

import javax.inject.Inject;

public class Wheels {

    private static final String TAG = "Wheels";
    private Rims rims;
    private Tires tires;


    Wheels(Rims rims, Tires tires) {
        Log.e(TAG, "Wheels constructor ");
        this.rims = rims;
        this.tires = tires;
    }
}
