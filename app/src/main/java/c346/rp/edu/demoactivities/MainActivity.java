package c346.rp.edu.demoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDone = (Button)findViewById(R.id.buttonDone);
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText etName = (EditText)findViewById(R.id.editTextName);
                EditText etAge = (EditText)findViewById(R.id.editTextAge);
                String[] info = {etName.getText().toString(),etAge.getText().toString()};

                Intent intent = new Intent(getApplicationContext(),DemoActivity2.class);
                intent.putExtra("Info",info);
                startActivity(intent);
            }
        });
    }

}
