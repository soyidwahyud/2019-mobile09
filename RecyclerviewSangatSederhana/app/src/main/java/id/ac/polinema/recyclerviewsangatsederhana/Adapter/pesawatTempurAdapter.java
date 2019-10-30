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
import id.ac.polinema.recyclerviewsangatsederhana.models.pesawattempur;

public class pesawatTempurAdapter extends RecyclerView.Adapter<pesawatTempurAdapter.MyViewHolder>{
    List<pesawattempur> pesawattempurList;

    public pesawatTempurAdapter(List<pesawattempur>pesawattempurList){
        this.pesawattempurList = pesawattempurList;
    }

    @NonNull
    @Override
    public pesawatTempurAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View pesawattempurView = layoutInflater.inflate(R.layout.list_pesawat_tempur,parent,false);
        pesawatTempurAdapter.MyViewHolder viewHolder = new pesawatTempurAdapter.MyViewHolder(pesawattempurView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull pesawatTempurAdapter.MyViewHolder holder, int position) {
        pesawattempur t3 = pesawattempurList.get(position);
        //set text heroName berdasarkan data dari model hero
        holder.latihName.setText(t3.getNama());
        holder.latihBuatan.setText(t3.getBuatan());
        holder.latihImage.setImageResource(t3.getImage());

    }

    @Override
    public int getItemCount() {
        return (pesawattempurList != null) ? pesawattempurList.size() : 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView latihName;
        public ImageView latihImage;
        public TextView latihBuatan;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            latihName = itemView.findViewById(R.id.pesawat_tempur);
            latihImage = itemView.findViewById(R.id.gambar3);
            latihBuatan = itemView.findViewById(R.id.buatan);
        }
    }
}
