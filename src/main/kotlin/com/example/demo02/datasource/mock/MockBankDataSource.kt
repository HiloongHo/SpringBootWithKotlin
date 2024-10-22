package com.example.demo02.datasource.mock

import com.example.demo02.datasource.BankDataSource
import com.example.demo02.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {
    val  banks = listOf(
        Bank("123", 1.0, 1),
        Bank("124", 2.0, 2),
        Bank("125", 3.0, 3),
        Bank("126", 4.0, 4)
    )
    override fun retriveveBanks(): Collection<Bank> {
        return banks
    }
}