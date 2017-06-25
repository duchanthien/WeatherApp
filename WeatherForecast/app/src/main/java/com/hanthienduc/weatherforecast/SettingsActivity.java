package com.hanthienduc.weatherforecast;

import android.preference.Preference;
import android.preference.PreferenceActivity;

/**
 * Created by hanth on 25/06/2017.
 */

public class SettingsActivity extends PreferenceActivity
implements Preference.OnPreferenceChangeListener{
    @Override
    public boolean onPreferenceChange(Preference preference, Object newValue) {
        return false;
    }
}
