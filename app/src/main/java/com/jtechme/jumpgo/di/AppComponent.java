package com.jtechme.jumpgo.di;

import javax.inject.Singleton;

import com.jtechme.jumpgo.browser.activity.BrowserActivity;
import com.jtechme.jumpgo.reading.activity.ReadingActivity;
import com.jtechme.jumpgo.browser.TabsManager;
import com.jtechme.jumpgo.browser.activity.ThemableBrowserActivity;
import com.jtechme.jumpgo.settings.activity.ThemableSettingsActivity;
import com.jtechme.jumpgo.BrowserApp;
import com.jtechme.jumpgo.browser.BrowserPresenter;
import com.jtechme.jumpgo.browser.SearchBoxModel;
import com.jtechme.jumpgo.constant.BookmarkPage;
import com.jtechme.jumpgo.constant.DownloadsPage;
import com.jtechme.jumpgo.constant.HistoryPage;
import com.jtechme.jumpgo.constant.StartPage;
import com.jtechme.jumpgo.dialog.LightningDialogBuilder;
import com.jtechme.jumpgo.download.DownloadHandler;
import com.jtechme.jumpgo.download.LightningDownloadListener;
import com.jtechme.jumpgo.settings.fragment.BookmarkSettingsFragment;
import com.jtechme.jumpgo.browser.fragment.BookmarksFragment;
import com.jtechme.jumpgo.settings.fragment.DebugSettingsFragment;
import com.jtechme.jumpgo.settings.fragment.GeneralSettingsFragment;
import com.jtechme.jumpgo.settings.fragment.LightningPreferenceFragment;
import com.jtechme.jumpgo.settings.fragment.PrivacySettingsFragment;
import com.jtechme.jumpgo.browser.fragment.TabsFragment;
import com.jtechme.jumpgo.search.SearchEngineProvider;
import com.jtechme.jumpgo.search.SuggestionsAdapter;
import com.jtechme.jumpgo.utils.ProxyUtils;
import com.jtechme.jumpgo.view.LightningChromeClient;
import com.jtechme.jumpgo.view.LightningView;
import com.jtechme.jumpgo.view.LightningWebClient;
import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(BrowserActivity activity);

    void inject(BookmarksFragment fragment);

    void inject(BookmarkSettingsFragment fragment);

    void inject(LightningDialogBuilder builder);

    void inject(TabsFragment fragment);

    void inject(LightningView lightningView);

    void inject(ThemableBrowserActivity activity);

    void inject(LightningPreferenceFragment fragment);

    void inject(BrowserApp app);

    void inject(ProxyUtils proxyUtils);

    void inject(ReadingActivity activity);

    void inject(LightningWebClient webClient);

    void inject(ThemableSettingsActivity activity);

    void inject(LightningDownloadListener listener);

    void inject(PrivacySettingsFragment fragment);

    void inject(StartPage startPage);

    void inject(HistoryPage historyPage);

    void inject(BookmarkPage bookmarkPage);

    void inject(DownloadsPage downloadsPage);

    void inject(BrowserPresenter presenter);

    void inject(TabsManager manager);

    void inject(DebugSettingsFragment fragment);

    void inject(SuggestionsAdapter suggestionsAdapter);

    void inject(LightningChromeClient chromeClient);

    void inject(DownloadHandler downloadHandler);

    void inject(SearchBoxModel searchBoxModel);

    void inject(SearchEngineProvider searchEngineProvider);

    void inject(GeneralSettingsFragment generalSettingsFragment);

}
