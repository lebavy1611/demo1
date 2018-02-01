package problem.lebavy.bai1pro4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by ASUS on 1/31/2018.
 */

public class MenuActivity5 extends AppCompatActivity {
    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen5);

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
                intent =  new Intent(MenuActivity5.this, MenuActivity.class);
                break;
            case R.id.sc2:
                intent =  new Intent(MenuActivity5.this, MenuActivity2.class);
                break;
            case R.id.sc3:
                intent =  new Intent(MenuActivity5.this, MenuActivity3.class);
                break;
            case R.id.sc4:
                intent =  new Intent(MenuActivity5.this, MenuActivity4.class);
                break;
            case R.id.sc5:
                intent =  new Intent(MenuActivity5.this, MenuActivity5.class);
                break;
            case R.id.sc6:
                intent =  new Intent(MenuActivity5.this, MenuActivity6.class);
                break;
        }
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }
}
