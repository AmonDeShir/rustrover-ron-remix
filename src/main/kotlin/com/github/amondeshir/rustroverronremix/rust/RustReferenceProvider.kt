package com.github.amondeshir.rustroverronremix.rust

import com.github.amondeshir.rustroverronremix.language.psi.RONFieldName
import com.github.amondeshir.rustroverronremix.language.psi.RONObjectName
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiReference
import com.intellij.psi.PsiReferenceProvider
import com.intellij.util.ProcessingContext

object RustReferenceProvider : PsiReferenceProvider() {
    override fun getReferencesByElement(element: PsiElement, context: ProcessingContext): Array<PsiReference> {
        return when (element) {
            is RONObjectName -> arrayOf(RonToRustTypeReference(element))
            is RONFieldName -> arrayOf(
                RonToRustFieldReference(
                    element
                )
            )
            else -> error("${this.javaClass.simpleName} was invoked for an element of type ${element.javaClass.simpleName}")
        }
    }

}
