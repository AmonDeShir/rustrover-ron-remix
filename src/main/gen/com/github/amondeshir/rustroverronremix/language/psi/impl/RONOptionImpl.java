// This is a generated file. Not intended for manual editing.
package com.github.amondeshir.rustroverronremix.language.psi.impl;

import java.util.List;

import com.github.amondeshir.rustroverronremix.language.psi.RONOption;
import com.github.amondeshir.rustroverronremix.language.psi.RONValue;
import com.github.amondeshir.rustroverronremix.language.psi.RONVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.amondeshir.rustroverronremix.language.psi.RONTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.amondeshir.rustroverronremix.language.psi.*;

public class RONOptionImpl extends ASTWrapperPsiElement implements RONOption {

  public RONOptionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RONVisitor visitor) {
    visitor.visitOption(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RONVisitor) accept((RONVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RONValue getValue() {
    return findChildByClass(RONValue.class);
  }

}