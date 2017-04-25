package com.nl.sligro.commerce.menucalculator.objects;

/**
 * Home interface for Enterprise Bean: Xrecipe
 */
public interface XrecipeHome extends javax.ejb.EJBHome {

	/**
	 * Creates an instance from a key for Entity Bean: Xrecipe
	 */
	public com.nl.sligro.commerce.menucalculator.objects.Xrecipe create(
		java.lang.Long xrecipeId)
		throws javax.ejb.CreateException,
		java.rmi.RemoteException;

	/**
	 * Finds an instance using a key for Entity Bean: Xrecipe
	 */
	public com.nl.sligro.commerce.menucalculator.objects.Xrecipe findByPrimaryKey(
		com.nl.sligro.commerce.menucalculator.objects.XrecipeKey primaryKey)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException;

	public com.nl.sligro.commerce.menucalculator.objects.Xrecipe findByOrgentityId(java.lang.Long orgentityId) throws javax.ejb.FinderException, java.rmi.RemoteException;

	/**
	 * @param xrecipeId
	 * @param orgentityId
	 * @param recipeType
	 * @param storeentId
	 * @param createBy
	 * @param currency
	 * @param netProductPrice
	 * @param vat
	 * @param wastage
	 * @param marginOfProfit
	 * @param persons
	 * @param grossProductPrice
	 * @param markForDelete
	 * @param preperationTime
	 * @param totalTime
	 * @param lastUpdated
	 * @param sequence
	 * @param field1
	 * @param field2
	 * @param field3
	 * @return
	 * @throws javax.ejb.CreateException
	 * @throws java.rmi.RemoteException
	 */
	public com.nl.sligro.commerce.menucalculator.objects.Xrecipe create(
			java.lang.Long xrecipeId, java.lang.Long orgentityId,
			java.lang.String recipeType, java.lang.Integer storeentId,
			java.lang.Long createBy, java.lang.String currency,
			java.math.BigDecimal netProductPrice, java.math.BigDecimal vat,
			java.math.BigDecimal wastage, java.math.BigDecimal marginOfProfit,
			java.lang.Integer persons, java.math.BigDecimal grossProductPrice,
			java.lang.Integer markForDelete, java.lang.Integer preperationTime,
			java.lang.Integer totalTime, java.sql.Timestamp lastUpdated,
			java.lang.Double sequence, java.lang.String field1,
			java.lang.String field2, java.lang.Double field3)
			throws javax.ejb.CreateException, java.rmi.RemoteException;

	public java.util.Enumeration findByCreatedBy(java.lang.Long createdBy) throws javax.ejb.FinderException, java.rmi.RemoteException;
}
