package keung.foodchoice;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    Button button1;
    EditText in1;
    EditText in2;
    EditText in3;
    EditText in4;
    EditText in5;
    EditText in6;
    EditText in7;
    EditText in8;
    EditText in9;





    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //checkBox1 = (TextView) findViewById(R.id.Check_A);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
        button1 = (Button) findViewById(R.id.btm_choice);
        in1 = (EditText) findViewById(R.id.input1);
        in2 = (EditText) findViewById(R.id.input2);
        in3 = (EditText) findViewById(R.id.input3);
        in4 = (EditText) findViewById(R.id.input4);
        in5 = (EditText) findViewById(R.id.input5);
        in6 = (EditText) findViewById(R.id.input6);
        in7 = (EditText) findViewById(R.id.input7);
        in8 = (EditText) findViewById(R.id.input8);
        in9 = (EditText) findViewById(R.id.input9);

    }

public void random () {
int random = (int)(Math.random()*9+1);


}



    public void buttonclick(View view) {
// random = new random();
        AlertDialog.Builder builder= new  AlertDialog.Builder(this);
        builder.setMessage("幫你揀左"+"random" );
        builder.show();



       /* outerloop:
        for (int x = 0; x < 10; x++) {
            switch ((int) (Math.random() * 9 + 1)) {
                case 1:
                    if (in1.length() > 0) {
                       String input = in1.getText().toString();
                        builder.setMessage("幫你揀左"+ input);
                        builder.show();
                       break outerloop;
                    }
                case 2:
                    if (in2.length() > 0) {
                        String input = in2.getText().toString();
                        builder.setMessage("幫你揀左"+ input);
                        builder.show();
break outerloop;
                    }
                case 3:
                    if (in3.length() > 0) {
                        String input = in3.getText().toString();
                        builder.setMessage("幫你揀左"+ input);
                        builder.show();
break outerloop;
            }
                case 4:
                    if (in4.length() > 0) {
                        String input = in4.getText().toString();
                        builder.setMessage("幫你揀左"+ input);
                        builder.show();
break outerloop;
                    }
                case 5:
                    if (in5.length() > 0) {
                        String input = in5.getText().toString();
                        builder.setMessage("幫你揀左"+ input);
                        builder.show();
break outerloop;
                    }
                case 6:
                    if (in6.length() > 0) {
                        String input = in6.getText().toString();
                        builder.setMessage("幫你揀左"+ input);
                        builder.show();
break outerloop;
                    }
                case 7:
                    if (in7.length() > 0) {
                        String input = in7.getText().toString();
                        builder.setMessage("幫你揀左"+ input);
                        builder.show();
break outerloop;
                    }
                case 8:
                    if (in8.length() > 0) {
                        String input = in8.getText().toString();
                        builder.setMessage("幫你揀左"+ input);
                        builder.show();
break outerloop;
                    }
                case 9:
                    if (in9.length() > 0) {
                        String input = in9.getText().toString();
                        builder.setMessage("幫你揀左"+ input);
                        builder.show();
                    break outerloop;
                    }
            }
        }*/
    }
        /*number1 = (int) (Math.random() * 10 + 1);
        textView01.setText(number1 + "");*/


        @Override

    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://keung.foodchoice/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://keung.foodchoice/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }}




