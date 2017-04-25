package com.nl.sligro.commerce.menucalculator.objects;

import com.ibm.etools.ejb.client.runtime.*;

/**
 * XrecipeGroupDescriptionFactory
 * @generated
 */
public class XrecipeGroupDescriptionFactory extends AbstractEJBFactory {

	/**
	 * XrecipeGroupDescriptionFactory
	 * @generated
	 */
	public XrecipeGroupDescriptionFactory() {
		super();
	}

	/**
	 * _acquireXrecipeGroupDescriptionHome
	 * @generated
	 */
	protected com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupDescriptionHome _acquireXrecipeGroupDescriptionHome()
		throws java.rmi.RemoteException {
		return (com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupDescriptionHome) _acquireEJBHome();
	}

	/**
	 * acquireXrecipeGroupDescriptionHome
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupDescriptionHome acquireXrecipeGroupDescriptionHome()
		throws javax.naming.NamingException {
		return (com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupDescriptionHome) acquireEJBHome();
	}

	/**
	 * getDefaultJNDIName
	 * @generated
	 */
	public String getDefaultJNDIName() {
		return "ejb/com/nl/sligro/commerce/menucalculator/objects/XrecipeGroupDescriptionHome";
	}

	/**
	 * getHomeInterface
	 * @generated
	 */
	protected Class getHomeInterface() {
		return com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupDescriptionHome.class;
	}

	/**
	 * resetXrecipeGroupDescriptionHome
	 * @generated
	 */
	public void resetXrecipeGroupDescriptionHome() {
		resetEJBHome();
	}

	/**
	 * setXrecipeGroupDescriptionHome
	 * @generated
	 */
	public void setXrecipeGroupDescriptionHome(
		com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupDescriptionHome home) {
		setEJBHome(home);
	}

	/**
	 * findByName
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupDescription findByName(
		java.lang.String name)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException {
		return _acquireXrecipeGroupDescriptionHome().findByName(name);
	}

	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupDescription findByPrimaryKey(
		com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupDescriptionKey primaryKey)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException {
		return _acquireXrecipeGroupDescriptionHome().findByPrimaryKey(
			primaryKey);
	}

	/**
	 * create
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupDescription create(
		java.lang.Long xrecipeGroupId,
		java.lang.Integer langId,
		java.lang.String name,
		java.lang.String shortDescription,
		java.lang.String longDescription,
		java.sql.Timestamp lastUpdated,
		java.lang.Double sequence,
		java.lang.String field1,
		java.lang.String field2,
		java.lang.Double field3)
		throws javax.ejb.CreateException,
		java.rmi.RemoteException {
		return _acquireXrecipeGroupDescriptionHome().create(
			xrecipeGroupId,
			langId,
			name,
			shortDescription,
			longDescription,
			lastUpdated,
			sequence,
			field1,
			field2,
			field3);
	}

	/**
	 * create
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupDescription create(
		java.lang.Long xrecipeGroupId,
		java.lang.Integer langId)
		throws javax.ejb.CreateException,
		java.rmi.RemoteException {
		return _acquireXrecipeGroupDescriptionHome().create(
			xrecipeGroupId,
			langId);
	}
}
