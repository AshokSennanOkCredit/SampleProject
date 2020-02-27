package com.example.sampleproject.model

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.airbnb.epoxy.CallbackProp
import com.airbnb.epoxy.ModelProp
import com.airbnb.epoxy.ModelView
import com.airbnb.epoxy.TextProp
import com.example.sampleproject.R

@ModelView(autoLayout = ModelView.Size.MATCH_WIDTH_WRAP_HEIGHT)
class ModelViewSetUp @JvmOverloads constructor(context: Context, attributeSet: AttributeSet?= null, defStyle:Int = 0):ConstraintLayout(context,attributeSet,defStyle) {
    private val rootLayout:ConstraintLayout
    private val imageView:ImageView
    private val textView: TextView
    private val textView2:TextView

    init{
        View.inflate(context, R.layout.single_food_layout,this)
        rootLayout = findViewById(R.id.root)
        imageView = findViewById(R.id.imageView)
        textView = findViewById(R.id.textView)
        textView2 = findViewById(R.id.textView2)
    }

    @ModelProp
    fun setTitle(title:String){
        textView.text = title
    }

    @ModelProp
    fun setDescription(description:String){
        textView2.text = description
    }

    @ModelProp
    fun setImage(id:Int){
        imageView.setImageResource(id)
    }

    @CallbackProp
    fun setItemClickListener(listener:OnClickListener?){
        rootLayout.setOnClickListener {
            listener
        }
    }

}