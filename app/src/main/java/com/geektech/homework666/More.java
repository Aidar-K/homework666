package com.geektech.homework666;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class More extends Fragment {
    SwitchCompat switchCompat;
    Boolean boo = false;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_more, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        switchCompat = view.findViewById(R.id.switchh);
        More m1 = new More();
        More2 m2 = new More2();
        switchCompat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                if (boo) {
                    transaction.replace(R.id.frame, m1);
                    boo = false;
                } else {
                    transaction.replace(R.id.frame, m2);
                    boo = true;
                }
                transaction.commit();
            }
        });
    }
}