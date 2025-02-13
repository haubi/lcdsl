/**
 * generated by Xtext 2.28.0
 */
package com.wamas.ide.launching.lcDsl.impl;

import com.wamas.ide.launching.lcDsl.LcDslPackage;
import com.wamas.ide.launching.lcDsl.MemoryOption;
import com.wamas.ide.launching.lcDsl.MemoryUnit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.wamas.ide.launching.lcDsl.impl.MemoryOptionImpl#getMin <em>Min</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.impl.MemoryOptionImpl#getMinUnit <em>Min Unit</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.impl.MemoryOptionImpl#getMax <em>Max</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.impl.MemoryOptionImpl#getMaxUnit <em>Max Unit</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.impl.MemoryOptionImpl#getPerm <em>Perm</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.impl.MemoryOptionImpl#getPermUnit <em>Perm Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemoryOptionImpl extends MinimalEObjectImpl.Container implements MemoryOption
{
  /**
   * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMin()
   * @generated
   * @ordered
   */
  protected static final int MIN_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMin()
   * @generated
   * @ordered
   */
  protected int min = MIN_EDEFAULT;

  /**
   * The default value of the '{@link #getMinUnit() <em>Min Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinUnit()
   * @generated
   * @ordered
   */
  protected static final MemoryUnit MIN_UNIT_EDEFAULT = MemoryUnit.MB;

  /**
   * The cached value of the '{@link #getMinUnit() <em>Min Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinUnit()
   * @generated
   * @ordered
   */
  protected MemoryUnit minUnit = MIN_UNIT_EDEFAULT;

  /**
   * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax()
   * @generated
   * @ordered
   */
  protected static final int MAX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax()
   * @generated
   * @ordered
   */
  protected int max = MAX_EDEFAULT;

  /**
   * The default value of the '{@link #getMaxUnit() <em>Max Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxUnit()
   * @generated
   * @ordered
   */
  protected static final MemoryUnit MAX_UNIT_EDEFAULT = MemoryUnit.MB;

  /**
   * The cached value of the '{@link #getMaxUnit() <em>Max Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxUnit()
   * @generated
   * @ordered
   */
  protected MemoryUnit maxUnit = MAX_UNIT_EDEFAULT;

  /**
   * The default value of the '{@link #getPerm() <em>Perm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPerm()
   * @generated
   * @ordered
   */
  protected static final int PERM_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPerm() <em>Perm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPerm()
   * @generated
   * @ordered
   */
  protected int perm = PERM_EDEFAULT;

  /**
   * The default value of the '{@link #getPermUnit() <em>Perm Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPermUnit()
   * @generated
   * @ordered
   */
  protected static final MemoryUnit PERM_UNIT_EDEFAULT = MemoryUnit.MB;

  /**
   * The cached value of the '{@link #getPermUnit() <em>Perm Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPermUnit()
   * @generated
   * @ordered
   */
  protected MemoryUnit permUnit = PERM_UNIT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MemoryOptionImpl()
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
    return LcDslPackage.Literals.MEMORY_OPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getMin()
  {
    return min;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMin(int newMin)
  {
    int oldMin = min;
    min = newMin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LcDslPackage.MEMORY_OPTION__MIN, oldMin, min));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MemoryUnit getMinUnit()
  {
    return minUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMinUnit(MemoryUnit newMinUnit)
  {
    MemoryUnit oldMinUnit = minUnit;
    minUnit = newMinUnit == null ? MIN_UNIT_EDEFAULT : newMinUnit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LcDslPackage.MEMORY_OPTION__MIN_UNIT, oldMinUnit, minUnit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getMax()
  {
    return max;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMax(int newMax)
  {
    int oldMax = max;
    max = newMax;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LcDslPackage.MEMORY_OPTION__MAX, oldMax, max));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MemoryUnit getMaxUnit()
  {
    return maxUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMaxUnit(MemoryUnit newMaxUnit)
  {
    MemoryUnit oldMaxUnit = maxUnit;
    maxUnit = newMaxUnit == null ? MAX_UNIT_EDEFAULT : newMaxUnit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LcDslPackage.MEMORY_OPTION__MAX_UNIT, oldMaxUnit, maxUnit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getPerm()
  {
    return perm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPerm(int newPerm)
  {
    int oldPerm = perm;
    perm = newPerm;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LcDslPackage.MEMORY_OPTION__PERM, oldPerm, perm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MemoryUnit getPermUnit()
  {
    return permUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPermUnit(MemoryUnit newPermUnit)
  {
    MemoryUnit oldPermUnit = permUnit;
    permUnit = newPermUnit == null ? PERM_UNIT_EDEFAULT : newPermUnit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LcDslPackage.MEMORY_OPTION__PERM_UNIT, oldPermUnit, permUnit));
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
      case LcDslPackage.MEMORY_OPTION__MIN:
        return getMin();
      case LcDslPackage.MEMORY_OPTION__MIN_UNIT:
        return getMinUnit();
      case LcDslPackage.MEMORY_OPTION__MAX:
        return getMax();
      case LcDslPackage.MEMORY_OPTION__MAX_UNIT:
        return getMaxUnit();
      case LcDslPackage.MEMORY_OPTION__PERM:
        return getPerm();
      case LcDslPackage.MEMORY_OPTION__PERM_UNIT:
        return getPermUnit();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LcDslPackage.MEMORY_OPTION__MIN:
        setMin((Integer)newValue);
        return;
      case LcDslPackage.MEMORY_OPTION__MIN_UNIT:
        setMinUnit((MemoryUnit)newValue);
        return;
      case LcDslPackage.MEMORY_OPTION__MAX:
        setMax((Integer)newValue);
        return;
      case LcDslPackage.MEMORY_OPTION__MAX_UNIT:
        setMaxUnit((MemoryUnit)newValue);
        return;
      case LcDslPackage.MEMORY_OPTION__PERM:
        setPerm((Integer)newValue);
        return;
      case LcDslPackage.MEMORY_OPTION__PERM_UNIT:
        setPermUnit((MemoryUnit)newValue);
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
      case LcDslPackage.MEMORY_OPTION__MIN:
        setMin(MIN_EDEFAULT);
        return;
      case LcDslPackage.MEMORY_OPTION__MIN_UNIT:
        setMinUnit(MIN_UNIT_EDEFAULT);
        return;
      case LcDslPackage.MEMORY_OPTION__MAX:
        setMax(MAX_EDEFAULT);
        return;
      case LcDslPackage.MEMORY_OPTION__MAX_UNIT:
        setMaxUnit(MAX_UNIT_EDEFAULT);
        return;
      case LcDslPackage.MEMORY_OPTION__PERM:
        setPerm(PERM_EDEFAULT);
        return;
      case LcDslPackage.MEMORY_OPTION__PERM_UNIT:
        setPermUnit(PERM_UNIT_EDEFAULT);
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
      case LcDslPackage.MEMORY_OPTION__MIN:
        return min != MIN_EDEFAULT;
      case LcDslPackage.MEMORY_OPTION__MIN_UNIT:
        return minUnit != MIN_UNIT_EDEFAULT;
      case LcDslPackage.MEMORY_OPTION__MAX:
        return max != MAX_EDEFAULT;
      case LcDslPackage.MEMORY_OPTION__MAX_UNIT:
        return maxUnit != MAX_UNIT_EDEFAULT;
      case LcDslPackage.MEMORY_OPTION__PERM:
        return perm != PERM_EDEFAULT;
      case LcDslPackage.MEMORY_OPTION__PERM_UNIT:
        return permUnit != PERM_UNIT_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (min: ");
    result.append(min);
    result.append(", minUnit: ");
    result.append(minUnit);
    result.append(", max: ");
    result.append(max);
    result.append(", maxUnit: ");
    result.append(maxUnit);
    result.append(", perm: ");
    result.append(perm);
    result.append(", permUnit: ");
    result.append(permUnit);
    result.append(')');
    return result.toString();
  }

} //MemoryOptionImpl
