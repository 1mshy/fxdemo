package com.imshy.demo;

public class UserManager {
    //implement singleton
    private static UserManager instance = null;

    private UserManager() {
        // Exists only to defeat instantiation.
    }
    public static UserManager getInstance() {
        if(instance == null) {
            instance = new UserManager();
        }
        return instance;
    }

    public boolean login(String username, String password) {
        return true;
    }


}
