package com.example.sampleproject.model

import com.example.sampleproject.R

data class User(val title:String, val description:String, val imageId:Int){
    companion object{
        fun getSampleUser():MutableList<User>{
            val userList:MutableList<User> = mutableListOf()
            for(i in 1..50){
                userList.add(User(title = "User $i",description = "description $i", imageId = R.drawable.ic_announcement_black_24dp))
            }
            return userList
        }
    }
}