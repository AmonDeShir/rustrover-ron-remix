package com.github.amondeshir.rustroverronremix.ide.completion

import com.github.amondeshir.rustroverronremix.language.psi.RONExt
import com.github.amondeshir.rustroverronremix.language.psi.RONExtensions
import com.github.amondeshir.rustroverronremix.language.psi.RONObjectName
import com.github.amondeshir.rustroverronremix.language.psi.RONTypes
import com.github.amondeshir.rustroverronremix.language.psi.RONValue
import com.intellij.codeInsight.completion.*
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.openapi.editor.EditorModificationUtil
import com.intellij.patterns.PlatformPatterns
import com.intellij.psi.util.parentOfType
import com.intellij.util.ProcessingContext

class RONOptionCompletionContributor : CompletionContributor() {
    init {
        extend(
            CompletionType.BASIC,
            PlatformPatterns.psiElement(com.github.amondeshir.rustroverronremix.language.psi.RONTypes.IDENT),
            object : CompletionProvider<CompletionParameters>() {
                override fun addCompletions(
                    parameters: CompletionParameters,
                    context: ProcessingContext,
                    resultSet: CompletionResultSet
                ) {
                    if (parameters.position.parentOfType<com.github.amondeshir.rustroverronremix.language.psi.RONExt>(false) != null) {
                        resultSet.addElement(
                            LookupElementBuilder
                                .create("enable()")
                                .withInsertHandler { ctx, _ ->
                                    EditorModificationUtil.moveCaretRelatively(ctx.editor, -1)
                                }
                        )
                    }
                    if (parameters.position.parent is com.github.amondeshir.rustroverronremix.language.psi.RONObjectName && parameters.position.parent.parent is com.github.amondeshir.rustroverronremix.language.psi.RONValue) {
                        resultSet.addElement(
                            LookupElementBuilder
                                .create("Some()")
                                .withInsertHandler { ctx, _ ->
                                    EditorModificationUtil.moveCaretRelatively(ctx.editor, - 1)
                                }
                        )
                        resultSet.addElement(LookupElementBuilder.create("None"))
                    }
                }
            }
        )
    }
}