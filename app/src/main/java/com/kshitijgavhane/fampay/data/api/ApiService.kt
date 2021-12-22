package com.kshitijgavhane.fampay.data.api

import com.kshitijgavhane.fampay.data.models.Response
import io.reactivex.Single
import retrofit2.http.GET

interface ApiService {
   @GET("fefcfbeb-5c12-4722-94ad-b8f92caad1ad/")
    fun getCardGroups(): Single<Response>
}