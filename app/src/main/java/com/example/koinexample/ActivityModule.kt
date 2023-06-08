package com.example.koinexample

import org.koin.core.qualifier.named
import org.koin.dsl.module

val activityModule = module {
    scope<MainActivity> {
        scope(qualifier = named("hello")) {"Hello"}
        scope(qualifier = named("bye")) {"Bye"}
    }
}