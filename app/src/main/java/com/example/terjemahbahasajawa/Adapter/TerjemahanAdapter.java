package com.example.terjemahbahasajawa.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;


import com.example.terjemahbahasajawa.Activity.Detail;
import com.example.terjemahbahasajawa.Database.DatabaseHelper;
import com.example.terjemahbahasajawa.Model.Terjemahan;
import com.example.terjemahbahasajawa.R;

import java.util.ArrayList;

public class TerjemahanAdapter extends RecyclerView.Adapter<TerjemahanAdapter.TerjemahanViewHolder> implements Filterable {


    private final Context mContext;
    private ArrayList<Terjemahan> dataList;
    private ArrayList<Terjemahan> mFilteredList;
    public DatabaseHelper databaseHelper ;
    public Terjemahan terjemahan;
    private int tanda,id;




    public static final String TAG_INDONESIA = "INDONESA";

    public static final String TAG_NGOKO = "NGOKO";

    public static final String TAG_KROMO = "KROMO";

    public static final String TAG_HALUS = "HALUS";

    public static final String TAG_KATA = "KATA";






    public TerjemahanAdapter(Context context,ArrayList<Terjemahan> arrayList,ArrayList<Terjemahan> awalArraylist,int tanda) {
        this.dataList = arrayList;
        this.mContext = context;
        this.mFilteredList = awalArraylist;
        this.tanda = tanda;

        databaseHelper = new DatabaseHelper(context);
        terjemahan = new Terjemahan();

    }

    @Override
    public TerjemahanViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_itemnya, parent, false);
        return new TerjemahanViewHolder(view);

    }

    @Override
    public void onBindViewHolder(TerjemahanViewHolder holder, final int position) {
        holder.txtKata.setText(mFilteredList.get(position).getKata());
        holder.txtArti.setText(mFilteredList.get(position).getArti());


        id = mFilteredList.get(position).getId();
        int batas= id-10;

        if(tanda >= 10){
            databaseHelper.delete1Data(batas);
        }


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tanda == 1){
                    terjemahan.setKata(mFilteredList.get(position).getKata());
                    terjemahan.setArti(mFilteredList.get(position).getArti());
                    terjemahan.setIndonesia(mFilteredList.get(position).getIndonesia());
                    terjemahan.setNgoko(mFilteredList.get(position).getNgoko());
                    terjemahan.setKrama(mFilteredList.get(position).getKrama());
                    terjemahan.setHalus(mFilteredList.get(position).getHalus());


                    databaseHelper.insertData(terjemahan);
                }



                Intent i = new Intent(view.getContext(), Detail.class);
                i.putExtra(TAG_KATA,String.valueOf(mFilteredList.get(position).getKata()));
                i.putExtra(TAG_INDONESIA, String.valueOf(mFilteredList.get(position).getIndonesia()));
                i.putExtra(TAG_NGOKO, String.valueOf(mFilteredList.get(position).getNgoko()));
                i.putExtra(TAG_KROMO, String.valueOf(mFilteredList.get(position).getKrama()));
                i.putExtra(TAG_HALUS, String.valueOf(mFilteredList.get(position).getHalus()));


                view.getContext().startActivity(i);
            }
        });



    }


    @Override
    public int getItemCount() {

        return mFilteredList.size();
    }

    @Override
    public Filter getFilter() {


        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {

                String charString1 = charSequence.toString();
                String charString = charString1.toLowerCase();

                if (charString.isEmpty()) {
                    ArrayList<Terjemahan> filteredList = new ArrayList<>();

                    mFilteredList = filteredList;

                } else {




                    ArrayList<Terjemahan> filteredList = new ArrayList<>();

                    for (Terjemahan terjemahan : dataList) {

                        if (terjemahan.getKata().toLowerCase().startsWith(charString) ) {

                            filteredList.add(terjemahan);
                        }
                    }

                    mFilteredList = filteredList;
                }

                FilterResults filterResults = new FilterResults();
                filterResults.values = mFilteredList;
                return filterResults; }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                mFilteredList = (ArrayList<Terjemahan>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }


    public class TerjemahanViewHolder extends RecyclerView.ViewHolder{
        private TextView txtKata,txtArti;



        public TerjemahanViewHolder( View itemView) {
            super(itemView);

            txtKata = (TextView) itemView.findViewById(R.id.kata);
            txtArti = (TextView) itemView.findViewById(R.id.arti);


        }
    }

}













