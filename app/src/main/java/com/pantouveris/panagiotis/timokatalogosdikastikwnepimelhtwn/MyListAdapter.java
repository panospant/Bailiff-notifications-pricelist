package com.pantouveris.panagiotis.timokatalogosdikastikwnepimelhtwn;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by Panagiotis on 18-Nov-15.
 */
public class MyListAdapter extends BaseExpandableListAdapter {

    private Context context;
    private ArrayList<AreaCategory> areaCategoryList;
    private ArrayList<AreaCategory> originalList;

    public MyListAdapter(Context context, ArrayList<AreaCategory> areaCategoryList)
    {
        this.context = context;
        this.areaCategoryList = new ArrayList<AreaCategory>();
        this.areaCategoryList.addAll(areaCategoryList);
        this.originalList = new ArrayList<AreaCategory>();
        this.originalList.addAll(areaCategoryList);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition)
    {
        ArrayList<Area> areaList = areaCategoryList.get(groupPosition).getAreaList();
        return areaList.get(childPosition);
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent)
    {
        Area theArea = (Area) getChild(groupPosition, childPosition);
        if (convertView == null)
        {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.child_row, null);
        }

        TextView area = (TextView) convertView.findViewById(R.id.area);

        area.setText(theArea.getArea().trim());


        return convertView;
    }

    @Override
    public int getChildrenCount(int groupPosition)
    {
        ArrayList<Area> areaList = areaCategoryList.get(groupPosition).getAreaList();
        return areaList.size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return areaCategoryList.get(groupPosition);
    }

    @Override
    public int getGroupCount() {
        return areaCategoryList.size();
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent)
    {
        AreaCategory areaCategory = (AreaCategory) getGroup(groupPosition);
        if (convertView == null)
        {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.group_row, null);
        }

        TextView heading = (TextView) convertView.findViewById(R.id.heading);
        heading.setText(areaCategory.getName().trim());
        return convertView;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }


    public void filterData(String query)
    {
        //apache commons lang3 is added on build.gradle to handle accent removal on greek letters
        query = org.apache.commons.lang3.StringUtils.stripAccents(query).toLowerCase();

        Log.v("MyListAdapter1", String.valueOf(areaCategoryList.size()));
        areaCategoryList.clear();

        if (query.isEmpty())
        {
            areaCategoryList.addAll(originalList);
        } else
        {
            for (AreaCategory areaCategory : originalList)
            {
                ArrayList<Area> areaList = areaCategory.getAreaList();
                ArrayList<Area> newList = new ArrayList<Area>();
                for (Area area : areaList)
                {
                    String normalizedArea = org.apache.commons.lang3.StringUtils.stripAccents(area.getArea()).toLowerCase();
                    if (normalizedArea.contains(query))
                    {
                        newList.add(area);
                    }
                }
                if (newList.size() > 0)
                {
                    AreaCategory mAreaCategory = new AreaCategory(areaCategory.getName(), newList);
                    areaCategoryList.add(mAreaCategory);
                }
            }
        }
        Log.v("MyListAdapter2", String.valueOf(areaCategoryList.size()));
        notifyDataSetChanged();
    }
}
