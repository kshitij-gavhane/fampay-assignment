package com.kshitijgavhane.fampay.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.kshitijgavhane.fampay.data.api.ApiHelper
import com.kshitijgavhane.fampay.data.repositories.CardGroupRepository

class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CardGroupViewModel::class.java)) {
            return CardGroupViewModel(CardGroupRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}