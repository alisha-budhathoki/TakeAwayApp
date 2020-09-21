package com.alisha.takeawayapp.tabs;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.alisha.takeawayapp.R;

public class FirstSignUp extends Fragment {
    TextView txtUser, txtDriver;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.first_sign_up, container, false);
    txtUser = view.findViewById(R.id.txtUsr);
    txtDriver = view.findViewById(R.id.txtDrvr);
        txtUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openUser();
            }
        });
        txtDriver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUser();
            }
        });

        return view;
    }

    private void openUser(){
        Tab2Fragment tab2Fragment = new Tab2Fragment();
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.first_frgament, tab2Fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }


}
