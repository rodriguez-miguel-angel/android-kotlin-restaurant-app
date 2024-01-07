package com.littlelemon.menu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class ProductActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // task-05: In Object declaration, see Activities with arguments and Implementing start function in an Activity
        val title = intent.getStringExtra(KEY_TITLE)!!
        val price: Double = intent.getDoubleExtra(KEY_PRICE, 0.0)
        val category = intent.getStringExtra(KEY_CATEGORY)!!
        val image = intent.getIntExtra(KEY_IMAGE, -1)

        /*
        version-00:
        val productItem =
            ProductItem("", 0.0, "", -1)//todo replace with the passed values from intent
         */
        val productItem =
            ProductItem(title, price, category, image)//todo replace with the passed values from intent
        setContent { ProductDetails(productItem) }
    }

    // task-03:
    companion object {
        const val KEY_TITLE = "title"
        const val KEY_PRICE = "price"
        const val KEY_IMAGE = "image"
        const val KEY_CATEGORY = "category"
    }
}