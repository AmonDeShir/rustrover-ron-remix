// This is a generated file. Not intended for manual editing.
package com.github.amondeshir.rustroverronremix.language.psi.impl;

import com.github.amondeshir.rustroverronremix.language.psi.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static com.github.amondeshir.rustroverronremix.language.psi.RONTypes.*;

public class RONValueImpl extends ASTWrapperPsiElement implements RONValue {

  public RONValueImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RONVisitor visitor) {
    visitor.visitValue(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RONVisitor) accept((RONVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RONList getList() {
    return findChildByClass(RONList.class);
  }

  @Override
  @Nullable
  public RONMap getMap() {
    return findChildByClass(RONMap.class);
  }

  @Override
  @Nullable
  public RONObject getObject() {
    return findChildByClass(RONObject.class);
  }

  @Override
  @Nullable
  public RONObjectName getObjectName() {
    return findChildByClass(RONObjectName.class);
  }

  @Override
  @Nullable
  public RONOption getOption() {
    return findChildByClass(RONOption.class);
  }

  @Override
  @Nullable
  public RONTuple getTuple() {
    return findChildByClass(RONTuple.class);
  }

  @Override
  @Nullable
  public PsiElement getBoolean() {
    return findChildByType(BOOLEAN);
  }

  @Override
  @Nullable
  public PsiElement getFloat() {
    return findChildByType(FLOAT);
  }

  @Override
  @Nullable
  public PsiElement getInteger() {
    return findChildByType(INTEGER);
  }

}
