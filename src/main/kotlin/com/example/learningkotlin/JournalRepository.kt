package com.example.learningkotlin

import com.example.learningkotlin.Journal
import org.springframework.data.repository.CrudRepository

abstract class JournalRepository : CrudRepository<Journal, Long> {

}