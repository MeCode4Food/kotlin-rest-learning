package com.example.learningkotlin

import org.springframework.data.repository.CrudRepository

interface JournalRepository : CrudRepository<Journal, Long> {

}