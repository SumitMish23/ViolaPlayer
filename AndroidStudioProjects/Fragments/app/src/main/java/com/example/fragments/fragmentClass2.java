package com.example.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragmentClass2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragmentClass2 extends ListFragment {
               String[] AndroidApps=new String[]{
                       "HI",
                       "BYE",
                       "SUMIT MISHRA",
                       "LOREM IPSUM0",
                               "SURESH SUDHA"
               };
    String[] Descriptions=new String[]{
            "Over 9000 users are using the android app",
            "Try to sleep everyday before 2:00",
            "SUMIT MISHRA",
            "Eat Healthy and Vegetables",
            "SURESH SUDHA"
    };
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public fragmentClass2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragmentClass2.
     */
    // TODO: Rename and change types and number of parameters
    public static fragmentClass2 newInstance(String param1, String param2) {
        fragmentClass2 fragment = new fragmentClass2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_class2, container, false);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,AndroidApps);
        setListAdapter(adapter);

        return view;

    }


  fragmentClass1 f1;
    fragmentClass1.newInstance()

    }
}