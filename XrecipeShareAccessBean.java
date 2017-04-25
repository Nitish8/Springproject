package com.nl.sligro.commerce.menucalculator.objects;

import javax.rmi.*;
import com.ibm.ivj.ejb.runtime.*;

/**
 * XrecipeShareAccessBean
 * @generated
 */
public class XrecipeShareAccessBean extends AbstractEntityAccessBean
	implements
		com.nl.sligro.commerce.menucalculator.objects.XrecipeShareAccessBeanData {

	/**
	 * @generated
	 */
	private XrecipeShare __ejbRef;

	/**
	 * @generated
	 */
	private Long initKey_xrecipeId;

	/**
	 * @generated
	 */
	private Long initKey_orgentityIdOwner;

	/**
	 * @generated
	 */
	private Long initKey_orgentityIdSharedWith;

	/**
	 * getOrgentityIdOwner
	 * @generated
	 */
	public java.lang.Long getOrgentityIdOwner()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.Long) __getCache("orgentityIdOwner")));
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
	 * getOrgentityIdSharedWith
	 * @generated
	 */
	public java.lang.Long getOrgentityIdSharedWith()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.Long) __getCache("orgentityIdSharedWith")));
	}

	/**
	 * setInitKey_xrecipeId
	 * @generated
	 */
	public void setInitKey_xrecipeId(Long newValue) {
		this.initKey_xrecipeId = (newValue);
	}

	/**
	 * setInitKey_orgentityIdOwner
	 * @generated
	 */
	public void setInitKey_orgentityIdOwner(Long newValue) {
		this.initKey_orgentityIdOwner = (newValue);
	}

	/**
	 * setInitKey_orgentityIdSharedWith
	 * @generated
	 */
	public void setInitKey_orgentityIdSharedWith(Long newValue) {
		this.initKey_orgentityIdSharedWith = (newValue);
	}

	/**
	 * XrecipeShareAccessBean
	 * @generated
	 */
	public XrecipeShareAccessBean() {
		super();
	}

	/**
	 * XrecipeShareAccessBean
	 * @generated
	 */
	public XrecipeShareAccessBean(javax.ejb.EJBObject o)
		throws java.rmi.RemoteException {
		super(o);
	}

	/**
	 * defaultJNDIName
	 * @generated
	 */
	public String defaultJNDIName() {
		return "ejb/com/nl/sligro/commerce/menucalculator/objects/XrecipeShareHome";
	}

	/**
	 * ejbHome
	 * @generated
	 */
	private com.nl.sligro.commerce.menucalculator.objects.XrecipeShareHome ejbHome()
		throws java.rmi.RemoteException,
		javax.naming.NamingException {
		return (com.nl.sligro.commerce.menucalculator.objects.XrecipeShareHome) PortableRemoteObject
			.narrow(
				getHome(),
				com.nl.sligro.commerce.menucalculator.objects.XrecipeShareHome.class);
	}

	/**
	 * ejbRef
	 * @generated
	 */
	private com.nl.sligro.commerce.menucalculator.objects.XrecipeShare ejbRef()
		throws java.rmi.RemoteException {
		if (ejbRef == null)
			return null;
		if (__ejbRef == null)
			__ejbRef = (com.nl.sligro.commerce.menucalculator.objects.XrecipeShare) PortableRemoteObject
				.narrow(
					ejbRef,
					com.nl.sligro.commerce.menucalculator.objects.XrecipeShare.class);
	
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
	
		com.nl.sligro.commerce.menucalculator.objects.XrecipeShareKey key = keyFromFields(
			initKey_xrecipeId,
			initKey_orgentityIdOwner,
			initKey_orgentityIdSharedWith);
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
			com.nl.sligro.commerce.menucalculator.objects.XrecipeShareKey pKey = (com.nl.sligro.commerce.menucalculator.objects.XrecipeShareKey) this
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
	private com.nl.sligro.commerce.menucalculator.objects.XrecipeShareKey keyFromFields(
		Long f0,
		Long f1,
		Long f2) {
		com.nl.sligro.commerce.menucalculator.objects.XrecipeShareKey keyClass = new com.nl.sligro.commerce.menucalculator.objects.XrecipeShareKey();
		keyClass.xrecipeId = f0;
		keyClass.orgentityIdOwner = f1;
		keyClass.orgentityIdSharedWith = f2;
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
	 * findByOrgentityIdOwner
	 * @generated
	 */
	public java.util.Enumeration findByOrgentityIdOwner(
		java.lang.Long orgentityIdOwner)
		throws javax.naming.NamingException,
		javax.ejb.FinderException,
		java.rmi.RemoteException {
		com.nl.sligro.commerce.menucalculator.objects.XrecipeShareHome localHome = ejbHome();
		java.util.Enumeration ejbs = localHome
			.findByOrgentityIdOwner(orgentityIdOwner);
		return (java.util.Enumeration) createAccessBeans(ejbs);
	}

	/**
	 * findByRecipeId
	 * @generated
	 */
	public XrecipeShareAccessBean findByRecipeId(java.lang.Long xrecipeId)
		throws javax.naming.NamingException,
		javax.ejb.FinderException,
		java.rmi.RemoteException {
		com.nl.sligro.commerce.menucalculator.objects.XrecipeShareHome localHome = ejbHome();
		com.nl.sligro.commerce.menucalculator.objects.XrecipeShare ejbs = localHome
			.findByRecipeId(xrecipeId);
		return (XrecipeShareAccessBean) createAccessBeans(ejbs);
	}

	/**
	 * XrecipeShareAccessBean
	 * @generated
	 */
	public XrecipeShareAccessBean(
		java.lang.Long xrecipeId,
		java.lang.Long orgentityIdOwner,
		java.lang.Long orgentityIdSharedWith,
		java.lang.Double sequence,
		java.lang.String field1,
		java.lang.String field2,
		java.lang.Double field3) throws javax.naming.NamingException,
		javax.ejb.CreateException, java.rmi.RemoteException {
		ejbRef = ejbHome().create(
			xrecipeId,
			orgentityIdOwner,
			orgentityIdSharedWith,
			sequence,
			field1,
			field2,
			field3);
	}

	/**
	 * XrecipeShareAccessBean
	 * @generated
	 */
	public XrecipeShareAccessBean(
		java.lang.Long xrecipeId,
		java.lang.Long orgentityIdOwner,
		java.lang.Long orgentityIdSharedWith)
		throws javax.naming.NamingException, javax.ejb.CreateException,
		java.rmi.RemoteException {
		ejbRef = ejbHome().create(
			xrecipeId,
			orgentityIdOwner,
			orgentityIdSharedWith);
	}

	/**
	 * findByOrgentityIdSharedWith
	 * @generated
	 */
	public java.util.Enumeration findByOrgentityIdSharedWith(
		java.lang.Long orgentityIdSharedWith)
		throws javax.naming.NamingException,
		javax.ejb.FinderException,
		java.rmi.RemoteException {
		com.nl.sligro.commerce.menucalculator.objects.XrecipeShareHome localHome = ejbHome();
		java.util.Enumeration ejbs = localHome
			.findByOrgentityIdSharedWith(orgentityIdSharedWith);
		return (java.util.Enumeration) createAccessBeans(ejbs);
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
}
