package jmgc.itics.tesoem.edu.proyectomole;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void amarillo(View v){
        Intent amarillo = new Intent (this, MoleAmarillooAmarillitoActivity.class);
        startActivity(amarillo);
        finish();
    }
    public void novia(View v){
        Intent novia = new Intent (this, MoleBlancoodeNoviaActivity.class);
        startActivity(novia);
        finish();
    }
    public void almendrado(View v){
        Intent almendrado = new Intent (this, MoleAlmendradoActivity.class);
        startActivity(almendrado);
        finish();
    }
    public void alcaparro(View v){
        Intent alcaparro = new Intent (this, MoleAlcaparradoActivity.class);
        startActivity(alcaparro);
        finish();
    }
    public void ajonjoli(View v){
        Intent ajonjoli = new Intent (this, MoleDeAjonjoliActivity.class);
        startActivity(ajonjoli);
        finish();
    }
    public void coloradito(View v){
        Intent coloradito = new Intent (this, MoleColoraditoActivity.class);
        startActivity(coloradito);
        finish();
    }
    public void mantel(View v){
        Intent mantel = new Intent (this, ManchaMantelesActivity.class);
        startActivity(mantel);
        finish();
    }
    public void poblano(View v){
        Intent poblano = new Intent (this, MolePoblanoActivity.class);
        startActivity(poblano);
        finish();
    }
    public void verde(View v){
        Intent verde = new Intent (this, MoleVerdeActivity.class);
        startActivity(verde);
        finish();
    }
    public void rojo(View v){
        Intent rojo = new Intent (this, MoleRojo3Activity.class);
        startActivity(rojo);
        finish();
    }
