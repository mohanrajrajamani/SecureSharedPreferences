package com.example.admin.securesharedpreferences;

import android.app.Application;

public class MyApplication extends Application {

    public static SecurePreferences preferences;

    @Override
    public void onCreate() {
        super.onCreate();
        preferences= new SecurePreferences(getApplicationContext(),"Mypreference",Constant.PUBLIC_SECURE_KEY,true);

    }


}
