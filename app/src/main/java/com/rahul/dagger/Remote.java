package com.rahul.dagger;

import android.util.Log;

import javax.inject.Inject;

public class Remote {

    private static final String TAG = "Remote";

    @Inject
    Remote() {

    }

    public void setListener(Car car) {
        Log.d(TAG, "setListener: ");
    }
}
