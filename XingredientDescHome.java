package com.nl.sligro.commerce.menucalculator.objects;

/**
 * Home interface for Enterprise Bean: XingredientDesc
 */
public interface XingredientDescHome extends javax.ejb.EJBHome {

	/**
	 * Creates an instance from a key for Entity Bean: XingredientDesc
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XingredientDesc create(
		java.lang.Long xingredientId,
		java.lang.Integer langId)
		throws javax.ejb.CreateException,
		java.rmi.RemoteException;

	/**
	 * Finds an instance using a key for Entity Bean: XingredientDesc
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XingredientDesc findByPrimaryKey(
		com.nl.sligro.commerce.menucalculator.objects.XingredientDescKey primaryKey)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException;

	/**
	 * @param xingredientId
	 * @param langId
	 * @param name
	 * @param description
	 * @param field1
	 * @param field2
	 * @param field3
	 * @return
	 * @throws javax.ejb.CreateException
	 * @throws java.rmi.RemoteException
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XingredientDesc create(
			java.lang.Long xingredientId, java.lang.Integer langId,
			java.lang.String name, java.lang.String description,
			java.lang.String field1, java.lang.String field2,
			java.lang.Double field3) throws javax.ejb.CreateException,
			java.rmi.RemoteException;

	public java.util.Enumeration findByNameAndLanguage(
		java.lang.String name,
		java.lang.Integer langId)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException;
}
