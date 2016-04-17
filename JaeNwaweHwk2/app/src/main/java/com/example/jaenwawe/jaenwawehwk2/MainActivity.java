package com.example.jaenwawe.jaenwawehwk2;

import android.app.Notification;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 10; i ++){
            builder.append("sting from StringBuilder()" + "\n");


        }

    }

    private void setSupportActionBar(Toolbar toolbar) {
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        //Inflate the menu; this adds items to the action bar if it is present
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true ;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();



        switch (id) {
            case R.id.jn_menu0:
                /*Intent start new activity.*/
                return true;
            case R.id.jn_menu1:
                return true;
            case R.layout.taskrelative:
                return true;
            case R.layout.calcr:
                return true;
            case R.layout.seeke:
                return true;
        }



        return super.onOptionsItemSelected(item);
    }



}


 /*

  TextView tv = (TextView) findViewById(R.id.longText);
            tv.setText(builder.toString());


 Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


 FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener((view) -> {
            EditText et = (EditText) findViewById(R.id.nameText);
            String entry = et.getText().toString();

            Snackbar.make(view, "You entered: " + entry, SnackBar.Length_Long)
                    .setAction("Action", null).show();

        });



        * FloatingActionButton fab= (FloatingActionButton) findViewById(R.id.fab);
        * fab.setOnClickListener((view) {
         *       SnackBar .make (view,"My own action",SnackBar.Length_Long)
         *               .setAction("Action",null).show();
        }); */