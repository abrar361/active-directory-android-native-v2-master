package com.azuresamples.msalandroidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.FirebaseDatabase;

public class Start extends AppCompatActivity {

//    private static FirebaseDatabase mDatabase;
//    public static FirebaseDatabase getDatabase(){
//        if(mDatabase==null){
//            mDatabase = FirebaseDatabase.getInstance();
//            mDatabase.setPersistenceEnabled(true);
//            mDatabase.getReference().keepSynced(true);
//        }
//        return mDatabase;
//    }

//    private static FirebaseStorage mStorage;
//    public static FirebaseStorage getStorage(){
//        if(mStorage==null){
//            mStorage = FirebaseStorage.getInstance();
//        }
//        return mStorage;
//    }

    //private DatabaseReference mDatabase;
    //mDatabase=LoginActivity.getDatabase().getReference();
    //mStorage=LoginActivity.getStorage().getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        startActivity(new Intent(Start.this,MainActivity.class));
        finish();
    }
}
