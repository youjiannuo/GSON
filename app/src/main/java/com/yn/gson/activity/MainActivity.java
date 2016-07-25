package com.yn.gson.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.gson.reflect.TypeToken;
import com.yn.gson.MyGson;
import com.yn.gson.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        List<A> list = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            A a = new A();
            B b = new B();
            a.setC("c" + i);
            a.setD("d" + i);
            a.setE("e" + i);
            a.setB(b);
            b.setF("f" + i);
            b.setG("g" + i);
            b.setH("h" + i);
            list.add(a);
        }
        String s = new MyGson().toJSON(list);
        list = new MyGson().fromJson(s, new TypeToken<List<A>>() {
        }.getType());
        ((TextView) findViewById(R.id.text)).setText(s);
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
