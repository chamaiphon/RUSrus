package rus.sinak.chamaiphon.rusrus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class SignUpActivity extends AppCompatActivity {

    //Explicit
    private EditText nameEditText,userEditTeat,passwordEditText;
    private RadioGroup radioGroup;
    private RadioButton avata0RadioButton, avata1RadioButton,
            avata2RadioButton,avata3RadioButton, avata4RadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        // Bind Widged
        nameEditText =(EditText) findViewById(R.id.editText);
        userEditTeat =(EditText)findViewById(R.id.editText2);
        passwordEditText = (EditText)findViewById(R.id.editText3);
        radioGroup = (RadioGroup)findViewById(R.id.ragavata);
        avata0RadioButton = (RadioButton)findViewById(R.id.radioButton);
        avata1RadioButton = (RadioButton)findViewById(R.id.radioButton2);
        avata2RadioButton = (RadioButton)findViewById(R.id.radioButton3);
        avata4RadioButton = (RadioButton)findViewById(R.id.radioButton4);

    }   // Main Method

    public void clickSignUpSign(View view){

    }  // clickSignUp

}    // Main Class
