package com.example.sampleproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.sampleproject.model.*
import kotlinx.android.synthetic.main.activity_expandable_recy_cle_view_epoxy.*

class ExpandableRecyCleViewEpoxy : AppCompatActivity(), HeaderModel.OnGenreExpanded {
    val genreList = ArrayList<Genre>()
    val gameList = ArrayList<Game>()

    lateinit var expandableRecycController: ExpandableRecycController

    override fun onExpand(genre: Genre) {
        if(genre.isExpanded) genre.isExpanded = false
        else genre.isExpanded = true
        Log.d("click","item")
        expandableRecycController.setGenreValue(genreList)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expandable_recy_cle_view_epoxy)
        setRecycView()
    }

    fun setRecycView(){
        expandableRecycController = ExpandableRecycController(this)

        gameList.add(Game("Age of Empire1"))
        gameList.add(Game("Age of Empire2"))
        gameList.add(Game("Age of Empire3"))
        gameList.add(Game("Age of Empire4"))
        gameList.add(Game("Age of Empire5"))
        genreList.add(Genre(genreName = "Build Empire",gameList = gameList,isExpanded = false))
        genreList.add(Genre(genreName = "Build Empire",gameList = gameList,isExpanded = false))
        genreList.add(Genre(genreName = "Build Empire",gameList = gameList,isExpanded = false))
        genreList.add(Genre(genreName = "Build Empire",gameList = gameList,isExpanded = false))
        genreList.add(Genre(genreName = "Build Empire",gameList = gameList,isExpanded = false))
        genreList.add(Genre(genreName = "Build Empire",gameList = gameList,isExpanded = false))
        recyclerView.adapter = expandableRecycController.adapter
        expandableRecycController.setGenreValue(genreList)

    }
}
