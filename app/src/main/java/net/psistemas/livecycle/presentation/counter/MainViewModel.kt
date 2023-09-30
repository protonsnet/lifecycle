package net.psistemas.livecycle.presentation.counter

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import net.psistemas.livecycle.data.CounterRepositoryImpl
import net.psistemas.livecycle.domain.CounterRepository

class MainViewModel(
    private val repository: CounterRepository
) : ViewModel() {

    val counter: LiveData<Int> = repository.getCounter()

    var incrementBy = 1

    fun increment(){
        repository.incrementCounterBu(incrementBy)
    }
}

