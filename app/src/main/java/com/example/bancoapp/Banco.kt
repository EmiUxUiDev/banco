package com.example.bancoapp

data class Banco(val nome:String, val numero:Int)
{
    fun Info() = "$nome e $numero"
}