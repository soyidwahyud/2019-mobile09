package id.ac.polinema.recyclerviewsangatsederhana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerviewsangatsederhana.Adapter.superHeroAdapter;
import id.ac.polinema.recyclerviewsangatsederhana.models.superhero;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvSuperHero;
    List<superhero> listSuperHero = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvSuperHero = findViewById(R.id.rvSuperHero);

        superhero hero = new superhero("Petruk");
        //menambahkan hero ke listSuperHero
        listSuperHero.add(hero);
        //membuat object hero baru
        hero = new superhero("Gareng");
        //menambahkan hero baru ke listSuperhero
        listSuperHero.add(hero);

        superHeroAdapter superHeroAdapter = new superHeroAdapter(listSuperHero);
        rvSuperHero.setAdapter(superHeroAdapter);
        rvSuperHero.setLayoutManager(new LinearLayoutManager(this));


    }
}
