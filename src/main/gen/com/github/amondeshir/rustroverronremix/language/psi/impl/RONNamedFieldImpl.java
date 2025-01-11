// This is a generated file. Not intended for manual editing.
package com.github.amondeshir.rustroverronremix.language.psi.impl;

import com.github.amondeshir.rustroverronremix.language.psi.RONFieldName;
import com.github.amondeshir.rustroverronremix.language.psi.RONNamedField;
import com.github.amondeshir.rustroverronremix.language.psi.RONValue;
import com.github.amondeshir.rustroverronremix.language.psi.RONVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;

public class RONNamedFieldImpl extends ASTWrapperPsiElement implements RONNamedField {

  public RONNamedFieldImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RONVisitor visitor) {
    visitor.visitNamedField(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RONVisitor) accept((RONVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public RONFieldName getFieldName() {
    return findNotNullChildByClass(RONFieldName.class);
  }

  @Override
  @Nullable
  public RONValue getValue() {
    return findChildByClass(RONValue.class);
  }

}
