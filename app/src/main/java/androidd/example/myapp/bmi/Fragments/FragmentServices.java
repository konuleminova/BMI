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
 * Created by Asus on 12/8/2017.
 */

public class FragmentServices extends android.app.Fragment{
    RelativeLayout relativeLayout1,relativeLayout;
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_services, container, false);
        relativeLayout = (RelativeLayout) view.findViewById(R.id.toxidmetler_genis);

        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentServicesInfo fragment = new FragmentServicesInfo();
                MainActivity.setFragmennt(fragment,getFragmentManager());
            }

        });
        relativeLayout1 = (RelativeLayout) view.findViewById(R.id.geri);
        relativeLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainFragment fragment = new MainFragment();
                MainActivity.setFragmennt(fragment,getFragmentManager());
                Toast.makeText(getActivity(), "back ", Toast.LENGTH_LONG).show();
            }

        });


        return view;
    }


}



