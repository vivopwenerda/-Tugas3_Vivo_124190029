package id.ac.upnyk.tugas3b;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvFilm;
    private ArrayList<FilmModel> listFilm = new ArrayList<>();
    TextView TV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvFilm = findViewById(R.id.rv_film_list);
        rvFilm.setHasFixedSize(true);
        listFilm.addAll(FilmData.getListData());

        showRecyclerList();

        rvFilm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent (MainActivity.this,ActivityTujuan.class);
                startActivity(pindah);
            }
        });
    }

    private void showRecyclerList() {
        rvFilm.setLayoutManager(new LinearLayoutManager(this));
        FilmAdapter filmAdapter = new FilmAdapter(this);
        filmAdapter.setFilmModels(listFilm);
        rvFilm.setAdapter(filmAdapter);
    }
}