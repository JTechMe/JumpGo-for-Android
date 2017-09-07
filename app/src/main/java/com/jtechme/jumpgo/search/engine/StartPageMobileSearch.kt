package com.jtechme.jumpgo.search.engine

import com.jtechme.jumpgo.R
import com.jtechme.jumpgo.constant.Constants

/**
 * The StartPage mobile search engine.
 */
class StartPageMobileSearch : BaseSearchEngine(
        "file:///android_asset/startpage.png",
        Constants.STARTPAGE_MOBILE_SEARCH,
        R.string.search_engine_startpage_mobile
)
