package com.ralphmarondev.tinkerkit

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform