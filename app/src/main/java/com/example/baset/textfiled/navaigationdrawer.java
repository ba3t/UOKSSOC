package com.example.baset.textfiled;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class navaigationdrawer extends AppCompatActivity {
    DrawerLayout dl;
    ActionBarDrawerToggle abdt;
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            setContentView(R.layout.navigationdrawer);
            initToolbar();
            dl = (DrawerLayout) findViewById(R.id.drawer);
            toolbar = (Toolbar) findViewById(R.id.toolbar);
            abdt = new ActionBarDrawerToggle(this, dl,toolbar, R.string.open, R.string.close);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            setSupportActionBar(toolbar);

            dl.addDrawerListener(abdt);
            abdt.syncState();
        } catch (Exception e) {
            Log.e("basettttttt", e.getLocalizedMessage());
        }
    }
    private void initToolbar() {
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        TextView txt = (TextView) findViewById(R.id.text_view_toolbar_title);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }

        toolbar.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        txt.setText("سامانه مدیریت انجمن ها");


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (abdt.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}


