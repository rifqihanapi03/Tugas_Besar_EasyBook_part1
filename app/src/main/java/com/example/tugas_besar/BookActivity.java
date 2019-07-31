package com.example.tugas_besar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BookActivity extends AppCompatActivity {

    private TextView tvtitle, tvdescription, tvcategory;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        tvtitle = (TextView) findViewById(R.id.txttitle);
        tvdescription = (TextView)  findViewById(R.id.txtdescription);
        tvcategory = (TextView) findViewById(R.id.txtcategory);
        img = (ImageView) findViewById(R.id.booktumbnail);

        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Category = intent.getExtras().getString("Category");
        String Descripstion = intent.getExtras().getString("Description");
        int image = intent.getExtras().getInt("Thumbnail");


        tvtitle.setText(Title);
        tvcategory.setText(Category);
        tvdescription.setText(Descripstion);
        img.setImageResource(image);


    }
}
