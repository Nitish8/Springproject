package com.nl.sligro.commerce.menucalculator.objects;

import com.ibm.etools.ejb.client.runtime.*;

/**
 * XingredientFactory
 * @generated
 */
public class XingredientFactory extends AbstractEJBFactory {

	/**
	 * XingredientFactory
	 * @generated
	 */
	public XingredientFactory() {
		super();
	}

	/**
	 * _acquireXingredientHome
	 * @generated
	 */
	protected com.nl.sligro.commerce.menucalculator.objects.XingredientHome _acquireXingredientHome()
		throws java.rmi.RemoteException {
		return (com.nl.sligro.commerce.menucalculator.objects.XingredientHome) _acquireEJBHome();
	}

	/**
	 * acquireXingredientHome
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XingredientHome acquireXingredientHome()
		throws javax.naming.NamingException {
		return (com.nl.sligro.commerce.menucalculator.objects.XingredientHome) acquireEJBHome();
	}

	/**
	 * getDefaultJNDIName
	 * @generated
	 */
	public String getDefaultJNDIName() {
		return "ejb/com/nl/sligro/commerce/menucalculator/objects/XingredientHome";
	}

	/**
	 * getHomeInterface
	 * @generated
	 */
	protected Class getHomeInterface() {
		return com.nl.sligro.commerce.menucalculator.objects.XingredientHome.class;
	}

	/**
	 * resetXingredientHome
	 * @generated
	 */
	public void resetXingredientHome() {
		resetEJBHome();
	}

	/**
	 * setXingredientHome
	 * @generated
	 */
	public void setXingredientHome(
		com.nl.sligro.commerce.menucalculator.objects.XingredientHome home) {
		setEJBHome(home);
	}

	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.Xingredient findByPrimaryKey(
		com.nl.sligro.commerce.menucalculator.objects.XingredientKey primaryKey)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException {
		return _acquireXingredientHome().findByPrimaryKey(primaryKey);
	}

	/**
	 * create
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.Xingredient create(
		java.lang.Long xingredientId)
		throws javax.ejb.CreateException,
		java.rmi.RemoteException {
		return _acquireXingredientHome().create(xingredientId);
	}

	/**
	 * findByOrgentityIdOrderByLastUpdated
	 * @generated
	 */
	public java.util.Enumeration findByOrgentityIdOrderByLastUpdated(
		java.lang.Long orgentityId)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException {
		return _acquireXingredientHome().findByOrgentityIdOrderByLastUpdated(
			orgentityId);
	}

	/**
	 * create
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.Xingredient create(
		java.lang.Long xingredientId,
		java.lang.Long orgentityId,
		java.lang.Long catentryId,
		java.lang.String identifer,
		java.lang.String unitOfMeasure,
		java.math.BigDecimal listPrice,
		java.sql.Timestamp lastUpdate,
		java.lang.String field1,
		java.lang.String field2,
		java.lang.Double field3)
		throws javax.ejb.CreateException,
		java.rmi.RemoteException {
		return _acquireXingredientHome().create(
			xingredientId,
			orgentityId,
			catentryId,
			identifer,
			unitOfMeasure,
			listPrice,
			lastUpdate,
			field1,
			field2,
			field3);
	}

	/**
	 * findByIngredientId
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.Xingredient findByIngredientId(
		java.lang.Long ingredientId)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException {
		return _acquireXingredientHome().findByIngredientId(ingredientId);
	}

	/**
	 * findByCatentryId
	 * @generated
	 */
	public java.util.Enumeration findByCatentryId(java.lang.Long catEntryId)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException {
		return _acquireXingredientHome().findByCatentryId(catEntryId);
	}
}
