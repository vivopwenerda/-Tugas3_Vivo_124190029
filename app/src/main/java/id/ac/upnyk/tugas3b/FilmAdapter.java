package id.ac.upnyk.tugas3b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class FilmAdapter extends RecyclerView.Adapter<FilmAdapter.ViewHolder> {

    private Context context;
    private ArrayList<FilmModel> filmModels;

    public FilmAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<FilmModel> getFilmModels() {
        return filmModels;
    }
    public void setFilmModels(ArrayList<FilmModel> filmModels) {
        this.filmModels = filmModels;
    }

    @NonNull
    @Override
    public FilmAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.item_film,viewGroup,false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull FilmAdapter.ViewHolder viewholder, int i) {
        Glide.with(context).load(getFilmModels().get(i).getGambarFilm()).into(viewholder.ivGambarFilm);
        viewholder.tvTulisanFilm.setText(getFilmModels().get(i).getNamaFilm());
    }

    @Override
    public int getItemCount() {
        return getFilmModels().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivGambarFilm;
        private TextView tvTulisanFilm;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivGambarFilm = itemView.findViewById(R.id.gambar_film);
            tvTulisanFilm = itemView.findViewById(R.id.tulisan_film);
        }
    }
}
