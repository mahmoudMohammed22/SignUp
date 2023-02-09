package com.example.taskapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ItemViewModel : ViewModel() {

    val firstName = MutableLiveData<String>()
    val lastName = MutableLiveData<String>()
    val email = MutableLiveData<String>()
    val phoneNumber = MutableLiveData<String>()

    init {
        // to make data empty
        rasterData()
    }


    fun rasterData(){

        firstName.value = ""
        lastName.value = ""
        email.value = ""
        phoneNumber.value = ""

    }

    fun isVaildEntry(firstName:String,lastName:String,email:String,phoneNumber :String): Boolean{
        return firstName.isNotBlank() && lastName.isNotBlank() &&
                email.isNotBlank()&& phoneNumber.isNotBlank()

    }


}