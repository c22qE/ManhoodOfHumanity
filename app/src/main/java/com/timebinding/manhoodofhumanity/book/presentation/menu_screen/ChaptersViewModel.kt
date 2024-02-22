package com.timebinding.manhoodofhumanity.book.presentation.menu_screen

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ChaptersViewModel: ViewModel() {
    private val _state = MutableStateFlow(MenuViewState())
    val state: StateFlow<MenuViewState> = _state.asStateFlow()
    fun setChapterId(id: Int) {
        _state.update {
            it.copy(chapterId = id)
        }
    }
}