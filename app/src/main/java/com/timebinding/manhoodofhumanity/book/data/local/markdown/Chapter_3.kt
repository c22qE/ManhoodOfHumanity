package com.timebinding.manhoodofhumanity.book.data.local.markdown

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.timebinding.manhoodofhumanity.R
import dev.jeziellago.compose.markdowntext.MarkdownText

@Composable
fun chapter_3(modifier: Modifier) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(40.dp),
        modifier = modifier.padding(horizontal = 15.dp).padding(top = 0.dp)
    ) {
        item {
            MarkdownText(
                markdown = chapter_3_text_1,
                color = MaterialTheme.colorScheme.onSurface,
                style = MaterialTheme.typography.bodyLarge,
                modifier = modifier,
            )
        }
        item {
            Image(
                painter = painterResource(R.drawable.live_classes),
                contentDescription = "Классы жизни",
                contentScale = ContentScale.Fit,
                modifier = Modifier.fillMaxSize()
            )
        }
        item {
            MarkdownText(
                markdown = chapter_3_text_2,
                color = MaterialTheme.colorScheme.onSurface,
                style = MaterialTheme.typography.bodyLarge,
                modifier = modifier,
            )
        }
    }
}

val chapter_3_text_1 = """
   # Глава Ⅲ
   · Зрелость человечности ·, 2-е издание, А. Коржибски

   * * *

   В этой главе нам придётся иметь дело с нелегкими, но крайне важными проблемами. Чтобы корректно классифицировать явления, их следует корректно проанализировать и чётко определить. Для ясности я воспользуюсь простейшими примерами и постараюсь как смогу избегать трудных для понимания научных терминов. В некоторых случаях я употреблю слова в научном значении, и мне придётся делать это осторожно, чтобы не произвести ложное впечатление.

   Для разумного мышления обязательно требуются ясные идеи. На деле наша повседневная речь плохо подходит для точного выражения мыслей; даже так называемый «научный» язык часто оказывается слишком неясным для таких целей и требует доработки. Кто-то может счесть бесполезным и излишним уделять столько внимания корректному мышлению и точному выражению, и что это не несёт практической ценности. Люди говорят, что «делового» языка хватает, чтобы «говорить по делу» или чтобы до собеседника «что-то дошло». Я приведу краткое объяснение, чтобы дать оценить важнейшую роль точности.

   Человечество относится к особенному классу жизни, который в некоторой степени определяет собственные судьбы. В практической жизни ·_слова_· и ·_идеи_· становятся фактами, а факты влекут за собой важные практические последствия.

   Например, многие миллионы людей определили удар молнии как «божественное наказание» злодеев. Другие миллионы определили его как «природное, чем-то обусловленное, периодическое явление». Ещё другие миллионы определили его как «электрический разряд».

   К каким результатам в практической жизни привели эти «неважные» определения?

   В случае первого определения, когда молния ударяла в дом, жители не предпринимали попыток уберечь его или имущество внутри, потому что таким поступком они бы пошли против «определения», которое гласит, что это явление служит «наказанием за совершённое зло». Любую попытку предотвратить или остановить разрушение сочли бы богопротивным поступком, «нарушающим высший закон», а совершившего его грешника виновным и достойным наказания смертью.

   Во втором случае с домом обращаются как с любым деревом, опрокинутым во время грозы: люди спасают всё, что могут, и пытаются потушить пожар. В обоих случаях поведение жителей сходится в одном отношении: если их застаёт гроза в открытой местности, они прячутся под деревом, чем, сами того не зная, подвергают себя максимальной опасности.

   В третьем случае, определив молнию научно корректно, жители устанавливают громоотводы на дома. Когда гроза застаёт их в открытой местности, они не убегают и не прячутся под деревьями. Если грозовые тучи находятся прямо над их головами, они занимают положение минимального риска поражения – ложатся на землю и ждут, когда гроза пройдёт.

   Мы можем приводить много таких примеров, но стоит привести ещё один важный, который имеет отношение к нашей концепции социально-экономической системы и государства. Если мы считаем наши институты «творениями от Бога» – священными и, следовательно, статичными – любой, кто призывает к переменам, заслуживает, чтобы с ним обращались как с преступником, «угрожающим существующему порядку», и повесили, или хотя бы посадили в тюрьму пожизненно.

   Если же мы видим свои институты «творениями человека», несовершенными, часто глупыми и подверженными постепенным динамическим изменениям по какому-либо известному или неизвестному закону, то, конечно, все реакционеры «угрожают естественному порядку», и с ними следует обращаться так же.

   Мы можем оценить важность определений во всех других областях практической жизни. Определения задают условия. Чтобы знать мир, в котором мы живём, нам следует анализировать факты, применяя такие факты, которые мы знаем в повседневной практике, и такие факты, которые устанавливают в научных лабораториях, где люди не скачут к выводам. В некоторых местах мне придётся позволить себе высказывания, обоснования которым я смогу привести только позднее в обсуждении. Это понадобится, чтобы указать на ход анализа.

   С помощью этого анализа мы хотим получить обоснованные концепции, правильные определения и истинные пропозиции. Этот процесс идёт медленно, постепенно и бесконечно. Мы имеем дело с неопределённым числом проблем, поэтому придётся выбирать. К счастью, решение нескольких проблем автоматически ведёт к решению многих других. Многими величайшими и масштабными научными открытиями стали не более чем несколько корректных определений, несколько обоснованных концепций и несколько истинных пропозиций. Таковыми стали, например, работы Эвклида, Ньютона и Лейбница. Их корректные определения, обоснованные концепции и истинные пропозиции впоследствии доработали талантливые творческие гении или просто благоразумные люди.

   Я назвал вопрос определений очень важным. Здесь я не говорю об ·_именных_· определениях, с помощью которых мы для удобства присваиваем названия известным объектам. Я говорю о таких определениях, которые получаются в результате корректного анализа явлений. Именные определения служат лишь удобству, и не относятся ни к истинным, ни к ложным, тогда как аналитические определения служат определительными ·_пропозициями_·, которые мы можем отнести к истинным или к ложным. Давайте рассмотрим этот вопрос подробнее.

   В примере выше мы сравнили три определения. Первое оказалось самым ошибочным, а его применение нанесло больше всего ущерба. Второе содержало меньше ошибок и привело к менее пагубным практическим результатам. Третье, в настоящих условиях нашего знания, оказалось «истинным» и принесло максимум пользы. Этот пример с молнией даёт основание рассмотреть идею ·_относительной_· истины и ·_относительной_· ложности. Мы не можем давать ни абсолютно истинные, ни абсолютно ложные определения; из двух определений одного явления или вещи одно может оказаться истиннее или ложнее второго.

   Для наглядности назовём первую «истину» ·_A_·₁ (альфа 1), вторую ·_A_·₂ (альфа 2) и третью ·_A_·₃ (альфа 3) и предположим, что к нам пришёл гений, который обладает способностью превосходить все иные относительные истины ·_A_·₁, ·_A_·₂, ·_A_·₃, … ·_A_·ₙ, и дал нам абсолютную, окончательную истину, ⬩**рабочую в бесконечности**⬩ (·_A_·₋∞₋) – окончательное определение: молния есть то … и то …, какой-то тип энергии, проходящей, скажем, через стеклянную трубку, наполненную углём. Благодаря этому определению сразу стало бы очевидно, как мы можем воспользоваться молнией. Мы могли бы построить стеклянные башни, наполненные углём и обеспечить себя неограниченным током свободной энергии, что повлияло бы на нашу жизнь невообразимым образом. Этим примером мы объясняем важность корректных определений.

   Возьмём другой пример. Существует такое явление как красный «цвет». Представим, как мы бы его определили.

   (·_A_·₁) Реакционер назвал бы его большевицким;  
   (·_A_·₂) большевик сказал бы: «Мой цвет»;  
   (·_A_·₃) один дальтоник сказал бы: «Такой вещи нет»;  
   (·_A_·₄) другой дальтоник назвал бы его зелёным;  
   (·_A_·₅) метафизик сказал бы: «В нём заключается душа виски»;  
   (·_A_·₆) историк сказал бы: «Чернилами этого цвета пишется человеческая история»;  
   (·_A_·₇) необразованный человек сказал бы: «Это цвет крови»;  
   (·_A_·ₙ) современный учёный сказал бы: «Это свет такой-то длины волны».

   «Работает» последнее определение «в бесконечности» или нет, мы не знаем, но оно становится «научной истиной» в текущих условиях нашего знания.

   Окончательную, но непознанную «рабочую в бесконечности истину» мы каким-то образом воспринимаем или ощущаем как идеальную, потому что в ходе бессчётных лет наблюдений мы формировали всё менее ложные и всё более истинные «идеи» об этом явлении. «Идеи» представляют собой ·_отражения_· данного явления; оно отражается в нас как в зеркале. Зеркала, однако, могут оказаться выпуклыми или вогнутыми и отражать криво, но они дают основания предполагать идеальное отражение, рабочее в бесконечности.

   Видится крайне важным, чтобы мы осознали, что слова, которые мы применяем, чтобы выражать идеи и идеалы, служат ⬩**представлением**⬩ идей и идеалов, и только слова позволяют нам передать другому человеку точное или почти точное впечатление, которое на нас произвело явление.

   Представить этот процесс нам поможет пример. Предположим, человек проводит эксперимент, в котором рисует собственный портрет по отражению в зеркале, прямом, вогнутом или выпуклом. Глядя в прямое зеркало, он видит свой истинный образ, но даже при этом, если ему не хватает навыков, он нарисует образ плохо. Предположим, что человек обладает красивыми чертами, но его неумелый рисунок не производит впечатление красивых черт оригинала. Если бы он как неумелый художник рисовал, глядя в вогнутое или выпуклое зеркало, рисунок его образа практически не сходился бы с его оригинальными чертами.

   Для корректного анализа и истинных определений основных классов жизни в нашем мире, нам потребуются адекватные идеи об измерениях или размерности. С этим нам в некоторой мере поможет Британская энциклопедия. Для объяснения я приведу краткий пример.

   Различные сущности, поддающиеся измерению, не удаётся сравнивать напрямую. Каждую приходится измерять единицами её типа. Линия может обладать только длиной, и поэтому относится к сущностям одного измерения. Поверхность обладает длиной и шириной, поэтому мы говорим, что она имеет два измерения. Объём обладает длиной, шириной и высотой, и поэтому мы говорим, что он имеет три измерения. Если взять какой-либо объём, – например, куб – мы увидим, что он обладает поверхностями, линиями и точками, но объём не представляет собой ни поверхность, ни линию, ни точку.

   Одни только эти размерные отличия играют роль огромной, не осознанной нами, важности в практической жизни. Если мы возьмём линию, составляющую пять единиц длины, и построим по ней квадрат, то размер (площадь поверхности) этого квадрата составит не пять, а 25, и числом 25 мы обозначим не линейные единицы длины, а квадратные единицы поверхности. Если по этому квадрату мы построим куб, то его размер составит не 5 и не 25, а 125, и этим числом мы обозначим единицы уже не длины и не площади, а кубические единицы.

   Мы чётко понимаем, что спутав ·_измерения_· при вычислении длин, площадей и объёмов, мы бы разрушили все архитектурные и инженерные структуры, чем показали бы свою глупость.

   Чтобы проанализировать классы жизни, нам следует рассмотреть явления двух очень разных типов: один под общим названием «неорганическая химия», и второй под общим названием «органическая химия», или «химия углеводородов». Их разделяют по особенным свойствам элементов во втором классе. Свойства материи распределяются среди элементов так, что три из них – кислород, водород и углерод – обладают множеством уникальных характеристик. В неорганической химии вещества могут вступать в относительно небольшое количество реакций, тогда как в органической химии – в химии этих трёх элементов – число разных соединений практически не имеет ограничений. До 1910 года мы знали более 79 элементов, между которыми количество реакций составляло лишь несколько сотен, но между остальными тремя элементами – углеродом, водородом и кислородом – число и возможности реакций не имело ограничений. Следует увидеть далеко идущие последствия этого факта.

   Что касается энергий, нам следует принимать их так, как природа их нам показывает. В этом случае, как ни в каком другом, нам существенно поможет математическое мышление. Реакции в неорганической химии всегда сопровождаются явлением тепла, иногда света и в некоторых случаях необычной энергии под названием «электричество». На данный момент радиоактивные элементы представляют пока недостаточно изученную группу, поэтому здесь мы не сможем подробно её разобрать.

   При неограниченности числа и возможностей органических соединений вместе с их уникальными характеристиками они представляют иной класс явлений. Одновременно с этим они относятся к ·_химическим_·, потому что в них входят базовые химические явления, характерные для всех химических реакций. Одновременно же они остаются уникальными во многих других отношениях, потому что обладают бесконечным множеством уникальных характеристик. Среди энергетических явлений органической химии, кроме вышеупомянутых, существуют ⬩**новые и уникальные**⬩ энергетические явления, происходящие в этом измерении.

   Среди этих явлений стоит упомянуть явление «жизни», явление «инстинктов» и явление «разума» в целом. Мы видим уникальность этих энергетических явлений по уникальности химического аспекта трёх уникальных элементов. Мы также ясно видим, что именно в связи с этой «уникальностью» мы относим эти явления к таковым более высокой размерности в сравнении с явлениями неорганической химии.

   Подобным образом мы рассматриваем уникальность свойств объёма, сопоставляя их со свойствами поверхности; объём тоже обладает более высокой размерностью по сравнению с поверхностью. Тем же образом, которым эта разница в измерениях составляет целую разницу между геометрией объёмов и геометрией поверхностей, разница между двумя химиями составляет разницу в размерности.

   Высокие энергии химий высокой размерности представляется очень трудным определить. Мои описания подойдут не лучше, чем описание жизни, которое дал профессор Вильгельм Ру в своей работе ·_Der Kampf der Teile im Organismus_· (Leipzig, 1881). Его я считаю в равной мере неподходящим, но за отсутствием лучшего, я процитирую его.

   Он определяет живое существо как объект природы, проявляющий следующие девять характерных автономных деятельностей:

   1\. автономное изменение  
   2\. автономная экскреция  
   3\. автономное поглощение  
   4\. автономная ассимиляция  
   5\. автономный рост  
   6\. автономное движение  
   7\. автономное размножение  
   8\. автономная передача наследственных характеристик и  
   9\. автономное развитие.

   Стоит обратить внимание на слова «автономные деятельности», потому что они намекают на размерные отличия этих энергий. Однако следует подыскать слово получше, чтобы определить размерные отличия деятельностей, наблюдаемых в неорганической химии, от таковых, наблюдаемых в органической химии.

   Мы понимаем, что допускаем ошибку, говоря о «жизни» в кристалле в том же смысле, в каком употребляем слово «жизнь» в отношении любопытного ⬩**автономного**⬩ явления ⬩**органической**⬩ химии – явления ⬩**измерения, отличного**⬩ от деятельностей в неорганической химии. Для так называемой жизни в кристаллах – ·_не_· ⬩**автономных**⬩ деятельностей кристаллов – стоит подобрать другое слово. В теоретических рассуждениях о кристаллах словом «жизнь» пользуются чисто риторически, и такое применение вредит разумной науке. Эти старые идеи о «жизни» в кристаллах уже далеко отстали от науки, и теперь служат наглядным примером частого спутывания и смешивания измерений. Это спутывание происходит в связи с не-математическими и логически некорректным способами мышления. Если кристаллы «живут», то ·_объёмы есть поверхности_·, а 125 кубических единиц = 25 квадратным единицам – абсурдность, характерная для «детства человечности».

   ⬩«⬩  
   Кристаллы могут расти в подходящем растворе и регенерировать свою форму в нём, если их сломать или повредить. Получается даже предотвратить или задержать формирование кристаллов в пересыщенном растворе, не допуская в него „микробов“ из воздуха. Этим наблюдением позднее воспользовались Шрёдер и Пастер в своих экспериментах по самозарождению. Однако мы пользуемся аналогиями между живым организмом и кристаллом лишь поверхностно, и лишь чётким указанием на основные отличия поведения кристаллов от поведения живых организмов мы можем лучше понять конкретные отличия между неживой и живой материей. Кристаллы действительно могут расти, но только в пересыщенном растворе собственного вещества.

   С живыми организмами происходит обратное. Во-первых, чтобы бактерии или клетки нашего тела росли, им требуется доступ к растворам продуктов расщепления составляющих их веществ, но не сами вещества. Во-вторых, рост происходит не в пересыщенных растворах, а наоборот, в слабоконцентрированных. В-третьих, рост в живых организмах приводит к делению клеток, как только масса клетки достигает определённого предела. Мы не можем говорить, что процесс деления клеток имеет место в кристалле даже метафорически. Мы сможем составить чёткое представление о конкретных отличиях неживой и живой материи, корректно оценив эти факты. Формирование живой материи состоит из синтеза белков, нуклеинов, жиров и углеводов клеток из продуктов расщепления….

   Существенно живая материя отличается от неживой следующим: живая клетка синтезирует собственный конкретный сложный материал из инертных или неконкретных простых соединений в среде, тогда как кристалл просто приращивает молекулы, находящиеся в пересыщенном растворе. К этим синтетическим возможностям преобразования малых „строительных камней“ в сложные соединения, конкретных для каждого организма сводится „секрет жизни“ или, скорее, один из секретов жизни.  
   ⬩»⬩  
   (·_The Organism as a Whole_· ⁅·_Организм как целое_·⁆, Жак Лёб.)

   Мы разберём позднее, что одно из энергетических явлений органической химии, «разум», – одна из энергий, характерных для этого класса явлений – складывается «автономно», работает «сама на себе» и сообразно своей размерности. Проанализировав классы жизни, мы быстро обнаружим, что существует три основных класса, которые чётко отличаются друг от друга своей функцией.

   Кратким анализом мы выявим, что, несмотря на то, что у минералов наблюдается различная деятельность, они не «живут». Растения выполняют очень явную и знакомую нам функцию – они преобразуют солнечную энергию в органическую химическую энергию. Они представляют класс жизни, который вбирает энергию одного типа, перерабатывает её в энергию другого типа, которую затем хранит. В этом смысле растения функционируют как аккумуляторная батарея для солнечной энергии. Учитывая это, я определяю

   ⬩**растения как химио-связующий класс жизни**⬩.

   Животные употребляют высоко динамические продукты ·_химио-связующего_· класса – растений – в пищу, и в них эти продукты – результаты преобразований растений – подвергаются дальнейшим преобразованиям в более высокие формы. Животные представляют более динамический класс жизни. Они реализуют кинетическую энергию и обладают свободой, какой не обладают растения – свободой и способностью перемещаться в ·_пространстве_·, поэтому я определяю

   ⬩**животных как пространство-связующий класс жизни**⬩.

   Теперь, что мы можем сказать о людях?  
   Как мы можем определить человека?

   Подобно животным люди тоже обладают ·_пространство-связующей_· способностью, но помимо и сверх этого, люди обладают самой удивительной и уникальной для них способностью. Я имею в виду способность обобщать, усваивать и применять труд и опыт прошлого; способность применять результаты трудов и опыта прошлого в качестве интеллектуального или духовного капитала для развития в настоящем; способность применять расширяющим образом возможности инструментов, накопленные пробами, ошибками и успехами достижения жизней прошлых поколений; способность людей вести свои жизни в постоянно расширяющимся свете унаследованного знания; способность, благодаря которой человек становится одновременно наследником ушедших веков и доверителем для потомков. Человечество представляет собой удивительный естественный действующий фактор прошлых жизней в настоящем и настоящих жизней для будущего, поэтому я определяю

   ⬩**человечество**⬩,

   говоря универсальным языком математики и механики,

   ⬩**как время-связующий класс жизни**⬩.

   Учитывая простоту и важность этих определений основных классов жизни, – стоит заметить, полученных путём прямых наблюдений – я не могу в должной мере подчеркнуть необходимость их усвоения, особенно усвоения определения человека. Эти простые определения имеют потенциал глубоко преобразовать всю концепцию человеческой жизни в каждой области интересов и деятельности. Ещё важнее я считаю то, что это определение человека может послужить отправной точкой для поисков ·_естественных_· ⁅·_природных_·⁆ законов человеческой природы – человеческого класса жизни.

   Этими определениями мы проводим различие между классами по их размерности; этому следует придать серьёзную важность, потому что меру одного класса не получится применить к другому, ·_не допустив при этом серьёзных ошибок_·. Например, обращаясь с человеком как с животным, – как лишь с пространство-связующим – потому что люди проявляют определённые животные наклонности, мы допускаем грубую ошибку, подобную той, какую допускаем, когда обращаемся с кубом как с поверхностью, потому что он обладает свойствами поверхности. Я считаю абсолютной необходимостью уяснить этот факт, если мы хотим построить науку человеческой природы.

   Мы можем представить разные классы жизни тремя координатами жизни. Минералы с их неорганической деятельностью мы относим к нулевому (0) измерению «жизни» – ·_безжизненный_· класс – и обозначаем его точкой ·_M_· ⁅·_Minerals_·⁆.

   Растения с их «автономным» ростом мы представляем ⬩**одномерной**⬩ линией ·_MP_· ⁅·_Plants_·⁆.

   Животных с их «автономной» способностью расти и действовать в пространстве мы представляем ⬩**двухмерной**⬩ плоскостью ·_PAM_· ⁅·_Animals_·⁆.

   Людей с их «автономной» способностью расти, действовать в пространстве ⬩**и действовать во времени**⬩ мы представляем ⬩**трёхмерной**⬩ областью ·_MAPH_· ⁅·_Humans_·⁆.
""".trimIndent()

