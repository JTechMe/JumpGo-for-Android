package com.jtechme.jumpgo.search.engine

import com.jtechme.jumpgo.R
import com.jtechme.jumpgo.constant.Constants

/**
 * The StartPage search engine.
 */
class StartPageSearch : BaseSearchEngine(
        "file:///android_asset/startpage.png",
        Constants.STARTPAGE_SEARCH,
        R.string.search_engine_startpage
)
