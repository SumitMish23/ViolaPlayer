package com.example.intents;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

public class Adapter extends BaseAdapter {
    private Context mContext;


   //Constructors:-
    public Adapter(Context c){
        mContext=c;
    }

    @Override
    public int getCount()
    {
        return m;
    }
    public Object getItem(int position)
    {
        return null;
    }
    public long getItemId(int position)
    {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        ImageView imageView;
        if(convertView ==null){
            imageView=new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(85.85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8,8,8,8);

        }
        else{
            imageView=(ImageView) convertView;
        }
        imageView.setImageResource(mThumbIDs[position]);
        return imageView;
        return  imageView;















    }
}
