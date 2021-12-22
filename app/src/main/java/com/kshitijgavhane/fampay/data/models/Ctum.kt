package com.kshitijgavhane.fampay.data.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Ctum {
    @SerializedName("text")
    @Expose
    var text: String? = null

    @SerializedName("bg_color")
    @Expose
    var bgColor: String? = null

    @SerializedName("other_url")
    @Expose
    var otherUrl: String? = null

    @SerializedName("text_color")
    @Expose
    var textColor: String? = null

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
     * @param bgColor
     * @param text
     * @param textColor
     * @param otherUrl
     * @param url
     * @param urlChoice
     */
    constructor(text: String?, bgColor: String?, otherUrl: String?, textColor: String?, urlChoice: String?, url: String?) : super() {
        this.text = text
        this.bgColor = bgColor
        this.otherUrl = otherUrl
        this.textColor = textColor
        this.urlChoice = urlChoice
        this.url = url
    }
}