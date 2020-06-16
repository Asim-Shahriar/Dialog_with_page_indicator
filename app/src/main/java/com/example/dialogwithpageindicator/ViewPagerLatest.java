package com.example.dialogwithpageindicator;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerLatest extends FragmentStateAdapter {

    public static final int DIALOG_SIZE=3;

    public ViewPagerLatest(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        return new PageIndicatorFragment();
    }

    @Override
    public int getItemCount() {
        return DIALOG_SIZE;
    }
}
