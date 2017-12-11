package photogeneia.koteoglou.olga.bmi;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 11/29/2017.
 */

public class FragmentList extends Fragment {
    List<Item> gridList = new ArrayList<>();
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.framelayout_listview, container, false);
        ListView listView = (ListView) view.findViewById(R.id.list);
        gridList.add(new Item("Lokallasdirma", R.drawable.lokallashdrima_icon));
        gridList.add(new Item("Media", R.drawable.media_icon));
        gridList.add(new Item("Information", R.drawable.information_icon));
        gridList.add(new Item("Payment", R.drawable.payment_icon));
        gridList.add(new Item("Services", R.drawable.services_icon));
        gridList.add(new Item("Contact", R.drawable.contact_icon));
        GridAdapter myAdapter = new GridAdapter(this.getActivity(), R.layout.grid_items_layout, gridList);
        listView.setAdapter(myAdapter);
        return view;
    }
}
