package com.kshitijgavhane.fampay.data.api

import com.kshitijgavhane.fampay.data.models.Response
import io.reactivex.Single
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

private const val BASE_URL = "https://run.mocky.io/v3/"

class ApiServiceImpl : ApiService {
    override fun getCardGroups(): Single<Response> {
        val client = OkHttpClient.Builder().build()
        return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ApiService::class.java).getCardGroups()
    }
}