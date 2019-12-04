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
public class PalindromeFragment extends Fragment implements View.OnClickListener{
    //Declaration
    private EditText etNumber;
    private Button btnCheck;
    private TextView tvPalindrome;
    public PalindromeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_palindrome, container, false);
        //Binding
        etNumber=view.findViewById(R.id.etNumber);
        btnCheck=view.findViewById(R.id.btnCheck);
        tvPalindrome=view.findViewById(R.id.tvPalindrome);
        btnCheck.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        //Validation
        if(TextUtils.isEmpty(etNumber.getText())) {
            etNumber.setError("Enter the number");
            etNumber.requestFocus();
        }
        else {
            //Calculation
            int number;
            number = Integer.parseInt(etNumber.getText().toString());
            int q = number;
            int i, reverse = 0;
            for (i = 0; i <= number; i++) {
                reverse = reverse * 10;
                reverse = reverse + number % 10;
                number = number / 10;
                i = 0;
            }
            if (reverse == q) {
                tvPalindrome.setText(q + " is a Palindrome Number");
                Toast.makeText(getActivity(), q + "is a Palindrome Number", Toast.LENGTH_SHORT).show();
            } else {
                tvPalindrome.setText(q + " is not a Palindrome Number");
                Toast.makeText(getActivity(), q + "is not a Palindrome Number", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
