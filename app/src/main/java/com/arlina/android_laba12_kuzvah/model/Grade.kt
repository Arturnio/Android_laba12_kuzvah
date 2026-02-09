package com.arlina.android_laba12_kuzvah.model

import androidx.annotation.DrawableRes

data class Grade(
    @DrawableRes val imageId: Int,
    val pointsPerClick: Int,
    val threshold: Int
)