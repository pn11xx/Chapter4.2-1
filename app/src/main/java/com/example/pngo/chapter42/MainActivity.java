package com.example.pngo.chapter42;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button diamondButton = (Button) findViewById(R.id.diamondButton);
        Button oddButton = (Button) findViewById(R.id.oddButton);
        Button evenButton = (Button) findViewById(R.id.evenButton);

        final TextView display = (TextView)findViewById(R.id.display);
        final String [] output = {""};
        final String [] outs = {""};
        final String [] output2 = {""};
        

        oddButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                int a = 1;

                do{
                    a = a + 2;
                    output2[0] = String.valueOf(a);
                    display.setText(output2[0]);
                } while(a<100);

            }

        });

        evenButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int i, n=0,sum=0;


                for(i=0; i<=100; i++){
                    if(i>1){
                        n+=2;
                        i++;
                        output[0] = String.valueOf(i);
                        display.setText(output[0]);
                    }
                }

            }
        });

    }

}
