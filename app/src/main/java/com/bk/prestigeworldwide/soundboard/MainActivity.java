package com.bk.prestigeworldwide.soundboard;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    Toolbar mToolbar;
    RecyclerView mRecyclerView;
    List<SoundData> mSoundList;
    SoundData mSoundData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Fuck You Adany", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });


        mToolbar = findViewById(R.id.toolbar);
        mToolbar.setTitle(getResources().getString(R.string.app_name));
        mRecyclerView = findViewById(R.id.recyclerview);
        GridLayoutManager mGridLayoutManager = new GridLayoutManager(MainActivity.this, 2);
        mRecyclerView.setLayoutManager(mGridLayoutManager);

        mSoundList = new ArrayList<>();
        mSoundData = new SoundData("Fuck U Adany", "Tracy - Fuck U Adany", R.drawable.play2, R.raw.fuck_you_adani);
        mSoundList.add(mSoundData);
        mSoundData = new SoundData("Rejected", "Rejected", R.drawable.play2, R.raw.rejected);
        mSoundList.add(mSoundData);
        mSoundData = new SoundData("Not Even Close", "U Like That Jer?", R.drawable.play2, R.raw.not_even_close);
        mSoundList.add(mSoundData);
        mSoundData = new SoundData("U Like That Jer?", "U Like That Jer?", R.drawable.bear, R.raw.like_that_jer);
        mSoundList.add(mSoundData);
        mSoundData = new SoundData("Jer? Little Bitch", "U Like That Jer?", R.drawable.bear, R.raw.jer_little_bitch);
        mSoundList.add(mSoundData);
        mSoundData = new SoundData("Poppin' Jerry's", "U Like That Jer?", R.drawable.bear, R.raw.poppin_jerrys);
        mSoundList.add(mSoundData);
        mSoundData = new SoundData("BK is an idiot", "U Like That Jer?", R.drawable.bk, R.raw.bk_idiot);
        mSoundList.add(mSoundData);
        mSoundData = new SoundData("BK bitch", "U Like That Jer?", R.drawable.bk, R.raw.get_ready_bk);
        mSoundList.add(mSoundData);
        mSoundData = new SoundData("Andrew = Trash", "U Like That Jer?", R.drawable.bk, R.raw.andrew_is_trash);
        mSoundList.add(mSoundData);
        MyAdapter myAdapter = new MyAdapter(MainActivity.this, mSoundList);
        mRecyclerView.setAdapter(myAdapter);
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
