package app.com.example.venepallyprajith.matrial;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity  {
private EditText username,password;
    private Button signin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText)findViewById(R.id.input_name);
        password=(EditText)findViewById(R.id.input_password);
        signin=(Button)findViewById(R.id.btn_signup);


            signin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String user = username.getText().toString();
                    String pass = password.getText().toString();

                    //if (user =="admin"&& pass =="pass")
                    //{
                        Intent intent = new Intent(MainActivity.this, RecyclerView.class);
                        startActivity(intent);
                    //} else
                    //{
                      //  Toast.makeText(MainActivity.this, "Worng username or password ",
                        //        Toast.LENGTH_LONG).show();
                    //}
                }
            });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
