package app.com.example.venepallyprajith.matrial;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class RecyclerView extends AppCompatActivity implements FragmentDrawer.FragmentDrawerListener {
private Toolbar mToolbar;
    private android.support.v7.widget.RecyclerView mRecyclerView;
    private android.support.v7.widget.RecyclerView.Adapter mAdapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private FragmentDrawer drawerFragment;
    private SearchFragment searchFragment;
    private ActionBarDrawerToggle mDrawerToggle;
    private DrawerLayout mDrawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        mToolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        drawerFragment = (FragmentDrawer)
                getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        drawerFragment.setUp(R.id.fragment_navigation_drawer, (DrawerLayout) findViewById(R.id.drawer_layout), mToolbar);
        //drawerFragment.setDrawerListener(this);

      /* searchFragment = (SearchFragment)
              getSupportFragmentManager().findFragmentById(R.id.fragment_Search_Fragment);
        searchFragment.setUp2(R.id.fragment_Search_Fragment, (DrawerLayout) findViewById(R.id.drawer_layout), mToolbar);*/
        //searchFragment.setDrawerListener(this);

        //drawerFragment = (FragmentDrawer)
              //  getSupportFragmentManager().findFragmentById(R.id.fragment_Search_Fragment);
      //  drawerFragment.setUp(R.id.fragment_navigation_drawer, (DrawerLayout) findViewById(R.id.drawer_layout), mToolbar);
       // drawerFragment.setDrawerListener(this);
        //mDrawerLayout=(DrawerLayout)findViewById(R.id.drawer_layout);
        //mDrawerToggle =new ActionBarDrawerToggle(this,mDrawerLayout,mToolbar,R.string.drawer_open, R.string.drawer_close);
    }
    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
       // Fragment fragment1=new Fragment();
        //Fragment fragment2=new Fragment();
        //Fragment fragment3=new Fragment();
        adapter.addFragment( new fragment1(), "ONE");
        adapter.addFragment( new fragment2(), "TWO");
        adapter.addFragment(new fragment3(), "THREE");
        viewPager.setAdapter(adapter);
    }
    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_recycler_view, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onDrawerItemSelected(View view, int position) {

    }
}
