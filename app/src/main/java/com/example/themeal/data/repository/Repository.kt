package com.example.themeal.data.repository

import com.example.themeal.data.model.AreaResponse
import com.example.themeal.data.model.CategoryResponse
import com.example.themeal.data.model.IngredientResponse
import com.example.themeal.data.model.MealCollapse
import com.example.themeal.data.model.MealResponse
import com.example.themeal.data.model.RecentSearch
import com.example.themeal.util.DataResult

interface Repository {

    interface MealRepository {
        suspend fun getMealByFirstLetter(letter: String): DataResult<MealResponse>

        suspend fun getMealByName(name: String): DataResult<MealResponse>

        suspend fun getArea(): DataResult<AreaResponse>

        suspend fun getCategories(): DataResult<CategoryResponse>

        suspend fun getListMealRecent(): DataResult<List<MealCollapse>>

        suspend fun getListIngredient(): DataResult<IngredientResponse>
    }

    interface RecentSearchRepository {
        suspend fun getAllKeyWord(): DataResult<List<RecentSearch>>

        suspend fun addNewKeyWord(recentSearch: RecentSearch): DataResult<Unit>

        suspend fun deleteKeyWord(recentSearch: RecentSearch): DataResult<Unit>
    }
}
