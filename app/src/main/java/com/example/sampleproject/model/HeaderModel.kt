package com.example.sampleproject.model

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.airbnb.epoxy.CallbackProp
import com.airbnb.epoxy.ModelProp
import com.airbnb.epoxy.ModelView
import com.example.sampleproject.R
import kotlinx.android.synthetic.main.viewholder_header.view.*

@ModelView(autoLayout = ModelView.Size.MATCH_WIDTH_WRAP_HEIGHT)
class HeaderModel @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    deffStyle:Int = 0
):ConstraintLayout(context,attributeSet,deffStyle) {
    init {
        LayoutInflater.from(context).inflate(R.layout.viewholder_header,this,true)
    }
    private lateinit var genreValue:Genre

    @ModelProp
    fun setGenre(genre: Genre){
        this.genreValue = genre
    }

    @ModelProp
    fun setGenreText(genre:String){
        textView3.text = genre
    }

    @CallbackProp
    fun onExpandCallBack(listener:OnGenreExpanded?){
        rootView.setOnClickListener {
            listener?.onExpand(genreValue)
        }
    }
    interface OnGenreExpanded{
        fun onExpand(genre:Genre)
    }

}