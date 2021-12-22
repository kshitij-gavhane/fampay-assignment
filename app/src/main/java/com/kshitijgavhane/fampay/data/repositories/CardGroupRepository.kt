package com.kshitijgavhane.fampay.data.repositories

import com.kshitijgavhane.fampay.data.api.ApiHelper
import com.kshitijgavhane.fampay.data.models.Response
import io.reactivex.Single

class CardGroupRepository(private val apiHelper: ApiHelper) {

    fun getCardGroups(): Single<Response> {
        return apiHelper.getCardGroups()
    }
}