package com.nl.sligro.commerce.menucalculator.objects;

import com.ibm.etools.ejb.client.runtime.*;

/**
 * XrecipeItemsFactory
 * @generated
 */
public class XrecipeItemsFactory extends AbstractEJBFactory {

	/**
	 * XrecipeItemsFactory
	 * @generated
	 */
	public XrecipeItemsFactory() {
		super();
	}

	/**
	 * _acquireXrecipeItemsHome
	 * @generated
	 */
	protected com.nl.sligro.commerce.menucalculator.objects.XrecipeItemsHome _acquireXrecipeItemsHome()
		throws java.rmi.RemoteException {
		return (com.nl.sligro.commerce.menucalculator.objects.XrecipeItemsHome) _acquireEJBHome();
	}

	/**
	 * acquireXrecipeItemsHome
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeItemsHome acquireXrecipeItemsHome()
		throws javax.naming.NamingException {
		return (com.nl.sligro.commerce.menucalculator.objects.XrecipeItemsHome) acquireEJBHome();
	}

	/**
	 * getDefaultJNDIName
	 * @generated
	 */
	public String getDefaultJNDIName() {
		return "ejb/com/nl/sligro/commerce/menucalculator/objects/XrecipeItemsHome";
	}

	/**
	 * getHomeInterface
	 * @generated
	 */
	protected Class getHomeInterface() {
		return com.nl.sligro.commerce.menucalculator.objects.XrecipeItemsHome.class;
	}

	/**
	 * resetXrecipeItemsHome
	 * @generated
	 */
	public void resetXrecipeItemsHome() {
		resetEJBHome();
	}

	/**
	 * setXrecipeItemsHome
	 * @generated
	 */
	public void setXrecipeItemsHome(
		com.nl.sligro.commerce.menucalculator.objects.XrecipeItemsHome home) {
		setEJBHome(home);
	}

	/**
	 * create
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeItems create(
		java.lang.Long xrecipeitemId,
		java.lang.Long xrecipeId,
		java.lang.Integer storeentId,
		java.lang.Long orgentityId,
		java.sql.Timestamp lastUpdated,
		java.lang.Long xingredientId,
		java.math.BigDecimal requiredQuantity,
		java.lang.Double sequence,
		java.math.BigDecimal price,
		java.lang.String field1,
		java.lang.String field2,
		java.lang.Double field3)
		throws javax.ejb.CreateException,
		java.rmi.RemoteException {
		return _acquireXrecipeItemsHome().create(
			xrecipeitemId,
			xrecipeId,
			storeentId,
			orgentityId,
			lastUpdated,
			xingredientId,
			requiredQuantity,
			sequence,
			price,
			field1,
			field2,
			field3);
	}

	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeItems findByPrimaryKey(
		com.nl.sligro.commerce.menucalculator.objects.XrecipeItemsKey primaryKey)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException {
		return _acquireXrecipeItemsHome().findByPrimaryKey(primaryKey);
	}

	/**
	 * create
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeItems create(
		java.lang.Long xrecipeitemId)
		throws javax.ejb.CreateException,
		java.rmi.RemoteException {
		return _acquireXrecipeItemsHome().create(xrecipeitemId);
	}

	/**
	 * findByRecipeId
	 * @generated
	 */
	public java.util.Enumeration findByRecipeId(java.lang.Long xrecipeId)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException {
		return _acquireXrecipeItemsHome().findByRecipeId(xrecipeId);
	}

	/**
	 * findByIngredientId
	 * @generated
	 */
	public java.util.Enumeration findByIngredientId(java.lang.Long xingredientId)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException {
		return _acquireXrecipeItemsHome().findByIngredientId(xingredientId);
	}

	/**
	 * findByOrgentityId
	 * @generated
	 */
	public java.util.Enumeration findByOrgentityId(java.lang.Long orgentityId)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException {
		return _acquireXrecipeItemsHome().findByOrgentityId(orgentityId);
	}
}
