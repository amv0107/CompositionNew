package com.amv0107.composition.domian.repository

import com.amv0107.composition.domian.entity.GameSettings
import com.amv0107.composition.domian.entity.Level
import com.amv0107.composition.domian.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}