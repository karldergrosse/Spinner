package com.spinner1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {

    String[] texte5 = { "Megane", "Clio", "Master",
            "Twingo", "Espace", "Trafic", "RS" };

    String[] text1 = { "rot", "weiss", "blau",
            "silber", "grau", "braun", "schwarz" };

    String[] text2 = { "Lagerfahrzeug", "Kundenfahrzeug" };


    Spinner spinne0, spinner1, spinner2;
    TextView textView0, textView1,textView2,textView3;
    Button button1,button2;
    EditText editText1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView0 = (TextView)findViewById(R.id.text0);
        spinne0 = (Spinner)findViewById(R.id.spinner0);
        ArrayAdapter<String> adapter0 =
                new ArrayAdapter<String>(MainActivity.this,
                        android.R.layout.simple_spinner_item, texte5);
        adapter0.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinne0.setAdapter(adapter0);
        spinne0.setOnItemSelectedListener(onItemSelectedListener0);


        textView1 = (TextView)findViewById(R.id.text1);
        spinner1 = (Spinner)findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter1 =
                new ArrayAdapter<String>(MainActivity.this,
                        android.R.layout.simple_spinner_item, text1);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);
        spinner1.setOnItemSelectedListener(onItemSelectedListener1);

        textView2 = (TextView)findViewById(R.id.text2);
        spinner2 = (Spinner)findViewById(R.id.spinner2);
        ArrayAdapter<String> adapter2 =
                new ArrayAdapter<String>(MainActivity.this,
                        android.R.layout.simple_spinner_item, text2);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(onItemSelectedListener2);


       textView3 = (TextView)findViewById(R.id.tvalle);
       button1 = (Button)findViewById(R.id.btZS);
       button2 = (Button)findViewById(R.id.btscan);
       editText1 = (EditText)findViewById(R.id.etbesonderes);

       button2 = (Button)findViewById(R.id.btscan);
       button1.setOnClickListener(new View.OnClickListener() {
           private View view;

           @Override
            public void onClick(View v) {



                String Text1=editText1.getText().toString();
                String sptv0=textView0.getText().toString();
                String sptv1=textView1.getText().toString();
                String sptv2=textView2.getText().toString();


                textView3.setText("jo Bürli:"+Text1+" / "+sptv0+" / "+sptv1+" / "+sptv2);


            }





       });




    }

    OnItemSelectedListener onItemSelectedListener0 =
            new OnItemSelectedListener(){

                @Override
                public void onItemSelected(AdapterView<?> parent, View view,
                                           int position, long id) {
                    String st0 = (String)parent.getItemAtPosition(position);
                    textView0.setText(st0);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {}
            };

    OnItemSelectedListener onItemSelectedListener1 =
            new OnItemSelectedListener(){

                @Override
                public void onItemSelected(AdapterView<?> parent, View view,
                                           int position, long id) {
                    String s1 = (String)parent.getItemAtPosition(position);
                    textView1.setText(s1);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {}
            };


    OnItemSelectedListener onItemSelectedListener2 =
            new OnItemSelectedListener(){

                @Override
                public void onItemSelected(AdapterView<?> parent, View view,
                                           int position, long id) {
                    String s2 = (String)parent.getItemAtPosition(position);
                    textView2.setText(s2);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {}
            };
}

