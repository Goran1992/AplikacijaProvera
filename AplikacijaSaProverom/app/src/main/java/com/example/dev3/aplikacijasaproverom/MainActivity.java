package com.example.dev3.aplikacijasaproverom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public final static String prva="1";
    public final static String druga="3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button dugme=(Button)findViewById(R.id.button);
        dugme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, odgovor.class);
                EditText et=(EditText)findViewById(R.id.editText);
                EditText et1=(EditText)findViewById(R.id.editText2);
                EditText et2=(EditText)findViewById(R.id.editText3);
                String msg=et.getText().toString();
                String msg1=et1.getText().toString();
                String msg2=et2.getText().toString();
                intent.putExtra(prva, msg);
                intent.putExtra(druga, msg1);
                if(msg2.equals("macka")){
                    startActivity(intent);



                }else{
                    Toast.makeText(MainActivity.this,"Pogresan odgovor",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
