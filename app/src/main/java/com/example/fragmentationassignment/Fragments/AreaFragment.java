package com.example.fragmentationassignment.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fragmentationassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AreaFragment extends Fragment implements View.OnClickListener{
    EditText etRadius;
    Button btnCalculate;
    TextView tvArea;
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
        tvArea=view.findViewById(R.id.tvArea);
        btnCalculate.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if(TextUtils.isEmpty(etRadius.getText())){
            etRadius.setError("Enter the radius");
        }
        else {
            int radius = Integer.parseInt(etRadius.getText().toString());
            double result = 3.14 * radius * radius;
            tvArea.setText("Area of Circle is " + result);
            Toast.makeText(getActivity(), "Area of Circle : " + result, Toast.LENGTH_SHORT).show();
        }
    }
}
