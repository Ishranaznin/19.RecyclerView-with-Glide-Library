package com.example.recyclerview_glide_library;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
 private ArrayList<String>mnames=new ArrayList<>();
 private ArrayList<String>mImageURL=new ArrayList<>();
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
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
       initImageBitmap();
    }
    private void initImageBitmap(){
        initRecyclerview();
    }
  private void  initRecyclerview(){
        RecyclerView recyclerView=findViewById(R.id.recyclerview);



      RecyclerviewAdapter adapter=new RecyclerviewAdapter(this,mImageURL,mnames);
      recyclerView.setAdapter(adapter);
      recyclerView.setLayoutManager(new LinearLayoutManager(this));

      mImageURL.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSd5K7JH1MJXLbd5Y_SEHle37HYLzArPbDipmAMcxqTNIBMUMIQyA");
        mnames.add("Asiatic Lily");
        mImageURL.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQEkynCDZBABxu7GUhJOOYWwiSL9E8vuWBWoKHleNAZvVxBCpIjdw");
      mnames.add("Azalea");
        mImageURL.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQEkynCDZBABxu7GUhJOOYWwiSL9E8vuWBWoKHleNAZvVxBCpIjdw");
        mnames.add("Azalea");
        mImageURL.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR9AgyO4i24o8FL3x2imXyVpm54tOpuFu_y3K_Zy1TgR4-8KJOl");
        mnames.add("Baby's Breath");
        mImageURL.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSFCYiqHtkkSZjUSJLruMaFxdfIvCXKsjwwzaz5ggS3QVe00DMo");
        mnames.add("Azalea");
        mImageURL.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ-zNJQgbrUd3A42OlCXRlQAZEhFLdHa9CcNlHzMPTjqvpX-LqitA");
        mnames.add("Frozen Lake");
        mImageURL.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ1T2gEUi_B1kADzgCfShh11qrFbv8O83ACL59ZN_eK5BC9XUuu");
        mnames.add("Aster");
        mImageURL.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTh6p3s3txDqGmT8y7BPPFLkQfHlkO0saarjQdY5ZhFPYXsXr8h2g");
        mnames.add("Azalea");
        mImageURL.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSd5K7JH1MJXLbd5Y_SEHle37HYLzArPbDipmAMcxqTNIBMUMIQyA");
        mnames.add("Aster");
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
