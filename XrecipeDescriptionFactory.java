package com.nl.sligro.commerce.menucalculator.objects;

import com.ibm.etools.ejb.client.runtime.*;

/**
 * XrecipeDescriptionFactory
 * @generated
 */
public class XrecipeDescriptionFactory extends AbstractEJBFactory {

	/**
	 * XrecipeDescriptionFactory
	 * @generated
	 */
	public XrecipeDescriptionFactory() {
		super();
	}

	/**
	 * _acquireXrecipeDescriptionHome
	 * @generated
	 */
	protected com.nl.sligro.commerce.menucalculator.objects.XrecipeDescriptionHome _acquireXrecipeDescriptionHome()
		throws java.rmi.RemoteException {
		return (com.nl.sligro.commerce.menucalculator.objects.XrecipeDescriptionHome) _acquireEJBHome();
	}

	/**
	 * acquireXrecipeDescriptionHome
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeDescriptionHome acquireXrecipeDescriptionHome()
		throws javax.naming.NamingException {
		return (com.nl.sligro.commerce.menucalculator.objects.XrecipeDescriptionHome) acquireEJBHome();
	}

	/**
	 * getDefaultJNDIName
	 * @generated
	 */
	public String getDefaultJNDIName() {
		return "ejb/com/nl/sligro/commerce/menucalculator/objects/XrecipeDescriptionHome";
	}

	/**
	 * getHomeInterface
	 * @generated
	 */
	protected Class getHomeInterface() {
		return com.nl.sligro.commerce.menucalculator.objects.XrecipeDescriptionHome.class;
	}

	/**
	 * resetXrecipeDescriptionHome
	 * @generated
	 */
	public void resetXrecipeDescriptionHome() {
		resetEJBHome();
	}

	/**
	 * setXrecipeDescriptionHome
	 * @generated
	 */
	public void setXrecipeDescriptionHome(
		com.nl.sligro.commerce.menucalculator.objects.XrecipeDescriptionHome home) {
		setEJBHome(home);
	}

	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeDescription findByPrimaryKey(
		com.nl.sligro.commerce.menucalculator.objects.XrecipeDescriptionKey primaryKey)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException {
		return _acquireXrecipeDescriptionHome().findByPrimaryKey(primaryKey);
	}

	/**
	 * findByRecipeIdAndLangId
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeDescription findByRecipeIdAndLangId(
		java.lang.Long xrecipeId,
		java.lang.Integer langId)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException {
		return _acquireXrecipeDescriptionHome().findByRecipeIdAndLangId(
			xrecipeId,
			langId);
	}

	/**
	 * create
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeDescription create(
		java.lang.Long xrecipeId,
		java.lang.Integer langId,
		java.lang.String name,
		java.lang.String shortDescription,
		java.lang.String longDescription,
		java.lang.String thumbnail,
		java.lang.String comment,
		java.lang.String field1,
		java.lang.String field2,
		java.lang.Double field3)
		throws javax.ejb.CreateException,
		java.rmi.RemoteException {
		return _acquireXrecipeDescriptionHome().create(
			xrecipeId,
			langId,
			name,
			shortDescription,
			longDescription,
			thumbnail,
			comment,
			field1,
			field2,
			field3);
	}

	/**
	 * create
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeDescription create(
		java.lang.Long xrecipeId,
		java.lang.Integer langId)
		throws javax.ejb.CreateException,
		java.rmi.RemoteException {
		return _acquireXrecipeDescriptionHome().create(xrecipeId, langId);
	}

	/**
	 * findByName
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeDescription findByName(
		java.lang.String name)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException {
		return _acquireXrecipeDescriptionHome().findByName(name);
	}

	/**
	 * findByNameAndLangId
	 * @generated
	 */
	public java.util.Enumeration findByNameAndLangId(
		java.lang.String name,
		java.lang.Long langId)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException {
		return _acquireXrecipeDescriptionHome().findByNameAndLangId(
			name,
			langId);
	}
}
