package com.rahul.dagger;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private static final String TAG = "Car";
    private Engine engine;
    private Wheels wheels;

    @Inject
    Car(Engine engine, Wheels wheels) {
        Log.e(TAG, "Car constructor");
        this.engine = engine;
        this.wheels = wheels;
    }

    void drive() {
        Log.e(TAG, "driving ");
    }
}
