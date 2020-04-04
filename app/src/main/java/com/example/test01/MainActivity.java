package com.example.test01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class MainActivity extends AppCompatActivity  {

    private String lastclicked;
    private String presentclicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final Button[] buttons = new Button[6];
        buttons [0] = (Button)findViewById(R.id.card_button1);
        buttons [1] =(Button)findViewById(R.id.card_button2);
        buttons [2] =(Button)findViewById(R.id.card_button3);
        buttons [3] =(Button)findViewById(R.id.card_button4);
        buttons [4] =(Button)findViewById(R.id.card_button5);
        buttons [5] =(Button)findViewById(R.id.card_button6);

        Integer[] intArray = { 0, 1, 2, 3, 4, 5};

        List<Integer> intList = Arrays.asList(intArray);

        Collections.shuffle(intList);

        intList.toArray(intArray);
        Log.d("this is my array", "arr: " + Arrays.toString(intArray));


        buttons[intArray[0]].setBackgroundResource(R.drawable.flip1);
        buttons[intArray[1]].setBackgroundResource(R.drawable.flip1);
        buttons[intArray[2]].setBackgroundResource(R.drawable.flip2);
        buttons[intArray[3]].setBackgroundResource(R.drawable.flip2);
        buttons[intArray[4]].setBackgroundResource(R.drawable.flip3);
        buttons[intArray[5]].setBackgroundResource(R.drawable.flip3);

        buttons[intArray[0]].setText("flip1");
        buttons[intArray[1]].setText("flip1");
        buttons[intArray[2]].setText("flip2");
        buttons[intArray[3]].setText("flip2");
        buttons[intArray[4]].setText("flip3");
        buttons[intArray[5]].setText("flip3");

        String rid = (String) buttons[intArray[0]].getText();
        String rid2 = (String) buttons[intArray[1]].getText();
        String rid3 = (String) buttons[intArray[2]].getText();

        Log.d("the resource id", "is: " + rid);
        Log.d("the next id", "is: " + rid2);
        Log.d("the nextnext id", "is: " + rid3);

        buttons[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(lastclicked==null) {
                    lastclicked=(String) buttons[0].getText();
                }
                else {
                    presentclicked=(String) buttons[0].getText();
                }

                if (lastclicked==presentclicked){
                    Log.d("SUCCESSSSSSSSSSSS", "is: " + presentclicked);
                }
            }
        });

        buttons[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(lastclicked==null) {
                    lastclicked=(String) buttons[1].getText();
                }
                else {
                    presentclicked=(String) buttons[1].getText();
                }

                if (lastclicked==presentclicked){
                    Log.d("SUCCESSSSSSSSSSSS", "is: " + presentclicked);
                }
            }
        });

        buttons[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(lastclicked==null) {
                    lastclicked=(String) buttons[2].getText();
                }
                else {
                    presentclicked=(String) buttons[2].getText();
                }

                if (lastclicked==presentclicked){
                    Log.d("SUCCESSSSSSSSSSSS", "is: " + presentclicked);
                }
            }
        });

        buttons[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(lastclicked==null) {
                    lastclicked=(String) buttons[3].getText();
                }
                else {
                    presentclicked=(String) buttons[3].getText();
                }

                if (lastclicked==presentclicked){
                    Log.d("SUCCESSSSSSSSSSSS", "is: " + presentclicked);
                }
            }
        });

        buttons[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(lastclicked==null) {
                    lastclicked=(String) buttons[4].getText();
                }
                else {
                    presentclicked=(String) buttons[4].getText();
                }

                if (lastclicked==presentclicked){
                    Log.d("SUCCESSSSSSSSSSSS", "is: " + presentclicked);
                }
            }
        });

        buttons[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(lastclicked==null) {
                    lastclicked=(String) buttons[5].getText();
                }
                else {
                    presentclicked=(String) buttons[5].getText();
                }

                if (lastclicked==presentclicked){
                    Log.d("SUCCESSSSSSSSSSSS", "is: " + presentclicked);
                }
            }
        });
    }



}


