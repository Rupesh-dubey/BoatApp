package com.example.boatapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class StatusFragment extends Fragment {

    private TextView fuelLevelView;
    private TextView temperatureView;
    private TextView speedView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_status, container, false);

        fuelLevelView = view.findViewById(R.id.fuelLevel);
        temperatureView = view.findViewById(R.id.engineTemperature);
        speedView = view.findViewById(R.id.speed);

        return view;
    }

    public void updateStatus(BoatStatus status) {
        fuelLevelView.setText("Fuel Level: " + status.getFuelLevel() + "%");
        temperatureView.setText("Engine Temp: " + status.getEngineTemperature() + "°C");
        speedView.setText("Speed: " + status.getSpeed() + " knots");
    }
}
