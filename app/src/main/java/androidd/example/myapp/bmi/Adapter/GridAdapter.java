package androidd.example.myapp.bmi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidd.example.myapp.bmi.R;

/**
 * Created by Asus on 11/29/2017.
 */

public class GridAdapter extends ArrayAdapter {


    List<Item> itemlist=new ArrayList();

    public GridAdapter(Context context, int textViewResourceId, List<Item> itemlist) {
        super(context, textViewResourceId, itemlist);
        this.itemlist=itemlist;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.grid_items_layout, null);
        TextView textView = (TextView) v.findViewById(R.id.textView);
        ImageView imageView = (ImageView) v.findViewById(R.id.imageView);
        Item i=itemlist.get(position);
        textView.setText(i.getText());
        imageView.setImageResource(i.getImage());
        return v;
    }
    }
