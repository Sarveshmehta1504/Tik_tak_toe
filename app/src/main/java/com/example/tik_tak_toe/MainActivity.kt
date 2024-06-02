package com.example.tik_tak_toe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.tik_tak_toe.Screen.TickTaeToe
import com.example.tik_tak_toe.ui.theme.Tik_tak_toeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tik_tak_toeTheme {
                val viewModel = viewModel<GameViewModel>()
                TickTaeToe(viewModel)
            }
        }
    }
}
