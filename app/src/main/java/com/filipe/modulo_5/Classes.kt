package com.filipe.modulo_5

class Classes {
}

fun main(){
    val aluno = Person()
    val aluno2:Person = Person()

    aluno.name = "joao"
    aluno.ola("ola")

}

class Team{
    var player: MutableList<Person> = mutableListOf()
    var name: String = ""

    fun getAllPlayer(size: Int):List<Person>{
        return this.player.filter {person -> person.name.length > size }
    }

    fun  printAll():Unit{
        return  player.forEach {
            playess -> println(playess.emailWithPhone())
        }
    }

}

class Person{
    var name: String = ""
    var age: Int = 0
    var email: String = ""
    var phone: String = ""

    fun emailWithPhone():String{
         return "${this.name} junto com o ${this.email}"
    }

    fun oldThan(terget: Int): Boolean{
        return this.age >terget
    }

    fun ola(hello : String){
        println("$hello como vai ${this.name}")
    }
}