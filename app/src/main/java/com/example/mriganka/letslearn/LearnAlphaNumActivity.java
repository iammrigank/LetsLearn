package com.example.mriganka.letslearn;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;




public class LearnAlphaNumActivity extends AppCompatActivity {

    GridView gview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("after 1");
        Boolean alpha=getIntent().getExtras().getBoolean("alphabet");
        setContentView(R.layout.activity_grid_alpha_num);
        System.out.println("after 2");
        gview = (GridView) findViewById(R.id.gridView);
        System.out.println("after 3");
        gview.setAdapter(new ItemsAdapter(this,alpha));
        gview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View row, int position, long id) {
                //Toast.makeText(getApplicationContext(),"Position Clicked: "+ position +"& text is",Toast.LENGTH_LONG).show();
                doCallIntent();
            }
        });

    }
    public void doCallIntent(){
        Intent intent = new Intent(this,AlphabetPager.class);
        startActivity(intent);
    }

}
