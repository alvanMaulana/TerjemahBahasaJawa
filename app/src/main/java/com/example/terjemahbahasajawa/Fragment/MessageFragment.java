package com.example.terjemahbahasajawa.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.terjemahbahasajawa.Adapter.TerjemahanAdapter;
import com.example.terjemahbahasajawa.Data;
import com.example.terjemahbahasajawa.Database.DatabaseHelper;
import com.example.terjemahbahasajawa.Model.Terjemahan;
import com.example.terjemahbahasajawa.R;

import java.util.ArrayList;
import java.util.List;


import android.app.SearchManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SearchView;
import android.widget.SearchView.OnQueryTextListener;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MessageFragment extends Fragment implements SearchView.OnQueryTextListener {
    private Context context;
    private RecyclerView recyclerView;
    private TerjemahanAdapter adapter;
    public static ArrayList<Terjemahan> TerjemahanArrayList = new ArrayList<Terjemahan>();
    public static ArrayList<Terjemahan> awalArraylist = new ArrayList<Terjemahan>();
    private String[][] TerjemahanList;
    Data data ;
    private SearchView editsearch;
    private Spinner b1,b2;
    private String s1,s2;
    private ImageButton tukar;
    private int ganti1,ganti2;

    private String c1 = "Indonesia";
    private String c2 = "Ngoko";
    private String c3 = "Krama";
    private String c4 = "Krama Inggil";


    private Spinner pilihanBahasa;
    private String[] Pilihan = {
           "Indonesia",
            "Ngoko",
            "Krama",
            "Krama Inggil"
    };
    int tanda=1;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_message, container, false);


        data = new Data();

        context = getActivity();//pentiiiiiing




        editsearch = (SearchView)view.findViewById(R.id.search);
        editsearch.setOnQueryTextListener(this);



        s1="Indonesia";
        s2="Ngoko";


        b1 = (Spinner) view.findViewById(R.id.b1);
        b2 = (Spinner) view.findViewById(R.id.b2);

        tukar = (ImageButton)view.findViewById(R.id.tukar);

        final ArrayAdapter<String> pilihan = new ArrayAdapter<>(context,
                android.R.layout.simple_spinner_item, Pilihan);



        b1.setAdapter(pilihan);
        b2.setAdapter(pilihan);
        b2.setSelection(1);







        b1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // memunculkan toast + value Spinner yang dipilih (diambil dari adapter)
                ganti1=i;
                s1 = pilihan.getItem(i);


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        b2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // memunculkan toast + value Spinner yang dipilih (diambil dari adapter)
                ganti2=i;
                s2 = pilihan.getItem(i);


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });





        tukar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
b1.setSelection(ganti2);
b2.setSelection(ganti1);





            }
        });

















        recyclerView = (RecyclerView)view.findViewById(R.id.recycler_view);




        awalArraylist.addAll(data.getListData17());





        adapter = new TerjemahanAdapter(context,TerjemahanArrayList,awalArraylist,tanda);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());



        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(context, DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(adapter);





        return view;    }



    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {


        if(s1 == c1 && s2 == c1)
        {

            TerjemahanArrayList.clear();
            TerjemahanArrayList. addAll (data.getListData()) ;

        }

        else if(s1 == c1 && s2 == c2)
        {

            TerjemahanArrayList.clear();
            TerjemahanArrayList. addAll (data.getListData2()) ;

        }
        else if(s1 == c1 && s2 == c3 ){
            TerjemahanArrayList.clear();
            TerjemahanArrayList. addAll (data.getListData3()) ;

        }
        else if(s1 == c1 && s2 == c4 ){
            TerjemahanArrayList.clear();
            TerjemahanArrayList. addAll (data.getListData4()) ;

        }







        else if(s1 == c2 && s2 == c1){
            TerjemahanArrayList.clear();
            TerjemahanArrayList. addAll (data.getListData5()) ;


        }

        else if(s1 == c2 && s2 == c2){
            TerjemahanArrayList.clear();
            TerjemahanArrayList. addAll (data.getListData6()) ;

        }

        else if(s1 == c2 && s2 == c3){
            TerjemahanArrayList.clear();
            TerjemahanArrayList. addAll (data.getListData7()) ;

        }
        else if(s1 == c2 && s2 == c4){
            TerjemahanArrayList.clear();
            TerjemahanArrayList. addAll (data.getListData8()) ;

        }




        else if(s1 == c3 && s2 == c1){
            TerjemahanArrayList.clear();
            TerjemahanArrayList. addAll (data.getListData9()) ;

        }

        else if(s1 == c3 && s2 ==c2){
            TerjemahanArrayList.clear();
            TerjemahanArrayList. addAll (data.getListData10()) ;

        }
        else if(s1 == c3 && s2 == c3){
            TerjemahanArrayList.clear();
            TerjemahanArrayList. addAll (data.getListData11()) ;

        }
        else if(s1 == c3 && s2 == c4){
            TerjemahanArrayList.clear();
            TerjemahanArrayList. addAll (data.getListData12()) ;

        }





        else if(s1 == c4 && s2 == c1){
            TerjemahanArrayList.clear();
            TerjemahanArrayList. addAll (data.getListData13()) ;

        }

        else if(s1 == c4 && s2 == c2){
            TerjemahanArrayList.clear();
            TerjemahanArrayList. addAll (data.getListData14()) ;

        }

        else if(s1 == c4 && s2 == c3){
            TerjemahanArrayList.clear();
            TerjemahanArrayList. addAll (data.getListData15()) ;

        }

        else if(s1 == c4 && s2 == c4){
            TerjemahanArrayList.clear();
            TerjemahanArrayList. addAll (data.getListData16()) ;

        }




        adapter.getFilter().filter(newText);
        return true;    }
}















