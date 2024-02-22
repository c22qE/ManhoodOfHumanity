package com.timebinding.manhoodofhumanity.book.presentation.chapter_screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.timebinding.manhoodofhumanity.R
import com.timebinding.manhoodofhumanity.book.data.Chapters
import com.timebinding.manhoodofhumanity.book.presentation.menu_screen.MenuViewState
import com.timebinding.manhoodofhumanity.book.presentation.util.ChaptersList
import com.timebinding.manhoodofhumanity.book.presentation.util.MyTopAppBar
import dev.jeziellago.compose.markdowntext.MarkdownText

@Composable
fun ChapterScreen(
    chapterId: Int,
    onClickBackToMenu: () -> Unit,
    modifier: Modifier = Modifier
) {
    Scaffold (
        topBar = { MyTopAppBar(onClick = onClickBackToMenu, clicked = true) },
    ) {
        Chapters[chapterId-1]
            .content(Modifier.padding(top = it.calculateTopPadding()))
    }
}


