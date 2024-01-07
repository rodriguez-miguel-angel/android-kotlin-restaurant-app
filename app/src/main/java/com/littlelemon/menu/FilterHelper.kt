package com.littlelemon.menu

class FilterHelper {//TODO create a FilterHelperTest and write a unit test for filterProducts

    // step-06
    fun filterProducts(type: FilterType, productsList: List<ProductItem>): List<ProductItem> {
        return when (type) {
            FilterType.All -> productsList
            FilterType.Dessert -> productsList.filter { productItem -> productItem.category == "Dessert" } // TODO("only products with category equal to Dessert")
            FilterType.Drinks -> productsList.filter { productItem -> productItem.category == "Drinks" } // TODO("only products with category equal to Drinks")
            FilterType.Food -> productsList.filter { productItem -> productItem.category == "Food" } // TODO("only products with category equal to Food")
        }
    }

}