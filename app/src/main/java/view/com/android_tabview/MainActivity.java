package view.com.android_tabview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * 属性介绍
 app:tab_textViewSize="14sp"             //文字大小
 app:tab_textViewSelColor="#ff0000"      //文字选中颜色
 app:tab_textViewUnSelColor="#00ff00"    //文字未选中颜色
 app:tab_tabViewBackgroundColor="#0000ff" //背景颜色
 app:imageViewTextViewMargin="2dip"       //图片文字间距
 app:tab_imageViewHeight="30dip"          //
 app:tab_imageViewWidth="30dip"
 app:tab_tabViewDefaultPosition="1"        //默认选中位置
 app:tab_tabViewGravity="right"            //摆放位置
 app:tab_tabViewHeight="52dip"             //整体高度


 tabView.setTextViewUnSelectedColor(Color.BLACK);
 tabView.setTabViewBackgroundColor(Color.YELLOW);
 tabView.setTabViewHeight(dip2px(52));
 tabView.setImageViewTextViewMargin(2);
 tabView.setTextViewSize(14);
 tabView.setImageViewWidth(dip2px(30));
 tabView.setImageViewHeight(dip2px(30));
 tabView.setTabViewGravity(Gravity.TOP);
 tabView.setTabViewDefaultPosition(2);

 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void quick_start(View view){
        startActivity(new Intent(this,QuickStartActivity.class));
    }
    public void loadTabView(View view){
        startActivity(new Intent(this,LoadTabViewActivity.class));
    }
    public void custom_in_xml(View view){
        startActivity(new Intent(this,CustomInXmlActivity.class));
    }
    public void custom_in_java(View view){
        startActivity(new Intent(this,CustomInJavaActivity.class));
    }
    public void use_in_fragment(View view){
        startActivity(new Intent(this,UseInFragment.class));
    }

}
