package id.ac.polinema.recyclerviewsangatsederhana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerviewsangatsederhana.Adapter.pesawatAngkutAdapter;
import id.ac.polinema.recyclerviewsangatsederhana.Adapter.pesawatTempurAdapter;
import id.ac.polinema.recyclerviewsangatsederhana.models.pesawatangkut;
import id.ac.polinema.recyclerviewsangatsederhana.models.pesawattempur;

public class Tugas3Activity extends AppCompatActivity {
    RecyclerView rvPesawattempur;
    List<pesawattempur> pesawattempurList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas3);

        rvPesawattempur= findViewById(R.id.rvTugas3);

        pesawattempur p1 = new pesawattempur(R.drawable.f16,"F-16 Fighting Falcon","Amerika Serikat");
        pesawattempurList.add(p1);

        pesawattempur p2 = new pesawattempur(R.drawable.su30,"Sukhoi su-30 Flanker","Rusia");
        pesawattempurList.add(p2);

        pesawattempur p3 = new pesawattempur(R.drawable.hawk109,"Hawk 109/209","Inggris");
        pesawattempurList.add(p3);

        pesawattempur p4 = new pesawattempur(R.drawable.t_50_i_tni,"T50-i Golden Eagle","Korea Selatan");
        pesawattempurList.add(p4);


        pesawatTempurAdapter pesawatTempurAdapter= new pesawatTempurAdapter((pesawattempurList));
        rvPesawattempur.setAdapter(pesawatTempurAdapter);
        rvPesawattempur.setLayoutManager(new GridLayoutManager(this, 2));
    }
}
