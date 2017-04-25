package com.nl.sligro.commerce.menucalculator.objects;

/**
 * Home interface for Enterprise Bean: Xingredient
 */
public interface XingredientHome extends javax.ejb.EJBHome {

	/**
	 * Creates an instance from a key for Entity Bean: Xingredient
	 */
	public com.nl.sligro.commerce.menucalculator.objects.Xingredient create(
		java.lang.Long xingredientId)
		throws javax.ejb.CreateException,
		java.rmi.RemoteException;

	/**
	 * Finds an instance using a key for Entity Bean: Xingredient
	 */
	public com.nl.sligro.commerce.menucalculator.objects.Xingredient findByPrimaryKey(
		com.nl.sligro.commerce.menucalculator.objects.XingredientKey primaryKey)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException;

	public java.util.Enumeration findByOrgentityIdOrderByLastUpdated(java.lang.Long orgentityId) throws javax.ejb.FinderException, java.rmi.RemoteException;

	/**
	 * @param xingredientId
	 * @param orgentityId
	 * @param catentryId
	 * @param identifer
	 * @param unitOfMeasure
	 * @param listPrice
	 * @param lastUpdate
	 * @param field1
	 * @param field2
	 * @param field3
	 * @return
	 * @throws javax.ejb.CreateException
	 * @throws java.rmi.RemoteException
	 */
	public com.nl.sligro.commerce.menucalculator.objects.Xingredient create(
			java.lang.Long xingredientId, java.lang.Long orgentityId,
			java.lang.Long catentryId, java.lang.String identifer,
			java.lang.String unitOfMeasure, java.math.BigDecimal listPrice,
			java.sql.Timestamp lastUpdate, java.lang.String field1,
			java.lang.String field2, java.lang.Double field3)
			throws javax.ejb.CreateException, java.rmi.RemoteException;

	public com.nl.sligro.commerce.menucalculator.objects.Xingredient findByIngredientId(java.lang.Long ingredientId) throws javax.ejb.FinderException, java.rmi.RemoteException;

	public java.util.Enumeration findByCatentryId(java.lang.Long catEntryId)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException;
}
