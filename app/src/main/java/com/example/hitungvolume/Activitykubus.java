package com.example.hitungvolume;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class Activitykubus extends Activity implements OnClickListener {

    EditText sis1, sis2, sis3;
    Button hit;
    TextView has;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus);
        sis1 = (EditText) findViewById(R.id.sisi1);
        sis2 = (EditText) findViewById(R.id.sisi2);
        sis3 = (EditText) findViewById(R.id.sisi3);
        hit = (Button) findViewById(R.id.hitung);
        has = (TextView) findViewById(R.id.hasil);
        hit.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        try {
            int side1 = Integer.parseInt(sis1.getText().toString());
            int side2 = Integer.parseInt(sis2.getText().toString());
            int side3 = Integer.parseInt(sis3.getText().toString());
            double volume = side1 * side2 * side3;

            has.setText("Hasilnya = " +volume);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
