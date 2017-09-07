package com.jtechme.jumpgo.search.engine

import com.jtechme.jumpgo.R
import com.jtechme.jumpgo.constant.Constants

/**
 * The Yandex search engine.
 *
 * See http://upload.wikimedia.org/wikipedia/commons/thumb/9/91/Yandex.svg/600px-Yandex.svg.png
 * for the icon.
 */
class YandexSearch : BaseSearchEngine(
        "file:///android_asset/yandex.png",
        Constants.YANDEX_SEARCH,
        R.string.search_engine_yandex
)
