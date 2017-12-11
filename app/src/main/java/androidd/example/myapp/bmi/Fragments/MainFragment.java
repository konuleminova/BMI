package androidd.example.myapp.bmi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidd.example.myapp.bmi.R;

/**
 * Created by Asus on 12/8/2017.
 */

public class MainFragment extends android.app.Fragment{
    RelativeLayout relativeLayout,relativeLayout1,relativeLayout2;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.framelayout_main, container, false);

        relativeLayout=(RelativeLayout)view.findViewById(R.id.xidmetler_relative);

        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentServices fragment= new FragmentServices();
                MainActivity.setFragmennt(fragment,getFragmentManager());
            }
        });
        relativeLayout1=(RelativeLayout)view.findViewById(R.id.xidmetler_relative3);

        relativeLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentGeralInfo fragment= new FragmentGeralInfo();
                MainActivity.setFragmennt(fragment,getFragmentManager());
            }
        });
        relativeLayout2=(RelativeLayout)view.findViewById(R.id.xidmetler_relative4);

        relativeLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentMedia fragment= new FragmentMedia();
                MainActivity.setFragmennt(fragment,getFragmentManager());
            }
        });
        return view;
    }

}
