package com.nl.sligro.commerce.menucalculator.objects;

import com.ibm.etools.ejb.client.runtime.*;

/**
 * XrecipeGroupRecipeRelationFactory
 * @generated
 */
public class XrecipeGroupRecipeRelationFactory extends AbstractEJBFactory {

	/**
	 * XrecipeGroupRecipeRelationFactory
	 * @generated
	 */
	public XrecipeGroupRecipeRelationFactory() {
		super();
	}

	/**
	 * _acquireXrecipeGroupRecipeRelationHome
	 * @generated
	 */
	protected com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRecipeRelationHome _acquireXrecipeGroupRecipeRelationHome()
		throws java.rmi.RemoteException {
		return (com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRecipeRelationHome) _acquireEJBHome();
	}

	/**
	 * acquireXrecipeGroupRecipeRelationHome
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRecipeRelationHome acquireXrecipeGroupRecipeRelationHome()
		throws javax.naming.NamingException {
		return (com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRecipeRelationHome) acquireEJBHome();
	}

	/**
	 * getDefaultJNDIName
	 * @generated
	 */
	public String getDefaultJNDIName() {
		return "ejb/com/nl/sligro/commerce/menucalculator/objects/XrecipeGroupRecipeRelationHome";
	}

	/**
	 * getHomeInterface
	 * @generated
	 */
	protected Class getHomeInterface() {
		return com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRecipeRelationHome.class;
	}

	/**
	 * resetXrecipeGroupRecipeRelationHome
	 * @generated
	 */
	public void resetXrecipeGroupRecipeRelationHome() {
		resetEJBHome();
	}

	/**
	 * setXrecipeGroupRecipeRelationHome
	 * @generated
	 */
	public void setXrecipeGroupRecipeRelationHome(
		com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRecipeRelationHome home) {
		setEJBHome(home);
	}

	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRecipeRelation findByPrimaryKey(
		com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRecipeRelationKey primaryKey)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException {
		return _acquireXrecipeGroupRecipeRelationHome().findByPrimaryKey(
			primaryKey);
	}

	/**
	 * create
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRecipeRelation create(
		java.lang.Long xrecipeGroupId,
		java.lang.Long xrecipeId)
		throws javax.ejb.CreateException,
		java.rmi.RemoteException {
		return _acquireXrecipeGroupRecipeRelationHome().create(
			xrecipeGroupId,
			xrecipeId);
	}

	/**
	 * findByRecipeId
	 * @generated
	 */
	public java.util.Enumeration findByRecipeId(java.lang.Long xrecipeId)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException {
		return _acquireXrecipeGroupRecipeRelationHome().findByRecipeId(
			xrecipeId);
	}

	/**
	 * create
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRecipeRelation create(
		java.lang.Long xrecipeGroupId,
		java.lang.Long xrecipeId,
		java.lang.Double sequence,
		java.sql.Timestamp lastUpdated,
		java.lang.Integer numberOfPersons,
		java.lang.String field1,
		java.lang.String field2,
		java.lang.Double field3)
		throws javax.ejb.CreateException,
		java.rmi.RemoteException {
		return _acquireXrecipeGroupRecipeRelationHome().create(
			xrecipeGroupId,
			xrecipeId,
			sequence,
			lastUpdated,
			numberOfPersons,
			field1,
			field2,
			field3);
	}

	/**
	 * findByRecipeGroupId
	 * @generated
	 */
	public java.util.Enumeration findByRecipeGroupId(
		java.lang.Long xrecipeGroupId)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException {
		return _acquireXrecipeGroupRecipeRelationHome().findByRecipeGroupId(
			xrecipeGroupId);
	}
}
