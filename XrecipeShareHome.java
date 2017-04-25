package com.nl.sligro.commerce.menucalculator.objects;

/**
 * Home interface for Enterprise Bean: XrecipeShare
 */
public interface XrecipeShareHome extends javax.ejb.EJBHome {

	/**
	 * Creates an instance from a key for Entity Bean: XrecipeShare
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeShare create(
		java.lang.Long xrecipeId,
		java.lang.Long orgentityIdOwner,
		java.lang.Long orgentityIdSharedWith)
		throws javax.ejb.CreateException,
		java.rmi.RemoteException;

	/**
	 * Finds an instance using a key for Entity Bean: XrecipeShare
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeShare findByPrimaryKey(
		com.nl.sligro.commerce.menucalculator.objects.XrecipeShareKey primaryKey)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException;

	public com.nl.sligro.commerce.menucalculator.objects.XrecipeShare findByRecipeId(java.lang.Long xrecipeId) throws javax.ejb.FinderException, java.rmi.RemoteException;

	public java.util.Enumeration findByOrgentityIdOwner(
		java.lang.Long orgentityIdOwner)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException;

	public java.util.Enumeration findByOrgentityIdSharedWith(
		java.lang.Long orgentityIdSharedWith)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException;

	/**
	 * @param xrecipeId
	 * @param orgentityIdOwner
	 * @param orgentityIdSharedWith
	 * @param sequence
	 * @param field1
	 * @param field2
	 * @param field3
	 * @return
	 * @throws javax.ejb.CreateException
	 * @throws java.rmi.RemoteException
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeShare create(
			java.lang.Long xrecipeId, java.lang.Long orgentityIdOwner,
			java.lang.Long orgentityIdSharedWith, java.lang.Double sequence,
			java.lang.String field1, java.lang.String field2,
			java.lang.Double field3) throws javax.ejb.CreateException,
			java.rmi.RemoteException;
}
