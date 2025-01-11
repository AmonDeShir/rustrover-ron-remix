package com.github.amondeshir.rustroverronremix.language

import com.github.amondeshir.rustroverronremix.ide.icons.RONIcons
import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class RONFileType private constructor() : LanguageFileType(RONLanguage.INSTANCE) {
    override fun getName(): String = "RON file"

    override fun getDescription(): String = "Rusty Object notation file"

    override fun getDefaultExtension(): String = "ron"

    override fun getIcon(): Icon? = RONIcons.FILE

    companion object {
        @JvmStatic
        val INSTANCE = RONFileType()
    }
}
