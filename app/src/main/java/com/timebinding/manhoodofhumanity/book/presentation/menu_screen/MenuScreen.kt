package com.timebinding.manhoodofhumanity.book.presentation.menu_screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.timebinding.manhoodofhumanity.book.presentation.chapter_screen.ChapterScreen
import com.timebinding.manhoodofhumanity.book.presentation.util.ChaptersList
import com.timebinding.manhoodofhumanity.book.presentation.util.MyTopAppBar
import androidx.lifecycle.viewmodel.compose.viewModel
@Composable
internal fun MenuScreen(
    viewModel: ChaptersViewModel = viewModel()
) {
    val state by viewModel.state.collectAsState()

    if (state.chapterId > 0) {
        ChapterScreen(
            chapterId = state.chapterId,
            onClickBackToMenu = { viewModel.setChapterId(0) }
        )
    } else {
        MenuContent(
            state = state,
            onClickToChapterItem = { viewModel.setChapterId(it) },
            modifier = Modifier
        )
    }

}

@Composable
fun MenuContent(
    state: MenuViewState,
    onClickToChapterItem: (Int) -> Unit,
    modifier: Modifier
) {
    Scaffold (
        topBar = { MyTopAppBar( onClick = { }, clicked = false ) },
        modifier = modifier
            .fillMaxSize()
        ) {
            ChaptersList(
                chapters = state.chapters,
                onClick = onClickToChapterItem,
                modifier = Modifier
                    .padding(top = it.calculateTopPadding())
            )
    }
}
