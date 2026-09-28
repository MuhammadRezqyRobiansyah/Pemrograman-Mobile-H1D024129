package com.jualan.robiansyah.network

import com.jualan.robiansyah.data.model.Category
import com.jualan.robiansyah.data.model.Product
import com.jualan.robiansyah.util.JualanConstants.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiInterface {
    @GET("data/categories.json")
    suspend fun getCategories(): List<Category>

    @GET("data/products.json")
    suspend fun getProducts(): List<Product>
}

object ApiClient {
    val instance: ApiInterface by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiInterface::class.java)
    }
}
