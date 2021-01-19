package com.github.madwareru.intellijronremix.ide.completion

import com.github.madwareru.intellijronremix.language.psi.RONTypes
import com.intellij.codeInsight.completion.CompletionContributor
import com.intellij.codeInsight.completion.CompletionParameters
import com.intellij.codeInsight.completion.CompletionProvider
import com.intellij.codeInsight.completion.CompletionResultSet
import com.intellij.codeInsight.completion.CompletionType
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.patterns.PlatformPatterns
import com.intellij.util.ProcessingContext

class RONOptionCompletionContributor : CompletionContributor() {
    init {
        extend(
            CompletionType.BASIC,
            PlatformPatterns.psiElement(RONTypes.IDENT),
            object : CompletionProvider<CompletionParameters>() {
                override fun addCompletions(
                    parameters: CompletionParameters,
                    context: ProcessingContext,
                    resultSet: CompletionResultSet
                ) {
                    resultSet.addElement(
                        LookupElementBuilder
                            .create("Some()")
                            .withInsertHandler { ctx, _ ->
                                val currentOffset = ctx.editor.caretModel.offset
                                ctx.editor.caretModel.moveToOffset(currentOffset - 1)
                            }
                    )
                    resultSet.addElement(LookupElementBuilder.create("None"))
                }
            }
        )
    }
}