package app.com.example.venepallyprajith.matrial;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.*;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class fragment1 extends Fragment {


    public fragment1() {
        // Required empty public constructor
    }

    private android.support.v7.widget.RecyclerView mRecyclerView;
    private android.support.v7.widget.RecyclerView.Adapter mAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view=inflater.inflate(R.layout.fragment_fragment1, container, false);

    android.support.v7.widget.RecyclerView rv=(android.support.v7.widget.RecyclerView)view.findViewById(R.id.rv);
    rv.setHasFixedSize(true);

    LinearLayoutManager llm=new LinearLayoutManager(getContext());
    rv.setLayoutManager(llm);

    String[] days={"Sun","Mon","Tue","Wed","Thus","Fri","Sat"};


    ArrayList<String> Days = new ArrayList<String>(Arrays.asList(days));
    //mAdapter = new MyAdapter(Days);
    //rv.setAdapter(mAdapter);
         List<Person> persons;
        persons = new ArrayList<>();
        persons.add(new Person("Ganesh", "23 years old", android.R.drawable.gallery_thumb));
        persons.add(new Person("Suresh", "25 years old",android.R.drawable.gallery_thumb));
        persons.add(new Person("Ramesh", "35 years old",android.R.drawable.gallery_thumb));
      mAdapter=new RVAdapter(persons);
        rv.setAdapter(mAdapter);
        return view;
    }


}
