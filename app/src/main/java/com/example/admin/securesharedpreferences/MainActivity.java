package com.example.admin.securesharedpreferences;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ed_name;
    EditText ed_address;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed_name = findViewById(R.id.ed_name);
        ed_address = findViewById(R.id.ed_address);
        textView = findViewById(R.id.textView);
    }


    public void save_fun(View view) {
        if (!TextUtils.isEmpty(ed_name.getText().toString())) {
            if (!TextUtils.isEmpty(ed_address.getText().toString())) {
                Pref.setName(ed_name.getText().toString());
                Pref.saveAddress(ed_address.getText().toString());
                ed_name.setText("");
                ed_address.setText("");
            } else {
                Toast.makeText(this, "Please enter the address", Toast.LENGTH_SHORT).show();
            }


        } else {
            Toast.makeText(this, "Please enter the name", Toast.LENGTH_SHORT).show();
        }
    }


    @SuppressLint("SetTextI18n")
    public void get_Data(View view) {
        if (Pref.getName() != null && Pref.getAddress() != null){
            textView.setText("Name"+":"+Pref.getName()+" "+"Address"+":"+Pref.getAddress());

        }


    }
}
