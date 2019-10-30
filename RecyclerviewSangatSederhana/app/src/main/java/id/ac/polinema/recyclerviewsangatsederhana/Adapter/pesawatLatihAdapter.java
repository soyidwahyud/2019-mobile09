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
import id.ac.polinema.recyclerviewsangatsederhana.models.pesawatlatih;

public class pesawatLatihAdapter extends RecyclerView.Adapter<pesawatLatihAdapter.MyViewHolder> {
    List<pesawatlatih>pesawatlatihList;

    public pesawatLatihAdapter(List<pesawatlatih>pesawatlatihList){
        this.pesawatlatihList = pesawatlatihList;
    }

    @NonNull
    @Override
    public pesawatLatihAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View pesawatlatihView = layoutInflater.inflate(R.layout.list_pesawat_latih,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(pesawatlatihView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull pesawatLatihAdapter.MyViewHolder holder, int position) {
        pesawatlatih t1 = pesawatlatihList.get(position);
        //set text heroName berdasarkan data dari model hero
        holder.latihName.setText(t1.getNama());
        holder.latihImage.setImageResource(t1.getImage());
    }

    @Override
    public int getItemCount() {
        return (pesawatlatihList != null) ? pesawatlatihList.size() : 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView latihName;
        public ImageView latihImage;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            latihName = itemView.findViewById(R.id.pesawat_latih);
            latihImage = itemView.findViewById(R.id.gambar);
        }
    }
}
