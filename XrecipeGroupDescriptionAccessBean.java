package com.nl.sligro.commerce.menucalculator.objects;

import javax.rmi.*;
import com.ibm.ivj.ejb.runtime.*;

/**
 * XrecipeGroupDescriptionAccessBean
 * @generated
 */
public class XrecipeGroupDescriptionAccessBean extends AbstractEntityAccessBean
	implements
		com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupDescriptionAccessBeanData {

	/**
	 * @generated
	 */
	private XrecipeGroupDescription __ejbRef;

	/**
	 * @generated
	 */
	private Long initKey_xrecipeGroupId;

	/**
	 * @generated
	 */
	private Integer initKey_langId;

	/**
	 * getLongDescription
	 * @generated
	 */
	public java.lang.String getLongDescription()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.String) __getCache("longDescription")));
	}

	/**
	 * setLongDescription
	 * @generated
	 */
	public void setLongDescription(java.lang.String newValue) {
		__setCache("longDescription", newValue);
	}

	/**
	 * getShortDescription
	 * @generated
	 */
	public java.lang.String getShortDescription()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.String) __getCache("shortDescription")));
	}

	/**
	 * setShortDescription
	 * @generated
	 */
	public void setShortDescription(java.lang.String newValue) {
		__setCache("shortDescription", newValue);
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
	 * getXrecipeGroupId
	 * @generated
	 */
	public java.lang.Long getXrecipeGroupId()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.Long) __getCache("xrecipeGroupId")));
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
	 * getLangId
	 * @generated
	 */
	public java.lang.Integer getLangId()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.Integer) __getCache("langId")));
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
	 * getName
	 * @generated
	 */
	public java.lang.String getName()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.String) __getCache("name")));
	}

	/**
	 * setName
	 * @generated
	 */
	public void setName(java.lang.String newValue) {
		__setCache("name", newValue);
	}

	/**
	 * setInitKey_xrecipeGroupId
	 * @generated
	 */
	public void setInitKey_xrecipeGroupId(Long newValue) {
		this.initKey_xrecipeGroupId = (newValue);
	}

	/**
	 * setInitKey_langId
	 * @generated
	 */
	public void setInitKey_langId(Integer newValue) {
		this.initKey_langId = (newValue);
	}

	/**
	 * XrecipeGroupDescriptionAccessBean
	 * @generated
	 */
	public XrecipeGroupDescriptionAccessBean() {
		super();
	}

	/**
	 * XrecipeGroupDescriptionAccessBean
	 * @generated
	 */
	public XrecipeGroupDescriptionAccessBean(javax.ejb.EJBObject o)
		throws java.rmi.RemoteException {
		super(o);
	}

	/**
	 * defaultJNDIName
	 * @generated
	 */
	public String defaultJNDIName() {
		return "ejb/com/nl/sligro/commerce/menucalculator/objects/XrecipeGroupDescriptionHome";
	}

	/**
	 * ejbHome
	 * @generated
	 */
	private com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupDescriptionHome ejbHome()
		throws java.rmi.RemoteException,
		javax.naming.NamingException {
		return (com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupDescriptionHome) PortableRemoteObject
			.narrow(
				getHome(),
				com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupDescriptionHome.class);
	}

	/**
	 * ejbRef
	 * @generated
	 */
	private com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupDescription ejbRef()
		throws java.rmi.RemoteException {
		if (ejbRef == null)
			return null;
		if (__ejbRef == null)
			__ejbRef = (com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupDescription) PortableRemoteObject
				.narrow(
					ejbRef,
					com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupDescription.class);
	
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
	
		com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupDescriptionKey key = keyFromFields(
			initKey_xrecipeGroupId,
			initKey_langId);
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
			com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupDescriptionKey pKey = (com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupDescriptionKey) this
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
	private com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupDescriptionKey keyFromFields(
		Long f0,
		Integer f1) {
		com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupDescriptionKey keyClass = new com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupDescriptionKey();
		keyClass.xrecipeGroupId = f0;
		keyClass.langId = f1;
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
	 * findByName
	 * @generated
	 */
	public XrecipeGroupDescriptionAccessBean findByName(java.lang.String name)
		throws javax.naming.NamingException,
		javax.ejb.FinderException,
		java.rmi.RemoteException {
		com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupDescriptionHome localHome = ejbHome();
		com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupDescription ejbs = localHome
			.findByName(name);
		return (XrecipeGroupDescriptionAccessBean) createAccessBeans(ejbs);
	}

	/**
	 * XrecipeGroupDescriptionAccessBean
	 * @generated
	 */
	public XrecipeGroupDescriptionAccessBean(
		java.lang.Long xrecipeGroupId,
		java.lang.Integer langId,
		java.lang.String name,
		java.lang.String shortDescription,
		java.lang.String longDescription,
		java.sql.Timestamp lastUpdated,
		java.lang.Double sequence,
		java.lang.String field1,
		java.lang.String field2,
		java.lang.Double field3) throws javax.naming.NamingException,
		javax.ejb.CreateException, java.rmi.RemoteException {
		ejbRef = ejbHome().create(
			xrecipeGroupId,
			langId,
			name,
			shortDescription,
			longDescription,
			lastUpdated,
			sequence,
			field1,
			field2,
			field3);
	}

	/**
	 * XrecipeGroupDescriptionAccessBean
	 * @generated
	 */
	public XrecipeGroupDescriptionAccessBean(
		java.lang.Long xrecipeGroupId,
		java.lang.Integer langId) throws javax.naming.NamingException,
		javax.ejb.CreateException, java.rmi.RemoteException {
		ejbRef = ejbHome().create(xrecipeGroupId, langId);
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
