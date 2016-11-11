package com.jatin.criminalintent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.Log;

import java.util.UUID;

public class CrimeActivity extends SingleFragmentActivity implements CrimeFragment.OnCrimeModifiedListener {

    private static final String TAG = "CrimeActivity";
    private static final String EXTRA_CRIME_ID = "com.jatin.crimeintent.crime_id";
    private boolean mCrimeModified = false;
    private UUID mCrimeId;

    public static Intent newIntent(Context packageContext, UUID crimeId){
        Intent intent = new Intent(packageContext, CrimeActivity.class);
        intent.putExtra(EXTRA_CRIME_ID, crimeId);
        return intent;
    }

    @Override
    protected Fragment createFragment() {
        UUID crimeId = (UUID)getIntent().getSerializableExtra(EXTRA_CRIME_ID);
        return CrimeFragment.newInstance(crimeId);
    }

    @Override
    public void onCrimeModified(UUID crimeId) {
        Intent data = new Intent();
        data.putExtra(EXTRA_CRIME_ID, crimeId);
        setResult(RESULT_OK, data);
    }
}
