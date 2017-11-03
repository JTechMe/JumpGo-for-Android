package com.jtechme.jumpgo;

/**
 * Created by joeho (NutellaRlz) on 11/2/2017.
 */

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import com.anthonycr.bonsai.Completable;
import com.jtechme.jumpgo.browser.activity.BrowserActivity;
import com.jtechme.jumpgo.browser.activity.BrowserActivity.*;
import com.jtechme.jumpgo.browser.activity.BrowserActivity_MembersInjector;
import com.jtechme.jumpgo.MainActivity;

public class newTab extends BrowserActivity {

/**
    //@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(mainActivity);
    }

    // Called when the user taps the Send button
    public void sendMessage(View view) {
        // Do something in response to button
    }
*/

    public newTab(){
        newTabButtonClicked();
    }


    @Override
    protected boolean isIncognito() {
        return false;
    }

    @Override
    public void closeActivity() {

    }

    @Override
    public void updateHistory(@Nullable String title, @NonNull String url) {

    }

    @NonNull
    @Override
    protected Completable updateCookiePreference() {
        return null;
    }
}
