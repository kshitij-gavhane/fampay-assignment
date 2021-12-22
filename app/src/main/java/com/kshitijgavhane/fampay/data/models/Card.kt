package com.kshitijgavhane.fampay.data.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Card {
    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("title")
    @Expose
    var title: String? = null

    @SerializedName("formatted_title")
    @Expose
    var formattedTitle: FormattedTitle? = null

    @SerializedName("description")
    @Expose
    var description: String? = null

    @SerializedName("formatted_description")
    @Expose
    var formattedDescription: FormattedDescription? = null

    @SerializedName("url")
    @Expose
    var url: String? = null

    @SerializedName("bg_image")
    @Expose
    var bgImage: CardImage? = null

    @SerializedName("bg_color")
    @Expose
    var bgColor: String? = null

    @SerializedName("icon")
    @Expose
    var icon: CardImage? = null

    @SerializedName("cta")
    @Expose
    var cta: List<Ctum>? = null

    /**
     * No args constructor for use in serialization
     *
     */
    constructor() {}

    /**
     * @param name
     * @param title
     * @param formattedTitle
     * @param description
     * @param formattedDescription
     * @param url
     * @param bgImage
     * @param bgColor
     * @param icon
     * @param cta
     */
    constructor(name: String?, title: String?, formattedTitle: FormattedTitle?, description: String?, formattedDescription: FormattedDescription?, url: String?, bgImage: CardImage?, bgColor: String?, icon: CardImage?, cta: List<Ctum>?) : super() {
        this.name = name
        this.title = title
        this.formattedTitle = formattedTitle
        this.description = description
        this.formattedDescription = formattedDescription
        this.url = url
        this.bgImage = bgImage
        this.bgColor = bgColor
        this.icon = icon
        this.cta = cta
    }
}