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
public class SumFragment extends Fragment implements View.OnClickListener{
    EditText etFirst,etSecond;
    Button btnCalculate;
    TextView tvSum;

    public SumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_sum, container, false);
        etFirst=view.findViewById(R.id.etFirst);
        etSecond=view.findViewById(R.id.etSecond);
        btnCalculate=view.findViewById(R.id.btnSum1);
        tvSum=view.findViewById(R.id.tvSum);
        btnCalculate.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if(TextUtils.isEmpty(etFirst.getText().toString())){
            etFirst.setError("Enter First number");
        }
        else if(TextUtils.isEmpty(etSecond.getText().toString())){
            etSecond.setError("Enter Second Number");
        }
        else {
        int first=Integer.parseInt(etFirst.getText().toString());
        int second=Integer.parseInt(etSecond.getText().toString());
        int result=first+second;
        tvSum.setText("Sum is" +result);
        Toast.makeText(getActivity(), "Sum is :"+result, Toast.LENGTH_SHORT).show();
        }
    }
}
