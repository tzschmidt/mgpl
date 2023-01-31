/**
 * generated by Xtext 2.9.0
 */
package mgpl.validation;

import com.google.common.base.Objects;
import java.util.Collections;
import java.util.List;
import mgpl.Common;
import mgpl.mGPL.AllDecls;
import mgpl.mGPL.AnimBlock;
import mgpl.mGPL.ArrayDecl;
import mgpl.mGPL.AssStmt;
import mgpl.mGPL.AttrAss;
import mgpl.mGPL.Complement;
import mgpl.mGPL.ElementSelect;
import mgpl.mGPL.Expr;
import mgpl.mGPL.MGPLPackage;
import mgpl.mGPL.MemberSelect;
import mgpl.mGPL.Negation;
import mgpl.mGPL.NumberLiteral;
import mgpl.mGPL.ObjDecl;
import mgpl.mGPL.ParamDecl;
import mgpl.mGPL.Prog;
import mgpl.mGPL.Touches;
import mgpl.mGPL.Var;
import mgpl.mGPL.VarDecl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class MGPLValidator extends AbstractMGPLValidator {
  /**
   * ##### Vordefinierte Hilfsfunktionen & globale Variablen.
   * ##### Verwenden Sie diese wenn möglich.
   * ##### Verwenden Sie ggf. auch die statischen Funktionen der Datei Common.xtend
   * ##### TODOs für @Check Implementierung hier weiter unten!
   */
  public boolean isUndeclared(final Var it) {
    return ((it.getId() == null) || it.getId().eIsProxy());
  }

  public boolean isArray(final Var it) {
    EObject _eContainer = it.getId().eContainer();
    return (_eContainer instanceof ArrayDecl);
  }

  public boolean isGame(final Var it) {
    AllDecls _id = it.getId();
    return (_id instanceof Prog);
  }

  public boolean isVariable(final Var it) {
    AllDecls _id = it.getId();
    return (_id instanceof VarDecl);
  }

  public boolean isObject(final Var it) {
    AllDecls _id = it.getId();
    return (_id instanceof ObjDecl);
  }

  public boolean isAnimation(final Var it) {
    AllDecls _id = it.getId();
    return (_id instanceof AnimBlock);
  }

  public boolean isParameter(final Var it) {
    AllDecls _id = it.getId();
    return (_id instanceof ParamDecl);
  }

  public boolean hasMembers(final Var it) {
    return ((this.isGame(it) || (this.isObject(it) && (!this.isArray(it)))) || this.isParameter(it));
  }

  public boolean usedAsArray(final Var it) {
    return ((it.eContainer() instanceof ElementSelect) && Objects.equal(it.eContainingFeature(), MGPLPackage.Literals.VAR__VARIABLE));
  }

  public boolean usedAsObject(final Var it) {
    EObject _eContainer = it.eContainer();
    return (_eContainer instanceof MemberSelect);
  }

  public boolean isNoGraphicalObject(final Var it) {
    boolean _or = false;
    if ((it instanceof MemberSelect)) {
      _or = true;
    } else {
      boolean _xifexpression = false;
      if ((it instanceof ElementSelect)) {
        _xifexpression = (((!this.isUndeclared(((ElementSelect)it).getVariable())) && (!this.isObject(((ElementSelect)it).getVariable()))) && this.isArray(((ElementSelect)it).getVariable()));
      } else {
        _xifexpression = (((!this.isUndeclared(it)) && ((!this.isObject(it)) || this.isArray(it))) && (!this.isParameter(it)));
      }
      _or = _xifexpression;
    }
    return _or;
  }

  public boolean isNoInt(final Var it) {
    boolean _xifexpression = false;
    if ((it instanceof MemberSelect)) {
      _xifexpression = ((MemberSelect)it).getMemberName().equals("animation_block");
    } else {
      boolean _xifexpression_1 = false;
      if ((it instanceof ElementSelect)) {
        _xifexpression_1 = (((!this.isUndeclared(((ElementSelect)it).getVariable())) && (!this.isVariable(((ElementSelect)it).getVariable()))) && this.isArray(((ElementSelect)it).getVariable()));
      } else {
        _xifexpression_1 = ((!this.isUndeclared(it)) && ((!this.isVariable(it)) || this.isArray(it)));
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }

  private final List<String> gameAttributes = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("height", "width", "speed", "x", "y"));

  private final List<String> circleAttributes = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("animation_block", "radius", "visible", "x", "y"));

  private final List<String> rectTriangleAttributes = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("animation_block", "height", "visible", "width", "x", "y"));

  public List<String> allowedAttributes(final EObject it) {
    List<String> _xifexpression = null;
    if ((it instanceof ObjDecl)) {
      List<String> _xifexpression_1 = null;
      boolean _equals = ((ObjDecl)it).getType().equals("circle");
      if (_equals) {
        _xifexpression_1 = this.circleAttributes;
      } else {
        _xifexpression_1 = this.rectTriangleAttributes;
      }
      _xifexpression = _xifexpression_1;
    } else {
      List<String> _xifexpression_2 = null;
      if ((it instanceof ParamDecl)) {
        List<String> _xifexpression_3 = null;
        boolean _equals_1 = ((ParamDecl)it).getType().equals("circle");
        if (_equals_1) {
          _xifexpression_3 = this.circleAttributes;
        } else {
          _xifexpression_3 = this.rectTriangleAttributes;
        }
        _xifexpression_2 = _xifexpression_3;
      } else {
        List<String> _xifexpression_4 = null;
        if ((it instanceof Prog)) {
          _xifexpression_4 = this.gameAttributes;
        }
        _xifexpression_2 = _xifexpression_4;
      }
      _xifexpression = _xifexpression_2;
    }
    return _xifexpression;
  }

  public String objectType(final EObject it) {
    String _xifexpression = null;
    if ((it instanceof ObjDecl)) {
      _xifexpression = Common.capitalize(((ObjDecl)it).getType());
    } else {
      String _xifexpression_1 = null;
      if ((it instanceof ParamDecl)) {
        _xifexpression_1 = Common.capitalize(((ParamDecl)it).getType());
      } else {
        String _xifexpression_2 = null;
        if ((it instanceof Prog)) {
          _xifexpression_2 = "Game";
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }

  /**
   * ##### Vordefinierte @Check Funktion als Orientierungshilfe.
   */
  @Check
  public void checkExpressionOperands(final Expr it) {
    if (((it instanceof NumberLiteral) || (it instanceof Var))) {
      return;
    }
    if ((it instanceof Touches)) {
      boolean _isNoGraphicalObject = this.isNoGraphicalObject(((Touches)it).getLeft());
      if (_isNoGraphicalObject) {
        this.error("This Operand must evaluate to a Circle, Rectangle, or Triangle", 
          MGPLPackage.Literals.TOUCHES__LEFT);
      }
      boolean _isNoGraphicalObject_1 = this.isNoGraphicalObject(((Touches)it).getRight());
      if (_isNoGraphicalObject_1) {
        this.error("This Operand must evaluate to a Circle, Rectangle, or Triangle", 
          MGPLPackage.Literals.TOUCHES__RIGHT);
      }
    } else {
      if (((it instanceof Negation) || (it instanceof Complement))) {
        final EStructuralFeature feature = it.eClass().getEStructuralFeature(MGPLPackage.Literals.NEGATION__EXPR.getName());
        final Object expr = it.eGet(feature);
        if ((expr instanceof Var)) {
          boolean _isNoInt = this.isNoInt(((Var)expr));
          if (_isNoInt) {
            this.error("This Operand must evaluate to an int", feature);
          }
        }
      } else {
        final EStructuralFeature leftFeature = it.eClass().getEStructuralFeature(MGPLPackage.Literals.EQUALS__LEFT.getName());
        final EStructuralFeature rightFeature = it.eClass().getEStructuralFeature(MGPLPackage.Literals.EQUALS__RIGHT.getName());
        final Object left = it.eGet(leftFeature);
        final Object right = it.eGet(rightFeature);
        if ((left instanceof Var)) {
          boolean _isNoInt_1 = this.isNoInt(((Var)left));
          if (_isNoInt_1) {
            this.error("This Operand must evaluate to an int", leftFeature);
          }
        }
        if ((right instanceof Var)) {
          boolean _isNoInt_2 = this.isNoInt(((Var)right));
          if (_isNoInt_2) {
            this.error("This Operand must evaluate to an int", rightFeature);
          }
        }
      }
    }
  }

  /**
   * ##### Ihre Implementierung der @Check Funktion für Aufgabe 2.
   */
  @Check
  public void checkVar(final Var it) {
    if (((it instanceof MemberSelect) || (it instanceof ElementSelect))) {
      return;
    } else {
      boolean _isUndeclared = this.isUndeclared(it);
      if (_isUndeclared) {
        final EStructuralFeature id = it.eClass().getEStructuralFeature(MGPLPackage.Literals.VAR__ID.getName());
        this.error("This Variable/Objekt is undeclared", id);
      }
    }
    boolean _usedAsObject = this.usedAsObject(it);
    if (_usedAsObject) {
      boolean _hasMembers = this.hasMembers(it);
      if (_hasMembers) {
        return;
      } else {
        final EStructuralFeature id_1 = it.eClass().getEStructuralFeature(MGPLPackage.Literals.VAR__ID.getName());
        this.error("This Variable is not an Object ", id_1);
      }
    }
  }

  public boolean isAllowedAttribute(final EObject it, final String name) {
    final List<String> allowList = this.allowedAttributes(it);
    for (final String allow : allowList) {
      boolean _equals = Common.longAttributeName(name).equals(allow);
      if (_equals) {
        return true;
      }
    }
    return false;
  }

  @Check
  public void checkAttributeAssignment(final AttrAss it) {
    final EStructuralFeature attrName = it.eClass().getEStructuralFeature(MGPLPackage.Literals.ATTR_ASS__NAME.getName());
    Object _eGet = it.eGet(attrName);
    final String name = ((String) _eGet);
    boolean _isAllowedAttribute = this.isAllowedAttribute(it.eContainer(), name);
    boolean _not = (!_isAllowedAttribute);
    if (_not) {
      this.error("This is not an allowed Attribute for this Object", attrName);
    }
    final EList<EObject> listAttributes = it.eContainer().eContents();
    String listAttributesString = "";
    for (final EObject variable : listAttributes) {
      if ((variable instanceof AttrAss)) {
        String _listAttributesString = listAttributesString;
        String _name = ((AttrAss)variable).getName();
        String _plus = (" " + _name);
        String _plus_1 = (_plus + " ");
        listAttributesString = (_listAttributesString + _plus_1);
      }
    }
    boolean _equals = name.equals("r");
    if (_equals) {
      boolean _contains = listAttributesString.contains("radius");
      if (_contains) {
        this.error("No double attributes allowed", attrName);
      }
    } else {
      boolean _equals_1 = name.equals("w");
      if (_equals_1) {
        boolean _contains_1 = listAttributesString.contains("width");
        if (_contains_1) {
          this.error("No double attributes allowed", attrName);
        }
      } else {
        boolean _equals_2 = name.equals("h");
        if (_equals_2) {
          boolean _contains_2 = listAttributesString.contains("height");
          if (_contains_2) {
            this.error("No double attributes allowed", attrName);
          }
        } else {
          boolean _equals_3 = name.equals("radius");
          if (_equals_3) {
            boolean _contains_3 = listAttributesString.contains(" r ");
            if (_contains_3) {
              this.error("No double attributes allowed", attrName);
            }
          } else {
            boolean _equals_4 = name.equals("width");
            if (_equals_4) {
              boolean _contains_4 = listAttributesString.contains(" w ");
              if (_contains_4) {
                this.error("No double attributes allowed", attrName);
              }
            } else {
              boolean _equals_5 = name.equals("height");
              if (_equals_5) {
                boolean _contains_5 = listAttributesString.contains(" h ");
                if (_contains_5) {
                  this.error("No double attributes allowed", attrName);
                }
              }
            }
          }
        }
      }
    }
    final EStructuralFeature attrValue = it.eClass().getEStructuralFeature(MGPLPackage.Literals.ATTR_ASS__VALUE.getName());
    final Object value = it.eGet(attrValue);
    boolean _equals_6 = name.equals("animation_block");
    if (_equals_6) {
      if ((value instanceof Var)) {
        final AllDecls anim = ((Var)value).getId();
        final EObject obj = it.eContainer();
        if ((anim instanceof AnimBlock)) {
          final String animType = ((AnimBlock)anim).getParam().getType();
          boolean _not_1 = (!((animType.equals("circle") || animType.equals("rectangle")) || animType.equals("triangle")));
          if (_not_1) {
            this.error("Not accepted type for an Animation-Handler", attrName);
          }
          if ((obj instanceof ObjDecl)) {
            boolean _equals_7 = ((ObjDecl)obj).getType().equals(animType);
            boolean _not_2 = (!_equals_7);
            if (_not_2) {
              String _type = ((ObjDecl)obj).getType();
              String _plus_2 = ("Animation-Handler must have same type as Object: " + _type);
              this.error(_plus_2, attrName);
            }
          }
        } else {
          this.error("Animation-Handler expected", attrValue);
        }
      } else {
        this.error("Animation-Handler expected", attrValue);
      }
    }
    EObject _eContainer = it.eContainer();
    if ((_eContainer instanceof Prog)) {
      Expr _value = it.getValue();
      boolean _not_3 = (!(_value instanceof NumberLiteral));
      if (_not_3) {
        this.error("Constant Integer expected", attrValue);
      }
    }
    boolean _equals_8 = name.equals("speed");
    if (_equals_8) {
      int speedValue = 0;
      Expr _value_1 = it.getValue();
      if ((_value_1 instanceof NumberLiteral)) {
        Expr _value_2 = it.getValue();
        speedValue = ((NumberLiteral) _value_2).getValue();
      } else {
        this.error("Constant Integer expected", attrValue);
      }
      if (((speedValue <= 0) || (100 <= speedValue))) {
        this.error("Value out of valid range (0, 100)", attrValue);
      }
    }
  }

  @Check
  public void checkMemberName(final MemberSelect it) {
    final EStructuralFeature memberName = it.eClass().getEStructuralFeature(MGPLPackage.Literals.MEMBER_SELECT__MEMBER_NAME.getName());
    Object _eGet = it.eGet(memberName);
    final String name = ((String) _eGet);
    Var obj = it.getVariable();
    if ((obj instanceof ElementSelect)) {
      obj = ((ElementSelect)obj).getVariable();
    }
    final AllDecls objId = obj.getId();
    boolean _isAllowedAttribute = this.isAllowedAttribute(objId, name);
    boolean _not = (!_isAllowedAttribute);
    if (_not) {
      this.error("This is not an allowed Attribute for this Object", memberName);
    }
  }

  @Check
  public void checkAnimation_blockAssignment(final AssStmt it) {
    final EStructuralFeature assVar = it.eClass().getEStructuralFeature(MGPLPackage.Literals.ASS_STMT__VARIABLE.getName());
    final Object variable = it.eGet(assVar);
    final EStructuralFeature assValue = it.eClass().getEStructuralFeature(MGPLPackage.Literals.ASS_STMT__EXPRESSION.getName());
    final Object value = it.eGet(assValue);
    if ((variable instanceof MemberSelect)) {
      boolean _equals = ((MemberSelect)variable).getMemberName().equals("animation_block");
      if (_equals) {
        if ((value instanceof Var)) {
          final AllDecls anim = ((Var)value).getId();
          Var obj = ((MemberSelect)variable).getVariable();
          if ((obj instanceof ElementSelect)) {
            obj = ((ElementSelect)obj).getVariable();
          }
          final AllDecls objId = obj.getId();
          if ((anim instanceof AnimBlock)) {
            final String animType = ((AnimBlock)anim).getParam().getType();
            boolean _not = (!((animType.equals("circle") || animType.equals("rectangle")) || animType.equals("triangle")));
            if (_not) {
              this.error("Not accepted type for an Animation-Handler", assVar);
            }
            if ((objId instanceof ObjDecl)) {
              boolean _equals_1 = ((ObjDecl)objId).getType().equals(animType);
              boolean _not_1 = (!_equals_1);
              if (_not_1) {
                String _type = ((ObjDecl)objId).getType();
                String _plus = ("Animation-Handler must have same type as Object: " + _type);
                this.error(_plus, assVar);
              }
            }
          } else {
            this.error("Animation-Handler expected", assValue);
          }
        }
      }
    }
  }
}
