package com.jtechme.jumpgo.browser

import com.jtechme.jumpgo.database.HistoryItem

interface BookmarksView {

    fun navigateBack()

    fun handleUpdatedUrl(url: String)

    fun handleBookmarkDeleted(item: HistoryItem)

}
