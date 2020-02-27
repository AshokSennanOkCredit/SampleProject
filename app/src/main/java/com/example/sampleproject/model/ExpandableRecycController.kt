package com.example.sampleproject.model

import android.util.Log
import com.airbnb.epoxy.EpoxyController
import com.example.sampleproject.ExpandableRecyCleViewEpoxy

class ExpandableRecycController(val expandableRecyCleViewEpoxy: ExpandableRecyCleViewEpoxy):EpoxyController() {
     var genre:List<Genre> = listOf()

    fun setGenreValue(genreValue: List<Genre>){
        genre = genreValue
        Log.d("==>","genre")
        requestModelBuild()
    }

    override fun buildModels() {
        Log.d("==>","buildModels")
        genre.forEachIndexed { index, genre ->
            headerModel {
                id(index)
                genre(genre)
                genreText(genre.genreName)
                onExpandCallBack(expandableRecyCleViewEpoxy)
            }
            if(genre.isExpanded){
                genre.gameList?.forEachIndexed { index, game ->
                    childModel {
                        id(index*10)
                        gameName(game.gameName)
                    }
                }
            }
        }

    }
}