package com.customlistview;

import java.util.ArrayList;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

	Context context;
	ArrayList<Items> arraylist;

	public CustomAdapter(Context context, ArrayList<Items> arraylist) {
		this.context = context;
		this.arraylist = arraylist;
	}

	@Override
	public int getCount() {
		// array list size
		return arraylist.size();
	}

	@Override
	public Object getItem(int arg0) {
		// array list items
		return arraylist.get(arg0);
	}

	@Override
	public long getItemId(int pos) {
		// item id
		return pos;
	}

	@Override
	public View getView(int position, View view, ViewGroup parent) {
		
		ViewHolder holder = null;
		
		//Layout Inflater for inflating a layout over listview
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		if (view == null) {
			view = inflater.inflate(R.layout.custom, parent, false);

			holder = new ViewHolder();

			holder.text = (TextView) view.findViewById(R.id.text);
			holder.iamge = (ImageView) view.findViewById(R.id.image);

			view.setTag(holder);

		} else {
			holder = (ViewHolder) view.getTag();
		}
		
		//Getting title and imageview from ITEMS class
		String title = arraylist.get(position).getTitle();
		Integer image_ = arraylist.get(position).getImage();

		
		//Setting title and image on textView and imageview
		holder.text.setText(title);

		holder.iamge.setBackgroundResource(image_);

		return view;
	}

	
	//view Holder class for holding views
	public class ViewHolder {
		TextView text;
		ImageView iamge;

	}

}
