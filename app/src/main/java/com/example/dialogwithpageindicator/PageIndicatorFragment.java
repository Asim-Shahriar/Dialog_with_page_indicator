package com.example.dialogwithpageindicator;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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

    private static final String ARG_SHOW_AS_DIALOG = "PageIndicatorFragment";
    private AutoCompleteTextView txt;
    private ImageView imageView;
    ViewPager2 viewPager;


    public static PageIndicatorFragment newInstance(boolean showAsDialog){

     PageIndicatorFragment pageIndicatorFragment=new PageIndicatorFragment();
     Bundle args=new Bundle();
     args.putBoolean(ARG_SHOW_AS_DIALOG,showAsDialog);
     pageIndicatorFragment.setArguments(args);
     return  pageIndicatorFragment;
    }

    public static PageIndicatorFragment newInstance(){
        return newInstance(true);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v= inflater.inflate(R.layout.fragment_page_indicator, container,false);
        return  v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        txt=(AutoCompleteTextView) view.findViewById(R.id.texttitle);
        imageView=(ImageView)view.findViewById(R.id.img);
        viewPager=(ViewPager2)view.findViewById(R.id.pager);
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

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle args=getArguments();
        if(args!=null){
            setShowsDialog(args.getBoolean(ARG_SHOW_AS_DIALOG, true));
        }
    }
}