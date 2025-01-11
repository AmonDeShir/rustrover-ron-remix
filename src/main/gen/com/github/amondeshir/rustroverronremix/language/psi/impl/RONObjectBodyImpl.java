// This is a generated file. Not intended for manual editing.
package com.github.amondeshir.rustroverronremix.language.psi.impl;

import java.util.List;

import com.github.amondeshir.rustroverronremix.language.psi.RONNamedField;
import com.github.amondeshir.rustroverronremix.language.psi.RONObjectBody;
import com.github.amondeshir.rustroverronremix.language.psi.RONVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.amondeshir.rustroverronremix.language.psi.RONTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.amondeshir.rustroverronremix.language.psi.*;

public class RONObjectBodyImpl extends ASTWrapperPsiElement implements RONObjectBody {

  public RONObjectBodyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RONVisitor visitor) {
    visitor.visitObjectBody(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RONVisitor) accept((RONVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RONNamedField> getNamedFieldList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RONNamedField.class);
  }

}
