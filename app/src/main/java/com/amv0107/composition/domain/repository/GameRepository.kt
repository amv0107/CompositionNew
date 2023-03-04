package com.amv0107.composition.domain.repository

import com.amv0107.composition.domain.entity.GameSettings
import com.amv0107.composition.domain.entity.Level
import com.amv0107.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}