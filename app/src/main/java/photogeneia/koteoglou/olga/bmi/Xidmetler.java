package photogeneia.koteoglou.olga.bmi;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

/**
 * Created by Asus on 12/8/2017.
 */

public class Xidmetler extends android.app.Fragment{
    RelativeLayout relativeLayout1,relativeLayout;
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.xidmetler, container, false);
        relativeLayout = (RelativeLayout) view.findViewById(R.id.toxidmetler_genis);

        relativeLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
              XidmetlerGenis fragment = new XidmetlerGenis();
                MainActivity.setFragmennt(fragment,getFragmentManager());
                return false;
            }
        });
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


        return view;
    }


}



