package com.github.daneko.adventcalendar2016;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((TextView) findViewById(R.id.build_type_text)).setText(BuildConfig.BUILD_TYPE);
        findViewById(R.id.int_click).setOnClickListener(new View.OnClickListener() {
            int lastValue = VALUE3;

            @Override
            public void onClick(View view) {
                switch (lastValue) {
                    case VALUE1:
                        lastValue = VALUE2;
                        break;
                    case VALUE2:
                        lastValue = VALUE3;
                        break;
                    case VALUE3:
                        lastValue = VALUE1;
                        break;
                }

                logWithInt(lastValue);
            }
        });

        findViewById(R.id.enum_click).setOnClickListener(new View.OnClickListener() {
            SampleEnum lastValue = SampleEnum.VALUE3;

            @Override
            public void onClick(View view) {
                switch (lastValue) {
                    case VALUE1:
                        lastValue = SampleEnum.VALUE2;
                        break;
                    case VALUE2:
                        lastValue = SampleEnum.VALUE3;
                        break;
                    case VALUE3:
                        lastValue = SampleEnum.VALUE1;
                        break;
                }
                logWithEnum(lastValue);
            }
        });
    }

    void logWithInt(int i) {
        Log.d(TAG, "int value is " + i);
    }

    void logWithEnum(SampleEnum i) {
        Log.d(TAG, "Enum value is " + i);
    }

    static final int VALUE1 = 1;
    static final int VALUE2 = 2;
    static final int VALUE3 = 3;

}
