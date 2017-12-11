package androidd.example.myapp.bmi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidd.example.myapp.bmi.R;

/**
 * Created by Asus on 12/11/2017.
 */

public class FragmentGeralInfo extends android.app.Fragment {
    RelativeLayout relativeLayout, relativeLayout1, relativeLayout2;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_generalinfo, container, false);
        relativeLayout1 = (RelativeLayout) view.findViewById(R.id.geri);
        relativeLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainFragment fragment = new MainFragment();
                MainActivity.setFragmennt(fragment, getFragmentManager());
                Toast.makeText(getActivity(), "back ", Toast.LENGTH_SHORT).show();
            }

        });
        relativeLayout = (RelativeLayout) view.findViewById(R.id.struktur);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentRehberlik fragment = new FragmentRehberlik();
                MainActivity.setFragmennt(fragment, getFragmentManager());
            }

        });
        relativeLayout2 = (RelativeLayout) view.findViewById(R.id.telimler);
        relativeLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTelimler fragment = new FragmentTelimler();
                MainActivity.setFragmennt(fragment, getFragmentManager());
            }
        });
        return view;
    }
}
