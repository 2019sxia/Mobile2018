package edu.tjhsst.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText text1;
    private Button button1;
    private TextView result_text;


    @Override
    protected void onCreate(Bundle savedInstanceState) { //called when screen is created
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = (EditText)findViewById(R.id.name);
        result_text = (TextView)findViewById(R.id.result);

        button1 = (Button)findViewById(R.id.button); //attaches button to layout file
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result_text.setText(text1.getText());
            }
        });

    }
}
