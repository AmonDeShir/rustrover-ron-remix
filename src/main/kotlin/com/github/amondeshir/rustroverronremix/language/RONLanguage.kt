package com.github.amondeshir.rustroverronremix.language

import com.intellij.lang.Language

class RONLanguage private constructor() : Language("RON") {
    companion object {
        @JvmStatic
        val INSTANCE = RONLanguage()
    }
}
