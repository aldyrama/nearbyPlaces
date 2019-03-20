package com.example.nearbyplaces.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nearbyplaces.Model.Place;
import com.example.nearbyplaces.R;

import java.util.ArrayList;

public class RecyclerViewAdapter extends  RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context context;
    private Place myPlaces;
    private double lat, lng;

    private String current_address;

    private static final int TYPE_HEAD=0;
    private static final int TYPE_LIST=1;
    private ArrayList<Place> places;

    public RecyclerViewAdapter(Context context, ArrayList<Place> places,String current_address) {
        this.context = context;
        this.places = places;
        this.current_address = current_address;
        this.lat = lat;
        this.lng = lng;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        return new PlaceListAdapterViewHolder(LayoutInflater
                .from(context).inflate(R.layout.list_item, parent, false));    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int position) {
        ((PlaceListAdapterViewHolder) myViewHolder).bindView(position);

    }

    @Override
    public int getItemCount() {
        return places.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        int mItemPosition;

        TextView res_name;
        TextView res_rating;
        TextView res_address;
        TextView res_phone;
        TextView current_location;
        ImageView res_image, location_image;

        int view_type;

        public MyViewHolder(final View itemView) {
            super(itemView);

            res_name = itemView.findViewById(R.id.name);
            res_rating = itemView.findViewById(R.id.rating);
            res_address = itemView.findViewById(R.id.address);
            res_phone = itemView.findViewById(R.id.phone);
            res_image = itemView.findViewById(R.id.res_image);
        }

        public void bindView(int position) {
            mItemPosition = position;

        }
    }

    private class PlaceListAdapterViewHolder extends MyViewHolder implements View.OnClickListener {
        public PlaceListAdapterViewHolder(View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {

        }
    }
}
