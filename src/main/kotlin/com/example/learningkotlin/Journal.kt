package com.example.learningkotlin

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


@Entity
data class Journal(
    val name: String,
    var email: String
){
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    var id: Int = 0

    fun getFunnyString(id: Int): String{
        return id.toString() + " " + this.name + " " + this.email
    }
}