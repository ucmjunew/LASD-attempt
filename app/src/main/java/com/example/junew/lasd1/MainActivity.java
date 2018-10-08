package com.example.junew.lasd1;

import android.media.MediaPlayer;
import android.os.Messenger;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;
import android.content.res.AssetManager;



public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    private DrawerLayout drawer;
    MediaPlayer mysong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.support.v7.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        //Ctrl+Shift+Space

        drawer.addDrawerListener(toggle);
        toggle.syncState();


        if (savedInstanceState == null) {
            //getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new AlphabetFragment()).commit();
            //navigationView.setCheckedItem(R.id.nav_alphabet);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch(menuItem.getItemId()){
            case R.id.nav_alphabet:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new AlphabetFragment()).commit();
                //mysong = MediaPlayer.create(AlphabetFragment., R.raw.alphabetlistm4a);
                //mysong.start();
            break;

            case R.id.nav_tencode:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new TenCodesFragment()).commit();
                break;

            case R.id.nav_code:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CodeFragment()).commit();
                break;

            case R.id.nav_radiocode1:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new RadioCodesFragment1()).commit();
                break;

            case R.id.nav_radiocode2:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new RadioCodesFragment2()).commit();
                break;

            case R.id.nav_radiocode3:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new RadioCodesFragment3()).commit();
                break;

            case R.id.nav_commands:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CommandFragment()).commit();
                break;
            case R.id.nav_creed:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CreedFragment()).commit();
                break;
            case R.id.nav_coreValues:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CoreValueFragment()).commit();
                break;
            case R.id.nav_missionStatement:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new MissionStatementFragment()).commit();
                break;
        }

        drawer.closeDrawer(GravityCompat.START);


        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
    }
}

/* if i ever want to input a toast message
Toast.makeText(this, "Additional Information", Toast.LENGTH_SHORT).show();
 */