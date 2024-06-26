package com.myits.newsapp.ui.favorite

import androidx.lifecycle.ViewModel
import com.myits.newsapp.data.repository.NewsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FavoriteViewModel@Inject constructor(repo:NewsRepository): ViewModel() {
    val favoriteNews = repo.getFavoriteNews()
}