package com.nl.sligro.commerce.menucalculator.objects;

import javax.rmi.*;
import com.ibm.ivj.ejb.runtime.*;

/**
 * XrecipeAccessBean
 * @generated
 */
public class XrecipeAccessBean extends AbstractEntityAccessBean
	implements
		com.nl.sligro.commerce.menucalculator.objects.XrecipeAccessBeanData {

	/**
	 * @generated
	 */
	private Xrecipe __ejbRef;
	/**
	 * @generated
	 */
	private Long initKey_xrecipeId;
	/**
	 * getXrecipeId
	 * @generated
	 */
	public java.lang.Long getXrecipeId()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.Long) __getCache("xrecipeId")));
	}

	/**
	 * getSequence
	 * @generated
	 */
	public java.lang.Double getSequence()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.Double) __getCache("sequence")));
	}

	/**
	 * setSequence
	 * @generated
	 */
	public void setSequence(java.lang.Double newValue) {
		__setCache("sequence", newValue);
	}

	/**
	 * getOrgentityId
	 * @generated
	 */
	public java.lang.Long getOrgentityId()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.Long) __getCache("orgentityId")));
	}

	/**
	 * setOrgentityId
	 * @generated
	 */
	public void setOrgentityId(java.lang.Long newValue) {
		__setCache("orgentityId", newValue);
	}

	/**
	 * getLastUpdated
	 * @generated
	 */
	public java.sql.Timestamp getLastUpdated()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.sql.Timestamp) __getCache("lastUpdated")));
	}

	/**
	 * setLastUpdated
	 * @generated
	 */
	public void setLastUpdated(java.sql.Timestamp newValue) {
		__setCache("lastUpdated", newValue);
	}

	/**
	 * getStoreentId
	 * @generated
	 */
	public java.lang.Integer getStoreentId()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.Integer) __getCache("storeentId")));
	}

	/**
	 * setStoreentId
	 * @generated
	 */
	public void setStoreentId(java.lang.Integer newValue) {
		__setCache("storeentId", newValue);
	}

	/**
	 * getMarkForDelete
	 * @generated
	 */
	public java.lang.Integer getMarkForDelete()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.Integer) __getCache("markForDelete")));
	}

	/**
	 * setMarkForDelete
	 * @generated
	 */
	public void setMarkForDelete(java.lang.Integer newValue) {
		__setCache("markForDelete", newValue);
	}

	/**
	 * getPreperationTime
	 * @generated
	 */
	public java.lang.Integer getPreperationTime()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.Integer) __getCache("preperationTime")));
	}

	/**
	 * setPreperationTime
	 * @generated
	 */
	public void setPreperationTime(java.lang.Integer newValue) {
		__setCache("preperationTime", newValue);
	}

	/**
	 * getRecipeType
	 * @generated
	 */
	public java.lang.String getRecipeType()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.String) __getCache("recipeType")));
	}

	/**
	 * setRecipeType
	 * @generated
	 */
	public void setRecipeType(java.lang.String newValue) {
		__setCache("recipeType", newValue);
	}

	/**
	 * getVat
	 * @generated
	 */
	public java.math.BigDecimal getVat()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.math.BigDecimal) __getCache("vat")));
	}

	/**
	 * setVat
	 * @generated
	 */
	public void setVat(java.math.BigDecimal newValue) {
		__setCache("vat", newValue);
	}

	/**
	 * getMarginOfProfit
	 * @generated
	 */
	public java.math.BigDecimal getMarginOfProfit()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.math.BigDecimal) __getCache("marginOfProfit")));
	}

	/**
	 * setMarginOfProfit
	 * @generated
	 */
	public void setMarginOfProfit(java.math.BigDecimal newValue) {
		__setCache("marginOfProfit", newValue);
	}

	/**
	 * getTotalTime
	 * @generated
	 */
	public java.lang.Integer getTotalTime()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.Integer) __getCache("totalTime")));
	}

	/**
	 * setTotalTime
	 * @generated
	 */
	public void setTotalTime(java.lang.Integer newValue) {
		__setCache("totalTime", newValue);
	}

	/**
	 * getCurrency
	 * @generated
	 */
	public java.lang.String getCurrency()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.String) __getCache("currency")));
	}

	/**
	 * setCurrency
	 * @generated
	 */
	public void setCurrency(java.lang.String newValue) {
		__setCache("currency", newValue);
	}

	/**
	 * getCreateBy
	 * @generated
	 */
	public java.lang.Long getCreateBy()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.Long) __getCache("createBy")));
	}

	/**
	 * setCreateBy
	 * @generated
	 */
	public void setCreateBy(java.lang.Long newValue) {
		__setCache("createBy", newValue);
	}

	/**
	 * getWastage
	 * @generated
	 */
	public java.math.BigDecimal getWastage()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.math.BigDecimal) __getCache("wastage")));
	}

	/**
	 * setWastage
	 * @generated
	 */
	public void setWastage(java.math.BigDecimal newValue) {
		__setCache("wastage", newValue);
	}

	/**
	 * getField1
	 * @generated
	 */
	public java.lang.String getField1()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.String) __getCache("field1")));
	}

	/**
	 * setField1
	 * @generated
	 */
	public void setField1(java.lang.String newValue) {
		__setCache("field1", newValue);
	}

	/**
	 * getNetProductPrice
	 * @generated
	 */
	public java.math.BigDecimal getNetProductPrice()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.math.BigDecimal) __getCache("netProductPrice")));
	}

	/**
	 * setNetProductPrice
	 * @generated
	 */
	public void setNetProductPrice(java.math.BigDecimal newValue) {
		__setCache("netProductPrice", newValue);
	}

	/**
	 * getField2
	 * @generated
	 */
	public java.lang.String getField2()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.String) __getCache("field2")));
	}

	/**
	 * setField2
	 * @generated
	 */
	public void setField2(java.lang.String newValue) {
		__setCache("field2", newValue);
	}

	/**
	 * getField3
	 * @generated
	 */
	public java.lang.Double getField3()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.Double) __getCache("field3")));
	}

	/**
	 * setField3
	 * @generated
	 */
	public void setField3(java.lang.Double newValue) {
		__setCache("field3", newValue);
	}

	/**
	 * getPersons
	 * @generated
	 */
	public java.lang.Integer getPersons()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.Integer) __getCache("persons")));
	}

	/**
	 * setPersons
	 * @generated
	 */
	public void setPersons(java.lang.Integer newValue) {
		__setCache("persons", newValue);
	}

	/**
	 * getGrossProductPrice
	 * @generated
	 */
	public java.math.BigDecimal getGrossProductPrice()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.math.BigDecimal) __getCache("grossProductPrice")));
	}

	/**
	 * setGrossProductPrice
	 * @generated
	 */
	public void setGrossProductPrice(java.math.BigDecimal newValue) {
		__setCache("grossProductPrice", newValue);
	}

	/**
	 * setInitKey_xrecipeId
	 * @generated
	 */
	public void setInitKey_xrecipeId(Long newValue) {
		this.initKey_xrecipeId = (newValue);
	}

	/**
	 * XrecipeAccessBean
	 * @generated
	 */
	public XrecipeAccessBean() {
		super();
	}

	/**
	 * XrecipeAccessBean
	 * @generated
	 */
	public XrecipeAccessBean(javax.ejb.EJBObject o)
		throws java.rmi.RemoteException {
		super(o);
	}

	/**
	 * defaultJNDIName
	 * @generated
	 */
	public String defaultJNDIName() {
		return "ejb/com/nl/sligro/commerce/menucalculator/objects/XrecipeHome";
	}

	/**
	 * ejbHome
	 * @generated
	 */
	private com.nl.sligro.commerce.menucalculator.objects.XrecipeHome ejbHome()
		throws java.rmi.RemoteException,
		javax.naming.NamingException {
		return (com.nl.sligro.commerce.menucalculator.objects.XrecipeHome) PortableRemoteObject
			.narrow(
				getHome(),
				com.nl.sligro.commerce.menucalculator.objects.XrecipeHome.class);
	}

	/**
	 * ejbRef
	 * @generated
	 */
	private com.nl.sligro.commerce.menucalculator.objects.Xrecipe ejbRef()
		throws java.rmi.RemoteException {
		if (ejbRef == null)
			return null;
		if (__ejbRef == null)
			__ejbRef = (com.nl.sligro.commerce.menucalculator.objects.Xrecipe) PortableRemoteObject
				.narrow(
					ejbRef,
					com.nl.sligro.commerce.menucalculator.objects.Xrecipe.class);
	
		return __ejbRef;
	}

	/**
	 * instantiateEJB
	 * @generated
	 */
	protected void instantiateEJB()
		throws javax.naming.NamingException,
		javax.ejb.FinderException,
		java.rmi.RemoteException {
		if (ejbRef() != null)
			return;
	
		com.nl.sligro.commerce.menucalculator.objects.XrecipeKey key = keyFromFields(initKey_xrecipeId);
		ejbRef = ejbHome().findByPrimaryKey(key);
	}

	/**
	 * instantiateEJBByPrimaryKey
	 * @generated
	 */
	protected boolean instantiateEJBByPrimaryKey()
		throws javax.ejb.CreateException,
		java.rmi.RemoteException,
		javax.naming.NamingException {
		boolean result = false;
	
		if (ejbRef() != null)
			return true;
	
		try {
			com.nl.sligro.commerce.menucalculator.objects.XrecipeKey pKey = (com.nl.sligro.commerce.menucalculator.objects.XrecipeKey) this
				.__getKey();
			if (pKey != null) {
				ejbRef = ejbHome().findByPrimaryKey(pKey);
				result = true;
			}
		} catch (javax.ejb.FinderException e) {
		}
		return result;
	}

	/**
	 * keyFromFields
	 * @generated
	 */
	private com.nl.sligro.commerce.menucalculator.objects.XrecipeKey keyFromFields(
		Long f0) {
		com.nl.sligro.commerce.menucalculator.objects.XrecipeKey keyClass = new com.nl.sligro.commerce.menucalculator.objects.XrecipeKey();
		keyClass.xrecipeId = f0;
		return keyClass;
	}

	/**
	 * refreshCopyHelper
	 * @generated
	 */
	public void refreshCopyHelper()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		refreshCopyHelper(ejbRef());
	}

	/**
	 * commitCopyHelper
	 * @generated
	 */
	public void commitCopyHelper()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		commitCopyHelper(ejbRef());
	}

	/**
	 * XrecipeAccessBean
	 * @generated
	 */
	public XrecipeAccessBean(
		java.lang.Long xrecipeId,
		java.lang.Long orgentityId,
		java.lang.String recipeType,
		java.lang.Integer storeentId,
		java.lang.Long createBy,
		java.lang.String currency,
		java.math.BigDecimal netProductPrice,
		java.math.BigDecimal vat,
		java.math.BigDecimal wastage,
		java.math.BigDecimal marginOfProfit,
		java.lang.Integer persons,
		java.math.BigDecimal grossProductPrice,
		java.lang.Integer markForDelete,
		java.lang.Integer preperationTime,
		java.lang.Integer totalTime,
		java.sql.Timestamp lastUpdated,
		java.lang.Double sequence,
		java.lang.String field1,
		java.lang.String field2,
		java.lang.Double field3) throws javax.naming.NamingException,
		javax.ejb.CreateException, java.rmi.RemoteException {
		ejbRef = ejbHome().create(
			xrecipeId,
			orgentityId,
			recipeType,
			storeentId,
			createBy,
			currency,
			netProductPrice,
			vat,
			wastage,
			marginOfProfit,
			persons,
			grossProductPrice,
			markForDelete,
			preperationTime,
			totalTime,
			lastUpdated,
			sequence,
			field1,
			field2,
			field3);
	}

	/**
	 * findByOrgentityId
	 * @generated
	 */
	public XrecipeAccessBean findByOrgentityId(java.lang.Long orgentityId)
		throws javax.naming.NamingException,
		javax.ejb.FinderException,
		java.rmi.RemoteException {
		com.nl.sligro.commerce.menucalculator.objects.XrecipeHome localHome = ejbHome();
		com.nl.sligro.commerce.menucalculator.objects.Xrecipe ejbs = localHome
			.findByOrgentityId(orgentityId);
		return (XrecipeAccessBean) createAccessBeans(ejbs);
	}

	/**
	 * XrecipeAccessBean
	 * @generated
	 */
	public XrecipeAccessBean(java.lang.Long xrecipeId)
		throws javax.naming.NamingException, javax.ejb.CreateException,
		java.rmi.RemoteException {
		ejbRef = ejbHome().create(xrecipeId);
	}

	/**
	 * fulfills
	 * @generated
	 */
	public boolean fulfills(java.lang.Long arg0, java.lang.String arg1)
		throws javax.naming.NamingException,
		javax.ejb.FinderException,
		java.lang.Exception,
		java.rmi.RemoteException {
		instantiateEJB();
		return ejbRef().fulfills(arg0, arg1);
	}

	/**
	 * getOwner
	 * @generated
	 */
	public java.lang.Long getOwner()
		throws javax.naming.NamingException,
		javax.ejb.FinderException,
		java.lang.Exception,
		java.rmi.RemoteException {
		instantiateEJB();
		return ejbRef().getOwner();
	}

	/**
	 * findByCreatedBy
	 * @generated
	 */
	public java.util.Enumeration findByCreatedBy(java.lang.Long createdBy)
		throws javax.naming.NamingException,
		javax.ejb.FinderException,
		java.rmi.RemoteException {
		com.nl.sligro.commerce.menucalculator.objects.XrecipeHome localHome = ejbHome();
		java.util.Enumeration ejbs = localHome.findByCreatedBy(createdBy);
		return (java.util.Enumeration) createAccessBeans(ejbs);
	}
}
