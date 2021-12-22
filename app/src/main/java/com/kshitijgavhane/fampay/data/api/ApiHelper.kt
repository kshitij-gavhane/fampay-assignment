package com.kshitijgavhane.fampay.data.api

class ApiHelper(private val apiService: ApiService) {
    fun getCardGroups() = apiService.getCardGroups()
}