package view.com.android_tabview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

import com.view.tabview.TabView;
import com.view.tabview.TabViewChild;
import com.view.tabview.TabViewHelper;

import java.util.ArrayList;


/**
 * Created by minweng on 2017/5/2.
 */
public class LoadTabViewActivity extends FragmentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quick_start_activity);
        TabView tabView = (TabView) findViewById(R.id.tabView);
        TabViewHelper helper = new TabViewHelper(this,tabView) {
            @Override
            protected ArrayList<TabViewChild> setTabViewResource(ArrayList<TabViewChild> tabViewChildList) {
                TabViewChild tabViewChild1 =new TabViewChild(R.drawable.tab01_sel,R.drawable.tab01_unsel,"1",FragmentCommon.newInstance("1"));
                TabViewChild tabViewChild2 =new TabViewChild(R.drawable.tab02_sel,R.drawable.tab02_unsel,"2",FragmentCommon.newInstance("2"));
                TabViewChild tabViewChild3 =new TabViewChild(R.drawable.tab03_sel,R.drawable.tab03_unsel,"3",FragmentCommon.newInstance("3"));
                TabViewChild tabViewChild4 =new TabViewChild(R.drawable.tab04_sel,R.drawable.tab04_unsel,"4",FragmentCommon.newInstance("4"));
                TabViewChild tabViewChild5 =new TabViewChild(R.drawable.tab05_sel,R.drawable.tab05_unsel,"5",FragmentCommon.newInstance("5"));

                tabViewChildList.add(tabViewChild1);
                tabViewChildList.add(tabViewChild2);
                tabViewChildList.add(tabViewChild3);
                tabViewChildList.add(tabViewChild4);
                tabViewChildList.add(tabViewChild5);

                return tabViewChildList;
            }

            /**
             * 重写此方法设置参数
             * @param tabView
             */
            @Override
            protected void setTabViewConfig(TabView tabView) {
                //super.setTabViewConfig(tabView);
                tabView.setTabViewDefaultPosition(2);
                //tabView.setTabViewBackgroundColor(Color.WHITE);
            }
        };

    }


}
