package com.nl.sligro.commerce.menucalculator.objects;

import com.ibm.etools.ejb.client.runtime.*;

/**
 * XrecipeTypeDescriptionFactory
 * @generated
 */
public class XrecipeTypeDescriptionFactory extends AbstractEJBFactory {

	/**
	 * XrecipeTypeDescriptionFactory
	 * @generated
	 */
	public XrecipeTypeDescriptionFactory() {
		super();
	}

	/**
	 * _acquireXrecipeTypeDescriptionHome
	 * @generated
	 */
	protected com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeDescriptionHome _acquireXrecipeTypeDescriptionHome()
		throws java.rmi.RemoteException {
		return (com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeDescriptionHome) _acquireEJBHome();
	}

	/**
	 * acquireXrecipeTypeDescriptionHome
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeDescriptionHome acquireXrecipeTypeDescriptionHome()
		throws javax.naming.NamingException {
		return (com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeDescriptionHome) acquireEJBHome();
	}

	/**
	 * getDefaultJNDIName
	 * @generated
	 */
	public String getDefaultJNDIName() {
		return "ejb/com/nl/sligro/commerce/menucalculator/objects/XrecipeTypeDescriptionHome";
	}

	/**
	 * getHomeInterface
	 * @generated
	 */
	protected Class getHomeInterface() {
		return com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeDescriptionHome.class;
	}

	/**
	 * resetXrecipeTypeDescriptionHome
	 * @generated
	 */
	public void resetXrecipeTypeDescriptionHome() {
		resetEJBHome();
	}

	/**
	 * setXrecipeTypeDescriptionHome
	 * @generated
	 */
	public void setXrecipeTypeDescriptionHome(
		com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeDescriptionHome home) {
		setEJBHome(home);
	}

	/**
	 * create
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeDescription create(
		java.lang.Integer xrecipeTypeId,
		java.lang.Integer langId,
		java.lang.String name,
		java.lang.String description,
		java.lang.String field1,
		java.lang.String field2,
		java.lang.Double field3)
		throws javax.ejb.CreateException,
		java.rmi.RemoteException {
		return _acquireXrecipeTypeDescriptionHome().create(
			xrecipeTypeId,
			langId,
			name,
			description,
			field1,
			field2,
			field3);
	}

	/**
	 * findByXrecipeTypeIdAndLangId
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeDescription findByXrecipeTypeIdAndLangId(
		java.lang.Integer xrecipeTypeId,
		java.lang.Integer langId)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException {
		return _acquireXrecipeTypeDescriptionHome()
			.findByXrecipeTypeIdAndLangId(xrecipeTypeId, langId);
	}

	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeDescription findByPrimaryKey(
		com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeDescriptionKey primaryKey)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException {
		return _acquireXrecipeTypeDescriptionHome()
			.findByPrimaryKey(primaryKey);
	}

	/**
	 * create
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeDescription create(
		java.lang.Integer xrecipeTypeId,
		java.lang.Integer langId)
		throws javax.ejb.CreateException,
		java.rmi.RemoteException {
		return _acquireXrecipeTypeDescriptionHome().create(
			xrecipeTypeId,
			langId);
	}

	/**
	 * findByXrecipeTypeNameAndLangId
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeDescription findByXrecipeTypeNameAndLangId(
		java.lang.String name,
		java.lang.Integer langId)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException {
		return _acquireXrecipeTypeDescriptionHome()
			.findByXrecipeTypeNameAndLangId(name, langId);
	}
}
