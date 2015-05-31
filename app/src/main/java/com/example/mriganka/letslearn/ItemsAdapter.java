package com.example.mriganka.letslearn;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

//Adapter is responsible for placing the data in grid view
class ItemsAdapter extends BaseAdapter {

    Context context;
    ArrayList<Images> list;

    ItemsAdapter(Context context,Boolean alpha) {
        this.context = context;
        list = new ArrayList<Images>();
        // Resources res = context.getResources();
        //Boolean alpha=getIntent().getExtras().getBoolean("alphabet");
        if(alpha) {
            int []images = {R.drawable.image_a, R.drawable.image_b, R.drawable.image_c};
            for (int j = 0; j < (images.length); j++) {
                Images tempimage = new Images(images[j]);
                list.add(tempimage);

            }
        }
        else
        {
            int []images = {R.drawable.image1, R.drawable.image2, R.drawable.image3};
            for (int j = 0; j < (images.length); j++) {
                Images tempimage = new Images(images[j]);
                list.add(tempimage);

            }
        }


    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    class ViewHolder {
        ImageView myimage;

        ViewHolder(View v) {
            myimage = (ImageView) v.findViewById(R.id.imageView);
        }
    }

    @Override
    //View specifies if the item is created first time, parent grid view by ViewGroup parent
    public View getView(int position, View convertView, ViewGroup parent) {

        View row = convertView;
        ViewHolder holder = null;

        if (row == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.gridimage, parent, false);
            holder = new ViewHolder(row);
            row.setTag(holder);

        } else {
            holder = (ViewHolder) row.getTag();
        }
        Images temp = list.get(position);
        holder.myimage.setImageResource(temp.imageid);
        return row;
    }

}