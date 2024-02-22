package com.timebinding.manhoodofhumanity.book.data.local.markdown

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.timebinding.manhoodofhumanity.book.data.Chapters
import dev.jeziellago.compose.markdowntext.MarkdownText

@Composable
fun tableOfContents(modifier: Modifier) {
    MarkdownText(
        markdown = tableOfContentsText,
        color = MaterialTheme.colorScheme.onSurface,
        style = MaterialTheme.typography.bodyLarge,
        modifier = modifier.padding(horizontal = 15.dp),
    )
}

val tableOfContentsText = """
    # Оглавление
    · Зрелость человечности ·, 2-е издание, А. Коржибски
        
    [Ⱉ] ⬩**ОТ РЕДАКТОРА**⬩
    [Ⱉ] ⬩**ПРЕДИСЛОВИЕ**⬩
    [Ⱉ] ⬩**МЕМУАРЫ**⬩: АЛЬФРЕД КОРЖИБСКИ И ЕГО РАБОТА
    [Ⱉ] ⬩**ВО ЧТО Я ВЕРЮ**⬩
    [Ⱉ] ⬩**ПРЕДИСЛОВИЕ**⬩ к первому изданию
    [Ⱉ] ⬩**БЛАГОДАРНОСТИ**⬩
    
    [Ⱉ] ⬩**ГЛАВА Ⅰ**⬩ МЕТОДЫ И ПРОЦЕССЫ ПОДХОДА К НОВОЙ КОНЦЕПЦИИ ЖИЗНИ
    [Ⱉ] ⬩**ГЛАВА Ⅱ**⬩ ДЕТСТВО ЧЕЛОВЕЧНОСТИ
    [Ⱉ] ⬩**ГЛАВА Ⅲ**⬩ КЛАССЫ ЖИЗНИ
    [Ⱉ] ⬩**ГЛАВА Ⅳ**⬩ ЧТО ЕСТЬ ЧЕЛОВЕК?
    [Ⱉ] ⬩**ГЛАВА Ⅴ**⬩ БОГАТСТВО
    [Ⱉ] ⬩**ГЛАВА Ⅵ**⬩ ЭПОХА КАПИТАЛИЗМА
    [Ⱉ] ⬩**ГЛАВА Ⅶ**⬩ ВЫЖИВАНИЕ САМОГО ПРИСПОСОБЛЕННОГО
    [Ⱉ] ⬩**ГЛАВА Ⅷ**⬩ СТИХИИ МОЩИ
    [Ⱉ] ⬩**ГЛАВА Ⅸ**⬩ ЗРЕЛОСТЬ ЧЕЛОВЕЧНОСТИ
    [Ⱉ] ⬩**ГЛАВА Ⅹ**⬩ ЗАКЛЮЧЕНИЕ
    
    [Ⱉ] ⬩**ПРИЛОЖЕНИЕ Ⅰ**⬩ МАТЕМАТИКА И ВРЕМЯ-СВЯЗЫВАНИЕ
    [Ⱉ] ⬩**ПРИЛОЖЕНИЕ Ⅱ**⬩ БИОЛОГИЯ И ВРЕМЯ-СВЯЗЫВАНИЕ
    [Ⱉ] ⬩**ПРИЛОЖЕНИЕ Ⅲ**⬩ ИНЖЕНЕРИЯ И ВРЕМЯ-СВЯЗЫВАНИЕ
    [Ⱉ] ⬩**ПРИЛОЖЕНИЕ Ⅳ**⬩ НЕКОТОРЫЕ НЕ-АРИСТОТЕЛЕВЫ ДАННЫЕ ОБ ЭФФЕКТИВНОСТИ ЧЕЛОВЕЧЕСКОЙ АДАПТАЦИИ
    [Ⱉ] ⬩**ПРИЛОЖЕНИЕ Ⅴ**⬩ ·_Наука и здравомыслие, избранные материалы_· – ЗАМЕТКА АВТОРА
    [Ⱉ] ⬩**ЛЕКЦИЯ ⅩⅩ**⬩ КОНЦЕПЦИЯ ЧЕЛОВЕКА КОРЖИБСКИ  
    
      * * *
      
""".trimIndent()


