package com.nl.sligro.commerce.menucalculator.objects;

/**
 * Home interface for Enterprise Bean: XrecipeDescription
 */
public interface XrecipeDescriptionHome extends javax.ejb.EJBHome {

	/**
	 * Creates an instance from a key for Entity Bean: XrecipeDescription
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeDescription create(
		java.lang.Long xrecipeId,
		java.lang.Integer langId)
		throws javax.ejb.CreateException,
		java.rmi.RemoteException;

	/**
	 * Finds an instance using a key for Entity Bean: XrecipeDescription
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeDescription findByPrimaryKey(
		com.nl.sligro.commerce.menucalculator.objects.XrecipeDescriptionKey primaryKey)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException;

	public com.nl.sligro.commerce.menucalculator.objects.XrecipeDescription findByRecipeIdAndLangId(java.lang.Long xrecipeId, java.lang.Integer langId) throws javax.ejb.FinderException, java.rmi.RemoteException;

	/**
	 * @param xrecipeId
	 * @param langId
	 * @param name
	 * @param shortDescription
	 * @param longDescription
	 * @param thumbnail
	 * @param comment
	 * @param field1
	 * @param field2
	 * @param field3
	 * @return
	 * @throws javax.ejb.CreateException
	 * @throws java.rmi.RemoteException
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeDescription create(
			java.lang.Long xrecipeId, java.lang.Integer langId,
			java.lang.String name, java.lang.String shortDescription,
			java.lang.String longDescription, java.lang.String thumbnail,
			java.lang.String comment, java.lang.String field1,
			java.lang.String field2, java.lang.Double field3)
			throws javax.ejb.CreateException, java.rmi.RemoteException;

	public com.nl.sligro.commerce.menucalculator.objects.XrecipeDescription findByName(java.lang.String name) throws javax.ejb.FinderException, java.rmi.RemoteException;

	public java.util.Enumeration findByNameAndLangId(
		java.lang.String name,
		java.lang.Long langId)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException;
}
