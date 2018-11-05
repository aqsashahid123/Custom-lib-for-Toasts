package com.example.customlibmodule;

import android.content.Context;
import android.widget.Toast;

public class CustomToast {
    public void showToast(Context context, String text, boolean isLong){
        Toast.makeText(context,text,Toast.LENGTH_LONG);
    }
}
