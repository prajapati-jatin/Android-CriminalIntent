package com.jatin.criminalintent;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.Fragment;
import android.widget.Toast;

/**
 * Created by jatin.prajapati on 11/11/2016.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    private static final String TAG = "CrimeListActivity";
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
