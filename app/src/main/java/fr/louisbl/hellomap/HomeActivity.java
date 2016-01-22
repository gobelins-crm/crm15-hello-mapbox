package fr.louisbl.hellomap;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class HomeActivity extends AppCompatActivity implements HomeFragment.HomeFragmentListener {

    private static final String TAG = "HomeActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home);

        changeFragment(new HomeFragment());
    }

    private void changeFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.home_container, fragment)
                .commit();
    }

    @Override
    public void onButtonMapClick() {
        Log.d(TAG, "on button clicked");
    }
}
