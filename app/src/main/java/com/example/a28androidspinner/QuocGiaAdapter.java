package com.example.a28androidspinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class QuocGiaAdapter extends BaseAdapter
{
    Context context;
    int myLayout;
    ArrayList<QuocGia> arrayList;

    public QuocGiaAdapter(Context context, int myLayout, ArrayList<QuocGia> arrayList) {
        this.context = context;
        this.myLayout = myLayout;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = layoutInflater.inflate(myLayout, null);

        TextView textView1 = convertView.findViewById(R.id.textView1);
        TextView textView2 = convertView.findViewById(R.id.textView2);
        ImageView imageView1 = convertView.findViewById(R.id.imageView1);

        textView1.setText(arrayList.get(position).getTen());
        textView2.setText(String.valueOf(arrayList.get(position).getToaDo())); // vì là kiểu int nên phải convert lại
        imageView1.setImageResource(arrayList.get(position).getHinhAnh());
        return convertView;
    }
}
