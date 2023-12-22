package com.example.mydaggerexample.example2.data.di

import com.example.mydaggerexample.example2.data.repository.ExampleRepositoryImpl
import com.example.mydaggerexample.example2.domain.ExampleRepository
import dagger.Binds
import dagger.Module

@Module
interface DomainModule {

    @Binds
    fun bindExampleRepository(impl: ExampleRepositoryImpl): ExampleRepository
}