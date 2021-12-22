package com.kshitijgavhane.fampay.data.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class CardGroup {
    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("design_type")
    @Expose
    var designType: String? = null

    @SerializedName("card_type")
    @Expose
    var cardType: Int? = null

    @SerializedName("cards")
    @Expose
    var cards: List<Card>? = null

    @SerializedName("is_scrollable")
    @Expose
    var isScrollable: Boolean? = null

    /**
     * No args constructor for use in serialization
     *
     */
    constructor() {}

    /**
     *
     * @param cards
     * @param isScrollable
     * @param designType
     * @param name
     * @param cardType
     * @param id
     */
    constructor(id: Int?, name: String?, designType: String?, cardType: Int?, cards: List<Card>?, isScrollable: Boolean?) : super() {
        this.id = id
        this.name = name
        this.designType = designType
        this.cardType = cardType
        this.cards = cards
        this.isScrollable = isScrollable
    }
}