package com.example.android.sunshine;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder> {

    private String[] mWeatherData;

    public ForecastAdapter(){

    }

    @NonNull
    @Override
    public ForecastAdapter.ForecastAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.forecast_list_item, viewGroup, false);
        return new ForecastAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ForecastAdapter.ForecastAdapterViewHolder forecastAdapterViewHolder, int i) {
        String weatherString = mWeatherData[i];
        forecastAdapterViewHolder.mWeatherTextView.setText(weatherString);
    }

    @Override
    public int getItemCount() {
        if(mWeatherData == null) return 0;
        return mWeatherData.length;
    }

    public void setWeatherData(String[] weatherData){
        mWeatherData = weatherData;
        notifyDataSetChanged();
    }

    class ForecastAdapterViewHolder extends RecyclerView.ViewHolder{
        public final TextView mWeatherTextView;

        public ForecastAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            mWeatherTextView = itemView.findViewById(R.id.tv_weather_data);
        }

    }
}
