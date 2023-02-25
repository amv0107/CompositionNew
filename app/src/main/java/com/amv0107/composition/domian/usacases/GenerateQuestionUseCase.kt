package com.amv0107.composition.domian.usacases

import com.amv0107.composition.domian.entity.Question
import com.amv0107.composition.domian.repository.GameRepository

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