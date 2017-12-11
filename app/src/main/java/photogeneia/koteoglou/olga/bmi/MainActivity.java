package photogeneia.koteoglou.olga.bmi;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import static java.security.AccessController.getContext;

public class MainActivity extends Activity {

    static ActivityMain fragment;
    static FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
        fragment = new ActivityMain();
        fragmentManager = getFragmentManager();
        setFragmennt(fragment, fragmentManager);

    }

    public static void setFragmennt(Fragment fragment, FragmentManager fragmentManager) {
        fragmentManager.beginTransaction()
                .replace(R.id.firstfrag, fragment)
                .commit();

    }
}
