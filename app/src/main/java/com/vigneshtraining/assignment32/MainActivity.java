package com.vigneshtraining.assignment32;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button searchBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchBtn=(Button)findViewById(R.id.searchButton);
        searchBtn.setOnClickListener(this);
        //dial();
    }



    private void dial(){

        //String number = "7777777777";
      //  Uri call = Uri.parse("tel:" + number);
        //Intent intent=new Intent(Intent.ACTION_DIAL,call);

        Intent intent=new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
        startActivity(intent);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.searchButton:

                dial();
                break;


        }
    }
}
