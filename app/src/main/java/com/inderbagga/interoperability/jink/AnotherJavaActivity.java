package com.inderbagga.interoperability.jink;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AnotherJavaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        JavaModel javaModel=new JavaModel();
        javaModel.setValue(9);
        System.out.println(javaModel.getValue());

        javaModel.addition(4,5);
    }
}
