// This is a generated file. Not intended for manual editing.
package com.github.amondeshir.rustroverronremix.language.psi.impl;

import com.github.amondeshir.rustroverronremix.language.psi.RONMapEntry;
import com.github.amondeshir.rustroverronremix.language.psi.RONMapKey;
import com.github.amondeshir.rustroverronremix.language.psi.RONValue;
import com.github.amondeshir.rustroverronremix.language.psi.RONVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;

public class RONMapEntryImpl extends ASTWrapperPsiElement implements RONMapEntry {

  public RONMapEntryImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RONVisitor visitor) {
    visitor.visitMapEntry(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RONVisitor) accept((RONVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public RONMapKey getMapKey() {
    return findNotNullChildByClass(RONMapKey.class);
  }

  @Override
  @NotNull
  public RONValue getValue() {
    return findNotNullChildByClass(RONValue.class);
  }

}
