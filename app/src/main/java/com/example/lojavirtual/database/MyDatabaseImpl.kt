package com.example.lojavirtual.database

import com.example.lojavirtual.model.Recipes
import com.example.lojavirtual.model.User

interface MyDatabaseImpl {
    fun saveDataUser(data: String, data2: String)
    fun saveDataRecipe(recipes: Recipes)
    fun deleteDataUser()
    fun deleteDataRecipes()
}