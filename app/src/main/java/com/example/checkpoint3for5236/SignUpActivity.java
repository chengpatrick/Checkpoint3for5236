package com.example.checkpoint3for5236;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SignUpActivity extends AppCompatActivity {
    private static final String file_name="accounts_example.txt";

    EditText uEditText;
    EditText pEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        uEditText=findViewById(R.id.editTextTextPersonName3);
        pEditText=findViewById(R.id.editTextTextPassword3);

        Button signupbtn=(Button)  findViewById(R.id.signinButton);

        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(uEditText.getText().toString().length()>0 && pEditText.getText().toString().length()>0){
                    //correct password
                    save(view);
                    Toast.makeText(SignUpActivity.this,"Sign Up Successful",Toast.LENGTH_SHORT).show();
                }
                else{
                    //incorrect password
                    Toast.makeText(SignUpActivity.this,"Please Enter username and password to register",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public void save(View view){
        String utext=uEditText.getText().toString();
        String ptext=pEditText.getText().toString();
        FileOutputStream out=null;

        try {
            out=openFileOutput(file_name,MODE_PRIVATE);
            out.write(utext.getBytes());
            out.write(ptext.getBytes());

            uEditText.getText().clear();
            pEditText.getText().clear();

            Toast.makeText(this,"Saved to: "+getFilesDir()+"/"+file_name,Toast.LENGTH_LONG).show();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(out!=null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}