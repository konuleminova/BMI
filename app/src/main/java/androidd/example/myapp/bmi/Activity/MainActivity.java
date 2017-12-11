package androidd.example.myapp.bmi;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

import androidd.example.myapp.bmi.R;

public class MainActivity extends Activity {

    static MainFragment fragment;
    static FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
        fragment = new MainFragment();
        fragmentManager = getFragmentManager();
        setFragmennt(fragment, fragmentManager);

    }

    public static void setFragmennt(Fragment fragment, FragmentManager fragmentManager) {
        fragmentManager.beginTransaction()
                .replace(R.id.firstfrag, fragment)
                .commit();

    }
}
