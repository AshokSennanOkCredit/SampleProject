package com.example.sampleproject.model

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.airbnb.epoxy.ModelProp
import com.airbnb.epoxy.ModelView
import com.example.sampleproject.R
import kotlinx.android.synthetic.main.child_item.view.*

@ModelView(autoLayout = ModelView.Size.MATCH_WIDTH_WRAP_HEIGHT)
class ChildModel @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyle:Int = 0
):ConstraintLayout(context,attributeSet,defStyle) {

    init {
        LayoutInflater.from(context).inflate(R.layout.child_item,this,true)
    }

    @ModelProp
    fun setGameName(gameName:String){
        textView4.text = gameName
    }
}