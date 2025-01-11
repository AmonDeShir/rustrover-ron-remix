package com.github.amondeshir.rustroverronremix.ide.braces

import com.github.amondeshir.rustroverronremix.language.psi.RONTypes
import com.github.amondeshir.rustroverronremix.language.psi.RON_COMMENTS
import com.github.amondeshir.rustroverronremix.language.psi.tokenSetOf
import com.intellij.lang.BracePair
import com.intellij.lang.PairedBraceMatcher
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet

class RONBaseBraceMatcher : PairedBraceMatcher {
    override fun getPairs(): Array<BracePair> = PAIRS

    override fun isPairedBracesAllowedBeforeType(lbraceType: IElementType, next: IElementType?): Boolean =
        next in InsertPairBraceBefore

    override fun getCodeConstructStart(file: PsiFile?, openingBraceOffset: Int): Int = openingBraceOffset

    companion object {
        private val PAIRS = arrayOf(
            BracePair(com.github.amondeshir.rustroverronremix.language.psi.RONTypes.BRACEL, com.github.amondeshir.rustroverronremix.language.psi.RONTypes.BRACER, true),
            BracePair(com.github.amondeshir.rustroverronremix.language.psi.RONTypes.BRACKETL, com.github.amondeshir.rustroverronremix.language.psi.RONTypes.BRACKETR, true),
            BracePair(com.github.amondeshir.rustroverronremix.language.psi.RONTypes.PARENTHESISL, com.github.amondeshir.rustroverronremix.language.psi.RONTypes.PARENTHESISR, true),
            BracePair(com.github.amondeshir.rustroverronremix.language.psi.RONTypes.EXT_PREFIX, com.github.amondeshir.rustroverronremix.language.psi.RONTypes.BRACKETR, false)
        )

        private val InsertPairBraceBefore = TokenSet.orSet(
            RON_COMMENTS,
            tokenSetOf(
                TokenType.WHITE_SPACE,
                com.github.amondeshir.rustroverronremix.language.psi.RONTypes.COMMA,
                com.github.amondeshir.rustroverronremix.language.psi.RONTypes.PARENTHESISR,
                com.github.amondeshir.rustroverronremix.language.psi.RONTypes.BRACKETR,
                com.github.amondeshir.rustroverronremix.language.psi.RONTypes.BRACER,
                com.github.amondeshir.rustroverronremix.language.psi.RONTypes.BRACEL
            )
        )
    }
}
