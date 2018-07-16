package com.example.learningkotlin

import org.springframework.beans.factory.annotation.Autowired

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/journal")
class JournalController {

    @Autowired
    private lateinit var journalRepository: JournalRepository

    @GetMapping("/greeting")
    @ResponseBody fun addNewJournal(@RequestParam name: String, @RequestParam email: String): String{

        val journal = Journal(name, email)
        journalRepository.save(journal)
        return "Saved"
    }

    @GetMapping("/all")
    @ResponseBody fun getAllJournals(): Iterable<Journal> {
        return journalRepository.findAll()
    }
}