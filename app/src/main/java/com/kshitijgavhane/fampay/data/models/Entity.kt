package com.kshitijgavhane.fampay.data.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Entity {
    @SerializedName("text")
    @Expose
    var text: String? = null

    @SerializedName("type")
    @Expose
    var type: String? = null

    @SerializedName("color")
    @Expose
    var color: String? = null

    @SerializedName("other_url")
    @Expose
    var otherUrl: String? = null

    @SerializedName("url_choice")
    @Expose
    var urlChoice: String? = null

    @SerializedName("url")
    @Expose
    var url: String? = null

    /**
     * No args constructor for use in serialization
     *
     */
    constructor() {}

    /**
     *
     * @param color
     * @param text
     * @param type
     * @param otherUrl
     * @param url
     * @param urlChoice
     */
    constructor(text: String?, type: String?, color: String?, otherUrl: String?, urlChoice: String?, url: String?) : super() {
        this.text = text
        this.type = type
        this.color = color
        this.otherUrl = otherUrl
        this.urlChoice = urlChoice
        this.url = url
    }
}