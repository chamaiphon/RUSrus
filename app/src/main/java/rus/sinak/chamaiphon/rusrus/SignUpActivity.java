package rus.sinak.chamaiphon.rusrus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.security.PrivateKey;

public class SignUpActivity extends AppCompatActivity {

    //Explicit
    private EditText nameEditText,userEditTeat,passwordEditText;
    private RadioGroup radioGroup;
    private RadioButton avata0RadioButton, avata1RadioButton,
            avata2RadioButton,avata3RadioButton, avata4RadioButton;
    private String nameString,userString,passwordString,avataString;

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

        //Get Value from Edit Text
        nameString = nameEditText.getText().toString().trim();
        userString = userEditTeat.getText().toString().trim();
        passwordString = passwordEditText.getText().toString().trim();

        //Check Space
        if (nameString.equals("")||userString.equals("")|| passwordString.equals("")) {

            MyAlert myAlert = new MyAlert();
            myAlert.myDialog(this,"มีช่องว่าง","กรุณากรอกทุกช่อง คะ");
        }

    }  // clickSignUp

}    // Main Class
