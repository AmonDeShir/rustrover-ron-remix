package com.github.amondeshir.rustroverronremix.ide.annotator.checkers

import com.github.amondeshir.rustroverronremix.language.psi.RONMap
import com.github.amondeshir.rustroverronremix.language.psi.RONMapEntry
import com.github.amondeshir.rustroverronremix.language.psi.keyAsText
import com.github.amondeshir.rustroverronremix.language.psi.keyAsTextMatches
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.psi.PsiElement

class RONMapCheckerAnnotator : CheckerAnnotator()  {
    override fun check(element: PsiElement, holder: AnnotationHolder): CheckerAnnotatorResult =
        if (holder.isBatchMode) {
            CheckerAnnotatorResult.Ok
        } else {
            when (element) {
                is com.github.amondeshir.rustroverronremix.language.psi.RONMapEntry -> checkMapEntry(element)
                else -> CheckerAnnotatorResult.Ok
            }
        }

    private fun checkMapEntry(mapEntry: com.github.amondeshir.rustroverronremix.language.psi.RONMapEntry): CheckerAnnotatorResult {
        val filteredEntries = (mapEntry.parent as com.github.amondeshir.rustroverronremix.language.psi.RONMap)
            .mapEntryList
            .asSequence()
            .filterNot { it == mapEntry }

        val duplicatesFound = filteredEntries.any { mapEntry.keyAsTextMatches(it.keyAsText) }

        return if (duplicatesFound) {
            CheckerAnnotatorResult.Error(
                "Duplicate keys found in a dictionary",
                mapEntry.mapKey.textRange
            )
        } else {
            CheckerAnnotatorResult.Ok
        }
    }
}