package com.example.koinexample

import com.example.koinexample.ui.theme.MainRepoInterface
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    // singletons
    single {
        // we could also just create the retrofit instance here as well
        RetrofitInstance.retrofitInstance
    }
    // get() gets the instance of what has already been created
    single<MainRepoInterface> {
        RepositoryImpl(get())
    }

    // viewModel & make sure to import the right view model instance
    viewModel {
        MainViewModel(get())
    }

    /* used to create a new instance of an object everytime it is requested.
    Implements the factory design pattern
    */
//    factory {
//    }
}