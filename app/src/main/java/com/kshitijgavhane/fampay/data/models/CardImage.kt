package com.kshitijgavhane.fampay.data.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class CardImage {
    @SerializedName("image_type")
    @Expose
    var imageType: String? = null

    @SerializedName("image_url")
    @Expose
    var imageUrl: String? = null

    @SerializedName("aspect_ratio")
    @Expose
    var aspectRatio: Double = 1.0

    @SerializedName("asset_type")
    @Expose
    var assetType: String? = null

    /**
     * No args constructor for use in serialization
     *
     */
    constructor() {}

    /**
     *
     * @param imageUrl
     * @param imageType
     * @param assetType
     * @param aspectRatio
     */
    constructor(imageType: String?, imageUrl: String?, assetType: String?, aspectRatio: Double) : super() {
        this.imageType = imageType
        this.imageUrl = imageUrl
        this.assetType = assetType
        this.aspectRatio = aspectRatio
    }
}