package com.example.blake.buttontest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class test_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test__page);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater optionsMenuInflator = getMenuInflater();
        optionsMenuInflator.inflate(R.menu.dropdown_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.main_activity_menu_item:
                Intent mainActivityIntent = new Intent(test_Page.this, MainActivity.class);
                startActivity(mainActivityIntent);
                return true;
            case R.id.home_activity_menu_item:
                Intent testActivityIntent = new Intent(test_Page.this, homePage.class);
                startActivity(testActivityIntent);
                return true;
            case R.id.test_activity_menu_item:
                return true;

            default:
                return true;
        }
    }
}