val chapter_3_text_2 = """
    
   Не следует принимать такое схематическое представление буквально. Диаграммы служат своего рода фигурами речи; они приносят пользу, если их понимать, и могут навредить, если их не понимать. Я рекомендую читателю подумать над простой идеей измерений, чтобы ясно увидеть, что мы пользуемся ей не просто из интереса или для удобства, а применяем её как необходимое средство отличения основных классов жизни друг от друга и осмысления того, что каждый класс собой представляет, чтобы не путать его с чем-то радикально иным.

   Читатель сможет извлечь существенную пользу, уединившись и глубоко поразмыслив о следующем. Линия обладает одним измерением; плоскость двумя. Плоскость содержит линии и, следовательно, обладает линейными свойствами, – ·_одно_·мерными свойствами. Однако она обладает и другими, ·_двух_·мерными, свойствами, которые её характеризуют и делают её тем, что она есть – плоскостью, а не линией.

   Животные тоже обладают некоторыми свойствами растений, – например, они растут – но также другими свойствами – например, автономной способностью перемещаться – более высокой размерности или типа, и именно эти свойства делают животных ·_животными_·, а не растениями.

   Сообразно, люди обладают некоторыми свойствами животных, – например, автономной способностью перемещаться, или физическими потребностями – но вместе с ними и другими свойствами или наклонностями, – например, чувством этики, логики, изобретательностью, прогрессивностью – свойствами и наклонностями более высокой размерности, уровня или типа, и именно эти наклонности или способности составляют человеческую ·_человечность_· и ·_отличают_· человека от животного.

   Только чётко увидев и должным образом поняв этот факт, мы можем начать строить ·_человеческую науку_· – науку и искусство ·_человеческой природы_·. Тогда и только тогда мы сможем начать уходить от вековых неизмеримых зол, происходящих от обращения с людьми как с животными, как с простыми пространство-связующими. Мы сможем ожидать этики, юриспруденции, экономики, правительства, – науки и искусства человеческой жизни и общества – основанных на законах человеческой природы благодаря адекватной концепции человечества как время-связующего класса жизни, по своей судьбе бесконечно творящего и развивающего благо в реализации потенциалов Человеческой Природы.[¹](https://teletype.in/@czoc/RcEqO73A8I2#Qh1F)

   Человечество по-прежнему остаётся в своём детстве. Мы «связали» так мало времени за века, которые кажутся такими короткими в масштабах вселенной. В основе всякой человеческой деятельности, исторического факта или тенденции цивилизации лежит некоторая доктрина или концепция так называемой «истины». Яблоки падали с деревьев веками без важных результатов в организации человечества. Падение яблока на голову Ньютона привело к открытию теории гравитации, которая изменила наши представления о всём мире, наши науки и нашу деятельность. Она значительно простимулировала развитие всех дисциплин естественного и технологического знания. Несмотря на то что законы Ньютона оказались не совсем корректными, они послужили великой цели нашего понимания природных явлений в достаточной мере, чтобы сделать возможной современную технологию и прийти в наших естественных науках к необходимым корректировкам законов Ньютона.

   Подобные органические перемены в нашей концепции человеческой жизни и её явлений подразумеваются под вышеизложенными определениями классов жизни. С их помощью мы исправим основательные ошибки и заменим их научными истинами фундаментальной важности. Мы сформируем основу для научного развития постоянной цивилизации, вместо периодических так называемых цивилизаций прошлого и настоящего. Зная причины зла и ошибок, мы найдём средства избавиться от них.

   Сноски
   ------

   1\. [⇧](https://teletype.in/@czoc/RcEqO73A8I2#nIrB)Кто-то может возразить, сказав, что животные тоже «прогрессируют» или «связывают время». Такое применение слов представляет собой не более чем пустословие – разговор о словах, перебор догадок, не имеющих никакого отношения к ·_фактам_· или корректному мышлению, в которых мы не смешиваем измерения. Особую, уникально человеческую способность, которую я называю время-связыванием, я чётко определил в следующей главе как ·_экспоненциальную функцию времени_·. Если людям хочется говорить о «прогрессе» животных, у них не получится не увидеть ясно, что он отличается как функцией, так и типом, или измерением, от того, что мы обоснованно имеем в виду, когда говорим о человеческом прогрессе. Человеческая время-связующая способность реализуется в измерении, совершенно отличном от животного измерения. Поэтому, если кто-то желает говорить о животном «прогрессе» или животном «время-связывании», следует подобрать подходящее для этого слово, чтобы предостеречься от ошибки спутывания или смешивания измерений.

   Это математическое различение между классами, типами, измерениями играет важнейшую роль в естественных науках, где учитывается трансформизм. Приспособление теории Дарвина к размерности представляет в некотором роде более трудную проблему, в которой учитывается концепция «континуума», но благодаря современной теории Де Фриза эти вещи стали очевидными. Если животные действительно прогрессируют, – что я считаю сомнительным, учитывая, что они представляют более старую форму жизни, чем человек – и мы не видим заметного прогресса, то их прогресс идёт так медленно, что математическими терминами мы можем назвать его ·_пренебрежимо_· бесконечно малым высшего порядка.
   
   * * *
   
""".trimIndent()