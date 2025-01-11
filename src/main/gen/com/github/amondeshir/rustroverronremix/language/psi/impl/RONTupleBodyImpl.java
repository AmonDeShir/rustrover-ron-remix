// This is a generated file. Not intended for manual editing.
package com.github.amondeshir.rustroverronremix.language.psi.impl;

import com.github.amondeshir.rustroverronremix.language.psi.RONTupleBody;
import com.github.amondeshir.rustroverronremix.language.psi.RONValue;
import com.github.amondeshir.rustroverronremix.language.psi.RONVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class RONTupleBodyImpl extends ASTWrapperPsiElement implements RONTupleBody {

  public RONTupleBodyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RONVisitor visitor) {
    visitor.visitTupleBody(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RONVisitor) accept((RONVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RONValue> getValueList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RONValue.class);
  }

}
