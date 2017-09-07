package com.jtechme.jumpgo.di;

import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;

import net.i2p.android.ui.I2PAndroidHelper;

import javax.inject.Singleton;

import com.jtechme.jumpgo.BrowserApp;
import com.jtechme.jumpgo.database.bookmark.BookmarkDatabase;
import com.jtechme.jumpgo.database.bookmark.BookmarkModel;
import com.jtechme.jumpgo.database.downloads.DownloadsDatabase;
import com.jtechme.jumpgo.database.downloads.DownloadsModel;
import com.jtechme.jumpgo.database.history.HistoryDatabase;
import com.jtechme.jumpgo.database.history.HistoryModel;
import com.jtechme.jumpgo.download.DownloadHandler;
import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    private final BrowserApp mApp;

    public AppModule(BrowserApp app) {
        this.mApp = app;
    }

    @Provides
    public Application provideApplication() {
        return mApp;
    }

    @Provides
    public Context provideContext() {
        return mApp.getApplicationContext();
    }

    @NonNull
    @Provides
    @Singleton
    public BookmarkModel provideBookmarkModel() {
        return new BookmarkDatabase(mApp);
    }

    @NonNull
    @Provides
    @Singleton
    public DownloadsModel provideDownloadsModel() {
        return new DownloadsDatabase(mApp);
    }

    @NonNull
    @Provides
    @Singleton
    public HistoryModel providesHistoryModel() {
        return new HistoryDatabase(mApp);
    }

    @NonNull
    @Provides
    @Singleton
    public DownloadHandler provideDownloadHandler() {
        return new DownloadHandler();
    }

    @NonNull
    @Provides
    @Singleton
    public I2PAndroidHelper provideI2PAndroidHelper() {
        return new I2PAndroidHelper(mApp.getApplicationContext());
    }

}
