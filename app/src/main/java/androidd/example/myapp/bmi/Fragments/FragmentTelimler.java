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

public class FragmentTelimler extends android.app.Fragment{
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_telimler, container, false);
        RelativeLayout relativeLayout1 = (RelativeLayout) view.findViewById(R.id.geri);
        relativeLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentGeralInfo fragment = new FragmentGeralInfo();
                MainActivity.setFragmennt(fragment,getFragmentManager());
                Toast.makeText(getActivity(), "back ", Toast.LENGTH_LONG).show();
            }

        });
        return view;
    }
}
