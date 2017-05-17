package com.example.junyang.bmpt;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class SelectBed extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    GridLayoutManager lLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_bed);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        List<ItemObject> rowListItem = getAllItemList();
        RecyclerView rView = (RecyclerView)findViewById(R.id.recycler_view);

        lLayout = new GridLayoutManager(SelectBed.this, 4);
        rView.setLayoutManager(lLayout);
        rView.setHasFixedSize(true);


        RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(SelectBed.this, rowListItem);
        rView.setAdapter(rcAdapter);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.select_bed, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            Intent intent = new Intent(SelectBed.this, MainActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_gallery) {
            Intent intent = new Intent(SelectBed.this, BedManagement.class);
            startActivity(intent);
        } else if (id == R.id.nav_slideshow) {
            Intent intent = new Intent(SelectBed.this, PatientTracking.class);
            startActivity(intent);
        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private List<ItemObject> getAllItemList(){

        List<ItemObject> allItems = new ArrayList<ItemObject>();
        allItems.add(new ItemObject("Bed 1", R.color.red));
        allItems.add(new ItemObject("Bed 2", R.color.green));
        allItems.add(new ItemObject("Bed 3", R.color.green));
        allItems.add(new ItemObject("Bed 4", R.color.orange));
        allItems.add(new ItemObject("Bed 5", R.color.red));
        allItems.add(new ItemObject("Bed 6", R.color.red));
        allItems.add(new ItemObject("Bed 7", R.color.yellow));
        allItems.add(new ItemObject("Bed 8", R.color.yellow));
        allItems.add(new ItemObject("Bed 9", R.color.green));
        allItems.add(new ItemObject("Bed 10", R.color.green));
        allItems.add(new ItemObject("Bed 11", R.color.green));
        allItems.add(new ItemObject("Bed 12", R.color.green));
        allItems.add(new ItemObject("Bed 13", R.color.red));
        allItems.add(new ItemObject("Bed 14", R.color.red));
        allItems.add(new ItemObject("Bed 15", R.color.orange));
        allItems.add(new ItemObject("Bed 16", R.color.yellow));
        allItems.add(new ItemObject("Bed 17", R.color.green));
        allItems.add(new ItemObject("Bed 18", R.color.green));
        allItems.add(new ItemObject("Bed 19", R.color.green));
        allItems.add(new ItemObject("Bed 20", R.color.green));
        allItems.add(new ItemObject("Bed 21", R.color.red));
        allItems.add(new ItemObject("Bed 22", R.color.red));
        allItems.add(new ItemObject("Bed 23", R.color.red));
        allItems.add(new ItemObject("Bed 24", R.color.red));
        allItems.add(new ItemObject("Bed 25", R.color.red));
        allItems.add(new ItemObject("Bed 26", R.color.green));
        allItems.add(new ItemObject("Bed 27", R.color.orange));
        allItems.add(new ItemObject("Bed 28", R.color.yellow));

        return allItems;
    }
}
