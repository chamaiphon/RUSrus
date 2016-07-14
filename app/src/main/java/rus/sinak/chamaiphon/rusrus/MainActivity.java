package rus.sinak.chamaiphon.rusrus;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private EditText userEditText, passwordEditText;
    private ImageView imageView;
    private static final  String urlLogo = "http://swiftcodingthai.com/rus/image/logo_rus.png";
    private String userString, passwordStrimg;
    private static final String urlJSON = "http://swiftcodingthai.com/rus/get_user_chamaiphon.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind widget
        userEditText = (EditText) findViewById(R.id.editText4);
        passwordEditText = (EditText) findViewById(R.id.editText5);
        imageView = (ImageView) findViewById(R.id.imageView6);

        //Load Imge from Server
        Picasso.with(this).load(urlLogo).into(imageView);

    }  // Main Method

    //Create Inner Class
    private class SynUser extends AsyncTask<Void, Void, String> {

        @Override
        protected String doInBackground(Void... params) {
            return null;
        }   // doInBack



    }  // SynUser Class


    public void clickSignIn(View view) {

        userString = userEditText.getText().toString().trim();
        passwordStrimg = passwordEditText.getText().toString().trim();

        if (userString.equals("") || passwordStrimg.equals("")) {
            //Have Space
            MyAlert myAlert = new MyAlert();
            myAlert.myDialog(this, "Have Space",
                    "Please Fill All Every Blank");
        } else {
            //No Space

        } //if

    }
    // clinkSign
    public void clickSignUpMain(View view) {
        startActivity(new Intent(MainActivity.this,SignUpActivity.class));
    }

}  // Main Class นี่คือ คลาสหลัก นะฮับ
