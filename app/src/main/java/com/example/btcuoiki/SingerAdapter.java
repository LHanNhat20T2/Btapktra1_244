package com.example.btcuoiki;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SingerAdapter extends BaseAdapter {
    private Activity activity;
    private List<Singer> singers;


    public SingerAdapter(Activity activity, List<Singer> singers) {
        this.activity = activity;
        this.singers = singers;
    }

    @Override
    public int getCount() {
        return singers.size();
    }

    @Override
    public Object getItem(int i) {
        return singers.get(i);
    }
    @Override
    public long getItemId(int i) {
        return i;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = activity.getLayoutInflater();
        view = inflater.inflate(R.layout.item_singer, null);
        // anh xa view
        TextView tvten = (TextView) view.findViewById(R.id.tv_ten);
        TextView tvnghedanh = (TextView) view.findViewById(R.id.tv_nghedanh);
        TextView tvquocgia = (TextView) view.findViewById(R.id.tv_quocgia);
        TextView tvsosao = (TextView) view.findViewById(R.id.tv_sosao);
        ImageView imghinh = (ImageView) view.findViewById(R.id.img_hinh);
        // gan gtri
        tvten.setText(singers.get(i).getTen());
        tvnghedanh.setText(singers.get(i).getNghedanh());
        tvquocgia.setText(singers.get(i).getQuocgia());
        tvsosao.setText(singers.get(i).getSaobinhchon());
        imghinh.setImageResource(singers.get(i).getAnh());
        return view;
    }
}
