package com.nl.sligro.commerce.menucalculator.objects;

import com.ibm.etools.ejb.client.runtime.*;

/**
 * XrecipeFactory
 * @generated
 */
public class XrecipeFactory extends AbstractEJBFactory {

	/**
	 * XrecipeFactory
	 * @generated
	 */
	public XrecipeFactory() {
		super();
	}

	/**
	 * _acquireXrecipeHome
	 * @generated
	 */
	protected com.nl.sligro.commerce.menucalculator.objects.XrecipeHome _acquireXrecipeHome()
		throws java.rmi.RemoteException {
		return (com.nl.sligro.commerce.menucalculator.objects.XrecipeHome) _acquireEJBHome();
	}

	/**
	 * acquireXrecipeHome
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeHome acquireXrecipeHome()
		throws javax.naming.NamingException {
		return (com.nl.sligro.commerce.menucalculator.objects.XrecipeHome) acquireEJBHome();
	}

	/**
	 * getDefaultJNDIName
	 * @generated
	 */
	public String getDefaultJNDIName() {
		return "ejb/com/nl/sligro/commerce/menucalculator/objects/XrecipeHome";
	}

	/**
	 * getHomeInterface
	 * @generated
	 */
	protected Class getHomeInterface() {
		return com.nl.sligro.commerce.menucalculator.objects.XrecipeHome.class;
	}

	/**
	 * resetXrecipeHome
	 * @generated
	 */
	public void resetXrecipeHome() {
		resetEJBHome();
	}

	/**
	 * setXrecipeHome
	 * @generated
	 */
	public void setXrecipeHome(
		com.nl.sligro.commerce.menucalculator.objects.XrecipeHome home) {
		setEJBHome(home);
	}

	/**
	 * create
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.Xrecipe create(
		java.lang.Long xrecipeId,
		java.lang.Long orgentityId,
		java.lang.String recipeType,
		java.lang.Integer storeentId,
		java.lang.Long createBy,
		java.lang.String currency,
		java.math.BigDecimal netProductPrice,
		java.math.BigDecimal vat,
		java.math.BigDecimal wastage,
		java.math.BigDecimal marginOfProfit,
		java.lang.Integer persons,
		java.math.BigDecimal grossProductPrice,
		java.lang.Integer markForDelete,
		java.lang.Integer preperationTime,
		java.lang.Integer totalTime,
		java.sql.Timestamp lastUpdated,
		java.lang.Double sequence,
		java.lang.String field1,
		java.lang.String field2,
		java.lang.Double field3)
		throws javax.ejb.CreateException,
		java.rmi.RemoteException {
		return _acquireXrecipeHome().create(
			xrecipeId,
			orgentityId,
			recipeType,
			storeentId,
			createBy,
			currency,
			netProductPrice,
			vat,
			wastage,
			marginOfProfit,
			persons,
			grossProductPrice,
			markForDelete,
			preperationTime,
			totalTime,
			lastUpdated,
			sequence,
			field1,
			field2,
			field3);
	}

	/**
	 * findByOrgentityId
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.Xrecipe findByOrgentityId(
		java.lang.Long orgentityId)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException {
		return _acquireXrecipeHome().findByOrgentityId(orgentityId);
	}

	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.Xrecipe findByPrimaryKey(
		com.nl.sligro.commerce.menucalculator.objects.XrecipeKey primaryKey)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException {
		return _acquireXrecipeHome().findByPrimaryKey(primaryKey);
	}

	/**
	 * create
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.Xrecipe create(
		java.lang.Long xrecipeId)
		throws javax.ejb.CreateException,
		java.rmi.RemoteException {
		return _acquireXrecipeHome().create(xrecipeId);
	}

	/**
	 * findByCreatedBy
	 * @generated
	 */
	public java.util.Enumeration findByCreatedBy(java.lang.Long createdBy)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException {
		return _acquireXrecipeHome().findByCreatedBy(createdBy);
	}
}
