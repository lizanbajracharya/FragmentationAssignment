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
public class AuthomorphicFragment extends Fragment implements View.OnClickListener{
    //Declaration
    private EditText etNumber1;
    private Button btnCheck1;
    private TextView tvAuto;

    public AuthomorphicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_authomorphic, container, false);
        //Binding
        etNumber1=view.findViewById(R.id.etNumber1);
        btnCheck1=view.findViewById(R.id.btnCheck1);
        tvAuto=view.findViewById(R.id.tvAuto);
        btnCheck1.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        //Validation
        if(TextUtils.isEmpty(etNumber1.getText())) {
            etNumber1.setError("Enter the number");
            etNumber1.requestFocus();
        }
        else {
            //Calculation
            int num = Integer.parseInt(etNumber1.getText().toString());
            int sq_num = num * num;

            String str_num = Integer.toString(num);
            String square = Integer.toString(sq_num);

            if (square.endsWith(str_num)) {
                tvAuto.setText(num + " is a Automorphic Number");
                Toast.makeText(getActivity(), num + " is an Automorphic Number", Toast.LENGTH_SHORT).show();
            }
            else{
                tvAuto.setText(num + " is not a Automorphic Number");
                Toast.makeText(getActivity(), num + " is not an Automorphic Number", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
