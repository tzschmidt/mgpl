/**
 * generated by Xtext 2.29.0
 */
package mgpl.mGPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgpl.mGPL.ArrayDecl#getVariable <em>Variable</em>}</li>
 *   <li>{@link mgpl.mGPL.ArrayDecl#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @see mgpl.mGPL.MGPLPackage#getArrayDecl()
 * @model
 * @generated
 */
public interface ArrayDecl extends VarDecl, ObjDecl
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(Decl)
   * @see mgpl.mGPL.MGPLPackage#getArrayDecl_Variable()
   * @model containment="true"
   * @generated
   */
  Decl getVariable();

  /**
   * Sets the value of the '{@link mgpl.mGPL.ArrayDecl#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(Decl value);

  /**
   * Returns the value of the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Length</em>' attribute.
   * @see #setLength(int)
   * @see mgpl.mGPL.MGPLPackage#getArrayDecl_Length()
   * @model
   * @generated
   */
  int getLength();

  /**
   * Sets the value of the '{@link mgpl.mGPL.ArrayDecl#getLength <em>Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Length</em>' attribute.
   * @see #getLength()
   * @generated
   */
  void setLength(int value);

} // ArrayDecl
