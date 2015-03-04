package com.cursor.greendict.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.cursor.greendict.R;
import com.cursor.greendict.utils.logger.Logger;
import com.cursor.greendict.ui.adapter.DrawerAdapter;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import butterknife.OnItemClick;

/**
 * MenuDrawer
 * * *
 * USER: ldx
 * EMAIL: danxionglei@foxmail.com
 * PROJECT_NAME: GreenDict
 * DATE: 2015/3/1
 */
public class MenuFragment extends BaseFragment {
    @OnClick(R.id.btn_edit_fragment_menu) void btnEditOnClick(){
        Logger.d("");
    }
    
    @InjectView(R.id.menu_list_view)
    ListView mListView;
    
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_menu,container);
        ButterKnife.inject(this,view);
        DrawerAdapter adapter = new DrawerAdapter(mListView,this.getActivity());
        mListView.setAdapter(adapter);
        mListView.setItemChecked(0,true);
        return view;
    }
    
    @OnItemClick(R.id.menu_list_view) void onItemClick(int position){
        mListView.setItemChecked(position,true);
    }
    
    
}
