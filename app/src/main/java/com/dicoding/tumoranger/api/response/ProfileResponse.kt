package com.dicoding.tumoranger.api.response

data class ProfileResponse(
    val status: Int,
    val message: String,
    val data: ProfileData
)

data class ProfileData(
    val username: String,
    val email: String
)
