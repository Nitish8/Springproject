package com.nl.sligro.commerce.menucalculator.objects;

import javax.rmi.*;
import com.ibm.ivj.ejb.runtime.*;

/**
 * XingredientAccessBean
 * @generated
 */
public class XingredientAccessBean extends AbstractEntityAccessBean
	implements
		com.nl.sligro.commerce.menucalculator.objects.XingredientAccessBeanData {

	/**
	 * @generated
	 */
	private Xingredient __ejbRef;
	/**
	 * @generated
	 */
	private Long initKey_xingredientId;
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
	 * getUnitOfMeasure
	 * @generated
	 */
	public java.lang.String getUnitOfMeasure()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.String) __getCache("unitOfMeasure")));
	}

	/**
	 * setUnitOfMeasure
	 * @generated
	 */
	public void setUnitOfMeasure(java.lang.String newValue) {
		__setCache("unitOfMeasure", newValue);
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
	 * getCatentryId
	 * @generated
	 */
	public java.lang.Long getCatentryId()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.Long) __getCache("catentryId")));
	}

	/**
	 * setCatentryId
	 * @generated
	 */
	public void setCatentryId(java.lang.Long newValue) {
		__setCache("catentryId", newValue);
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
	 * setInitKey_xingredientId
	 * @generated
	 */
	public void setInitKey_xingredientId(Long newValue) {
		this.initKey_xingredientId = (newValue);
	}

	/**
	 * XingredientAccessBean
	 * @generated
	 */
	public XingredientAccessBean() {
		super();
	}

	/**
	 * XingredientAccessBean
	 * @generated
	 */
	public XingredientAccessBean(javax.ejb.EJBObject o)
		throws java.rmi.RemoteException {
		super(o);
	}

	/**
	 * defaultJNDIName
	 * @generated
	 */
	public String defaultJNDIName() {
		return "ejb/com/nl/sligro/commerce/menucalculator/objects/XingredientHome";
	}

	/**
	 * ejbHome
	 * @generated
	 */
	private com.nl.sligro.commerce.menucalculator.objects.XingredientHome ejbHome()
		throws java.rmi.RemoteException,
		javax.naming.NamingException {
		return (com.nl.sligro.commerce.menucalculator.objects.XingredientHome) PortableRemoteObject
			.narrow(
				getHome(),
				com.nl.sligro.commerce.menucalculator.objects.XingredientHome.class);
	}

	/**
	 * ejbRef
	 * @generated
	 */
	private com.nl.sligro.commerce.menucalculator.objects.Xingredient ejbRef()
		throws java.rmi.RemoteException {
		if (ejbRef == null)
			return null;
		if (__ejbRef == null)
			__ejbRef = (com.nl.sligro.commerce.menucalculator.objects.Xingredient) PortableRemoteObject
				.narrow(
					ejbRef,
					com.nl.sligro.commerce.menucalculator.objects.Xingredient.class);
	
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
	
		com.nl.sligro.commerce.menucalculator.objects.XingredientKey key = keyFromFields(initKey_xingredientId);
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
			com.nl.sligro.commerce.menucalculator.objects.XingredientKey pKey = (com.nl.sligro.commerce.menucalculator.objects.XingredientKey) this
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
	private com.nl.sligro.commerce.menucalculator.objects.XingredientKey keyFromFields(
		Long f0) {
		com.nl.sligro.commerce.menucalculator.objects.XingredientKey keyClass = new com.nl.sligro.commerce.menucalculator.objects.XingredientKey();
		keyClass.xingredientId = f0;
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
	 * XingredientAccessBean
	 * @generated
	 */
	public XingredientAccessBean(java.lang.Long xingredientId)
		throws javax.naming.NamingException, javax.ejb.CreateException,
		java.rmi.RemoteException {
		ejbRef = ejbHome().create(xingredientId);
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
	 * getListPrice
	 * @generated
	 */
	public java.math.BigDecimal getListPrice()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.math.BigDecimal) __getCache("listPrice")));
	}

	/**
	 * setListPrice
	 * @generated
	 */
	public void setListPrice(java.math.BigDecimal newValue) {
		__setCache("listPrice", newValue);
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
	 * findByOrgentityIdOrderByLastUpdated
	 * @generated
	 */
	public java.util.Enumeration findByOrgentityIdOrderByLastUpdated(
		java.lang.Long orgentityId)
		throws javax.naming.NamingException,
		javax.ejb.FinderException,
		java.rmi.RemoteException {
		com.nl.sligro.commerce.menucalculator.objects.XingredientHome localHome = ejbHome();
		java.util.Enumeration ejbs = localHome
			.findByOrgentityIdOrderByLastUpdated(orgentityId);
		return (java.util.Enumeration) createAccessBeans(ejbs);
	}

	/**
	 * getIdentifer
	 * @generated
	 */
	public java.lang.String getIdentifer()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.String) __getCache("identifer")));
	}

	/**
	 * setIdentifer
	 * @generated
	 */
	public void setIdentifer(java.lang.String newValue) {
		__setCache("identifer", newValue);
	}

	/**
	 * XingredientAccessBean
	 * @generated
	 */
	public XingredientAccessBean(
		java.lang.Long xingredientId,
		java.lang.Long orgentityId,
		java.lang.Long catentryId,
		java.lang.String identifer,
		java.lang.String unitOfMeasure,
		java.math.BigDecimal listPrice,
		java.sql.Timestamp lastUpdate,
		java.lang.String field1,
		java.lang.String field2,
		java.lang.Double field3) throws javax.naming.NamingException,
		javax.ejb.CreateException, java.rmi.RemoteException {
		ejbRef = ejbHome().create(
			xingredientId,
			orgentityId,
			catentryId,
			identifer,
			unitOfMeasure,
			listPrice,
			lastUpdate,
			field1,
			field2,
			field3);
	}

	/**
	 * findByIngredientId
	 * @generated
	 */
	public XingredientAccessBean findByIngredientId(java.lang.Long ingredientId)
		throws javax.naming.NamingException,
		javax.ejb.FinderException,
		java.rmi.RemoteException {
		com.nl.sligro.commerce.menucalculator.objects.XingredientHome localHome = ejbHome();
		com.nl.sligro.commerce.menucalculator.objects.Xingredient ejbs = localHome
			.findByIngredientId(ingredientId);
		return (XingredientAccessBean) createAccessBeans(ejbs);
	}

	/**
	 * findByCatentryId
	 * @generated
	 */
	public java.util.Enumeration findByCatentryId(java.lang.Long catEntryId)
		throws javax.naming.NamingException,
		javax.ejb.FinderException,
		java.rmi.RemoteException {
		com.nl.sligro.commerce.menucalculator.objects.XingredientHome localHome = ejbHome();
		java.util.Enumeration ejbs = localHome.findByCatentryId(catEntryId);
		return (java.util.Enumeration) createAccessBeans(ejbs);
	}
}
