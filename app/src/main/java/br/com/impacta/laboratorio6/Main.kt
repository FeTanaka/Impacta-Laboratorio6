package br.com.impacta.laboratorio6

fun main() {
    var idade: Int = 33
    var nota: Double = 7.0

    println(funcaoComIf(idade, nota))
    println(funcaoComWhen(idade, nota))
}

fun funcaoComIf(idade: Int, nota: Double): String {
    return if (idade >= 18) {
        if (nota >= 7.0) "Usuário aprovado."
        else "Usuário reprovado"
    } else {
        "Usuário menor de idade, não pode dirigir."
    }
}

fun funcaoComWhen(idade: Int, nota: Double): String {
    return when {
        idade >= 18 && nota >= 7.0 -> "Usuário aprovado."
        else -> "Usuário reprovado."
    }
}