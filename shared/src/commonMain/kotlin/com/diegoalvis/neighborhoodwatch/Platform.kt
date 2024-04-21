package com.diegoalvis.neighborhoodwatch

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform