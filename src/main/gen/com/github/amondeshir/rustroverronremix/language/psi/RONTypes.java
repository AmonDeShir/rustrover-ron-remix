// This is a generated file. Not intended for manual editing.
package com.github.amondeshir.rustroverronremix.language.psi;

import com.github.amondeshir.rustroverronremix.language.psi.impl.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;

public interface RONTypes {

  IElementType EXT = new RONElementType("EXT");
  IElementType EXTENSIONS = new RONElementType("EXTENSIONS");
  IElementType FIELD_NAME = new RONElementType("FIELD_NAME");
  IElementType LIST = new RONElementType("LIST");
  IElementType MAP = new RONElementType("MAP");
  IElementType MAP_ENTRY = new RONElementType("MAP_ENTRY");
  IElementType MAP_KEY = new RONElementType("MAP_KEY");
  IElementType NAMED_FIELD = new RONElementType("NAMED_FIELD");
  IElementType OBJECT = new RONElementType("OBJECT");
  IElementType OBJECT_BODY = new RONElementType("OBJECT_BODY");
  IElementType OBJECT_NAME = new RONElementType("OBJECT_NAME");
  IElementType OPTION = new RONElementType("OPTION");
  IElementType TUPLE = new RONElementType("TUPLE");
  IElementType TUPLE_BODY = new RONElementType("TUPLE_BODY");
  IElementType VALUE = new RONElementType("VALUE");

  IElementType BLOCK_COMMENT = new RONTokenType("BLOCK COMMENT");
  IElementType BOOLEAN = new RONTokenType("BOOLEAN");
  IElementType BRACEL = new RONTokenType("{");
  IElementType BRACER = new RONTokenType("}");
  IElementType BRACKETL = new RONTokenType("[");
  IElementType BRACKETR = new RONTokenType("]");
  IElementType CHAR = new RONTokenType("CHAR");
  IElementType COLON = new RONTokenType(":");
  IElementType COMMA = new RONTokenType(",");
  IElementType COMMENT = new RONTokenType("COMMENT");
  IElementType ENABLE_KEYWORD = new RONTokenType("enable");
  IElementType EXT_PREFIX = new RONTokenType("#![");
  IElementType FLOAT = new RONTokenType("FLOAT");
  IElementType IDENT = new RONTokenType("IDENT");
  IElementType INTEGER = new RONTokenType("INTEGER");
  IElementType NONE = new RONTokenType("None");
  IElementType PARENTHESISL = new RONTokenType("(");
  IElementType PARENTHESISR = new RONTokenType(")");
  IElementType RAW_STRING = new RONTokenType("RAW STRING");
  IElementType SOME = new RONTokenType("Some");
  IElementType STRING = new RONTokenType("STRING");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == EXT) {
        return new RONExtImpl(node);
      }
      else if (type == EXTENSIONS) {
        return new RONExtensionsImpl(node);
      }
      else if (type == FIELD_NAME) {
        return new RONFieldNameImpl(node);
      }
      else if (type == LIST) {
        return new RONListImpl(node);
      }
      else if (type == MAP) {
        return new RONMapImpl(node);
      }
      else if (type == MAP_ENTRY) {
        return new RONMapEntryImpl(node);
      }
      else if (type == MAP_KEY) {
        return new RONMapKeyImpl(node);
      }
      else if (type == NAMED_FIELD) {
        return new RONNamedFieldImpl(node);
      }
      else if (type == OBJECT) {
        return new RONObjectImpl(node);
      }
      else if (type == OBJECT_BODY) {
        return new RONObjectBodyImpl(node);
      }
      else if (type == OBJECT_NAME) {
        return new RONObjectNameImpl(node);
      }
      else if (type == OPTION) {
        return new RONOptionImpl(node);
      }
      else if (type == TUPLE) {
        return new RONTupleImpl(node);
      }
      else if (type == TUPLE_BODY) {
        return new RONTupleBodyImpl(node);
      }
      else if (type == VALUE) {
        return new RONValueImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
