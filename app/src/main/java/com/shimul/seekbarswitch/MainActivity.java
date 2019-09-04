package com.shimul.seekbarswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private SeekBar seekBar;
    private Switch aSwitch;
    private TextView seekbarValue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                seekbarValue.setText("Volume Level: "+i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

      aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
          @Override
          public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
              if(b == true){
                  Toast.makeText(MainActivity.this, "Wifi turned on", Toast.LENGTH_SHORT).show();
              }else{
                  Toast.makeText(MainActivity.this, "Wifi turned off", Toast.LENGTH_SHORT).show();
              }
          }
      });
    }

    private void init() {
        seekBar = findViewById(R.id.seekbarVU);
        aSwitch = findViewById(R.id.switchVU);
        seekbarValue = findViewById(R.id.volumeResult);
    }
}
