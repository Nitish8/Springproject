package com.nl.sligro.commerce.menucalculator.objects;

import com.ibm.etools.ejb.client.runtime.*;

/**
 * XrecipeGroupRelationFactory
 * @generated
 */
public class XrecipeGroupRelationFactory extends AbstractEJBFactory {

	/**
	 * XrecipeGroupRelationFactory
	 * @generated
	 */
	public XrecipeGroupRelationFactory() {
		super();
	}

	/**
	 * _acquireXrecipeGroupRelationHome
	 * @generated
	 */
	protected com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRelationHome _acquireXrecipeGroupRelationHome()
		throws java.rmi.RemoteException {
		return (com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRelationHome) _acquireEJBHome();
	}

	/**
	 * acquireXrecipeGroupRelationHome
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRelationHome acquireXrecipeGroupRelationHome()
		throws javax.naming.NamingException {
		return (com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRelationHome) acquireEJBHome();
	}

	/**
	 * getDefaultJNDIName
	 * @generated
	 */
	public String getDefaultJNDIName() {
		return "ejb/com/nl/sligro/commerce/menucalculator/objects/XrecipeGroupRelationHome";
	}

	/**
	 * getHomeInterface
	 * @generated
	 */
	protected Class getHomeInterface() {
		return com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRelationHome.class;
	}

	/**
	 * resetXrecipeGroupRelationHome
	 * @generated
	 */
	public void resetXrecipeGroupRelationHome() {
		resetEJBHome();
	}

	/**
	 * setXrecipeGroupRelationHome
	 * @generated
	 */
	public void setXrecipeGroupRelationHome(
		com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRelationHome home) {
		setEJBHome(home);
	}

	/**
	 * findByChildRecipeGroupId
	 * @generated
	 */
	public java.util.Enumeration findByChildRecipeGroupId(
		java.lang.Long xrecipeGroupIdChild)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException {
		return _acquireXrecipeGroupRelationHome().findByChildRecipeGroupId(
			xrecipeGroupIdChild);
	}

	/**
	 * findByParentRecipeGroupId
	 * @generated
	 */
	public java.util.Enumeration findByParentRecipeGroupId(
		java.lang.Long xrecipeGroupIdParent)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException {
		return _acquireXrecipeGroupRelationHome().findByParentRecipeGroupId(
			xrecipeGroupIdParent);
	}

	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRelation findByPrimaryKey(
		com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRelationKey primaryKey)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException {
		return _acquireXrecipeGroupRelationHome().findByPrimaryKey(primaryKey);
	}

	/**
	 * create
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRelation create(
		java.lang.Long xrecipeGroupIdParent,
		java.lang.Long xrecipeGroupIdChild)
		throws javax.ejb.CreateException,
		java.rmi.RemoteException {
		return _acquireXrecipeGroupRelationHome().create(
			xrecipeGroupIdParent,
			xrecipeGroupIdChild);
	}

	/**
	 * create
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRelation create(
		java.lang.Long xrecipeGroupIdParent,
		java.lang.Long xrecipeGroupIdChild,
		java.lang.Double sequence,
		java.sql.Timestamp lastUpdated,
		java.lang.Long orgentityId,
		java.lang.String field1,
		java.lang.String field2,
		java.lang.Double field3)
		throws javax.ejb.CreateException,
		java.rmi.RemoteException {
		return _acquireXrecipeGroupRelationHome().create(
			xrecipeGroupIdParent,
			xrecipeGroupIdChild,
			sequence,
			lastUpdated,
			orgentityId,
			field1,
			field2,
			field3);
	}
}
