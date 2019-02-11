package com.customlistview;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	ListView list;
	Items items;
	CustomAdapter adapter;

	ArrayList<Items> arraylist;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		list = (ListView) findViewById(R.id.list);

		// initialize the aarray list
		arraylist = new ArrayList<Items>();

		// adding items to array list
		arraylist.add(new Items("Cupcake", R.drawable.cupcake));
		arraylist.add(new Items("Donut", R.drawable.donut));
		arraylist.add(new Items("Eclair", R.drawable.eclair));
		arraylist.add(new Items("Froyo", R.drawable.froyo));
		arraylist.add(new Items("Gingerbread", R.drawable.gingerbread));
		arraylist.add(new Items("Honeycomb", R.drawable.honeycomb));
		arraylist.add(new Items("Icecreamsandwich", R.drawable.icecream));

		adapter = new CustomAdapter(MainActivity.this, arraylist);

		list.setAdapter(adapter);

		adapter.notifyDataSetChanged();

		list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1,
					int position, long arg3) {

				// Showing clicked items title
				Toast.makeText(MainActivity.this,
						arraylist.get(position).getTitle(), Toast.LENGTH_SHORT)
						.show();

			}
		});

	}

}
