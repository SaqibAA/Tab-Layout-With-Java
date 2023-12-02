package com.asadeveloper.tablayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.asadeveloper.tablayout.fragment.FirstFragment;
import com.asadeveloper.tablayout.fragment.SecondFragment;
import com.asadeveloper.tablayout.fragment.ThirdFragment;

import java.util.ArrayList;

public class PageAdapter extends FragmentStateAdapter {

//    private  final ArrayList<Fragment> fragmentArrayList = new ArrayList<>();
//    private  final ArrayList<String> fragmentTitle = new ArrayList<>();

    public PageAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0: return new FirstFragment();
            case 1: return new SecondFragment();
            case 2: return new ThirdFragment();
            default: return new FirstFragment();
        }
//        return fragmentArrayList.get(position);
    }

    @Override
    public int getItemCount() {
        return 3;
//        return fragmentArrayList.size();
    }

}
