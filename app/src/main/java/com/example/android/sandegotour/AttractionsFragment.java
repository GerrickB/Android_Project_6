package com.example.android.sandegotour;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AttractionsFragment extends Fragment {


    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.attraction_one, R.string.att_description_one,
                R.drawable.balboa_park));
        words.add(new Word(R.string.attraction_two, R.string.att_description_two,
                R.drawable.san_diego_zoo));
        words.add(new Word(R.string.attraction_three, R.string.att_description_three,
                R.drawable.uss));
        words.add(new Word(R.string.attraction_four, R.string.att_description_four,
                R.drawable.seaworld));

        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
