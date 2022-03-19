package com.example.test

sealed class BottomNavItem(var title:String, var icon:Int, var screen_route:String){

    object Home: BottomNavItem("홈", R.drawable.ic_baseline_home_24, "home")
    object Favorite: BottomNavItem("구독", R.drawable.ic_baseline_favorite_24,"favorite")
    object Coupon: BottomNavItem("쿠폰", R.drawable.ic_baseline_style_24,"coupon")

}
