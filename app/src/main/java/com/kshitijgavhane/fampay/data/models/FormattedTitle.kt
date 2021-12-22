package com.kshitijgavhane.fampay.data.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class FormattedTitle {
    @SerializedName("text")
    @Expose
    var text: String? = null

    @SerializedName("entities")
    @Expose
    var entities: List<Entity>? = null

    /**
     * No args constructor for use in serialization
     *
     */
    constructor() {}

    /**
     *
     * @param entities
     * @param text
     */
    constructor(text: String?, entities: List<Entity>?) : super() {
        this.text = text
        this.entities = entities
    }
}