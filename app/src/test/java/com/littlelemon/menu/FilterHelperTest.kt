package com.littlelemon.menu

import org.junit.jupiter.api.Assertions.*
import org.junit.Test

import org.junit.Assert.*
import org.junit.jupiter.api.Assertions

// task-08: In Testing, see Unit testing in Kotlin
class FilterHelperTest  {

    private val classUnderTest = FilterHelper()
    @Test
    fun filterProducts_filterTypeDessert_croissantReturned() {
        val sampleProductsList = mutableListOf(
            ProductItem(title = "Black tea", price = 3.00, category = "Drinks", R.drawable.black_tea),
            ProductItem(title = "Croissant", price = 7.00, category = "Dessert", R.drawable.croissant),
            ProductItem(title = "Bouillabaisse", price = 20.00, category = "Food", R.drawable.bouillabaisse)
        )
        val actual: String = classUnderTest.filterProducts(FilterType.Dessert ,sampleProductsList)[0].title
        val expected: String = "Croissant"
        Assertions.assertEquals(expected, actual)
    }
}