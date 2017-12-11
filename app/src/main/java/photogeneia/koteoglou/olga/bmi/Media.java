package photogeneia.koteoglou.olga.bmi;

import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

/**
 * Created by Asus on 12/11/2017.
 */

public class Media extends android.app.Fragment{
    RelativeLayout relativeLayout1;
    ImageView listVew,gridView;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.media, container, false);
        relativeLayout1 = (RelativeLayout) view.findViewById(R.id.geri);
        relativeLayout1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                ActivityMain fragment = new ActivityMain();
                MainActivity.setFragmennt(fragment,getFragmentManager());
                Toast.makeText(getActivity(), "back ", Toast.LENGTH_LONG).show();
                return false;
            }
        });
        listVew=(ImageView)view.findViewById(R.id.list_view);
        listVew.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
              FragmentList fragment = new FragmentList();
              FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragment_switch, fragment)
                        .commit();
               // MainActivity.setFragmennt(fragment,getFragmentManager());
                return false;
            }
        });
        gridView=(ImageView)view.findViewById(R.id.grid_view);
       gridView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                FragmentGrid fragment = new FragmentGrid();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragment_switch, fragment)
                        .commit();
                //MainActivity.setFragmennt(fragment,getFragmentManager());
                return false;
            }
        });


        return view;
    }

}
