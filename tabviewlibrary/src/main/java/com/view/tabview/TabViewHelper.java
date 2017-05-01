package com.view.tabview;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.util.TypedValue;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * 作者：敏文 on 2017/5/1
 *
 */
public abstract class TabViewHelper {
    ArrayList<TabViewChild> tabViewChildList;
    TabViewChild tabViewChild;
    public TabViewHelper(FragmentActivity activity, TabView tabView) {
        tabViewChildList = new ArrayList<TabViewChild>();
        loadTabView(activity,tabView);
    }
    private  void loadTabView(FragmentActivity activity, TabView tabView){
        ArrayList<TabViewChild> tabViewChild = setTabViewResource(tabViewChildList);
        if (tabViewChildList != null) {
            setTabViewConfig(tabView);
            tabView.setTabViewChild(tabViewChildList, activity.getSupportFragmentManager());
            tabView.setOnTabChildClickListener(new TabView.OnTabChildClickListener() {
                @Override
                public void onTabChildClick(int position, ImageView currentImageIcon, TextView currentTextView) {
                    // Toast.makeText(getApplicationContext(),"position:"+position,Toast.LENGTH_SHORT).show();
                }
            });
        } else {
            throw new IllegalArgumentException("resource can not be null");
        }
    }

    /**
     *
     * @param tabViewChildList
     * @return
     */
    protected abstract  ArrayList<TabViewChild> setTabViewResource(ArrayList<TabViewChild> tabViewChildList) ;

    /**
     * 重写此方法设置参数
     * @param tabView
     */
    protected  void setTabViewConfig(TabView tabView){};

    public static int dp2px(Context context, float dpValue) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dpValue, context.getResources().getDisplayMetrics());
    }

    public static int sp2px(Context context, float spValue) {
        return (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_SP, spValue, context.getResources().getDisplayMetrics());
    }


}
