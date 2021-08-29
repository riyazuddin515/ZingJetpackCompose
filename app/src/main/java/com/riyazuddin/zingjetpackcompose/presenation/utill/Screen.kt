package com.riyazuddin.zingjetpackcompose.presenation.utill

sealed class Screen (val route: String){
    object LoginScreen: Screen("login_screen")
    object RegisterScreen : Screen("register_screen")
    object FeedScreen: Screen("feed_screen")
    object ChatScreen: Screen("chat_screen")
    object MessageScreen: Screen("message_screen")
    object ActivityScreen: Screen("activity_screen")
    object SearchScreen: Screen("search_screen")
    object ProfileScreen: Screen("profile_screen")
    object EditProfileScreen: Screen("edit_profile_screen")
    object CreatePostScreen: Screen("create_post_screen")
    object PostDetailScreen: Screen("post_detail_screen")
}