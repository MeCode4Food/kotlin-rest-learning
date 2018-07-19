package com.example.learningkotlin

import org.springframework.beans.factory.annotation.Autowired

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/journal")
class JournalController {

    @Autowired
    private lateinit var journalRepository: JournalRepository

    @PostMapping("/add", consumes = ["application/json"])
    @ResponseBody fun addNewJournal(@RequestBody reqString: String): String{

        /*val journal = Journal()
        journal.setTitle(title)
        journal.setDate("")
        journal.setContent(journalContent)
        journalRepository.save(journal)*/
        return reqString
    }

    @GetMapping("/all")
    @ResponseBody fun getAllJournals(): Iterable<Journal> {
        return journalRepository.findAll()
    }
}