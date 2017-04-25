package com.nl.sligro.commerce.menucalculator.objects;

/**
 * Home interface for Enterprise Bean: XrecipeType
 */
public interface XrecipeTypeHome extends javax.ejb.EJBHome {

	/**
	 * Creates an instance from a key for Entity Bean: XrecipeType
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeType create(
		java.lang.Long xrecipeTypeId)
		throws javax.ejb.CreateException,
		java.rmi.RemoteException;

	/**
	 * Finds an instance using a key for Entity Bean: XrecipeType
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeType findByPrimaryKey(
		com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeKey primaryKey)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException;

	public java.util.Enumeration findByRelationType(
		java.lang.String relationType)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException;

	/**
	 * @param xrecipeTypeId
	 * @param identifier
	 * @param relationType
	 * @param selectable
	 * @param field1
	 * @param field2
	 * @param field3
	 * @return
	 * @throws javax.ejb.CreateException
	 * @throws java.rmi.RemoteException
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeType create(
			java.lang.Long xrecipeTypeId, java.lang.String identifier,
			java.lang.String relationType, java.lang.Integer selectable,
			java.lang.String field1, java.lang.String field2,
			java.lang.Double field3) throws javax.ejb.CreateException,
			java.rmi.RemoteException;
}
