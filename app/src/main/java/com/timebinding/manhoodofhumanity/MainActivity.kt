package com.timebinding.manhoodofhumanity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.timebinding.manhoodofhumanity.book.presentation.menu_screen.MenuContent
import com.timebinding.manhoodofhumanity.book.presentation.menu_screen.MenuScreen
import com.timebinding.manhoodofhumanity.ui.theme.ManhoodOfHumanityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ManhoodOfHumanityTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    MenuScreen()
                }
            }
        }
    }
}

