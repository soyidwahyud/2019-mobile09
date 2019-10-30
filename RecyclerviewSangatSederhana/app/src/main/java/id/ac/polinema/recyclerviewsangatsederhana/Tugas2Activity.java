package id.ac.polinema.recyclerviewsangatsederhana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerviewsangatsederhana.Adapter.pesawatAngkutAdapter;
import id.ac.polinema.recyclerviewsangatsederhana.Adapter.pesawatLatihAdapter;
import id.ac.polinema.recyclerviewsangatsederhana.models.pesawatangkut;
import id.ac.polinema.recyclerviewsangatsederhana.models.pesawatlatih;

public class Tugas2Activity extends AppCompatActivity {
    RecyclerView rvPesawatAngkut;
    List<pesawatangkut> pesawatangkutList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas2);

        rvPesawatAngkut= findViewById(R.id.rvTugas2);

        pesawatangkut p1 = new pesawatangkut(R.drawable.boeing737,"Boeing 737");
        pesawatangkutList.add(p1);

        pesawatangkut p2 = new pesawatangkut(R.drawable.c130_hercules,"Hercules C-130");
        pesawatangkutList.add(p2);

        pesawatangkut p3 = new pesawatangkut(R.drawable.cn295,"CN-295");
        pesawatangkutList.add(p3);


        pesawatAngkutAdapter pesawatAngkutAdapter= new pesawatAngkutAdapter(pesawatangkutList);
        rvPesawatAngkut.setAdapter(pesawatAngkutAdapter);
        rvPesawatAngkut.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
    }
}
