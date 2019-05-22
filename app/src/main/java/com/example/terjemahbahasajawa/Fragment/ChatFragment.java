package com.example.terjemahbahasajawa.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.SearchView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.terjemahbahasajawa.Adapter.TerjemahanAdapter;
import com.example.terjemahbahasajawa.Data;
import com.example.terjemahbahasajawa.Database.DatabaseHelper;
import com.example.terjemahbahasajawa.Model.Terjemahan;
import com.example.terjemahbahasajawa.R;

import java.util.ArrayList;


public class ChatFragment extends Fragment {


    private Context context;
    private RecyclerView recyclerView;
    private TerjemahanAdapter adapter;
    public static ArrayList<Terjemahan> TerjemahanArrayList = new ArrayList<Terjemahan>();
    public static ArrayList<Terjemahan> awalArraylist = new ArrayList<Terjemahan>();
    public DatabaseHelper databaseHelper ;
    int tanda = 0;
    int batas =0;
    String Batas;
    TextView batasan;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chat, container, false);


        context = getActivity();//pentiiiiiing

        databaseHelper =  new DatabaseHelper(context);


        recyclerView = (RecyclerView)view.findViewById(R.id.recycler_view);

        awalArraylist.clear();
        awalArraylist.addAll(databaseHelper.getTerjemahan());
        batas = awalArraylist.size();

        adapter = new TerjemahanAdapter(context,TerjemahanArrayList,awalArraylist,batas);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(context, DividerItemDecoration.VERTICAL));

        recyclerView.setAdapter(adapter);







        return view;


    }
}