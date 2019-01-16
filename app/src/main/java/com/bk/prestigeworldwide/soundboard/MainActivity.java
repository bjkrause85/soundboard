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

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Fuck You Adany", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        mToolbar = findViewById(R.id.toolbar);
        mToolbar.setTitle(getResources().getString(R.string.app_name));
        mRecyclerView = findViewById(R.id.recyclerview);
        GridLayoutManager mGridLayoutManager = new GridLayoutManager(MainActivity.this, 2);
        mRecyclerView.setLayoutManager(mGridLayoutManager);

        mSoundList = new ArrayList<>();
        mSoundData = new SoundData("Fuck U Adany", "Tracy - Fuck U Adany", R.drawable.play2, R.raw.fuck_you_adani);
        mSoundList.add(mSoundData);
        mSoundData = new SoundData("Rejected", "Rejected", R.drawable.play2, R.raw.fuck_you_adani);
        mSoundList.add(mSoundData);
        mSoundData = new SoundData("Not Even Close", "U Like That Jer?", R.drawable.play2, R.raw.fuck_you_adani);
        mSoundList.add(mSoundData);
        mSoundData = new SoundData("Under Your Nose", "U Like That Jer?", R.drawable.play2, R.raw.fuck_you_adani);
        mSoundList.add(mSoundData);
        mSoundData = new SoundData("U Like That Jer?", "U Like That Jer?", R.drawable.play2, R.raw.fuck_you_adani);
        mSoundList.add(mSoundData);
//        mSoundData = new SoundData("Daisy", getString(R.string.description_flower_daisy),
//                R.drawable.play);
//        mSoundList.add(mSoundData);
//        mSoundData = new SoundData("Sunflower", getString(R.string.description_flower_sunflower),
//                R.drawable.play);
//        mSoundList.add(mSoundData);
//        mSoundData = new SoundData("Daffodil", getString(R.string.description_flower_daffodil),
//                R.drawable.play);
//        mSoundList.add(mSoundData);
//        mSoundData = new SoundData("Gerbera", getString(R.string.description_flower_gerbera),
//                R.drawable.play);
//        mSoundList.add(mSoundData);
//        mSoundData = new SoundData("Orchid", getString(R.string.description_flower_orchid),
//                R.drawable.play);
//        mSoundList.add(mSoundData);
//        mSoundData = new SoundData("Iris", getString(R.string.description_flower_iris),
//                R.drawable.play);
//        mSoundList.add(mSoundData);
//        mSoundData = new SoundData("Lilac", getString(R.string.description_flower_lilac),
//                R.drawable.play);
//        mSoundList.add(mSoundData);

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
