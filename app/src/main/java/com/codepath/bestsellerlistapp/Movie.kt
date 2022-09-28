package com.codepath.bestsellerlistapp

import com.google.gson.annotations.SerializedName

/**
 * The Model for storing a single book from the NY Times API
 *
 * SerializedName tags MUST match the JSON response for the
 * object to correctly parse with the gson library.
 */
class Movie {
    //@SerializedName("rank")
    //var rank = 0

    @JvmField
    @SerializedName("title")
    var title: String? = null

    @JvmField
    @SerializedName("overview")
    var descrip: String? = null

    //TODO bookImageUrl
    @JvmField
    @SerializedName("poster_path")
    var ImageUrl: String? = null
    var final = "https://image.tmdb.org/t/p/w500/"

    @JvmField
    @SerializedName("popularity")
    var pop: String? = null

    @JvmField
    @SerializedName("adult")
    var adult: Boolean? = null



    //TODO description


    //TODO-STRETCH-GOALS amazonUrl
}