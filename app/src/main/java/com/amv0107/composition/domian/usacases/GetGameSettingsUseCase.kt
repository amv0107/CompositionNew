package com.amv0107.composition.domian.usacases

import com.amv0107.composition.domian.entity.GameSettings
import com.amv0107.composition.domian.entity.Level
import com.amv0107.composition.domian.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {
    operator fun invoke(level: Level): GameSettings{
        return repository.getGameSettings(level)
    }
}