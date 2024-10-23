package com.example.demo02.controller

import com.example.demo02.model.Bank
import com.example.demo02.service.BankService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/banks")
class BankController(private val service:BankService) {
    @GetMapping
    fun getBanks(): Collection<Bank> = service.getBanks()
}