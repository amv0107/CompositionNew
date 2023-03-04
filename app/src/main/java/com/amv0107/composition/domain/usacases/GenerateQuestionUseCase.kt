package com.amv0107.composition.domain.usacases

import com.amv0107.composition.domain.entity.Question
import com.amv0107.composition.domain.repository.GameRepository

class GenerateQuestionUseCase(
    private val repository: GameRepository
) {
    operator fun invoke(maxSumValue: Int): Question{
       return repository.generateQuestion(maxSumValue, COUNT_OF_OPTIONS)

    }

    private companion object {
        private const val COUNT_OF_OPTIONS = 6
    }
}