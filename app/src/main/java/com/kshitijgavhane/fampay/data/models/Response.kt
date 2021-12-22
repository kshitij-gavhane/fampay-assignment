package com.kshitijgavhane.fampay.data.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Response {
    @SerializedName("card_groups")
    @Expose
    var cardGroupList: List<CardGroup>? = null
}