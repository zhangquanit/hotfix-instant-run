package com.instant_run.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.recreate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recreate();
                System.out.println("MainActivity  onCreate");
            }
        });
        System.out.println("MainActivity  onCreate");
        System.out.println();
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("MainActivity  onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("MainActivity  onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("MainActivity  onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("MainActivity  onDestroy");
    }
}
