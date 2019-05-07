package com.soar.zeus.fragment;

import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.soar.zeus.R;
import com.soar.zeus.base.BaseLazyFragment;
import com.soar.zeus.base.BaseViewModel;


/**
 * NAME：YONG_
 * Created at: 2018/12/11 16
 * Describe:
 */
public class ABCFragment extends BaseLazyFragment<ViewDataBinding, BaseViewModel> {

    public static ABCFragment newInstance() {
        return new ABCFragment();
    }

    @Override
    public int initContentView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return R.layout.fragment_abc;
    }

    @Override
    public int initVariableId() {
        return 0;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        initView();
        return view;
    }

    private void initView() {
    }

    @Override
    protected void lazyData() {
    }
}
