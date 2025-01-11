// This is a generated file. Not intended for manual editing.
package com.github.amondeshir.rustroverronremix.language.psi.impl;

import com.github.amondeshir.rustroverronremix.language.psi.RONObjectName;
import com.github.amondeshir.rustroverronremix.language.psi.RONObjectNameMixin;
import com.github.amondeshir.rustroverronremix.language.psi.RONVisitor;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;

import static com.github.amondeshir.rustroverronremix.language.psi.RONTypes.IDENT;

public class RONObjectNameImpl extends RONObjectNameMixin implements RONObjectName {

  public RONObjectNameImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RONVisitor visitor) {
    visitor.visitObjectName(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RONVisitor) accept((RONVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getIdent() {
    return findNotNullChildByType(IDENT);
  }

}
