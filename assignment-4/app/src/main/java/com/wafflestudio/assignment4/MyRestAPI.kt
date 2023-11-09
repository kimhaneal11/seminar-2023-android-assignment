package com.wafflestudio.assignment4

import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Path

interface MyRestAPI {
    @GET("/3/authentication")
    public abstract suspend fun getLogin(@Header("Authorization") authorization: String): DataLoginAnswer

    @GET("/3/movie/popular")
    public abstract suspend fun getMovie(@Header("Authorization") authorization: String): DataMovieAnswer
}