package com.example.jaenwawe.jaenwawehwk2;

import android.app.Notification;
import android.graphics.Color;
import android.media.Image;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    protected GestureDetectorCompat mDetector;

        @Override
            public boolean onTouchEvent(MotionEvent event){
            this.mDetector.onTouchEvent(event);
            return super.onTouchEvent(event);
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDetector = new GestureDetectorCompat (this, new GestureDetector.OnGestureListener() {
            @Override
            public boolean onDown(MotionEvent event){
                return true;
            }

            @Override
            public void onShowPress(MotionEvent e) {
            }

            @Override
            public boolean onSingleTapUp(MotionEvent e) {
                return false;
            }

            @Override
            public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
                return false;
            }

            @Override
            public void onLongPress(MotionEvent e) {

            }

            @Override
            public boolean onFling (MotionEvent event1, MotionEvent event2,float velocityX,
                                    float velocityY){
                Toast.makeText(MainActivity.this, "Fling", Toast.LENGTH_LONG).show();
                return true;
            }
        });
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
                setContentView(R.layout.activity_main);
                return true;

            case R.id.jn_menu2:
                setContentView(R.layout.tasklinear);
                return true;
            case R.id.jn_menu3:
                setContentView(R.layout.taskrelative);
                return true;
            case R.id.jn_menu4:
                setContentView(R.layout.calcr);

                return true;
            case R.id.jn_menu5:

                setContentView(R.layout.seeke);
                final TextView textView = (TextView) findViewById(R.id.textView4);
                final ImageButton imgButton = (ImageButton) findViewById(R.id.imgButton);
                final SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);
                final ImageView imageView = (ImageView) findViewById(R.id.imageView);

                seekBar.setOnLongClickListener(new View.OnLongClickListener() {

                    @Override
                    public boolean onLongClick(View v) {
                        seekBar.setProgress(50);
                        return false;
                    }
                });

                imgButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        textView.setText("Image Button Clicked.");
                        textView.setBackgroundColor(Color.YELLOW);
                    }
                });

                imgButton.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View view) {
                        textView.setText("Image Button Long Clicked.");
                        textView.setBackgroundColor(Color.CYAN);
                        return true;
                    }
                });

                seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        textView.setText(Integer.toString(progress));
                        ViewGroup.LayoutParams params = imageView.getLayoutParams();
                        params.width = progress * 5;
                        params.height = progress * 5;
                        imageView.setLayoutParams(params);
                    }
                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar){
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                    }

                });

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