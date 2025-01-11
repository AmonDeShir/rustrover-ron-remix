package com.github.amondeshir.rustroverronremix.ide.folding

import com.github.amondeshir.rustroverronremix.language.psi.*
import com.intellij.lang.ASTNode
import com.intellij.lang.folding.CustomFoldingBuilder
import com.intellij.lang.folding.FoldingDescriptor
import com.intellij.openapi.editor.Document
import com.intellij.openapi.project.DumbAware
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiComment
import com.intellij.psi.PsiElement
import com.intellij.psi.util.PsiTreeUtil

class RONFoldingBuilder : CustomFoldingBuilder(), DumbAware {
    override fun buildLanguageFoldRegions(
        descriptors: MutableList<FoldingDescriptor>,
        root: PsiElement,
        document: Document,
        quick: Boolean
    ) {
        if (root !is RONFile) return
        val visitor = RONFoldingVisitor(descriptors)
        PsiTreeUtil.processElements(root) {
            it.accept(visitor); true
        }
    }

    override fun getLanguagePlaceholderText(node: ASTNode, range: TextRange) =
        when (node.elementType) {
            com.github.amondeshir.rustroverronremix.language.psi.RONTypes.LIST -> "[...]"
            com.github.amondeshir.rustroverronremix.language.psi.RONTypes.OBJECT_BODY -> "..."
            com.github.amondeshir.rustroverronremix.language.psi.RONTypes.TUPLE -> "(...)"
            com.github.amondeshir.rustroverronremix.language.psi.RONTypes.MAP -> "{...}"
            com.github.amondeshir.rustroverronremix.language.psi.RONTypes.BLOCK_COMMENT -> "/*...*/"
            com.github.amondeshir.rustroverronremix.language.psi.RONTypes.EXTENSIONS -> "#![...]"
            else -> "{...}"
        }

    override fun isRegionCollapsedByDefault(node: ASTNode) = false
}

private class RONFoldingVisitor(private val descriptors: MutableList<FoldingDescriptor>) : RONRecursiveVisitor() {
    override fun visitList(o: com.github.amondeshir.rustroverronremix.language.psi.RONList) {
        if (o.valueList.isNotEmpty()) {
            fold(o)
            super.visitList(o)
        }
    }

    override fun visitExtensions(o: com.github.amondeshir.rustroverronremix.language.psi.RONExtensions) {
        fold(o)
        super.visitExtensions(o)
    }

    override fun visitObjectBody(o: com.github.amondeshir.rustroverronremix.language.psi.RONObjectBody) {
        if (o.namedFieldList.isNotEmpty()) {
            fold(o)
            super.visitObjectBody(o)
        }
    }

    override fun visitTupleBody(o: com.github.amondeshir.rustroverronremix.language.psi.RONTupleBody) {
        if (o.valueList.isNotEmpty()) {
            fold(o)
            super.visitTupleBody(o)
        }
    }

    override fun visitMap(o: com.github.amondeshir.rustroverronremix.language.psi.RONMap) {
        if (o.mapEntryList.isNotEmpty()) {
            fold(o)
            super.visitMap(o)
        }
    }

    override fun visitComment(comment: PsiComment) {
        if (comment.tokenType == com.github.amondeshir.rustroverronremix.language.psi.RONTypes.BLOCK_COMMENT) {
            fold(comment)
            super.visitComment(comment)
        }
    }

    private fun fold(element: PsiElement) {
        descriptors += FoldingDescriptor(element.node, element.textRange)
    }
}
