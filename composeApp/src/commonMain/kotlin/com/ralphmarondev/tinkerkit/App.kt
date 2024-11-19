package com.ralphmarondev.tinkerkit

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.ralphmarondev.tinkerkit.todoapp.presentation.auth.AuthScreen

@Composable
fun App() {
    MaterialTheme {
        AuthScreen()
    }
}