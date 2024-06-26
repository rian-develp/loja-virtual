package com.example.lojavirtual.database

import com.example.lojavirtual.model.Recipes

class MyDatabase: MyDatabaseImpl {

    private val userData = ArrayList<String>()
    private val recipesData = ArrayList<Recipes>()

    companion object {
        private val database: MyDatabase = MyDatabase()

        fun getInstance(): MyDatabase{
            return database
        }
    }

    override fun saveDataUser(data: String, data2: String) {
        userData.add(data)
        userData.add(data2)
    }

    override fun saveDataRecipe(recipes: Recipes) {
        recipesData.add(recipes)
    }

    override fun deleteDataUser() {
        userData.clear()
    }

    override fun deleteDataRecipes() {
        recipesData.clear()
    }

    fun loginValidate(data1: String, data2: String): Boolean{

        var resp = false

        for (i in 0 until userData.size){
            if(data1.equals(userData.get(i)) && data2.equals(userData.get(i))){
                resp = true
            } else {
                resp = false
            }
        }

        return resp
    }
}