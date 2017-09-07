package com.jtechme.jumpgo.settings.fragment;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import javax.inject.Inject;

import com.jtechme.jumpgo.BrowserApp;
import com.jtechme.jumpgo.preference.PreferenceManager;

/**
 * Simplify {@link PreferenceManager} inject in all the PreferenceFragments
 *
 * @author Stefano Pacifici
 * @date 2015/09/16
 */
public class LightningPreferenceFragment extends PreferenceFragment {

    @Inject
    PreferenceManager mPreferenceManager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BrowserApp.getAppComponent().inject(this);
    }
}
