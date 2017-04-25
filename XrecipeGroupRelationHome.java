package com.nl.sligro.commerce.menucalculator.objects;

/**
 * Home interface for Enterprise Bean: XrecipeGroupRelation
 */
public interface XrecipeGroupRelationHome extends javax.ejb.EJBHome {

	/**
	 * Creates an instance from a key for Entity Bean: XrecipeGroupRelation
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRelation create(
		java.lang.Long xrecipeGroupIdParent,
		java.lang.Long xrecipeGroupIdChild)
		throws javax.ejb.CreateException,
		java.rmi.RemoteException;

	/**
	 * Finds an instance using a key for Entity Bean: XrecipeGroupRelation
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRelation findByPrimaryKey(
		com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRelationKey primaryKey)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException;

	public java.util.Enumeration findByParentRecipeGroupId(
		java.lang.Long xrecipeGroupIdParent)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException;

	public java.util.Enumeration findByChildRecipeGroupId(
		java.lang.Long xrecipeGroupIdChild)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException;

	/**
	 * @param xrecipeGroupIdParent
	 * @param xrecipeGroupIdChild
	 * @param sequence
	 * @param lastUpdated
	 * @param orgentityId
	 * @param field1
	 * @param field2
	 * @param field3
	 * @return
	 * @throws javax.ejb.CreateException
	 * @throws java.rmi.RemoteException
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRelation create(
			java.lang.Long xrecipeGroupIdParent,
			java.lang.Long xrecipeGroupIdChild, java.lang.Double sequence,
			java.sql.Timestamp lastUpdated, java.lang.Long orgentityId,
			java.lang.String field1, java.lang.String field2,
			java.lang.Double field3) throws javax.ejb.CreateException,
			java.rmi.RemoteException;
}
