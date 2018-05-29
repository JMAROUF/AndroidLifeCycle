package com.example.jamal.a16_12_2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class TargetActivity extends AppCompatActivity {

    private Button returnButton ;
    private String TAG="TargetActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);
        Log.d(TAG,"onCreate methode is called");
        returnButton=findViewById(R.id.retour);

        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart methode is called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStop methode is called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy methode is called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPause methode is called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResume methode is called");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG,"onRestart methode is called");
    }
}
