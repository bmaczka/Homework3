package com.example.blake.buttontest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class homePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
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
                Intent mainActivityIntent = new Intent(homePage.this, MainActivity.class);
                startActivity(mainActivityIntent);
                return true;
            case R.id.home_activity_menu_item:
                return true;
            case R.id.test_activity_menu_item:
                Intent testActivityIntent = new Intent(homePage.this, test_Page.class);
                startActivity(testActivityIntent);
                return true;

            default:
                return true;
        }
    }
}
