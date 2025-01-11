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
            is com.github.amondeshir.rustroverronremix.language.psi.RONObjectName -> arrayOf(RonToRustTypeReference(element))
            is com.github.amondeshir.rustroverronremix.language.psi.RONFieldName -> arrayOf(
                com.github.amondeshir.rustroverronremix.rust.RonToRustFieldReference(
                    element
                )
            )
            else -> error("${this.javaClass.simpleName} was invoked for an element of type ${element.javaClass.simpleName}")
        }
    }

}
