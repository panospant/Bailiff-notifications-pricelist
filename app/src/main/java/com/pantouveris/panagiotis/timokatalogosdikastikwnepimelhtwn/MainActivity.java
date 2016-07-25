package com.pantouveris.panagiotis.timokatalogosdikastikwnepimelhtwn;

import android.app.SearchManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SearchView;
import android.widget.ExpandableListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener, SearchView.OnCloseListener {

    private SearchView search;
    private MyListAdapter listAdapter;
    private ExpandableListView myList;
    private ArrayList<AreaCategory> areaCategoryList = new ArrayList<AreaCategory>();
    private String FPA = " με Φ.Π.Α";
    private String noFPA = " χωρίς Φ.Π.Α";
    private AreaCollectionData mAreaCollectionData = new AreaCollectionData();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        search = (SearchView) findViewById(R.id.search);
        search.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        search.setIconifiedByDefault(false);
        search.setOnQueryTextListener(this);
        search.setOnCloseListener(this);
        displayList();
        expandAll();
    }

    private void expandAll()
    {
        int count = listAdapter.getGroupCount();
        for (int i = 0; i < count; i++)
        {
            myList.expandGroup(i);
        }
    }

    private void displayList()
    {
        areaCategoryList = mAreaCollectionData.loadSomeData();
        myList = (ExpandableListView) findViewById(R.id.expandableList);
        listAdapter = new MyListAdapter(MainActivity.this, areaCategoryList);
        myList.setAdapter(listAdapter);
    }

    @Override
    public boolean onClose()
    {
        listAdapter.filterData("");
        expandAll();
        return false;
    }

    @Override
    public boolean onQueryTextSubmit(String query)
    {
        listAdapter.filterData(query);
        expandAll();
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText)
    {
        listAdapter.filterData(newText);
        expandAll();
        return false;
    }
}
