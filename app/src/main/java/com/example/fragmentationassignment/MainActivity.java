package com.example.fragmentationassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragmentationassignment.Fragments.AreaFragment;
import com.example.fragmentationassignment.Fragments.AuthomorphicFragment;
import com.example.fragmentationassignment.Fragments.PalindromeFragment;
import com.example.fragmentationassignment.Fragments.ReverseFragment;
import com.example.fragmentationassignment.Fragments.ReverseOfStringFragment;
import com.example.fragmentationassignment.Fragments.SumFragment;

public class MainActivity extends AppCompatActivity {

    Button btnSum,btnArea,btnPalindrome,btnReverse,btnReverseString,btnAutomorphic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSum=findViewById(R.id.btnSum);
        btnArea=findViewById(R.id.btnAreaOfCircle);
        btnPalindrome=findViewById(R.id.btnPalindrome);
        btnAutomorphic=findViewById(R.id.btnAutomorphicNumber);
        btnReverse=findViewById(R.id.btnReverseOfNumber);
        btnReverseString=findViewById(R.id.btnReverseOfString);


        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                final FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                SumFragment firstFragment=new SumFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,firstFragment);
                fragmentTransaction.commit();
            }
        });

        btnReverseString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                final FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

                ReverseOfStringFragment reverseOfStringFragment=new ReverseOfStringFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,reverseOfStringFragment);
                fragmentTransaction.commit();

            }
        });

        btnReverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                final FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

                ReverseFragment reverseFragment=new ReverseFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,reverseFragment);
                fragmentTransaction.commit();
            }
        });

        btnAutomorphic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                final FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

                AuthomorphicFragment authomorphicFragment=new AuthomorphicFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,authomorphicFragment);
                fragmentTransaction.commit();
            }
        });

        btnPalindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                final FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

                PalindromeFragment palindromeFragment=new PalindromeFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,palindromeFragment);
                fragmentTransaction.commit();
            }
        });

        btnArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                final FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

                AreaFragment areaFragment=new AreaFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,areaFragment);
                fragmentTransaction.commit();
            }
        });
    }
}
