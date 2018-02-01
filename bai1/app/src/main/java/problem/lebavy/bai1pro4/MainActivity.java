package problem.lebavy.bai1pro4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_context, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent=null;
        switch (item.getItemId()){
            case R.id.sc1:
                intent =  new Intent(MainActivity.this, MenuActivity.class);
                break;
            case R.id.sc2:
                intent =  new Intent(MainActivity.this, MenuActivity2.class);
                break;
            case R.id.sc3:
                intent =  new Intent(MainActivity.this, MenuActivity3.class);
                break;
            case R.id.sc4:
                intent =  new Intent(MainActivity.this, MenuActivity4.class);
                break;
            case R.id.sc5:
                intent =  new Intent(MainActivity.this, MenuActivity5.class);
                break;
            case R.id.sc6:
                intent =  new Intent(MainActivity.this, MenuActivity6.class);
                break;
        }
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }
}
