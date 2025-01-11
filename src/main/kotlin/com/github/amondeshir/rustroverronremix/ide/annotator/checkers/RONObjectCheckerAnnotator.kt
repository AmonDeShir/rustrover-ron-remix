package com.github.amondeshir.rustroverronremix.ide.annotator.checkers

import com.github.amondeshir.rustroverronremix.language.psi.*
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.psi.PsiElement

class RONObjectCheckerAnnotator : CheckerAnnotator()  {
    override fun check(element: PsiElement, holder: AnnotationHolder): CheckerAnnotatorResult =
        if (holder.isBatchMode) {
            CheckerAnnotatorResult.Ok
        } else {
            when (element) {
                is com.github.amondeshir.rustroverronremix.language.psi.RONNamedField -> checkObjectEntry(element)
                is com.github.amondeshir.rustroverronremix.language.psi.RONValue -> checkValue(element)
                else -> CheckerAnnotatorResult.Ok
            }
        }

    private fun checkValue(value: com.github.amondeshir.rustroverronremix.language.psi.RONValue): CheckerAnnotatorResult {
        if (value.parent is com.github.amondeshir.rustroverronremix.language.psi.RONObjectBody) {
            return CheckerAnnotatorResult.Error("Object entry must have a field name", value.textRange)
        }
        return CheckerAnnotatorResult.Ok
    }

    private fun checkObjectEntry(objectEntry: com.github.amondeshir.rustroverronremix.language.psi.RONNamedField): CheckerAnnotatorResult {
        val filteredEntries = (objectEntry.parent as com.github.amondeshir.rustroverronremix.language.psi.RONObjectBody)
            .namedFieldList
            .asSequence()
            .filterNot { it == objectEntry }

        val namedField = objectEntry.fieldName
        val keyText = namedField.text
        val duplicatesFound = filteredEntries.any { it.keyTextMatches(keyText) }

        return if (duplicatesFound) {
            CheckerAnnotatorResult.Error(
                "Duplicate keys found in an object",
                namedField.textRange
            )
        } else {
            CheckerAnnotatorResult.Ok
        }
    }
}

