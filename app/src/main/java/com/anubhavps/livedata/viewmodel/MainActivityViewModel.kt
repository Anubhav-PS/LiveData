package com.anubhavps.livedata.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {


    var counter = MutableLiveData<Int>()

    init {
        counter.value = 0
    }

    fun incrementValue(num: Int) {
        counter.value = (counter.value)?.plus(num)
    }


}