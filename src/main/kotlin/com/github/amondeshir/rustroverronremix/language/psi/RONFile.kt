package com.github.amondeshir.rustroverronremix.language.psi

import com.github.amondeshir.rustroverronremix.language.RONFileType
import com.github.amondeshir.rustroverronremix.language.RONLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.openapi.util.ModificationTracker
import com.intellij.psi.FileViewProvider

class RONFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, RONLanguage.INSTANCE) {
    override fun getFileType(): FileType = RONFileType.INSTANCE

    override fun toString(): String = "RON File"

    val modificationTracker: ModificationTracker = ModificationTracker { modificationStamp }
}
