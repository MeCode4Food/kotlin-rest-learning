package com.example.learningkotlin

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Journal{
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private var id: Int = 0

    private lateinit var name: String
    private lateinit var email: String

    fun getId(): Int{
        return id
    }

    fun setId(id: Int){
        this.id = id
    }

    fun setName(name: String){
        this.name = name
    }

    fun getEmail(): String {
        return email
    }

    fun setEmail(email: String){
        this.email = email
    }

}