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
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.restaurant_one, R.string.res_description_one,
                R.drawable.sushi_ota));
        words.add(new Word(R.string.restaurant_two, R.string.res_description_two,
                R.drawable.island_prime));
        words.add(new Word(R.string.restaurant_three, R.string.res_description_three,
                R.drawable.the_prado));


        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
