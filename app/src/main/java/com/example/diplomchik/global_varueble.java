package com.example.diplomchik;

import android.app.Application;

public class global_varueble extends Application {
    public int counter = 0;

    public int getCounter() { return counter; }
    public void incCounter(int a)
    {
        if(a!=1) {
            counter += a;
            return;
        }
        counter++;
    }
}
