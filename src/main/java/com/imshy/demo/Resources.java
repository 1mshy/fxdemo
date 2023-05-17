package com.imshy.demo;

public class Resources {
    // singleton
    private static final Resources instance = new Resources();;
    private Resources(){};
    public static Resources getInstance() {
        return instance;
    }

    // resources


}
