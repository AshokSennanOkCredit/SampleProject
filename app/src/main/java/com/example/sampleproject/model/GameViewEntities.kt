package com.example.sampleproject.model

import java.util.concurrent.atomic.AtomicInteger

private val globalId = AtomicInteger(1)


data class Genre(var genreName:String="",var gameList:List<Game>?=null,var isExpanded:Boolean = false)
data class Game(val gameName:String)