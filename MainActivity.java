package com.example.fragment;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_one, btn_two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_one =(Button)findViewById(R.id.btn_one);

        btn_two =(Button)findViewById(R.id.btn_two);

        btn_one.setOnClickListener(this);
        btn_two.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {

            case  R.id.btn_one :

                FirstFragment firstFragment = new FirstFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                transaction.addToBackStack(null);
                transaction.replace(R.id.framelayout,firstFragment);
                transaction.commit();
                break;

            case R.id.btn_two :

                SecondFragment secondFragment = new SecondFragment();

                FragmentTransaction transactiontwo = getSupportFragmentManager().beginTransaction();

                transactiontwo.replace(R.id.framelayout,secondFragment);
                transactiontwo.commit();
                break;
        }

    }
}
