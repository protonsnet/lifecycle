package net.psistemas.livecycle.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import net.psistemas.livecycle.domain.CounterRepository

class CounterRepositoryImpl : CounterRepository {
    private val counter = MutableLiveData(0)

    override fun getCounter(): LiveData<Int> = counter

    override fun incrementCounterBu(incrementBy: Int){
        val number = counter.value ?: 0
        counter.value = number + incrementBy
    }
}
