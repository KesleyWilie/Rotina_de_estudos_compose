package com.kw.rotinadeestudoscompose

object Repository {
    val rotina: MutableMap<String, MutableList<String>> = mutableMapOf(
        "Segunda-feira" to mutableListOf("Matemática - 08:00", "Português - 10:00"),
        "Terça-feira" to mutableListOf("História - 09:00"),
        "Quarta-feira" to mutableListOf("Física - 14:00"),
        "Quinta-feira" to mutableListOf("Química - 11:00"),
        "Sexta-feira" to mutableListOf("Inglês - 10:00"),
        "Sábado" to mutableListOf("Revisão geral - 09:00"),
        "Domingo" to mutableListOf("Descanso")
    )
}