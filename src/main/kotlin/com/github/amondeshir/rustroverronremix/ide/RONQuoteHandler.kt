package com.github.amondeshir.rustroverronremix.ide

import com.github.amondeshir.rustroverronremix.language.psi.RONTypes
import com.intellij.codeInsight.editorActions.SimpleTokenSetQuoteHandler

class RONQuoteHandler : SimpleTokenSetQuoteHandler(com.github.amondeshir.rustroverronremix.language.psi.RONTypes.STRING, com.github.amondeshir.rustroverronremix.language.psi.RONTypes.RAW_STRING)
