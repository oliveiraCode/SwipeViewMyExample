package com.lfoliveira.lasalle.swipeviewmyexample1;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class NumberFragment extends Fragment {


    public NumberFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_number, container, false);
        Bundle args = getArguments();
        TextView textView = rootView.findViewById(R.id.number);
        textView.setText(Integer.toString(args.getInt("number")));
        return rootView;
    }

}
