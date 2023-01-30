/**
 * generated by Xtext 2.29.0
 */
package mgpl.mGPL.impl;

import java.util.Collection;

import mgpl.mGPL.AttrAss;
import mgpl.mGPL.Block;
import mgpl.mGPL.Decl;
import mgpl.mGPL.MGPLPackage;
import mgpl.mGPL.Prog;
import mgpl.mGPL.StmtBlock;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mgpl.mGPL.impl.ProgImpl#getAttr <em>Attr</em>}</li>
 *   <li>{@link mgpl.mGPL.impl.ProgImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link mgpl.mGPL.impl.ProgImpl#getInit <em>Init</em>}</li>
 *   <li>{@link mgpl.mGPL.impl.ProgImpl#getBlocks <em>Blocks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgImpl extends AllDeclsImpl implements Prog
{
  /**
   * The cached value of the '{@link #getAttr() <em>Attr</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttr()
   * @generated
   * @ordered
   */
  protected EList<AttrAss> attr;

  /**
   * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclarations()
   * @generated
   * @ordered
   */
  protected EList<Decl> declarations;

  /**
   * The cached value of the '{@link #getInit() <em>Init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInit()
   * @generated
   * @ordered
   */
  protected StmtBlock init;

  /**
   * The cached value of the '{@link #getBlocks() <em>Blocks</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlocks()
   * @generated
   * @ordered
   */
  protected EList<Block> blocks;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProgImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MGPLPackage.Literals.PROG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<AttrAss> getAttr()
  {
    if (attr == null)
    {
      attr = new EObjectContainmentEList<AttrAss>(AttrAss.class, this, MGPLPackage.PROG__ATTR);
    }
    return attr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Decl> getDeclarations()
  {
    if (declarations == null)
    {
      declarations = new EObjectContainmentEList<Decl>(Decl.class, this, MGPLPackage.PROG__DECLARATIONS);
    }
    return declarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StmtBlock getInit()
  {
    return init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInit(StmtBlock newInit, NotificationChain msgs)
  {
    StmtBlock oldInit = init;
    init = newInit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MGPLPackage.PROG__INIT, oldInit, newInit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInit(StmtBlock newInit)
  {
    if (newInit != init)
    {
      NotificationChain msgs = null;
      if (init != null)
        msgs = ((InternalEObject)init).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MGPLPackage.PROG__INIT, null, msgs);
      if (newInit != null)
        msgs = ((InternalEObject)newInit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MGPLPackage.PROG__INIT, null, msgs);
      msgs = basicSetInit(newInit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MGPLPackage.PROG__INIT, newInit, newInit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Block> getBlocks()
  {
    if (blocks == null)
    {
      blocks = new EObjectContainmentEList<Block>(Block.class, this, MGPLPackage.PROG__BLOCKS);
    }
    return blocks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MGPLPackage.PROG__ATTR:
        return ((InternalEList<?>)getAttr()).basicRemove(otherEnd, msgs);
      case MGPLPackage.PROG__DECLARATIONS:
        return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
      case MGPLPackage.PROG__INIT:
        return basicSetInit(null, msgs);
      case MGPLPackage.PROG__BLOCKS:
        return ((InternalEList<?>)getBlocks()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MGPLPackage.PROG__ATTR:
        return getAttr();
      case MGPLPackage.PROG__DECLARATIONS:
        return getDeclarations();
      case MGPLPackage.PROG__INIT:
        return getInit();
      case MGPLPackage.PROG__BLOCKS:
        return getBlocks();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MGPLPackage.PROG__ATTR:
        getAttr().clear();
        getAttr().addAll((Collection<? extends AttrAss>)newValue);
        return;
      case MGPLPackage.PROG__DECLARATIONS:
        getDeclarations().clear();
        getDeclarations().addAll((Collection<? extends Decl>)newValue);
        return;
      case MGPLPackage.PROG__INIT:
        setInit((StmtBlock)newValue);
        return;
      case MGPLPackage.PROG__BLOCKS:
        getBlocks().clear();
        getBlocks().addAll((Collection<? extends Block>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MGPLPackage.PROG__ATTR:
        getAttr().clear();
        return;
      case MGPLPackage.PROG__DECLARATIONS:
        getDeclarations().clear();
        return;
      case MGPLPackage.PROG__INIT:
        setInit((StmtBlock)null);
        return;
      case MGPLPackage.PROG__BLOCKS:
        getBlocks().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MGPLPackage.PROG__ATTR:
        return attr != null && !attr.isEmpty();
      case MGPLPackage.PROG__DECLARATIONS:
        return declarations != null && !declarations.isEmpty();
      case MGPLPackage.PROG__INIT:
        return init != null;
      case MGPLPackage.PROG__BLOCKS:
        return blocks != null && !blocks.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ProgImpl
