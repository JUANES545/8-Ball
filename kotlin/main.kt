//Answers
const val POSITIVE_ANSWER = "✅"
const val NEGATIVE_ANSWER = "❌"
const val DOUBTFUL_ANSWER = "?"

//mapping answers
val answers = mapOf(
    "Yes" to POSITIVE_ANSWER,
    "It's true" to POSITIVE_ANSWER,
    "Totally" to POSITIVE_ANSWER,
    "Without a doubt" to POSITIVE_ANSWER,
    "Ask again later" to DOUBTFUL_ANSWER,
    "I can't answer that right now" to DOUBTFUL_ANSWER,
    "Maybe" to DOUBTFUL_ANSWER,
    "It's not going to happen" to NEGATIVE_ANSWER,
    "Don't count on that" to NEGATIVE_ANSWER,
    "Definitely" to NEGATIVE_ANSWER,
    "I don't think so" to NEGATIVE_ANSWER,
)

fun main(args: Array<String>) {
    //Mapa inmutable
    val edadDeSuperHeroes = mapOf(
        "IronMan" to 35,
        "SpiderMan" to 23,
        "Capitan America" to 99
    )
    println(edadDeSuperHeroes)

    //mapa mutable
    val edadSuperHeroesMutable = mutableMapOf(
        "IronMan" to 35,
        "SpiderMan" to 23,
        "Capitan America" to 99
    )

    //Formas de agregar elementos al map mutable
    edadSuperHeroesMutable.put("Wolverine",45) //agrega mas elementos al map mutable
    println(edadSuperHeroesMutable)

    edadSuperHeroesMutable["IronMan"] = 9 //otra manera más óptima de hacerlo
    println(edadSuperHeroesMutable)

    val edadIronMan = edadSuperHeroesMutable["IronMan"] //optiene un elemento
    println(edadIronMan)

    edadSuperHeroesMutable.remove("Wolverine") // eliminar un elemento de map
    println(edadSuperHeroesMutable)

    println(edadSuperHeroesMutable.keys) //imprime solo los nombres de los heroes
    println(edadSuperHeroesMutable.values) // imprime solo las edades
}

fun answersType(type: String = "ALL") {
    val printAnswers: (Map<String, String>) -> Unit = {
        it.keys.forEach { answer -> println(answer) }
    }
    when(type) {
        "ALL" -> answers.keys.forEach { answer -> println(answer) }
        POSITIVE_ANSWER -> answers.filterValues { value -> value == POSITIVE_ANSWER }
            .also { printAnswers(it) }
        NEGATIVE_ANSWER -> answers.filterValues { value -> value == NEGATIVE_ANSWER }
            .also { printAnswers(it) }
        DOUBTFUL_ANSWER -> answers.filterValues { value -> value == DOUBTFUL_ANSWER }
            .also { printAnswers(it) }
        else -> println("Error, bye.")
    }
}

fun exit() {
    println("See you later.")
}

fun showError() {
    println("There was an error... :/")
}

fun miFuncion( nombre: String,  apellido: String) = nombre + apellido
