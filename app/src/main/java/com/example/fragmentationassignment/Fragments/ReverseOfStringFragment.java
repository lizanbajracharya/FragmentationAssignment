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

import java.util.HashMap;

/**
 * A simple {@link Fragment} subclass.
 */
public class ReverseOfStringFragment extends Fragment implements View.OnClickListener{
    EditText etString;
    Button btnString;
    HashMap<Character, Integer> charCountMap;

    public ReverseOfStringFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_reverse_of_string, container, false);
        etString=view.findViewById(R.id.etString);
        btnString=view.findViewById(R.id.btnString);
        btnString.setOnClickListener(this);
        charCountMap = new HashMap<>();
        return view;
    }

    @Override
    public void onClick(View v) {
        if (!etString.getText().toString().isEmpty()) {
            StringBuffer c = new StringBuffer(etString.getText().toString());
            Toast.makeText(getActivity(), "The reverse of the string is: "+c.reverse(), Toast.LENGTH_SHORT).show();
        } else {
            etString.setError("Enter NAME");
        }
    }
}
