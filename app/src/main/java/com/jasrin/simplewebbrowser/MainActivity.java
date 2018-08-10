package com.jasrin.simplewebbrowser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etxtURL;
    Button btnGo,btnGoogle,btnFacebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGo=findViewById(R.id.btn_go);
        btnFacebook=findViewById(R.id.btn_facebook);
        btnGoogle=findViewById(R.id.btn_google);

        etxtURL=findViewById(R.id.etxt_url);

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url=etxtURL.getText().toString();
                if(url.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please Enter URL", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent=new Intent(MainActivity.this,WebActivity.class);
                    intent.putExtra("url",url);
                    startActivity(intent);
                }
            }
        });

        btnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent=new Intent(MainActivity.this,WebActivity.class);
                    intent.putExtra("url","facebook.com");
                    startActivity(intent);

            }
        });

        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent=new Intent(MainActivity.this,WebActivity.class);
                    intent.putExtra("url","google.com");
                    startActivity(intent);

            }
        });
    }
}
