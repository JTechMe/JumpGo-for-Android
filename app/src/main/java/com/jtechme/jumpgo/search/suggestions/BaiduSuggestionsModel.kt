package com.jtechme.jumpgo.search.suggestions

import com.jtechme.jumpgo.R
import com.jtechme.jumpgo.constant.Constants
import com.jtechme.jumpgo.database.HistoryItem
import com.jtechme.jumpgo.utils.FileUtils
import android.app.Application
import org.json.JSONArray
import java.io.InputStream

/**
 * The search suggestions provider for the Baidu search engine.
 */
class BaiduSuggestionsModel(
        application: Application
) : BaseSuggestionsModel(application, Constants.UTF8) {

    private val searchSubtitle = application.getString(R.string.suggestion)
    private val inputEncoding = "GBK"

    override fun createQueryUrl(query: String, language: String): String {
        // see http://unionsug.baidu.com/su?wd=encodeURIComponent(U)
        // see http://suggestion.baidu.com/s?wd=encodeURIComponent(U)&action=opensearch
        return "http://suggestion.baidu.com/s?wd=$query&action=opensearch"
    }

    @Throws(Exception::class)
    override fun parseResults(inputStream: InputStream, results: MutableList<HistoryItem>) {
        val content = FileUtils.readStringFromStream(inputStream, inputEncoding)
        val respArray = JSONArray(content)
        val jsonArray = respArray.getJSONArray(1)

        var n = 0
        val size = jsonArray.length()

        while (n < size && n < BaseSuggestionsModel.MAX_RESULTS) {
            val suggestion = jsonArray.getString(n)
            results.add(HistoryItem(searchSubtitle + " \"$suggestion\"",
                    suggestion, R.drawable.ic_search))

            n++
        }
    }

}
