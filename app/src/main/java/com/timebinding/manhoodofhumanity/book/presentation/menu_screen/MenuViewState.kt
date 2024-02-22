package com.timebinding.manhoodofhumanity.book.presentation.menu_screen

import com.timebinding.manhoodofhumanity.book.data.Chapter
import com.timebinding.manhoodofhumanity.book.data.Chapters

data class MenuViewState(
    var chapterId: Int = 0,
    val chapters: List<Chapter> = Chapters,
)