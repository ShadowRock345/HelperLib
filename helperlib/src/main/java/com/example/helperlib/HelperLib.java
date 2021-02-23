package com.example.helperlib;

import android.content.Context;
import android.widget.Toast;

import java.net.ContentHandler;

public class HelperLib {

    public static void shortToast(Context context, String text){
        int length = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, length);
        toast.show();
    }
    
    public static void longToast(Context context, String text){
        int length = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, text, length);
        toast.show();
    }

    public static int addieren(Integer integerNummer1, Integer integerNummer2){
        int ergebniss = integerNummer1 + integerNummer2;
        return ergebniss;
    }


}
