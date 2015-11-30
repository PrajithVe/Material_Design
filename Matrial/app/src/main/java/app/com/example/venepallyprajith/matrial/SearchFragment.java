package app.com.example.venepallyprajith.matrial;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class SearchFragment extends Fragment {

    private ActionBarDrawerToggle mDrawerToggle;
    private DrawerLayout mDrawerLayout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_search, container, false);
        View rootview=inflater.inflate(R.layout.activity_recycler_view, container, false);
        //mDrawerLayout=(DrawerLayout)rootview.findViewById(R.id.drawer_layout);
       // mDrawerToggle =new ActionBarDrawerToggle(getActivity(),mDrawerLayout,R.drawable.ic_action_search,R.string.drawer_open, R.string.drawer_close);
        return view;
    }
    public void setUp2(int fragmentId, DrawerLayout drawerLayout, final Toolbar toolbar) {

        mDrawerLayout = drawerLayout;
        mDrawerToggle = new ActionBarDrawerToggle(getActivity(), drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close) {
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                getActivity().invalidateOptionsMenu();
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                getActivity().invalidateOptionsMenu();
            }


        };




    }


    public interface FragmentDrawerListener {
        public void onDrawerItemSelected(View view, int position);
    }



}
