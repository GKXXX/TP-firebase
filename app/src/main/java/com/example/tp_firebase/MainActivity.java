package com.example.tp_firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private Button boutonAjoutLivre;
    private class listenerBouton implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.boutonAjoutLivre:
                    lanceActiviteAjoutLivre();
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listenerBouton listenerBouton=new listenerBouton();

        boutonAjoutLivre = findViewById(R.id.boutonAjoutLivre);
        boutonAjoutLivre.setOnClickListener(listenerBouton);
    }
    public void lanceActiviteAjoutLivre(){
        Intent intent = new Intent(MainActivity.this,AjoutLivreActivite.class);
        startActivity(intent);
    }
}