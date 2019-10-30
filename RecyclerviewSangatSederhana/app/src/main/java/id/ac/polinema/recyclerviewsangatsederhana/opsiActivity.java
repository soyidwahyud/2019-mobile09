package id.ac.polinema.recyclerviewsangatsederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class opsiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opsi);
    }

    public void onPraktikum(View view) {
        Intent p = new Intent(this,MainActivity.class);
        startActivity(p);
    }

    public void onTugas1(View view) {
        Intent t1 = new Intent(this,Tugas1Activity.class);
        startActivity(t1);

    }

    public void onTugas2(View view) {
        Intent t2 = new Intent(this,Tugas2Activity.class);
        startActivity(t2);
    }

    public void onTugas3(View view) {
        Intent t3 = new Intent(this,Tugas3Activity.class);
        startActivity(t3);
    }
}
