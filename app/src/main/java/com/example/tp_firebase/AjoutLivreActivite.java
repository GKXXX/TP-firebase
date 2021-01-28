package com.example.tp_firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class AjoutLivreActivite extends AppCompatActivity {
    EditText editTitre,editAuteur,editNbPage,editHall;
    Button boutonValide;

    private class ListenerBouton implements Button.OnClickListener{

        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.boutonValideAjoutLivre) {
                envoieLivre();
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajout_livre_activite);
        editTitre = findViewById(R.id.editTitre);
        editAuteur = findViewById(R.id.editAuteur);
        editNbPage = findViewById(R.id.editPage);
        editHall = findViewById(R.id.editHall);
        boutonValide = findViewById(R.id.boutonValideAjoutLivre);
        ListenerBouton listener = new ListenerBouton();
        boutonValide.setOnClickListener(listener);
    }
    private void envoieLivre () {
        DatabaseReference database = FirebaseDatabase.getInstance().getReference();
        DatabaseReference maRef = database.child("livre/");
        Map<String,Object> mapLivre = new HashMap<>();
        Map<String, Object> mapObjet = new HashMap<>();
        mapLivre.put("auteur",editAuteur.getText().toString());
        mapLivre.put("titre",editTitre.getText().toString());
        mapLivre.put("nbPage",editNbPage.getText().toString());
        mapLivre.put("hall",editHall.getText().toString());
        String key = maRef.push().getKey();
        mapObjet.put(key,mapLivre);
        maRef.updateChildren(mapObjet);
    }
}