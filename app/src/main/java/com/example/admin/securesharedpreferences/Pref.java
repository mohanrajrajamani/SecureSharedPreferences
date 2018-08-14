package com.example.admin.securesharedpreferences;

public class Pref {


    private static final String CLIENT_ACCOUNT_UNAME = "CLIENT_ACCOUNT_UNAME";
    private static final String CLIENT_ACCOUNT_ADDRESS = "CLIENT_ACCOUNT_ADDRESS";
    private static SecurePreferences preferences = MyApplication.preferences;


    public static void setName(String token) {
        preferences.put(CLIENT_ACCOUNT_UNAME, token);

    }

    public static String getName() {
        return preferences.getString(CLIENT_ACCOUNT_UNAME);
    }

    public static void saveAddress(String mKey) {
        preferences.put(CLIENT_ACCOUNT_ADDRESS, mKey);

    }

    public static String getAddress() {
        return preferences.getString(CLIENT_ACCOUNT_ADDRESS);

    }


    public static void clear() {
        SecurePreferences.clear();
    }


}
