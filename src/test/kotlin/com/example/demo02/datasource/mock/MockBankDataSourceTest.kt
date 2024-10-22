   package com.example.demo02.datasource.mock

   import org.junit.jupiter.api.Assertions.*
   import org.junit.jupiter.api.Test

   class MockBankDataSourceTest {
       private  val mockDataSource = MockBankDataSource()
       @Test
       fun shouldProvideACollectionOfBanks() {
           val banks = mockDataSource.retriveveBanks()
           assertNotNull(banks)
       }
   }