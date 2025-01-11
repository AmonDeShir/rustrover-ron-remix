package com.github.amondeshir.rustroverronremix.ide.todo

import com.github.amondeshir.rustroverronremix.language.RONLexerAdapter
import com.github.amondeshir.rustroverronremix.language.psi.RON_COMMENTS
import com.intellij.lexer.Lexer
import com.intellij.psi.impl.cache.impl.BaseFilterLexer
import com.intellij.psi.impl.cache.impl.OccurrenceConsumer
import com.intellij.psi.impl.cache.impl.todo.LexerBasedTodoIndexer
import com.intellij.psi.search.UsageSearchContext

class RONTodoIndexer : LexerBasedTodoIndexer() {
    override fun createLexer(consumer: OccurrenceConsumer): Lexer {
        return object : BaseFilterLexer(RONLexerAdapter(), consumer) {
            override fun advance() {
                if (myDelegate.tokenType in RON_COMMENTS) {
                    scanWordsInToken(UsageSearchContext.IN_COMMENTS.toInt(), false, false)
                    advanceTodoItemCountsInToken()
                }
                myDelegate.advance()
            }
        }
    }
}
