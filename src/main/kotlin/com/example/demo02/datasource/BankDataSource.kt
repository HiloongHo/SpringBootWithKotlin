package com.example.demo02.datasource

import com.example.demo02.model.Bank

interface BankDataSource {
    fun retriveveBanks(): Collection<Bank>
}