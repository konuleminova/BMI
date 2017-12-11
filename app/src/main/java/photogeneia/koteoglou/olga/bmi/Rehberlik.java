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

public class Rehberlik  extends android.app.Fragment{
    RelativeLayout relativeLayout1,relativeLayout;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.rehberlik, container, false);
       relativeLayout1 = (RelativeLayout) view.findViewById(R.id.geri);
        relativeLayout1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
              UmumiMelumat fragment = new UmumiMelumat();
                MainActivity.setFragmennt(fragment,getFragmentManager());
                Toast.makeText(getActivity(), "back ", Toast.LENGTH_LONG).show();
                return false;
            }
        });
      relativeLayout = (RelativeLayout) view.findViewById(R.id.rehberlik_genis);
        relativeLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                RehberlikGenis fragment = new RehberlikGenis();
                MainActivity.setFragmennt(fragment,getFragmentManager());
                Toast.makeText(getActivity(), "back ", Toast.LENGTH_LONG).show();
                return false;
            }
        });
        return view;
    }
}
