package com.example.dialogwithpageindicator;

import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;


public class PageIndicatorFragment extends DialogFragment {

    private AutoCompleteTextView txt;
    private ImageView imageView;
    ViewPager2 viewPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        txt=getView().findViewById(R.id.texttitle);
        imageView=getView().findViewById(R.id.img);
        viewPager=getView().findViewById(R.id.pager);
        ViewPagerLatest viewPagerLatest=new ViewPagerLatest(getActivity());
        viewPager.setAdapter(viewPagerLatest);
        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
                if(position==0){
                    txt.setText("1st pager");
                    ContextCompat.getDrawable(getContext(),R.drawable.black);
                }
                if(position==1){
                    txt.setText("2 nd pager");
                    ContextCompat.getDrawable(getContext(),R.drawable.white);
                }
                if(position==2){
                    ContextCompat.getDrawable(getContext(),R.drawable.red);
                }
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });

        View v= inflater.inflate(R.layout.fragment_page_indicator, container, false);
        return  v;
    }
}