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

}
