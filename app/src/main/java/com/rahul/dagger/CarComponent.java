package com.rahul.dagger;

import dagger.Component;

@Component(modules = WheelsModule.class)
public interface CarComponent {
    Car getCar();

    void inject(MainActivity mainActivity);
}
