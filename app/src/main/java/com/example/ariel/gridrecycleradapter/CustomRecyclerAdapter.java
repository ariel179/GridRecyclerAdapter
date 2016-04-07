package com.example.ariel.gridrecycleradapter;

/**
 * Created by Ariel on 4/3/2016.
 */
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class CustomRecyclerAdapter extends RecyclerView.Adapter<CustomRecyclerAdapter.ViewHolder> {


    ArrayList<String> array = new ArrayList<>();

    public CustomRecyclerAdapter(ArrayList<String> array){

        this.array = array;

    }

    @Override
    public CustomRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        //Called when RecyclerView needs a new RecyclerView.ViewHolder of the given type to represent an item.

        //inflating the row layout we created earlier
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.grid_view, parent, false);

        //making a ViewHolder object with the view we just inflated
        ViewHolder vh = new ViewHolder(v);


        return vh;
    }



    @Override
    public void onBindViewHolder(final CustomRecyclerAdapter.ViewHolder holder, final int position) {

      holder.textView.setText(array.get(position));





    }

    @Override
    public int getItemCount(){



        return array.size();

    }



    public static class ViewHolder extends RecyclerView.ViewHolder {

        //reference to the row view
        public View view;

        TextView textView;

        TextView imageNumberView;

        //constructing the viewHolder
        public ViewHolder(View v) {
            super(v);
            view = v;
            textView = (TextView) v.findViewById(R.id.textView);
           // imageNumberView = (TextView) v.findViewById(R.id.textView);

        }
    }

}

