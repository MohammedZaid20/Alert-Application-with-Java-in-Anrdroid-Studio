package com.example.alertapplication;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Mohammed Ramadan Zaid - Email me at Mohammed.r.zaid20@Gmail.com in case you have any questions
    // or call me at +218 94 579 8487 | look at my patreon : Mohammed Zaid in case you are interested in supporting me
    // here is my patreon link : https://www.patreon.com/MohammedZaid20
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Alert1Button(View view) {
        AlertDialog.Builder Alert1 = new AlertDialog.Builder(this);
        Alert1.setPositiveButton("ok", null).setTitle("Hey I am Alert");
        Alert1.setMessage("this is my msg ya nas");

        AlertDialog alert = Alert1.create();
        alert.show();
    }

    public void Alert2Button(View view) {
        AlertDialog.Builder Alert2 = new AlertDialog.Builder(this);
        Alert2.setTitle("second alert");
        Alert2.setMessage("this is second msg ya people");
        Alert2.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Yes, it works!!", Toast.LENGTH_SHORT).show();
            }
        });
        Alert2.setNegativeButton("no", null);
        Alert2.setNeutralButton("maybe", null);
        Alert2.setCancelable(false);

        Alert2.create().show();

    }

    public void Alert3Button(View view) {
        AlertDialog.Builder Alert3 = new AlertDialog.Builder(this);
        Alert3.setTitle("Choose your inner animal");
        final String[] animals = {"horse", "penguin", "cow", "cat", "dog"};
        Alert3.setItems(animals, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int w) {
                ShowToast(w);
                // Toast.makeText(MainActivity.this, "You passed " + animals[which], Toast.LENGTH_LONG).show();
            }
        });
        Alert3.create().show();


    }


    void ShowToast(int w) {
        switch (w) {
            case 0:
                Toast.makeText(MainActivity.this, "case horse", Toast.LENGTH_SHORT).show();
                break;

            case 1:
                Toast.makeText(MainActivity.this, "case penguin", Toast.LENGTH_SHORT).show();
                break;

            case 2:
                Toast.makeText(MainActivity.this, "case cow", Toast.LENGTH_SHORT).show();
                break;

            case 3:
                Toast.makeText(MainActivity.this, "case cat", Toast.LENGTH_SHORT).show();
                break;

            case 4:
                Toast.makeText(MainActivity.this, "case dog", Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(MainActivity.this, "case human", Toast.LENGTH_SHORT).show();
        }
    }

    public void Alert4Button(View view) {
        AlertDialog.Builder Alert4 = new AlertDialog.Builder(this);
        Alert4.setTitle("Enter your name");
        //     final EditText editText = new EditText(this);
        //  editText.setHint("write name");
        // EditText editText1 = new EditText(this);
        //  editText1.setHint("your age");
        Alert4.setView(R.layout.dialog_activity);
        Alert4.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //    String username = editText.getText().toString();
                //     Toast.makeText(MainActivity.this, "you are : " + username, Toast.LENGTH_SHORT).show();
            }
        });

        Alert4.create().show();
    }
}
