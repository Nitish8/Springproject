package com.nl.sligro.commerce.menucalculator.objects;

/**
 * Home interface for Enterprise Bean: XrecipeTypeDescription
 */
public interface XrecipeTypeDescriptionHome extends javax.ejb.EJBHome {

	/**
	 * Creates an instance from a key for Entity Bean: XrecipeTypeDescription
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeDescription create(
		java.lang.Integer xrecipeTypeId,
		java.lang.Integer langId)
		throws javax.ejb.CreateException,
		java.rmi.RemoteException;

	/**
	 * Finds an instance using a key for Entity Bean: XrecipeTypeDescription
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeDescription findByPrimaryKey(
		com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeDescriptionKey primaryKey)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException;

	public com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeDescription findByXrecipeTypeIdAndLangId(java.lang.Integer xrecipeTypeId, java.lang.Integer langId) throws javax.ejb.FinderException, java.rmi.RemoteException;

	/**
	 * @param xrecipeTypeId
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
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeDescription create(
			java.lang.Integer xrecipeTypeId, java.lang.Integer langId,
			java.lang.String name, java.lang.String description,
			java.lang.String field1, java.lang.String field2,
			java.lang.Double field3) throws javax.ejb.CreateException,
			java.rmi.RemoteException;

	public com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeDescription findByXrecipeTypeNameAndLangId(java.lang.String name, java.lang.Integer langId) throws javax.ejb.FinderException, java.rmi.RemoteException;
}
