package com.gaadikey.gaadikey.gaadikey;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by madratgames on 08/10/14.
 */
public class Fragment_TripsLane extends Fragment {

    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState)
    {
        // Fragment name is Tripls Lane

        //fragment_tripslane

        View view = inflater.inflate(R.layout.fragment_tripslane, container, false);
        return view;

    }
}
