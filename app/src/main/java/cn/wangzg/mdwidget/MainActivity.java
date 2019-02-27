package cn.wangzg.mdwidget;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<String> mTitle;
    List<Fragment> mFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initToolbar();
        ViewPager mViewPager = findViewById(R.id.viewpager);
        mTitle = new ArrayList<>();
        mTitle.add("选项卡一");
        mTitle.add("选项卡二");
        mTitle.add("选项卡三");
        mTitle.add("选项卡四");

        mFragment = new ArrayList<>();
        mFragment.add(MyFragment.newInstance(mTitle.get(0)));
        mFragment.add(MyFragment.newInstance(mTitle.get(1)));
        mFragment.add(MyFragment.newInstance(mTitle.get(2)));
        mFragment.add(MyFragment.newInstance(mTitle.get(3)));

        mViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return mFragment.get(position);
            }

            @Override
            public int getCount() {
                return mFragment.size();
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return mTitle.get(position);
            }
        });
        TabLayout mytab = findViewById(R.id.mytab);
        mytab.setupWithViewPager(mViewPager);



//
//        mytab.addTab(mytab.newTab().setText("选项卡一").setIcon(R.mipmap.ic_launcher));
//        mytab.addTab(mytab.newTab().setText("选项卡二").setIcon(R.mipmap.ic_launcher));
//        mytab.addTab(mytab.newTab().setText("选项卡三").setIcon(R.mipmap.ic_launcher));
//        mytab.addTab(mytab.newTab().setText("选项卡四").setIcon(R.mipmap.ic_launcher));
        //mytab.addTab(mytab.newTab().setText("选项卡五").setIcon(R.mipmap.ic_launcher));
        //mytab.addTab(mytab.newTab().setText("选项卡六").setIcon(R.mipmap.ic_launcher));
    }
    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // App Logo
        //toolbar.setLogo(R.mipmap.ic_launcher_round);
        // Title
        toolbar.setTitle("My Title");
        // Sub Title
        //toolbar.setSubtitle("Sub title");
        setSupportActionBar(toolbar);
        //设置是否有返回箭头
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //设置左侧NavigationIcon点击事件
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "点击了左侧按钮", Toast.LENGTH_SHORT).show();
            }
        });
    }
    //设置菜单
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return true;
    }
    //处理菜单的单击事件
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int menuItemId = item.getItemId();
        if (menuItemId == R.id.action_search) {
            Toast.makeText(MainActivity.this , R.string.menu_search , Toast.LENGTH_SHORT).show();

        } else if (menuItemId == R.id.action_notification) {
            Toast.makeText(MainActivity.this , R.string.menu_notification , Toast.LENGTH_SHORT).show();

        } else if (menuItemId == R.id.action_item_one) {
            Toast.makeText(MainActivity.this , R.string.item_one , Toast.LENGTH_SHORT).show();

        } else if (menuItemId == R.id.action_item_two) {
            Toast.makeText(MainActivity.this , R.string.item_two , Toast.LENGTH_SHORT).show();

        }
        return true;
    }
}
