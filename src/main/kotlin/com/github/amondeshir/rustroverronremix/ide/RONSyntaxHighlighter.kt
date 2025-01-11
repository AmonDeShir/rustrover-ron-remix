package com.github.amondeshir.rustroverronremix.ide

import com.github.amondeshir.rustroverronremix.ide.colors.RONColor
import com.github.amondeshir.rustroverronremix.language.RONLexerAdapter
import com.github.amondeshir.rustroverronremix.language.psi.RONTypes
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType

class RONSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer {
        return RONLexerAdapter()
    }

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        return pack(getTokenColor(tokenType)?.textAttributesKey)
    }

    private fun getTokenColor(tokenType: IElementType): RONColor? {
        return when (tokenType) {
            com.github.amondeshir.rustroverronremix.language.psi.RONTypes.COLON -> RONColor.COLON
            com.github.amondeshir.rustroverronremix.language.psi.RONTypes.COMMA -> RONColor.COMMA
            com.github.amondeshir.rustroverronremix.language.psi.RONTypes.BOOLEAN -> RONColor.BOOLEAN
            com.github.amondeshir.rustroverronremix.language.psi.RONTypes.IDENT -> RONColor.IDENTIFIER
            TokenType.BAD_CHARACTER -> RONColor.BAD_CHAR
            else -> getTokenColorSpecial(tokenType)
        }
    }

    private fun getTokenColorSpecial(tokenType: IElementType): RONColor? {
        return when (tokenType) {
            com.github.amondeshir.rustroverronremix.language.psi.RONTypes.PARENTHESISL, com.github.amondeshir.rustroverronremix.language.psi.RONTypes.PARENTHESISR -> RONColor.PARENTHESES
            com.github.amondeshir.rustroverronremix.language.psi.RONTypes.BRACKETL, com.github.amondeshir.rustroverronremix.language.psi.RONTypes.BRACKETR -> RONColor.BRACKETS
            com.github.amondeshir.rustroverronremix.language.psi.RONTypes.BRACEL, com.github.amondeshir.rustroverronremix.language.psi.RONTypes.BRACER -> RONColor.BRACES
            com.github.amondeshir.rustroverronremix.language.psi.RONTypes.INTEGER, com.github.amondeshir.rustroverronremix.language.psi.RONTypes.FLOAT -> RONColor.NUMBER
            com.github.amondeshir.rustroverronremix.language.psi.RONTypes.STRING, com.github.amondeshir.rustroverronremix.language.psi.RONTypes.RAW_STRING, com.github.amondeshir.rustroverronremix.language.psi.RONTypes.CHAR -> RONColor.STRING
            com.github.amondeshir.rustroverronremix.language.psi.RONTypes.SOME, com.github.amondeshir.rustroverronremix.language.psi.RONTypes.NONE -> RONColor.OPTION
            com.github.amondeshir.rustroverronremix.language.psi.RONTypes.COMMENT, com.github.amondeshir.rustroverronremix.language.psi.RONTypes.BLOCK_COMMENT -> RONColor.COMMENT
            else -> null
        }
    }
}
