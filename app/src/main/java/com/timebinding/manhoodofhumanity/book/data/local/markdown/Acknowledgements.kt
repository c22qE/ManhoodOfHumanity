package com.timebinding.manhoodofhumanity.book.data.local.markdown

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.jeziellago.compose.markdowntext.MarkdownText

@Composable
fun acknowledgements(modifier: Modifier) {
    MarkdownText(
        markdown = acknowledgementsText,
        color = MaterialTheme.colorScheme.onSurface,
        style = MaterialTheme.typography.bodyLarge,
        modifier = modifier.padding(horizontal = 15.dp),
    )
}

val acknowledgementsText = """
    # Благодарности
    · Зрелость человечности ·, 2-е издание, А. Коржибски

    * * *

    Автор и издатель выражают благодарность за разрешения воспользоваться в данной работе материалами, защищёнными законом о правах интеллектуальной собственности:

    Компании D. C. Heath & Company за разрешение цитировать из книги “Unified Mathematics” Луиса Карпински, Хэри Яндэла Бенедикта и Джона Калхуна.

    Компании G. P. Putnam’s Sons New York and London, за разрешение цитировать из книг “Organism as a Whole” и “Physiology of the Brain” Жака Лёба.

    Компании Harper & Brothers за разрешение цитировать из книги “From the Life, Imaginary Portraits of Some Distinguished Americans” Харви О’Хиггинса.

    Компании D. Appleton & Company за разрешение цитировать из книги “Corporation Finance” Э. С. Мида.

    Компании. J. B. Lippincott Company за разрешение цитировать из книги “Forced Movements” Жака Лёба.

    Издательству Принстонского университета за разрешение цитировать из книги “Heredity and Environment” Эдвина Гранта Конклина.

    Издательству колумбийского университета за разрешение цитировать из книги “The Human Worth of Rigorous Thinking” Кассия Дж. Кайзера.

    Рокфеллеровскому университету медицинских исследований за разрешение цитировать из книги ·_The Journal of Experimental Medicine_·, Том 27.

    Новую школу социальных исследований за разрешение цитировать из доклада “An Outline of the History of the Western European Mind” Джеймса Харви Робинсона.

    Компании The Engineering Magazine Company за разрешение цитировать из книги “Mastering Power Production” Вальтера Николаевича Полякова.

    * * *
""".trimIndent()