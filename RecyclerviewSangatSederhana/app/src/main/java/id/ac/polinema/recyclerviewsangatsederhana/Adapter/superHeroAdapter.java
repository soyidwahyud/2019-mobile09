package id.ac.polinema.recyclerviewsangatsederhana.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import id.ac.polinema.recyclerviewsangatsederhana.R;
import id.ac.polinema.recyclerviewsangatsederhana.models.superhero;

public class superHeroAdapter extends RecyclerView.Adapter<superHeroAdapter.myViewHolder> {
    List<superhero> heroList;

    public superHeroAdapter(List<superhero> heroList) {
        this.heroList = heroList;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View superHeroView = layoutInflater.inflate(R.layout.item_super_hero,parent,false);
        myViewHolder viewHolder = new myViewHolder(superHeroView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        superhero hero = heroList.get(position);
        //set text heroName berdasarkan data dari model hero
        holder.heroName.setText(hero.getHeroName());
    }

    @Override
    public int getItemCount() {
        return (heroList != null) ? heroList.size() : 0;
    }

    public class myViewHolder extends RecyclerView.ViewHolder {
        public TextView heroName;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            heroName = itemView.findViewById(R.id.heroName);
        }
    }
}
