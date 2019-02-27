package cn.wangzg.mdwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initToolbar();

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
