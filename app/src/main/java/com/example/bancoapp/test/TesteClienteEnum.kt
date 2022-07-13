package com.example.bancoapp.test

import com.example.bancoapp.ClienteTipo

fun main(){
    ClienteTipo.values().forEach {
        print("${it.name} - $it - ")
    }
}