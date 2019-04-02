package com.example.fucking;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.DoubleSummaryStatistics;


public class MainActivity extends AppCompatActivity {


    private static Object TextView ="";
   

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SeekBar seekBar = findViewById(R.id.seekBar);
        SeekBar.setMax(20);


        TextView = this.findViewById(R.id.editText);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

            private EditText yourTextView;

            @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    if (fromUser) {
                        String sizeSeekBar;
                        if (progress >= 0 && progress <= sizeSeekBar.getMax()) {

                            String progressString = String.valueOf(progress * 10);
                            yourTextView.setText(progressString); // the TextView Reference
                            seekBar.setSecondaryProgress(progress);
                            {

            @Override
            public void onProgressChanged(seekBar, int progress, boolean fromUser) {

                TextView(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    private void TextView(String valueOf) {
    }
}