package net.psistemas.livecycle.domain

import androidx.lifecycle.LiveData

interface CounterRepository {
    fun getCounter(): LiveData<Int>

    fun incrementCounterBu(incrementBy: Int)

}