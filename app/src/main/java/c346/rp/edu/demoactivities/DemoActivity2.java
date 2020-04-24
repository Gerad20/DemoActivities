package c346.rp.edu.demoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DemoActivity2 extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demoactivity2);

        Intent i = getIntent();
        TextView tv1 = findViewById(R.id.DisplayInfo);

        String[] info = i.getStringArrayExtra("Info");

        tv1.setText("You are " + info[0] + ",age " + info[1]);






    }

}
