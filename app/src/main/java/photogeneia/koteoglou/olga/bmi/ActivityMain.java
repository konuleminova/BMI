package photogeneia.koteoglou.olga.bmi;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/**
 * Created by Asus on 12/8/2017.
 */

public class ActivityMain extends android.app.Fragment{
    RelativeLayout relativeLayout,relativeLayout1,relativeLayout2;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main, container, false);

        relativeLayout=(RelativeLayout)view.findViewById(R.id.xidmetler_relative);

        relativeLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Xidmetler fragment= new Xidmetler();
                MainActivity.setFragmennt(fragment,getFragmentManager());
                return false;
            }
        });
        relativeLayout1=(RelativeLayout)view.findViewById(R.id.xidmetler_relative3);

        relativeLayout1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
              UmumiMelumat fragment= new UmumiMelumat();
                MainActivity.setFragmennt(fragment,getFragmentManager());
                return false;
            }
        });
        relativeLayout2=(RelativeLayout)view.findViewById(R.id.xidmetler_relative4);

        relativeLayout2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
             Media fragment= new Media();
                MainActivity.setFragmennt(fragment,getFragmentManager());
                return false;
            }
        });
        return view;
    }

}
