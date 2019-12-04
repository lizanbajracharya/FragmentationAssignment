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
public class ReverseFragment extends Fragment implements View.OnClickListener {
    //Declaration
    private EditText etFirstNo;
    private Button btnReversenumber;
    private TextView tvReverse;
    public ReverseFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_reverse, container, false);
        //Binding
        etFirstNo=view.findViewById(R.id.etFirstNo);
        btnReversenumber=view.findViewById(R.id.btnReversenumber);
        tvReverse=view.findViewById(R.id.tvReverse);
        btnReversenumber.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        //Validation
        if(TextUtils.isEmpty(etFirstNo.getText())){
            etFirstNo.setError("Enter the number");
        }
        else {
            //Calculation
            int number = Integer.parseInt(etFirstNo.getText().toString());
            int num = number, reversed = 0;
            while (num != 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }
            tvReverse.setText("The reverse of the number is" + reversed);
            Toast.makeText(getActivity(), reversed + " is the reverse of the number ", Toast.LENGTH_SHORT).show();
        }
    }
}
