package com.jtechme.jumpgo.app;

import javax.inject.Singleton;

import com.jtechme.jumpgo.activity.BrowserActivity;
import com.jtechme.jumpgo.constant.BookmarkPage;
import com.jtechme.jumpgo.dialog.BookmarksDialogBuilder;
import com.jtechme.jumpgo.fragment.BookmarkSettingsFragment;
import com.jtechme.jumpgo.fragment.BookmarksFragment;
import com.jtechme.jumpgo.object.SearchAdapter;
import dagger.Component;

/**
 * Created by Stefano Pacifici on 01/09/15.
 */
@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(BrowserActivity activity);

    void inject(BookmarksFragment fragment);

    void inject(BookmarkSettingsFragment fragment);

    void inject(SearchAdapter adapter);

    void inject(BookmarksDialogBuilder builder);

    void inject(BookmarkPage bookmarkPage);
}
