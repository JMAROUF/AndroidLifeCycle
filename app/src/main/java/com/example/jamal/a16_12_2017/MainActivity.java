package com.example.jamal.a16_12_2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="MainActivity";
    private Button finish , openToast,openActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize views
        finish=findViewById(R.id.finish);
        openToast=findViewById(R.id.openToast);
        openActivity=findViewById(R.id.openActivity);
        Log.d(TAG,"onCreate methode is called");

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        openToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(),"a  little  view ", Toast.LENGTH_LONG).show();
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);				
                startActivity(Intent.createChooser(intent, "Select Picture"));
            }
        });
        openActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),TargetActivity.class);
                startActivity(intent);
            }
        });



    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart methode is called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop methode is called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy methode is called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause methode is called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume methode is called");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG,"onRestart methode is called");
    }

}
