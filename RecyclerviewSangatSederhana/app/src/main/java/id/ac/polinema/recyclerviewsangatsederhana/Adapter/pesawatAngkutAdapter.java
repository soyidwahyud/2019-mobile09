package id.ac.polinema.recyclerviewsangatsederhana.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import id.ac.polinema.recyclerviewsangatsederhana.R;
import id.ac.polinema.recyclerviewsangatsederhana.models.pesawatangkut;
import id.ac.polinema.recyclerviewsangatsederhana.models.pesawatlatih;

public class pesawatAngkutAdapter extends RecyclerView.Adapter<pesawatAngkutAdapter.MyViewHolder>{
    List<pesawatangkut> pesawatangkutList;

    public pesawatAngkutAdapter(List<pesawatangkut>pesawatangkutList){
        this.pesawatangkutList = pesawatangkutList;
    }

    @NonNull
    @Override
    public pesawatAngkutAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View pesawatangkutView = layoutInflater.inflate(R.layout.list_pesawat_angkut,parent,false);
        pesawatAngkutAdapter.MyViewHolder viewHolder = new pesawatAngkutAdapter.MyViewHolder(pesawatangkutView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull pesawatAngkutAdapter.MyViewHolder holder, int position) {
        pesawatangkut t2 = pesawatangkutList.get(position);
        //set text heroName berdasarkan data dari model hero
        holder.latihName.setText(t2.getNama());
        holder.latihImage.setImageResource(t2.getImage());
    }

    @Override
    public int getItemCount() {
        return (pesawatangkutList != null) ? pesawatangkutList.size() : 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView latihName;
        public ImageView latihImage;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            latihName = itemView.findViewById(R.id.pesawat_angkut);
            latihImage = itemView.findViewById(R.id.gambar2);
        }
    }
}
