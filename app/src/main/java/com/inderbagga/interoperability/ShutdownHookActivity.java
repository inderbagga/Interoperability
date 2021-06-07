package com.inderbagga.interoperability;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ShutdownHookActivity extends AppCompatActivity {

    private static final String TAG = "ShutdownHookActivity";

    @Override
    protected void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Runtime runtime=Runtime.getRuntime();
        runtime.addShutdownHook(new Thread(){

            @Override
            public void run() {


                for(int i=1;i<11;i++){
                    Log.e(TAG,i+"");

                    if(i==10){

                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(ShutdownHookActivity.this,"done",Toast.LENGTH_LONG).show();
                            }
                        });
                   }
                }
            }
        });
    }

    public void onTapped(View view) {

        System.exit(0);
    }
}
