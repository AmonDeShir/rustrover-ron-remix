package com.github.amondeshir.rustroverronremix.ide

import com.github.amondeshir.rustroverronremix.language.psi.RONTypes
import com.intellij.codeInsight.editorActions.SimpleTokenSetQuoteHandler

class RONQuoteHandler : SimpleTokenSetQuoteHandler(RONTypes.STRING, RONTypes.RAW_STRING)
