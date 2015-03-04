package com.cursor.greendict.ui.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.cursor.greendict.R;
import com.cursor.greendict.dao.DictDBHelper;
import com.cursor.greendict.dict;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Adapter of MenuDrawer
 * * *  
 * USER: ldx
 * EMAIL: danxionglei@foxmail.com
 * PROJECT_NAME: GreenDict
 * DATE: 2015/3/2
 */
public class DrawerAdapter extends BaseAdapter {
    private ListView mListView;
    private DictDBHelper dictDBHelper;
    private Context context;
    private List<dict> dataList;
    public DrawerAdapter(ListView listView, Context context){
        mListView = listView;
        this.context = context;
        dictDBHelper = DictDBHelper.getInstance(context);
        dataList = dictDBHelper.getAllEntity();
    }
    
    @Override
    public int getCount() {
        return dataList.size();
    }

    @Override
    public dict getItem(int position) {
        return dataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return dictDBHelper.getId((dict) getItem(position));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView != null){
            holder = (ViewHolder) convertView.getTag();
        }else{
            convertView = View.inflate(context,R.layout.drawer_item,null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }
        
        String dictName = getItem(position).getDict_name();
        holder.dictName.setText(dictName);
        return convertView;
    }
    
    class ViewHolder{
        @InjectView(R.id.item_text)
        TextView dictName;  
        
        ViewHolder(View view){
            ButterKnife.inject(this,view);
            
        }
    }
}
