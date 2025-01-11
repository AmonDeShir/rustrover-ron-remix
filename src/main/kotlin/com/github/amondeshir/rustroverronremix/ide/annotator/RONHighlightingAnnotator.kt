package com.github.amondeshir.rustroverronremix.ide.annotator

import com.github.amondeshir.rustroverronremix.ide.colors.RONColor
import com.github.amondeshir.rustroverronremix.language.psi.RONExt
import com.github.amondeshir.rustroverronremix.language.psi.RONNamedField
import com.github.amondeshir.rustroverronremix.language.psi.RONObject
import com.github.amondeshir.rustroverronremix.language.psi.RONObjectName
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.psi.PsiElement

class RONHighlightingAnnotator : AnnotatorBase() {
    override fun annotateInternal(element: PsiElement, holder: AnnotationHolder) {
        val parent = element.parent
        if (holder.isBatchMode || parent == null) return

        when (parent) {
            is RONExt -> if (parent.ident != element) {
                holder
                    .newSilentAnnotation(HighlightSeverity.INFORMATION)
                    .textAttributes(RONColor.EXTENSION.textAttributesKey)
                    .create()
            }
            is RONObject -> if (parent.objectName == element) {
                holder
                    .newSilentAnnotation(HighlightSeverity.INFORMATION)
                    .textAttributes(RONColor.OBJECT_NAME.textAttributesKey)
                    .create()
            }
            is RONObjectName -> if (parent.ident == element) {
                holder
                    .newSilentAnnotation(HighlightSeverity.INFORMATION)
                    .textAttributes(RONColor.OBJECT_NAME.textAttributesKey)
                    .create()
            }
            is RONNamedField -> if (parent.fieldName == element) {
                holder
                    .newSilentAnnotation(HighlightSeverity.INFORMATION)
                    .textAttributes(RONColor.KEY_NAME.textAttributesKey)
                    .create()
            }
        }
    }
}
