package net.psistemas.livecycle

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import net.psistemas.livecycle.data.CounterRepositoryImpl
import net.psistemas.livecycle.presentation.SecondViewModel
import net.psistemas.livecycle.presentation.counter.MainViewModel

class ViewModelFactory : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
        if (modelClass == MainViewModel::class.java){
            return MainViewModel(repository = CounterRepositoryImpl()) as T
        }
        if (modelClass == SecondViewModel::class.java){
            return SecondViewModel() as T
        }
        throw IllegalArgumentException("Unknown ViewModel Instance for $modelClass")
    }

}