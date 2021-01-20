package co.edu.unipiloto.edu.mysignuploginforms;

import android.os.Bundle;
import android.provider.SearchRecentSuggestions;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SignUpForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_form);
        getSupportActionBar().setTitle("SignUp Form");

    }


}
