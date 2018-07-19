package com.example.learningkotlin

import java.text.SimpleDateFormat
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Journal{
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private var id: Int = 0

    private lateinit var title: String
    private var date = Date()
    private lateinit var content: String

    fun getId(): Int{
        return id
    }

    fun setId(id: Int){
        this.id = id
    }

    fun getTitle(): String{
        return title
    }

    fun setTitle(title: String){
        this.title = title
    }

    fun setDate(dateString: String){
        val dateParser = SimpleDateFormat("dd-MM-yyyy")

        try {
            if(!dateString.isEmpty()){
                this.date = dateParser.parse(dateString)
            }
            else{
                this.date = Date()
            }
        }
        catch (e: Error){
            println("dateString $dateString unparseable to date format")
        }
    }

    fun getContent(): String {
        return content
    }

    fun setContent(email: String){
        this.content = email
    }

}