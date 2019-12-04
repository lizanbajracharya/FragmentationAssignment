package com.example.fragmentationassignment.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fragmentationassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AreaFragment extends Fragment implements View.OnClickListener{
    EditText etRadius;
    Button btnCalculate;

    public AreaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_area, container, false);
        etRadius=view.findViewById(R.id.etRadius);
        btnCalculate=view.findViewById(R.id.btnCalculate);
        btnCalculate.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int radius=Integer.parseInt(etRadius.getText().toString());
        double result=3.14*radius*radius;
        Toast.makeText(getActivity(), "Area of Circle : "+result, Toast.LENGTH_SHORT).show();
    }
}
