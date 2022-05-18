package com.example.sp1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //fragment default
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.frameLayout, new BlankFragment_a())
                .commit();
    }

    //metodos para reemplazar fragments
    public void mostrarFA(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new BlankFragment_a()).commit();
    }
    public void mostrarFB(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new BlankFragment_b()).commit();
    }
    public void mostrarFC(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new BlankFragment_c()).commit();
    }
}