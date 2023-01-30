/**
 * generated by Xtext 2.29.0
 */
package mgpl.mGPL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stmt Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgpl.mGPL.StmtBlock#getStmts <em>Stmts</em>}</li>
 * </ul>
 *
 * @see mgpl.mGPL.MGPLPackage#getStmtBlock()
 * @model
 * @generated
 */
public interface StmtBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Stmts</b></em>' containment reference list.
   * The list contents are of type {@link mgpl.mGPL.Stmt}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stmts</em>' containment reference list.
   * @see mgpl.mGPL.MGPLPackage#getStmtBlock_Stmts()
   * @model containment="true"
   * @generated
   */
  EList<Stmt> getStmts();

} // StmtBlock
