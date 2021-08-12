package com.geek.reandroid1_7_hw.UI.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.geek.reandroid1_7_hw.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView botNav;
    private NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initNavigation();
    }

    private void initNavigation() {
        botNav = findViewById(R.id.botNav);
        AppBarConfiguration appBar = new AppBarConfiguration.Builder(R.id.characterFragment, R.id.locationFragment).build();
        navController = Navigation.findNavController(this, R.id.mainCont);
        NavigationUI.setupWithNavController(botNav, navController);
        NavigationUI.setupActionBarWithNavController(this, navController, appBar);
    }
}