/**
 * generated by Xtext 2.29.0
 */
package mgpl.mGPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equals</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgpl.mGPL.Equals#getLeft <em>Left</em>}</li>
 *   <li>{@link mgpl.mGPL.Equals#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see mgpl.mGPL.MGPLPackage#getEquals()
 * @model
 * @generated
 */
public interface Equals extends Expr
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expr)
   * @see mgpl.mGPL.MGPLPackage#getEquals_Left()
   * @model containment="true"
   * @generated
   */
  Expr getLeft();

  /**
   * Sets the value of the '{@link mgpl.mGPL.Equals#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expr value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Expr)
   * @see mgpl.mGPL.MGPLPackage#getEquals_Right()
   * @model containment="true"
   * @generated
   */
  Expr getRight();

  /**
   * Sets the value of the '{@link mgpl.mGPL.Equals#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expr value);

} // Equals
