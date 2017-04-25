package com.nl.sligro.commerce.menucalculator.objects;

import com.ibm.etools.ejb.client.runtime.*;

/**
 * XrecipeGroupFactory
 * @generated
 */
public class XrecipeGroupFactory extends AbstractEJBFactory {

	/**
	 * XrecipeGroupFactory
	 * @generated
	 */
	public XrecipeGroupFactory() {
		super();
	}

	/**
	 * _acquireXrecipeGroupHome
	 * @generated
	 */
	protected com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupHome _acquireXrecipeGroupHome()
		throws java.rmi.RemoteException {
		return (com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupHome) _acquireEJBHome();
	}

	/**
	 * acquireXrecipeGroupHome
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupHome acquireXrecipeGroupHome()
		throws javax.naming.NamingException {
		return (com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupHome) acquireEJBHome();
	}

	/**
	 * getDefaultJNDIName
	 * @generated
	 */
	public String getDefaultJNDIName() {
		return "ejb/com/nl/sligro/commerce/menucalculator/objects/XrecipeGroupHome";
	}

	/**
	 * getHomeInterface
	 * @generated
	 */
	protected Class getHomeInterface() {
		return com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupHome.class;
	}

	/**
	 * resetXrecipeGroupHome
	 * @generated
	 */
	public void resetXrecipeGroupHome() {
		resetEJBHome();
	}

	/**
	 * setXrecipeGroupHome
	 * @generated
	 */
	public void setXrecipeGroupHome(
		com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupHome home) {
		setEJBHome(home);
	}

	/**
	 * findByOrgentityId
	 * @generated
	 */
	public java.util.Enumeration findByOrgentityId(java.lang.Long orgentityId)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException {
		return _acquireXrecipeGroupHome().findByOrgentityId(orgentityId);
	}

	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeGroup findByPrimaryKey(
		com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupKey primaryKey)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException {
		return _acquireXrecipeGroupHome().findByPrimaryKey(primaryKey);
	}

	/**
	 * create
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeGroup create(
		java.lang.Long xrecipeGroupId,
		java.lang.String identifier,
		java.lang.Long createdBy,
		java.lang.Integer markForDelete,
		java.lang.Long orgentityId,
		java.lang.Integer isParentGroup,
		java.lang.String field1,
		java.lang.String field2,
		java.lang.Double field3)
		throws javax.ejb.CreateException,
		java.rmi.RemoteException {
		return _acquireXrecipeGroupHome().create(
			xrecipeGroupId,
			identifier,
			createdBy,
			markForDelete,
			orgentityId,
			isParentGroup,
			field1,
			field2,
			field3);
	}

	/**
	 * create
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeGroup create(
		java.lang.Long xrecipeGroupId)
		throws javax.ejb.CreateException,
		java.rmi.RemoteException {
		return _acquireXrecipeGroupHome().create(xrecipeGroupId);
	}

	/**
	 * findParentRecipeGroupsByOrgId
	 * @generated
	 */
	public java.util.Enumeration findParentRecipeGroupsByOrgId(
		java.lang.Long orgentityId)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException {
		return _acquireXrecipeGroupHome().findParentRecipeGroupsByOrgId(
			orgentityId);
	}
}
