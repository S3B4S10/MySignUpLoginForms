package co.edu.unipiloto.edu.mysignuploginforms;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginForm extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);
        getSupportActionBar().setTitle("Login Form");
    }

    public void btnSignUpForm(View view){
        startActivity(new Intent(getApplicationContext(),SignUpForm.class));
    }
}
