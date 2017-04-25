package com.nl.sligro.commerce.menucalculator.objects;

import com.ibm.etools.ejb.client.runtime.*;

/**
 * XrecipeShareFactory
 * @generated
 */
public class XrecipeShareFactory extends AbstractEJBFactory {

	/**
	 * XrecipeShareFactory
	 * @generated
	 */
	public XrecipeShareFactory() {
		super();
	}

	/**
	 * _acquireXrecipeShareHome
	 * @generated
	 */
	protected com.nl.sligro.commerce.menucalculator.objects.XrecipeShareHome _acquireXrecipeShareHome()
		throws java.rmi.RemoteException {
		return (com.nl.sligro.commerce.menucalculator.objects.XrecipeShareHome) _acquireEJBHome();
	}

	/**
	 * acquireXrecipeShareHome
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeShareHome acquireXrecipeShareHome()
		throws javax.naming.NamingException {
		return (com.nl.sligro.commerce.menucalculator.objects.XrecipeShareHome) acquireEJBHome();
	}

	/**
	 * getDefaultJNDIName
	 * @generated
	 */
	public String getDefaultJNDIName() {
		return "ejb/com/nl/sligro/commerce/menucalculator/objects/XrecipeShareHome";
	}

	/**
	 * getHomeInterface
	 * @generated
	 */
	protected Class getHomeInterface() {
		return com.nl.sligro.commerce.menucalculator.objects.XrecipeShareHome.class;
	}

	/**
	 * resetXrecipeShareHome
	 * @generated
	 */
	public void resetXrecipeShareHome() {
		resetEJBHome();
	}

	/**
	 * setXrecipeShareHome
	 * @generated
	 */
	public void setXrecipeShareHome(
		com.nl.sligro.commerce.menucalculator.objects.XrecipeShareHome home) {
		setEJBHome(home);
	}

	/**
	 * findByOrgentityIdOwner
	 * @generated
	 */
	public java.util.Enumeration findByOrgentityIdOwner(
		java.lang.Long orgentityIdOwner)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException {
		return _acquireXrecipeShareHome().findByOrgentityIdOwner(
			orgentityIdOwner);
	}

	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeShare findByPrimaryKey(
		com.nl.sligro.commerce.menucalculator.objects.XrecipeShareKey primaryKey)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException {
		return _acquireXrecipeShareHome().findByPrimaryKey(primaryKey);
	}

	/**
	 * findByRecipeId
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeShare findByRecipeId(
		java.lang.Long xrecipeId)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException {
		return _acquireXrecipeShareHome().findByRecipeId(xrecipeId);
	}

	/**
	 * create
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeShare create(
		java.lang.Long xrecipeId,
		java.lang.Long orgentityIdOwner,
		java.lang.Long orgentityIdSharedWith,
		java.lang.Double sequence,
		java.lang.String field1,
		java.lang.String field2,
		java.lang.Double field3)
		throws javax.ejb.CreateException,
		java.rmi.RemoteException {
		return _acquireXrecipeShareHome().create(
			xrecipeId,
			orgentityIdOwner,
			orgentityIdSharedWith,
			sequence,
			field1,
			field2,
			field3);
	}

	/**
	 * create
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeShare create(
		java.lang.Long xrecipeId,
		java.lang.Long orgentityIdOwner,
		java.lang.Long orgentityIdSharedWith)
		throws javax.ejb.CreateException,
		java.rmi.RemoteException {
		return _acquireXrecipeShareHome().create(
			xrecipeId,
			orgentityIdOwner,
			orgentityIdSharedWith);
	}

	/**
	 * findByOrgentityIdSharedWith
	 * @generated
	 */
	public java.util.Enumeration findByOrgentityIdSharedWith(
		java.lang.Long orgentityIdSharedWith)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException {
		return _acquireXrecipeShareHome().findByOrgentityIdSharedWith(
			orgentityIdSharedWith);
	}
}
