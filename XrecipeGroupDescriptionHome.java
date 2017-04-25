package com.nl.sligro.commerce.menucalculator.objects;

/**
 * Home interface for Enterprise Bean: XrecipeGroupDescription
 */
public interface XrecipeGroupDescriptionHome extends javax.ejb.EJBHome {

	/**
	 * Creates an instance from a key for Entity Bean: XrecipeGroupDescription
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupDescription create(
		java.lang.Long xrecipeGroupId,
		java.lang.Integer langId)
		throws javax.ejb.CreateException,
		java.rmi.RemoteException;

	/**
	 * Finds an instance using a key for Entity Bean: XrecipeGroupDescription
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupDescription findByPrimaryKey(
		com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupDescriptionKey primaryKey)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException;

	public com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupDescription findByName(java.lang.String name) throws javax.ejb.FinderException, java.rmi.RemoteException;

	/**
	 * @param xrecipeGroupId
	 * @param langId
	 * @param name
	 * @param shortDescription
	 * @param longDescription
	 * @param lastUpdated
	 * @param sequence
	 * @param field1
	 * @param field2
	 * @param field3
	 * @return
	 * @throws javax.ejb.CreateException
	 * @throws java.rmi.RemoteException
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupDescription create(
			java.lang.Long xrecipeGroupId, java.lang.Integer langId,
			java.lang.String name, java.lang.String shortDescription,
			java.lang.String longDescription, java.sql.Timestamp lastUpdated,
			java.lang.Double sequence, java.lang.String field1,
			java.lang.String field2, java.lang.Double field3)
			throws javax.ejb.CreateException, java.rmi.RemoteException;
}
