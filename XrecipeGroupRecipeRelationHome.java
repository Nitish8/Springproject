package com.nl.sligro.commerce.menucalculator.objects;

/**
 * Home interface for Enterprise Bean: XrecipeGroupRecipeRelation
 */
public interface XrecipeGroupRecipeRelationHome extends javax.ejb.EJBHome {

	/**
	 * Creates an instance from a key for Entity Bean: XrecipeGroupRecipeRelation
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRecipeRelation create(
		java.lang.Long xrecipeGroupId,
		java.lang.Long xrecipeId)
		throws javax.ejb.CreateException,
		java.rmi.RemoteException;

	/**
	 * Finds an instance using a key for Entity Bean: XrecipeGroupRecipeRelation
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRecipeRelation findByPrimaryKey(
		com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRecipeRelationKey primaryKey)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException;

	public java.util.Enumeration findByRecipeId(java.lang.Long xrecipeId)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException;

	public java.util.Enumeration findByRecipeGroupId(
		java.lang.Long xrecipeGroupId)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException;

	/**
	 * @param xrecipeGroupId
	 * @param xrecipeId
	 * @param sequence
	 * @param lastUpdated
	 * @param numberOfPersons
	 * @param field1
	 * @param field2
	 * @param field3
	 * @return
	 * @throws javax.ejb.CreateException
	 * @throws java.rmi.RemoteException
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRecipeRelation create(
			java.lang.Long xrecipeGroupId, java.lang.Long xrecipeId,
			java.lang.Double sequence, java.sql.Timestamp lastUpdated,
			java.lang.Integer numberOfPersons, java.lang.String field1,
			java.lang.String field2, java.lang.Double field3)
			throws javax.ejb.CreateException, java.rmi.RemoteException;
}
