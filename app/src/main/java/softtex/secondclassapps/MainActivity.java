package softtex.secondclassapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.buttoon);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"Clicked add",Toast.LENGTH_LONG).show();

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.menu1:
                Toast.makeText(getApplicationContext(),"First Position",Toast.LENGTH_LONG).show();
                break;

            case R.id.menu2:
                Toast.makeText(getApplicationContext(),"Second Position",Toast.LENGTH_LONG).show();
                break;
            case R.id.menu3:
                Toast.makeText(getApplicationContext(),"Third Position",Toast.LENGTH_LONG).show();
                break;

            case R.id.menu4:
                Toast.makeText(getApplicationContext(),"Fourth Position",Toast.LENGTH_LONG).show();
                break;

            case R.id.menu5:
                Toast.makeText(getApplicationContext(),"Fifth Position",Toast.LENGTH_LONG).show();
                break;

            case R.id.menu6:
                Toast.makeText(getApplicationContext(),"Six Position",Toast.LENGTH_LONG).show();
                break;


        }

        return super.onOptionsItemSelected(item);
    }


}
