package com.riyazuddin.zingjetpackcompose.presenation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import com.riyazuddin.zingjetpackcompose.R
import com.riyazuddin.zingjetpackcompose.presenation.ui.theme.ZingJetpackComposeTheme
import com.riyazuddin.zingjetpackcompose.presenation.utill.Navigation
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setTheme(R.style.Theme_ZingJetpackCompose_NoActionBar)
        setContent {
            ZingJetpackComposeTheme {
                Navigation()
            }
        }
    }
}