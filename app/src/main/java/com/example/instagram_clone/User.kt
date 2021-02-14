package com.example.instagram_clone

import java.io.Serializable

data class User (
        val coventryId : Int? = null,
        val firstName : String? = null,
        val lastName : String? = null,
        val userName : String? = null,
        val passWord : String? = null

        ):Serializable