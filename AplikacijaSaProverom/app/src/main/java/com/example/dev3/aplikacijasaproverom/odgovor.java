package com.example.dev3.aplikacijasaproverom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class odgovor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odgovor);
        Intent intent=getIntent();
        TextView tv=(TextView)findViewById(R.id.jedan);
        TextView tv1=(TextView)findViewById(R.id.dva);
        String msg=intent.getStringExtra(MainActivity.prva);
        String msg1=intent.getStringExtra(MainActivity.druga);
        tv.setText("Uspesno ste pogodili zivotinju sa slike");
        Button dugme=(Button)findViewById(R.id.dugmence);
        dugme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
