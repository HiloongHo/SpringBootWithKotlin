package com.example.demo02.service

import com.example.demo02.datasource.BankDataSource
import com.example.demo02.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {
    fun getBanks(): Collection<Bank> = dataSource.retriveveBanks()
}