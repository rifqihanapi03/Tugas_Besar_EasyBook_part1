package com.example.tugas_besar;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class FragmentLibrary extends Fragment {

    List<Book> lstBook ;
    View v;

    public FragmentLibrary() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.library_fragment,container,false);
        addData();
        RecyclerView myrv = (RecyclerView) v.findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(getContext(),lstBook);
        myrv.setLayoutManager(new GridLayoutManager(getContext(),3));
        myrv.setAdapter(myAdapter);
        return v;

    }


    public void addData() {
        lstBook = new ArrayList<>();
        lstBook.add(new Book("Pendidikan Agama Islam dan budi pekerti kelas 2","Pendidikan","Buku pendidikan agama islam ini digunakan untuk membangun akhlak dan membimbing dalam belajar agama yang baik dan benar untuk kelas 2 dan banyak hal yang dapat di pelajari dari buku ini",R.drawable.img_2));
        lstBook.add(new Book("Pendidikan Agama Islam dan budi pekerti kelas 4","Pendidikan","Buku pendidikan agama islam ini digunakan untuk membangun akhlak dan membimbing dalam belajar agama yang baik dan benar untuk kelas 4 dan banyak hal yang dapat di pelajari dari buku ini",R.drawable.img_3));
        lstBook.add(new Book("Pendidikan Karakter di Sekolah","Pendidikan","Buku pendidikan Karekter di Sekolah ini digunakan untuk umum supaya bisa membantu membimbing anak dalam membangun karekternya di sekolah dan banyak hal yang dapat di pelajari dari buku ini",R.drawable.img4));
        lstBook.add(new Book("Pendidikan Agama Islam dan budi pekerti kelas 1","Pendidikan","Buku pendidikan agama islam ini digunakan untuk membangun akhlak dan membimbing dalam belajar agama yang baik dan benar untuk kelas 1 dan banyak hal yang dapat di pelajari dari buku ini",R.drawable.img5));
        lstBook.add(new Book("Pendidikan Agama Islam dan budi pekerti kelas 5","Pendidikan","Buku pendidikan agama islam ini digunakan untuk membangun akhlak dan membimbing dalam belajar agama yang baik dan benar untuk kelas 5 dan banyak hal yang dapat di pelajari dari buku ini",R.drawable.img6));
        lstBook.add(new Book("Pendidikan Agama Islam dan budi pekerti kelas 2","Pendidikan","Buku pendidikan agama islam ini digunakan untuk membangun akhlak dan membimbing dalam belajar agama yang baik dan benar untuk kelas 2 dan banyak hal yang dapat di pelajari dari buku ini",R.drawable.img_2));
        lstBook.add(new Book("Pendidikan Agama Islam dan budi pekerti kelas 4","Pendidikan","Buku pendidikan agama islam ini digunakan untuk membangun akhlak dan membimbing dalam belajar agama yang baik dan benar untuk kelas 4 dan banyak hal yang dapat di pelajari dari buku ini",R.drawable.img_3));
        lstBook.add(new Book("Pendidikan Karakter di Sekolah","Pendidikan","Buku pendidikan Karekter di Sekolah ini digunakan untuk umum supaya bisa membantu membimbing anak dalam membangun karekternya di sekolah dan banyak hal yang dapat di pelajari dari buku ini",R.drawable.img4));
        lstBook.add(new Book("Pendidikan Agama Islam dan budi pekerti kelas 1","Pendidikan","Buku pendidikan agama islam ini digunakan untuk membangun akhlak dan membimbing dalam belajar agama yang baik dan benar untuk kelas 1 dan banyak hal yang dapat di pelajari dari buku ini",R.drawable.img5));
        lstBook.add(new Book("Pendidikan Agama Islam dan budi pekerti kelas 5","Pendidikan","Buku pendidikan agama islam ini digunakan untuk membangun akhlak dan membimbing dalam belajar agama yang baik dan benar untuk kelas 5 dan banyak hal yang dapat di pelajari dari buku ini",R.drawable.img6));

    }
}
