package photogeneia.koteoglou.olga.bmi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

/**
 * Created by Asus on 12/11/2017.
 */

public class UmumiMelumat extends android.app.Fragment {
    RelativeLayout relativeLayout, relativeLayout1, relativeLayout2;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_umumimelumat, container, false);
        relativeLayout1 = (RelativeLayout) view.findViewById(R.id.geri);
        relativeLayout1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                ActivityMain fragment = new ActivityMain();
                MainActivity.setFragmennt(fragment, getFragmentManager());
                Toast.makeText(getActivity(), "back ", Toast.LENGTH_LONG).show();
                return false;
            }
        });
        relativeLayout = (RelativeLayout) view.findViewById(R.id.struktur);
        relativeLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Rehberlik fragment = new Rehberlik();
                MainActivity.setFragmennt(fragment, getFragmentManager());
                return false;
            }
        });
        relativeLayout2 = (RelativeLayout) view.findViewById(R.id.telimler);
        relativeLayout2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Telimler fragment = new Telimler();
                MainActivity.setFragmennt(fragment, getFragmentManager());
                return false;
            }
        });
        return view;
    }
}
