package com.chenluwei.beijingnews.pager;

import android.content.Context;
import android.graphics.Color;
import android.widget.TextView;

import com.chenluwei.beijingnews.base.BasePager;

/**
 * Created by lw on 2016/5/18.
 */
public class SmartService extends BasePager {
    public SmartService(Context context) {
        super(context);
    }

    @Override
    public void initData() {
        super.initData();
        //设置标题
        tv_title.setText("服务");
        //设置内容
        TextView textView = new TextView(context);
        textView.setText("智慧服务内容");
        textView.setTextSize(25);
        textView.setTextColor(Color.RED);
        //将子视图添加到FramLayout中
        fl_base_content.addView(textView);
    }
}
