package com.rahul.dagger;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private static final String TAG = "Car";
    @Inject
    Engine engine;
    private Wheels wheels;

    @Inject
    Car(Wheels wheels) {
        Log.e(TAG, "Car constructor");
        this.wheels = wheels;
    }


    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    void drive() {
        Log.e(TAG, "driving ");
    }
}
