package com.wisewords.quotify.endpoints

import com.wisewords.quotify.repository.all.AllCategory
import com.wisewords.quotify.repository.exceptall.ExceptAllCategory
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface GetCategory {

    @Headers(
        "X-RapidAPI-Key: 9a6b2cdd3dmsh2b1e442a70addb0p140514jsnec84707b61f2",
        "X-RapidAPI-Host: famous-quotes4.p.rapidapi.com"
    )
    @GET("/random")
    suspend fun getAllQuotes(@Query("category") category: String, @Query("count") count: Int ):Response<AllCategory>

    @Headers(
        "X-RapidAPI-Key: 9a6b2cdd3dmsh2b1e442a70addb0p140514jsnec84707b61f2",
        "X-RapidAPI-Host: famous-quotes4.p.rapidapi.com"
    )
    @GET("/random")
    suspend fun getExceptAllQuotes(@Query("category") category: String, @Query("count") count: Int ):Response<ExceptAllCategory>

}