package com.littlelemon.menu

class SortHelper {

    fun sortProducts(type: SortType, productsList: List<ProductItem>): List<ProductItem> {
        return when (type) {
            SortType.Alphabetically -> productsList.sortAlphabetically()
            SortType.PriceAsc -> productsList.sortPriceAscendingly() // TODO("create extension function for List<Product> with sorting based on price ascending")
            SortType.PriceDesc -> productsList.sortPriceDescendingly() // TODO("create extension function for List<Product> with sorting based on price descending")
        }
    }

    private fun List<ProductItem>.sortAlphabetically(): List<ProductItem> {
        return sortedBy { it.title }
    }
    // step-07:
    private fun List<ProductItem>.sortPriceAscendingly(): List<ProductItem> {
        return sortedBy { it.price }
    }

    private fun List<ProductItem>.sortPriceDescendingly(): List<ProductItem> {
        return sortedByDescending { it.price }
    }
}