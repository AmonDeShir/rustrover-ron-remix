// This is a generated file. Not intended for manual editing.
package com.github.amondeshir.rustroverronremix.language.psi.impl;

import com.github.amondeshir.rustroverronremix.language.psi.RONObjectName;
import com.github.amondeshir.rustroverronremix.language.psi.RONTuple;
import com.github.amondeshir.rustroverronremix.language.psi.RONTupleBody;
import com.github.amondeshir.rustroverronremix.language.psi.RONVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class RONTupleImpl extends ASTWrapperPsiElement implements RONTuple {

  public RONTupleImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RONVisitor visitor) {
    visitor.visitTuple(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RONVisitor) accept((RONVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RONObjectName getObjectName() {
    return findChildByClass(RONObjectName.class);
  }

  @Override
  @NotNull
  public RONTupleBody getTupleBody() {
    return findNotNullChildByClass(RONTupleBody.class);
  }

}
