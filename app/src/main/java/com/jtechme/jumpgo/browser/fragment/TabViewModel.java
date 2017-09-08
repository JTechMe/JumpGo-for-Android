package com.jtechme.jumpgo.browser.fragment;

/**
 * Created by joeho on 9/8/2017.
 */

import android.graphics.Bitmap;
import android.support.annotation.NonNull;

import com.jtechme.jumpgo.view.LightningView;

/**
 * A view model representing the visual state of a tab.
 */
final class TabViewModel {

    @NonNull private LightningView mLightningView;
    @NonNull private final String mTitle;
    @NonNull private final Bitmap mFavicon;
    private final boolean mIsForeground;

    TabViewModel(@NonNull LightningView lightningView) {
        mLightningView = lightningView;
        mTitle = mLightningView.getTitle();
        mFavicon = mLightningView.getFavicon();
        mIsForeground = mLightningView.isForegroundTab();
    }

    @NonNull
    public String getTitle() {
        return mTitle;
    }

    @NonNull
    public Bitmap getFavicon() {
        return mFavicon;
    }

    boolean isForegroundTab() {
        return mIsForeground;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof TabViewModel && ((TabViewModel) obj).mLightningView.equals(mLightningView);
    }
}