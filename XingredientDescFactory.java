package com.nl.sligro.commerce.menucalculator.objects;

import com.ibm.etools.ejb.client.runtime.*;

/**
 * XingredientDescFactory
 * @generated
 */
public class XingredientDescFactory extends AbstractEJBFactory {

	/**
	 * XingredientDescFactory
	 * @generated
	 */
	public XingredientDescFactory() {
		super();
	}

	/**
	 * _acquireXingredientDescHome
	 * @generated
	 */
	protected com.nl.sligro.commerce.menucalculator.objects.XingredientDescHome _acquireXingredientDescHome()
		throws java.rmi.RemoteException {
		return (com.nl.sligro.commerce.menucalculator.objects.XingredientDescHome) _acquireEJBHome();
	}

	/**
	 * acquireXingredientDescHome
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XingredientDescHome acquireXingredientDescHome()
		throws javax.naming.NamingException {
		return (com.nl.sligro.commerce.menucalculator.objects.XingredientDescHome) acquireEJBHome();
	}

	/**
	 * getDefaultJNDIName
	 * @generated
	 */
	public String getDefaultJNDIName() {
		return "ejb/com/nl/sligro/commerce/menucalculator/objects/XingredientDescHome";
	}

	/**
	 * getHomeInterface
	 * @generated
	 */
	protected Class getHomeInterface() {
		return com.nl.sligro.commerce.menucalculator.objects.XingredientDescHome.class;
	}

	/**
	 * resetXingredientDescHome
	 * @generated
	 */
	public void resetXingredientDescHome() {
		resetEJBHome();
	}

	/**
	 * setXingredientDescHome
	 * @generated
	 */
	public void setXingredientDescHome(
		com.nl.sligro.commerce.menucalculator.objects.XingredientDescHome home) {
		setEJBHome(home);
	}

	/**
	 * create
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XingredientDesc create(
		java.lang.Long xingredientId,
		java.lang.Integer langId,
		java.lang.String name,
		java.lang.String description,
		java.lang.String field1,
		java.lang.String field2,
		java.lang.Double field3)
		throws javax.ejb.CreateException,
		java.rmi.RemoteException {
		return _acquireXingredientDescHome().create(
			xingredientId,
			langId,
			name,
			description,
			field1,
			field2,
			field3);
	}

	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XingredientDesc findByPrimaryKey(
		com.nl.sligro.commerce.menucalculator.objects.XingredientDescKey primaryKey)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException {
		return _acquireXingredientDescHome().findByPrimaryKey(primaryKey);
	}

	/**
	 * create
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XingredientDesc create(
		java.lang.Long xingredientId,
		java.lang.Integer langId)
		throws javax.ejb.CreateException,
		java.rmi.RemoteException {
		return _acquireXingredientDescHome().create(xingredientId, langId);
	}

	/**
	 * findByNameAndLanguage
	 * @generated
	 */
	public java.util.Enumeration findByNameAndLanguage(
		java.lang.String name,
		java.lang.Integer langId)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException {
		return _acquireXingredientDescHome()
			.findByNameAndLanguage(name, langId);
	}
}
