package id.ac.polinema.recyclerviewsangatsederhana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerviewsangatsederhana.Adapter.pesawatLatihAdapter;
import id.ac.polinema.recyclerviewsangatsederhana.models.pesawatlatih;

public class Tugas1Activity extends AppCompatActivity {

    RecyclerView rvPesawatLatih;
    List<pesawatlatih> pesawatlatihList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas1);
        rvPesawatLatih= findViewById(R.id.rvTugas1);

        pesawatlatih p1 = new pesawatlatih(R.drawable.embraer_emb_312_tucano,"EMBRAER EMB-312 Tucano");
        pesawatlatihList.add(p1);

        pesawatlatih p2 = new pesawatlatih(R.drawable.guizhou_jl_9,"Guizhou JL-9");
        pesawatlatihList.add(p2);

        pesawatlatih p3 = new pesawatlatih(R.drawable.bae_system_hawk,"BAE Systems Hawk");
        pesawatlatihList.add(p3);

        pesawatLatihAdapter pesawatLatihAdapter = new pesawatLatihAdapter(pesawatlatihList);
        rvPesawatLatih.setAdapter(pesawatLatihAdapter);
        rvPesawatLatih.setLayoutManager(new LinearLayoutManager(this));
    }
}
