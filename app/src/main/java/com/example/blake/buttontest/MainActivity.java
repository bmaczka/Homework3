//Blake Maczka and Tomasz Kantor
//TO 426
// Blake Maczka (bmaczka) & Tomasz Kantor (kantort)
// TO 426 HW #2
// username is: BLAKEM, password is: BHMACZKA
package com.example.blake.buttontest;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    //step 1: define object
    private Button buttonLogin;
    private EditText editTextLogin, editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //step 2: connect object w layout widget
        buttonLogin = findViewById(R.id.buttonLogin);
        editTextLogin = findViewById(R.id.editTextLogin);
        editTextPassword = findViewById(R.id.editTextPassword);
        //step 3b attach the listener to the object
        buttonLogin.setOnClickListener(this);
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();

    @Override
    public void onClick(View view) {
        String password, login;
        password = editTextPassword.getText().toString().toUpperCase();
        login = editTextLogin.getText().toString().toUpperCase();


        if(login.length() < 6){
            Toast.makeText(this, "Too short!",Toast.LENGTH_SHORT).show();
        }
        else if(password.length() < 8){
            Toast.makeText(this, "Too short!",Toast.LENGTH_SHORT).show();
        }
        else if(password.equals("BHMACZKA") & login.equals("BLAKEM")){
            Toast.makeText(this, "Login/Password Match: You are Logged In",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "INTRUDER ALERT!! INTRUDER ALERT!!",Toast.LENGTH_SHORT).show();
        }
    }
}
