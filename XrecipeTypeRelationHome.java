package com.nl.sligro.commerce.menucalculator.objects;

/**
 * Home interface for Enterprise Bean: XrecipeTypeRelation
 */
public interface XrecipeTypeRelationHome extends javax.ejb.EJBHome {

	/**
	 * Creates an instance from a key for Entity Bean: XrecipeTypeRelation
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeRelation create(
		java.lang.Integer xrecipeTypeId,
		java.lang.Long xrecipeId)
		throws javax.ejb.CreateException,
		java.rmi.RemoteException;

	/**
	 * Finds an instance using a key for Entity Bean: XrecipeTypeRelation
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeRelation findByPrimaryKey(
		com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeRelationKey primaryKey)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException;

	public java.util.Enumeration findByRecipeId(java.lang.Long xrecipeId)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException;

	/**
	 * @param xrecipeTypeId
	 * @param xrecipeId
	 * @param sequence
	 * @param field1
	 * @param field2
	 * @param field3
	 * @return
	 * @throws javax.ejb.CreateException
	 * @throws java.rmi.RemoteException
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeRelation create(
			java.lang.Integer xrecipeTypeId, java.lang.Long xrecipeId,
			java.lang.Double sequence, java.lang.String field1,
			java.lang.String field2, java.lang.Double field3)
			throws javax.ejb.CreateException, java.rmi.RemoteException;

	public java.util.Enumeration findByRecipeIdandTypeId(
		java.lang.Long recipeId,
		java.lang.Integer recipeType_id)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException;
}
