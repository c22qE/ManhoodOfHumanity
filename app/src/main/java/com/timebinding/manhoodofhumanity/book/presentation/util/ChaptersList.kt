package com.timebinding.manhoodofhumanity.book.presentation.util

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.timebinding.manhoodofhumanity.book.data.Chapter

@Composable
fun ChaptersList(
    chapters: List<Chapter>,
    onClick: (Int) -> Unit,
    modifier: Modifier
) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(10.dp),
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 15.dp)
            .padding(bottom = 15.dp)
    ) {
        items(chapters) { chapter ->
            ChapterCard(chapter, onClick = onClick)
        }
    }
}
