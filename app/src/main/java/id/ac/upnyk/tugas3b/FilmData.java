package id.ac.upnyk.tugas3b;

import java.util.ArrayList;

public class FilmData {
    private static String[] tulisan_film = new String[]{"Conan","Kong","Kungfu",
            "Mortal","Raya","Shadow","Unholy"};
    private static int[] gambar_film = new
            int[]{R.drawable.conan,R.drawable.kong,
            R.drawable.kungfu,R.drawable.mortal,R.drawable.raya,R.drawable.raya,R.drawable.shadow,
            R.drawable.unholy};
    public static ArrayList<FilmModel> getListData(){
        FilmModel filmModel = null;
        ArrayList<FilmModel> list = new ArrayList<>();
        for (int i=0; i<tulisan_film.length; i++){
            filmModel = new FilmModel();
            filmModel.setGambarFilm(gambar_film[i]);
            filmModel.setNamaFilm(tulisan_film[i]);
            list.add(filmModel);
        }
        return list;
    }
}
