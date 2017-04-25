package com.nl.sligro.commerce.menucalculator.objects;

import javax.rmi.*;
import com.ibm.ivj.ejb.runtime.*;

/**
 * XrecipeTypeAccessBean
 * @generated
 */
public class XrecipeTypeAccessBean extends AbstractEntityAccessBean
	implements
		com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeAccessBeanData {

	/**
	 * @generated
	 */
	private XrecipeType __ejbRef;
	/**
	 * @generated
	 */
	private Long initKey_xrecipeTypeId;
	/**
	 * getSelectable
	 * @generated
	 */
	public java.lang.Integer getSelectable()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.Integer) __getCache("selectable")));
	}

	/**
	 * setSelectable
	 * @generated
	 */
	public void setSelectable(java.lang.Integer newValue) {
		__setCache("selectable", newValue);
	}

	/**
	 * getRelationType
	 * @generated
	 */
	public java.lang.String getRelationType()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.String) __getCache("relationType")));
	}

	/**
	 * setRelationType
	 * @generated
	 */
	public void setRelationType(java.lang.String newValue) {
		__setCache("relationType", newValue);
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
	 * getIdentifier
	 * @generated
	 */
	public java.lang.String getIdentifier()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.String) __getCache("identifier")));
	}

	/**
	 * setIdentifier
	 * @generated
	 */
	public void setIdentifier(java.lang.String newValue) {
		__setCache("identifier", newValue);
	}

	/**
	 * getXrecipeTypeId
	 * @generated
	 */
	public java.lang.Long getXrecipeTypeId()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.Long) __getCache("xrecipeTypeId")));
	}

	/**
	 * setInitKey_xrecipeTypeId
	 * @generated
	 */
	public void setInitKey_xrecipeTypeId(Long newValue) {
		this.initKey_xrecipeTypeId = (newValue);
	}

	/**
	 * XrecipeTypeAccessBean
	 * @generated
	 */
	public XrecipeTypeAccessBean() {
		super();
	}

	/**
	 * XrecipeTypeAccessBean
	 * @generated
	 */
	public XrecipeTypeAccessBean(javax.ejb.EJBObject o)
		throws java.rmi.RemoteException {
		super(o);
	}

	/**
	 * defaultJNDIName
	 * @generated
	 */
	public String defaultJNDIName() {
		return "ejb/com/nl/sligro/commerce/menucalculator/objects/XrecipeTypeHome";
	}

	/**
	 * ejbHome
	 * @generated
	 */
	private com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeHome ejbHome()
		throws java.rmi.RemoteException,
		javax.naming.NamingException {
		return (com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeHome) PortableRemoteObject
			.narrow(
				getHome(),
				com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeHome.class);
	}

	/**
	 * ejbRef
	 * @generated
	 */
	private com.nl.sligro.commerce.menucalculator.objects.XrecipeType ejbRef()
		throws java.rmi.RemoteException {
		if (ejbRef == null)
			return null;
		if (__ejbRef == null)
			__ejbRef = (com.nl.sligro.commerce.menucalculator.objects.XrecipeType) PortableRemoteObject
				.narrow(
					ejbRef,
					com.nl.sligro.commerce.menucalculator.objects.XrecipeType.class);
	
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
	
		com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeKey key = keyFromFields(initKey_xrecipeTypeId);
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
			com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeKey pKey = (com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeKey) this
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
	private com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeKey keyFromFields(
		Long f0) {
		com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeKey keyClass = new com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeKey();
		keyClass.xrecipeTypeId = f0;
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
	 * XrecipeTypeAccessBean
	 * @generated
	 */
	public XrecipeTypeAccessBean(
		java.lang.Long xrecipeTypeId,
		java.lang.String identifier,
		java.lang.String relationType,
		java.lang.Integer selectable,
		java.lang.String field1,
		java.lang.String field2,
		java.lang.Double field3) throws javax.naming.NamingException,
		javax.ejb.CreateException, java.rmi.RemoteException {
		ejbRef = ejbHome().create(
			xrecipeTypeId,
			identifier,
			relationType,
			selectable,
			field1,
			field2,
			field3);
	}

	/**
	 * findByRelationType
	 * @generated
	 */
	public java.util.Enumeration findByRelationType(
		java.lang.String relationType)
		throws javax.naming.NamingException,
		javax.ejb.FinderException,
		java.rmi.RemoteException {
		com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeHome localHome = ejbHome();
		java.util.Enumeration ejbs = localHome.findByRelationType(relationType);
		return (java.util.Enumeration) createAccessBeans(ejbs);
	}

	/**
	 * XrecipeTypeAccessBean
	 * @generated
	 */
	public XrecipeTypeAccessBean(java.lang.Long xrecipeTypeId)
		throws javax.naming.NamingException, javax.ejb.CreateException,
		java.rmi.RemoteException {
		ejbRef = ejbHome().create(xrecipeTypeId);
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
