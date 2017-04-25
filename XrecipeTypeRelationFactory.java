package com.nl.sligro.commerce.menucalculator.objects;

import com.ibm.etools.ejb.client.runtime.*;

/**
 * XrecipeTypeRelationFactory
 * @generated
 */
public class XrecipeTypeRelationFactory extends AbstractEJBFactory {

	/**
	 * XrecipeTypeRelationFactory
	 * @generated
	 */
	public XrecipeTypeRelationFactory() {
		super();
	}

	/**
	 * _acquireXrecipeTypeRelationHome
	 * @generated
	 */
	protected com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeRelationHome _acquireXrecipeTypeRelationHome()
		throws java.rmi.RemoteException {
		return (com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeRelationHome) _acquireEJBHome();
	}

	/**
	 * acquireXrecipeTypeRelationHome
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeRelationHome acquireXrecipeTypeRelationHome()
		throws javax.naming.NamingException {
		return (com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeRelationHome) acquireEJBHome();
	}

	/**
	 * getDefaultJNDIName
	 * @generated
	 */
	public String getDefaultJNDIName() {
		return "ejb/com/nl/sligro/commerce/menucalculator/objects/XrecipeTypeRelationHome";
	}

	/**
	 * getHomeInterface
	 * @generated
	 */
	protected Class getHomeInterface() {
		return com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeRelationHome.class;
	}

	/**
	 * resetXrecipeTypeRelationHome
	 * @generated
	 */
	public void resetXrecipeTypeRelationHome() {
		resetEJBHome();
	}

	/**
	 * setXrecipeTypeRelationHome
	 * @generated
	 */
	public void setXrecipeTypeRelationHome(
		com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeRelationHome home) {
		setEJBHome(home);
	}

	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeRelation findByPrimaryKey(
		com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeRelationKey primaryKey)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException {
		return _acquireXrecipeTypeRelationHome().findByPrimaryKey(primaryKey);
	}

	/**
	 * findByRecipeId
	 * @generated
	 */
	public java.util.Enumeration findByRecipeId(java.lang.Long xrecipeId)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException {
		return _acquireXrecipeTypeRelationHome().findByRecipeId(xrecipeId);
	}

	/**
	 * create
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeRelation create(
		java.lang.Integer xrecipeTypeId,
		java.lang.Long xrecipeId,
		java.lang.Double sequence,
		java.lang.String field1,
		java.lang.String field2,
		java.lang.Double field3)
		throws javax.ejb.CreateException,
		java.rmi.RemoteException {
		return _acquireXrecipeTypeRelationHome().create(
			xrecipeTypeId,
			xrecipeId,
			sequence,
			field1,
			field2,
			field3);
	}

	/**
	 * create
	 * @generated
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeRelation create(
		java.lang.Integer xrecipeTypeId,
		java.lang.Long xrecipeId)
		throws javax.ejb.CreateException,
		java.rmi.RemoteException {
		return _acquireXrecipeTypeRelationHome().create(
			xrecipeTypeId,
			xrecipeId);
	}

	/**
	 * findByRecipeIdandTypeId
	 * @generated
	 */
	public java.util.Enumeration findByRecipeIdandTypeId(
		java.lang.Long recipeId,
		java.lang.Integer recipeType_id)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException {
		return _acquireXrecipeTypeRelationHome().findByRecipeIdandTypeId(
			recipeId,
			recipeType_id);
	}
}
