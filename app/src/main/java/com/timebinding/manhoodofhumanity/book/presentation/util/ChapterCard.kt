package com.timebinding.manhoodofhumanity.book.presentation.util

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.timebinding.manhoodofhumanity.book.data.Chapter

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChapterCard(
    chapter: Chapter,
    onClick: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    OutlinedCard(
        onClick = { onClick(chapter.id) },
        modifier = modifier.fillMaxWidth()
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.padding(10.dp)
        ) {
            Text(
                text = chapter.title,
                style = MaterialTheme.typography.titleLarge,
                color = MaterialTheme.colorScheme.primary
            )
            chapter.subtitle?.let {
                Text(
                    text = it,
                    style = MaterialTheme.typography.titleMedium,
                    color = MaterialTheme.colorScheme.secondary
                )
            }
            chapter.body?.let {
                Text(
                    text = it,
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.secondary
                )
            }
        }
    }
}