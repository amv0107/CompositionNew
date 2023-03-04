package com.amv0107.composition.domain.usacases

import com.amv0107.composition.domain.entity.GameSettings
import com.amv0107.composition.domain.entity.Level
import com.amv0107.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {
    operator fun invoke(level: Level): GameSettings{
        return repository.getGameSettings(level)
    }
}