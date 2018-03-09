package com.example.baset.textfiled;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatEditText;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    AppCompatEditText user;
    AppCompatEditText pass;
    RelativeLayout relativeLayout;
    TextInputLayout userlayout;
    TextInputLayout passlayout;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.button);
        user = (AppCompatEditText) findViewById(R.id.username_textfiled);
        userlayout=(TextInputLayout)findViewById(R.id.username_textinputlayout);
        pass = (AppCompatEditText) findViewById(R.id.password_textfiled);
        passlayout =(TextInputLayout)findViewById(R.id.password_textinputlayout);
        relativeLayout = (RelativeLayout) findViewById(R.id.activiti_main);
        relativeLayout.setOnClickListener(null);
        user.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(user.getText().toString().isEmpty()){
                    userlayout.setErrorEnabled(true);
                    userlayout.setError("please enter your username");

                }else{
                    userlayout.setErrorEnabled(false);
                }

            }
        });
        passlayout.setCounterEnabled(true);
        passlayout.setCounterMaxLength(8);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{

                    Intent i =new Intent(MainActivity.this,navaigationdrawer.class);
                    startActivity(i);
                }catch (Exception e){
                    Log.e("basettttttttt",e.getLocalizedMessage());
                }
            }
        });
    }
}
