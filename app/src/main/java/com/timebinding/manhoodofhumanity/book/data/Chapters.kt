package com.timebinding.manhoodofhumanity.book.data

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.timebinding.manhoodofhumanity.book.data.local.markdown.*

data class Chapter(
    val id: Int,
    val title: String,
    val subtitle: String?,
    val body: String?,
    val content: @Composable (modifier: Modifier) -> Unit,
)

val Chapters = listOf(
    Chapter(
        id = 1,
        title = "Оглавление",
        subtitle = "Зрелость человечности",
        body = "2-е издание 1921–1950, А. Коржибски",
        content = { tableOfContents(it) }
    ),
    Chapter(
        id = 2,
        title = "ОТ РЕДАКТОРА",
        subtitle = null,
        body = null,
        content = { fromTheEditor(it) }
    ),
    Chapter(
        id = 3,
        title = "ПРЕДИСЛОВИЕ",
        subtitle = null,
        body = null,
        content = { preface(it) }
    ),
    Chapter(
        id = 4,
        title = "МЕМУАРЫ",
        subtitle = "АЛЬФРЕД КОРЖИБСКИ И ЕГО РАБОТА",
        body = null,
        content = { memoirs(it) }
    ),
    Chapter(
        id = 5,
        title = "ВО ЧТО Я ВЕРЮ",
        subtitle = null,
        body = null,
        content = { whatIbelieve(it) }
    ),
    Chapter(
        id = 6,
        title = "ПРЕДИСЛОВИЕ",
        subtitle = "К первому изданию",
        body = null,
        content = { prefaceToTheFirstEdition(it) }
    ),
    Chapter(
        id = 7,
        title = "БЛАГОДАРНОСТИ",
        subtitle = null,
        body = null,
        content = { acknowledgements(it) }
    ),
    Chapter(
        id = 8,
        title = "ГЛАВА Ⅰ",
        subtitle = "МЕТОДЫ И ПРОЦЕССЫ ПОДХОДА К НОВОЙ КОНЦЕПЦИИ ЖИЗНИ",
        body = null,
        content = { chapter_1(it) }
    ),
    Chapter(
        id = 9,
        title = "ГЛАВА Ⅱ",
        subtitle = "ДЕТСТВО ЧЕЛОВЕЧНОСТИ",
        body = null,
        content = { chapter_2(it) }
    ),
    Chapter(
        id = 10,
        title = "ГЛАВА Ⅲ",
        subtitle = "КЛАССЫ ЖИЗНИ",
        body = null,
        content = { chapter_3(it) }
    ),
    Chapter(
        id = 11,
        title = "ГЛАВА Ⅳ",
        subtitle = "ЧТО ЕСТЬ ЧЕЛОВЕК?",
        body = null,
        content = { chapter_4(it) }
    ),
    Chapter(
        id = 12,
        title = "ГЛАВА Ⅴ",
        subtitle = "БОГАТСТВО",
        body = null,
        content = { chapter_5(it) }
    ),
    Chapter(
        id = 13,
        title = "ГЛАВА Ⅵ",
        subtitle = "ЭПОХА КАПИТАЛИЗМА",
        body = null,
        content = { chapter_6(it) }
    ),
    Chapter(
        id = 14,
        title = "ГЛАВА Ⅶ",
        subtitle = "ВЫЖИВАНИЕ САМОГО ПРИСПОСОБЛЕННОГО",
        body = null,
        content = { chapter_7(it) }
    ),
    Chapter(
        id = 15,
        title = "ГЛАВА Ⅷ",
        subtitle = "СТИХИИ МОЩИ",
        body = null,
        content = { chapter_8(it) }
    ),
    Chapter(
        id = 16,
        title = "ГЛАВА Ⅸ",
        subtitle = "ЗРЕЛОСТЬ ЧЕЛОВЕЧНОСТИ",
        body = null,
        content = { chapter_9(it) }
    ),
    Chapter(
        id = 17,
        title = "ГЛАВА Ⅹ",
        subtitle = "ЗАКЛЮЧЕНИЕ",
        body = null,
        content = { chapter_10(it) }
    ),
    Chapter(
        id = 18,
        title = "ПРИЛОЖЕНИЕ Ⅰ",
        subtitle = "МАТЕМАТИКА И ВРЕМЯ-СВЯЗЫВАНИЕ",
        body = null,
        content = { appendix_1(it) }
    ),
    Chapter(
        id = 19,
        title = "ПРИЛОЖЕНИЕ Ⅱ",
        subtitle = "БИОЛОГИЯ И ВРЕМЯ-СВЯЗЫВАНИЕ",
        body = null,
        content = { appendix_2(it) }
    ),
    Chapter(
        id = 20,
        title = "ПРИЛОЖЕНИЕ Ⅲ",
        subtitle = "ИНЖЕНЕРИЯ И ВРЕМЯ-СВЯЗЫВАНИЕ",
        body = null,
        content = { appendix_3(it) }
    ),
    Chapter(
        id = 21,
        title = "ПРИЛОЖЕНИЕ Ⅳ",
        subtitle = "НЕКОТОРЫЕ НЕ-АРИСТОТЕЛЕВЫ ДАННЫЕ ОБ ЭФФЕКТИВНОСТИ ЧЕЛОВЕЧЕСКОЙ АДАПТАЦИИ",
        body = null,
        content = { appendix_4(it) }
    ),
    Chapter(
        id = 22,
        title = "ПРИЛОЖЕНИЕ Ⅴ",
        subtitle = "Наука и здравомыслие, избранные материалы",
        body = "ЗАМЕТКА АВТОРА",
        content = { appendix_5(it) }
    ),
    Chapter(
        id = 23,
        title = "ЛЕКЦИЯ XX",
        subtitle = "КОНЦЕПЦИЯ ЧЕЛОВЕКА КОРЖИБСКИ  ",
        body = null,
        content = { lection(it) }
    ),
)
