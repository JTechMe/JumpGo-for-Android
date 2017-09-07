package com.jtechme.jumpgo.search.engine

import com.jtechme.jumpgo.R
import com.jtechme.jumpgo.constant.Constants

/**
 * The DuckDuckGo Lite search engine.
 *
 * See https://duckduckgo.com/assets/logo_homepage.normal.v101.png for the icon.
 */
class DuckLiteSearch : BaseSearchEngine(
        "file:///android_asset/duckduckgo.png",
        Constants.DUCK_LITE_SEARCH,
        R.string.search_engine_duckduckgo_lite
)
