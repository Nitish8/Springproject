package com.nl.sligro.commerce.menucalculator.objects;

import com.ibm.etools.ejb.client.runtime.*;

/**
 * XrecipeTypeFactory
 * @generated
 */
public class XrecipeTypeFactory extends AbstractEJBFactory {

	/**
	 * XrecipeTypeFactory
	 * @generated
	 */
	public XrecipeTypeFactory() {
		super();
	}

	/**
	 * _acquireXrecipeTypeHome
	 * @generated
	 */
	protected com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeHome _acquireXrecipeTypeHome()
		throws java.rmi.RemoteException {
		return (com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeHome) _acquireEJBHome();
	}

	/**
	 * acquireXrecipeTypeHome
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeHome acquireXrecipeTypeHome()
		throws javax.naming.NamingException {
		return (com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeHome) acquireEJBHome();
	}

	/**
	 * getDefaultJNDIName
	 * @generated
	 */
	public String getDefaultJNDIName() {
		return "ejb/com/nl/sligro/commerce/menucalculator/objects/XrecipeTypeHome";
	}

	/**
	 * getHomeInterface
	 * @generated
	 */
	protected Class getHomeInterface() {
		return com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeHome.class;
	}

	/**
	 * resetXrecipeTypeHome
	 * @generated
	 */
	public void resetXrecipeTypeHome() {
		resetEJBHome();
	}

	/**
	 * setXrecipeTypeHome
	 * @generated
	 */
	public void setXrecipeTypeHome(
		com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeHome home) {
		setEJBHome(home);
	}

	/**
	 * create
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeType create(
		java.lang.Long xrecipeTypeId,
		java.lang.String identifier,
		java.lang.String relationType,
		java.lang.Integer selectable,
		java.lang.String field1,
		java.lang.String field2,
		java.lang.Double field3)
		throws javax.ejb.CreateException,
		java.rmi.RemoteException {
		return _acquireXrecipeTypeHome().create(
			xrecipeTypeId,
			identifier,
			relationType,
			selectable,
			field1,
			field2,
			field3);
	}

	/**
	 * findByRelationType
	 * @generated
	 */
	public java.util.Enumeration findByRelationType(
		java.lang.String relationType)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException {
		return _acquireXrecipeTypeHome().findByRelationType(relationType);
	}

	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeType findByPrimaryKey(
		com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeKey primaryKey)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException {
		return _acquireXrecipeTypeHome().findByPrimaryKey(primaryKey);
	}

	/**
	 * create
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeType create(
		java.lang.Long xrecipeTypeId)
		throws javax.ejb.CreateException,
		java.rmi.RemoteException {
		return _acquireXrecipeTypeHome().create(xrecipeTypeId);
	}
}
