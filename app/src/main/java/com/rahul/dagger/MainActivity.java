package com.rahul.dagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //constructor injection
        CarComponent carComponent = DaggerCarComponent.create();
        carComponent.getCar().drive();

        //field injection
        carComponent.inject(this);

        car.drive();

    }
}
