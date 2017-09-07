package com.jtechme.jumpgo.browser;

import android.support.annotation.NonNull;

import com.jtechme.jumpgo.database.HistoryItem;

public interface BookmarksView {

    void navigateBack();

    void handleUpdatedUrl(@NonNull String url);

    void handleBookmarkDeleted(@NonNull HistoryItem item);

}
