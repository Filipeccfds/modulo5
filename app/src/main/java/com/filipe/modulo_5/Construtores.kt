package com.filipe.modulo_5

import kotlin.random.Random

class Construtores {
}

fun main(){
    var acount = Account("JORGE")
    acount.print()


}

class Account(name:String){
    private var balance:Double
    var name:String
    var endereco:String
    private var id:Int

            init{
                this.name = name
                this.balance = 0.0
                this.endereco = ""
                this.id = Random.nextInt(0,15000)
            }
    fun getBalance() = this.balance

    fun add(ammount: Double){
        balance = balance + ammount
    }

    fun remove(ammount: Double):Double{
        balance = balance - ammount
        if (balance< 0){
            balance = 0.0
        }
        return balance
    }

    fun print() { println("valor: $balance, nome: $name, id: $id")}
}