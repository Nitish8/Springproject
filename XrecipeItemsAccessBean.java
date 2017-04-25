package com.nl.sligro.commerce.menucalculator.objects;

import javax.rmi.*;
import com.ibm.ivj.ejb.runtime.*;

/**
 * XrecipeItemsAccessBean
 * @generated
 */
public class XrecipeItemsAccessBean extends AbstractEntityAccessBean
	implements
		com.nl.sligro.commerce.menucalculator.objects.XrecipeItemsAccessBeanData {

	/**
	 * @generated
	 */
	private XrecipeItems __ejbRef;
	/**
	 * @generated
	 */
	private Long initKey_xrecipeitemId;
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
	 * setXrecipeId
	 * @generated
	 */
	public void setXrecipeId(java.lang.Long newValue) {
		__setCache("xrecipeId", newValue);
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
	 * getXrecipeItemId
	 * @generated
	 */
	public java.lang.Long getXrecipeItemId()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.Long) __getCache("xrecipeItemId")));
	}

	/**
	 * getXingredientId
	 * @generated
	 */
	public java.lang.Long getXingredientId()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.Long) __getCache("xingredientId")));
	}

	/**
	 * setXingredientId
	 * @generated
	 */
	public void setXingredientId(java.lang.Long newValue) {
		__setCache("xingredientId", newValue);
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
	 * getPrice
	 * @generated
	 */
	public java.math.BigDecimal getPrice()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.math.BigDecimal) __getCache("price")));
	}

	/**
	 * setPrice
	 * @generated
	 */
	public void setPrice(java.math.BigDecimal newValue) {
		__setCache("price", newValue);
	}

	/**
	 * getRequiredQuantity
	 * @generated
	 */
	public java.math.BigDecimal getRequiredQuantity()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.math.BigDecimal) __getCache("requiredQuantity")));
	}

	/**
	 * setRequiredQuantity
	 * @generated
	 */
	public void setRequiredQuantity(java.math.BigDecimal newValue) {
		__setCache("requiredQuantity", newValue);
	}

	/**
	 * setInitKey_xrecipeitemId
	 * @generated
	 */
	public void setInitKey_xrecipeitemId(Long newValue) {
		this.initKey_xrecipeitemId = (newValue);
	}

	/**
	 * XrecipeItemsAccessBean
	 * @generated
	 */
	public XrecipeItemsAccessBean() {
		super();
	}

	/**
	 * XrecipeItemsAccessBean
	 * @generated
	 */
	public XrecipeItemsAccessBean(javax.ejb.EJBObject o)
		throws java.rmi.RemoteException {
		super(o);
	}

	/**
	 * defaultJNDIName
	 * @generated
	 */
	public String defaultJNDIName() {
		return "ejb/com/nl/sligro/commerce/menucalculator/objects/XrecipeItemsHome";
	}

	/**
	 * ejbHome
	 * @generated
	 */
	private com.nl.sligro.commerce.menucalculator.objects.XrecipeItemsHome ejbHome()
		throws java.rmi.RemoteException,
		javax.naming.NamingException {
		return (com.nl.sligro.commerce.menucalculator.objects.XrecipeItemsHome) PortableRemoteObject
			.narrow(
				getHome(),
				com.nl.sligro.commerce.menucalculator.objects.XrecipeItemsHome.class);
	}

	/**
	 * ejbRef
	 * @generated
	 */
	private com.nl.sligro.commerce.menucalculator.objects.XrecipeItems ejbRef()
		throws java.rmi.RemoteException {
		if (ejbRef == null)
			return null;
		if (__ejbRef == null)
			__ejbRef = (com.nl.sligro.commerce.menucalculator.objects.XrecipeItems) PortableRemoteObject
				.narrow(
					ejbRef,
					com.nl.sligro.commerce.menucalculator.objects.XrecipeItems.class);
	
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
	
		com.nl.sligro.commerce.menucalculator.objects.XrecipeItemsKey key = keyFromFields(initKey_xrecipeitemId);
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
			com.nl.sligro.commerce.menucalculator.objects.XrecipeItemsKey pKey = (com.nl.sligro.commerce.menucalculator.objects.XrecipeItemsKey) this
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
	private com.nl.sligro.commerce.menucalculator.objects.XrecipeItemsKey keyFromFields(
		Long f0) {
		com.nl.sligro.commerce.menucalculator.objects.XrecipeItemsKey keyClass = new com.nl.sligro.commerce.menucalculator.objects.XrecipeItemsKey();
		keyClass.xrecipeitemId = f0;
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
	 * XrecipeItemsAccessBean
	 * @generated
	 */
	public XrecipeItemsAccessBean(
		java.lang.Long xrecipeitemId,
		java.lang.Long xrecipeId,
		java.lang.Integer storeentId,
		java.lang.Long orgentityId,
		java.sql.Timestamp lastUpdated,
		java.lang.Long xingredientId,
		java.math.BigDecimal requiredQuantity,
		java.lang.Double sequence,
		java.math.BigDecimal price,
		java.lang.String field1,
		java.lang.String field2,
		java.lang.Double field3) throws javax.naming.NamingException,
		javax.ejb.CreateException, java.rmi.RemoteException {
		ejbRef = ejbHome().create(
			xrecipeitemId,
			xrecipeId,
			storeentId,
			orgentityId,
			lastUpdated,
			xingredientId,
			requiredQuantity,
			sequence,
			price,
			field1,
			field2,
			field3);
	}

	/**
	 * XrecipeItemsAccessBean
	 * @generated
	 */
	public XrecipeItemsAccessBean(java.lang.Long xrecipeitemId)
		throws javax.naming.NamingException, javax.ejb.CreateException,
		java.rmi.RemoteException {
		ejbRef = ejbHome().create(xrecipeitemId);
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
	 * findByRecipeId
	 * @generated
	 */
	public java.util.Enumeration findByRecipeId(java.lang.Long xrecipeId)
		throws javax.naming.NamingException,
		javax.ejb.FinderException,
		java.rmi.RemoteException {
		com.nl.sligro.commerce.menucalculator.objects.XrecipeItemsHome localHome = ejbHome();
		java.util.Enumeration ejbs = localHome.findByRecipeId(xrecipeId);
		return (java.util.Enumeration) createAccessBeans(ejbs);
	}

	/**
	 * findByIngredientId
	 * @generated
	 */
	public java.util.Enumeration findByIngredientId(java.lang.Long xingredientId)
		throws javax.naming.NamingException,
		javax.ejb.FinderException,
		java.rmi.RemoteException {
		com.nl.sligro.commerce.menucalculator.objects.XrecipeItemsHome localHome = ejbHome();
		java.util.Enumeration ejbs = localHome
			.findByIngredientId(xingredientId);
		return (java.util.Enumeration) createAccessBeans(ejbs);
	}

	/**
	 * findByOrgentityId
	 * @generated
	 */
	public java.util.Enumeration findByOrgentityId(java.lang.Long orgentityId)
		throws javax.naming.NamingException,
		javax.ejb.FinderException,
		java.rmi.RemoteException {
		com.nl.sligro.commerce.menucalculator.objects.XrecipeItemsHome localHome = ejbHome();
		java.util.Enumeration ejbs = localHome.findByOrgentityId(orgentityId);
		return (java.util.Enumeration) createAccessBeans(ejbs);
	}
}
