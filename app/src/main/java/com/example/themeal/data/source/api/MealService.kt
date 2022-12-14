package com.example.themeal.data.source.api

import com.example.themeal.data.model.AreaResponse
import com.example.themeal.data.model.CategoryResponse
import com.example.themeal.data.model.IngredientResponse
import com.example.themeal.data.model.MealResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface MealService {

    @GET("search.php")
    suspend fun getMealByName(@Query("s") name: String): MealResponse

    @GET("search.php")
    suspend fun getMealByFirstLetter(@Query("f") letter: String): MealResponse

    @GET("lookup.php")
    suspend fun getMealDetail(@Query("i") id: String): MealResponse

    @GET("categories.php")
    suspend fun getCategory(): CategoryResponse

    @GET("list.php?i=list")
    suspend fun getListIngredient(): IngredientResponse

    @GET("filter.php")
    suspend fun getMealByCategory(@Query("c") name: String): MealResponse

    @GET("list.php?a=list")
    suspend fun getArea(): AreaResponse
}
