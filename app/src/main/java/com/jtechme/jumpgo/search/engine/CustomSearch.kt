package com.jtechme.jumpgo.search.engine

import com.jtechme.jumpgo.R

/**
 * A custom search engine.
 */
class CustomSearch(queryUrl: String) : BaseSearchEngine(
        "file:///android_asset/lightning.png",
        queryUrl,
        R.string.search_engine_custom
)
