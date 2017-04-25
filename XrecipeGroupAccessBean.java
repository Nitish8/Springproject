package com.nl.sligro.commerce.menucalculator.objects;

import javax.rmi.*;
import com.ibm.ivj.ejb.runtime.*;

/**
 * XrecipeGroupAccessBean
 * @generated
 */
public class XrecipeGroupAccessBean extends AbstractEntityAccessBean
	implements
		com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupAccessBeanData {

	/**
	 * @generated
	 */
	private XrecipeGroup __ejbRef;
	/**
	 * @generated
	 */
	private Long initKey_xrecipeGroupId;
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
	 * getIsParentGroup
	 * @generated
	 */
	public java.lang.Integer getIsParentGroup()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.Integer) __getCache("isParentGroup")));
	}

	/**
	 * setIsParentGroup
	 * @generated
	 */
	public void setIsParentGroup(java.lang.Integer newValue) {
		__setCache("isParentGroup", newValue);
	}

	/**
	 * getCreatedBy
	 * @generated
	 */
	public java.lang.Long getCreatedBy()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.Long) __getCache("createdBy")));
	}

	/**
	 * setCreatedBy
	 * @generated
	 */
	public void setCreatedBy(java.lang.Long newValue) {
		__setCache("createdBy", newValue);
	}

	/**
	 * setInitKey_xrecipeGroupId
	 * @generated
	 */
	public void setInitKey_xrecipeGroupId(Long newValue) {
		this.initKey_xrecipeGroupId = (newValue);
	}

	/**
	 * XrecipeGroupAccessBean
	 * @generated
	 */
	public XrecipeGroupAccessBean() {
		super();
	}

	/**
	 * XrecipeGroupAccessBean
	 * @generated
	 */
	public XrecipeGroupAccessBean(javax.ejb.EJBObject o)
		throws java.rmi.RemoteException {
		super(o);
	}

	/**
	 * defaultJNDIName
	 * @generated
	 */
	public String defaultJNDIName() {
		return "ejb/com/nl/sligro/commerce/menucalculator/objects/XrecipeGroupHome";
	}

	/**
	 * ejbHome
	 * @generated
	 */
	private com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupHome ejbHome()
		throws java.rmi.RemoteException,
		javax.naming.NamingException {
		return (com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupHome) PortableRemoteObject
			.narrow(
				getHome(),
				com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupHome.class);
	}

	/**
	 * ejbRef
	 * @generated
	 */
	private com.nl.sligro.commerce.menucalculator.objects.XrecipeGroup ejbRef()
		throws java.rmi.RemoteException {
		if (ejbRef == null)
			return null;
		if (__ejbRef == null)
			__ejbRef = (com.nl.sligro.commerce.menucalculator.objects.XrecipeGroup) PortableRemoteObject
				.narrow(
					ejbRef,
					com.nl.sligro.commerce.menucalculator.objects.XrecipeGroup.class);
	
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
	
		com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupKey key = keyFromFields(initKey_xrecipeGroupId);
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
			com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupKey pKey = (com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupKey) this
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
	private com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupKey keyFromFields(
		Long f0) {
		com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupKey keyClass = new com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupKey();
		keyClass.xrecipeGroupId = f0;
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
	 * findByOrgentityId
	 * @generated
	 */
	public java.util.Enumeration findByOrgentityId(java.lang.Long orgentityId)
		throws javax.naming.NamingException,
		javax.ejb.FinderException,
		java.rmi.RemoteException {
		com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupHome localHome = ejbHome();
		java.util.Enumeration ejbs = localHome.findByOrgentityId(orgentityId);
		return (java.util.Enumeration) createAccessBeans(ejbs);
	}

	/**
	 * XrecipeGroupAccessBean
	 * @generated
	 */
	public XrecipeGroupAccessBean(
		java.lang.Long xrecipeGroupId,
		java.lang.String identifier,
		java.lang.Long createdBy,
		java.lang.Integer markForDelete,
		java.lang.Long orgentityId,
		java.lang.Integer isParentGroup,
		java.lang.String field1,
		java.lang.String field2,
		java.lang.Double field3) throws javax.naming.NamingException,
		javax.ejb.CreateException, java.rmi.RemoteException {
		ejbRef = ejbHome().create(
			xrecipeGroupId,
			identifier,
			createdBy,
			markForDelete,
			orgentityId,
			isParentGroup,
			field1,
			field2,
			field3);
	}

	/**
	 * XrecipeGroupAccessBean
	 * @generated
	 */
	public XrecipeGroupAccessBean(java.lang.Long xrecipeGroupId)
		throws javax.naming.NamingException, javax.ejb.CreateException,
		java.rmi.RemoteException {
		ejbRef = ejbHome().create(xrecipeGroupId);
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
	 * findParentRecipeGroupsByOrgId
	 * @generated
	 */
	public java.util.Enumeration findParentRecipeGroupsByOrgId(
		java.lang.Long orgentityId)
		throws javax.naming.NamingException,
		javax.ejb.FinderException,
		java.rmi.RemoteException {
		com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupHome localHome = ejbHome();
		java.util.Enumeration ejbs = localHome
			.findParentRecipeGroupsByOrgId(orgentityId);
		return (java.util.Enumeration) createAccessBeans(ejbs);
	}
}
