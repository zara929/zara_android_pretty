package com.example.alzaraapriliani.zaraproject.ui.restaurant;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.alzaraapriliani.zaraproject.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestoFragment extends Fragment {


    public RestoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_resto, container, false);
    }

}