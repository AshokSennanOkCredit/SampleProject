package com.example.sampleproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.sampleproject.model.ModelViewSetUp
import com.example.sampleproject.model.ModelViewSetUpModel_
import com.example.sampleproject.model.User
import com.example.sampleproject.model.modelViewSetUp
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        epoxy.buildModelsWith {
            it.apply {
                User.getSampleUser()
                    .forEachIndexed { index, user ->
                        modelViewSetUp {
                            id(index)
                            image(user.imageId)
                            description(user.description)
                            title(user.title)
                            itemClickListener {model: ModelViewSetUpModel_?, parentView: ModelViewSetUp?, clickedView: View?, position: Int ->
                                Toast.makeText(this@MainActivity,"You clicked on item ${user.title}",Toast.LENGTH_SHORT).show()
                            }
                        }
                    }
            }
        }


    }
}
