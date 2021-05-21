package com.inderbagga.interoperability;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

public class JavaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String tag=MainActivity.displayTag();
        String version=Commons.getVersion();

        Event event=new Event("Java Day");
        String when=event.date.toString();


        Log.d("tag",tag);
        Log.d("version",version);
        Log.d("when",when);
        Log.d("output",DemoUtils.foo());


        try {
            DemoUtils.fetchFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
