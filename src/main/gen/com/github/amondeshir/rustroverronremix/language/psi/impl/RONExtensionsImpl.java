// This is a generated file. Not intended for manual editing.
package com.github.amondeshir.rustroverronremix.language.psi.impl;

import com.github.amondeshir.rustroverronremix.language.psi.RONExt;
import com.github.amondeshir.rustroverronremix.language.psi.RONExtensions;
import com.github.amondeshir.rustroverronremix.language.psi.RONVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class RONExtensionsImpl extends ASTWrapperPsiElement implements RONExtensions {

  public RONExtensionsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RONVisitor visitor) {
    visitor.visitExtensions(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RONVisitor) accept((RONVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RONExt> getExtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RONExt.class);
  }

}
