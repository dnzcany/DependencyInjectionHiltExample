package com.denobaba.daggerhilt3

import javax.inject.Inject

class Musician @Inject constructor(instrument: Instrument,band: Band) {

    fun sing(){
        println("I am singing")
    }
}