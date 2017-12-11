package androidd.example.myapp.bmi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

/**
 * Created by Asus on 12/8/2017.
 */

public class FragmentServicesInfo extends android.app.Fragment{
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_servicesinfo, container, false);
         RelativeLayout relativeLayout1 = (RelativeLayout) view.findViewById(R.id.geri);
        relativeLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentServices fragment = new FragmentServices();
                MainActivity.setFragmennt(fragment,getFragmentManager());
                Toast.makeText(getActivity(), "back ", Toast.LENGTH_LONG).show();
            }

        });
        return view;
    }
}
