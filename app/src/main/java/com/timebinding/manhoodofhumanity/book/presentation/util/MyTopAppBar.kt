package com.timebinding.manhoodofhumanity.book.presentation.util

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.clickable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.timebinding.manhoodofhumanity.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopAppBar(
    onClick: () -> Unit,
    clicked: Boolean,
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = { Text(text = stringResource(R.string.top_app_bar)) },
        navigationIcon = {
            IconButton(
                onClick = onClick,
            ) {
                Icon(
                    imageVector = if (clicked) Icons.Filled.ArrowBack else Icons.Filled.Menu,
                    contentDescription = null,
                )
            }
        },
        modifier = Modifier,
    )
}

