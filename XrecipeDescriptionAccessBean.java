package com.nl.sligro.commerce.menucalculator.objects;

import javax.rmi.*;
import com.ibm.ivj.ejb.runtime.*;

/**
 * XrecipeDescriptionAccessBean
 * @generated
 */
public class XrecipeDescriptionAccessBean extends AbstractEntityAccessBean
	implements
		com.nl.sligro.commerce.menucalculator.objects.XrecipeDescriptionAccessBeanData {

	/**
	 * @generated
	 */
	private XrecipeDescription __ejbRef;

	/**
	 * @generated
	 */
	private Long initKey_xrecipeId;

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
	 * getThumbnail
	 * @generated
	 */
	public java.lang.String getThumbnail()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.String) __getCache("thumbnail")));
	}

	/**
	 * setThumbnail
	 * @generated
	 */
	public void setThumbnail(java.lang.String newValue) {
		__setCache("thumbnail", newValue);
	}

	/**
	 * getComment
	 * @generated
	 */
	public java.lang.String getComment()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.String) __getCache("comment")));
	}

	/**
	 * setComment
	 * @generated
	 */
	public void setComment(java.lang.String newValue) {
		__setCache("comment", newValue);
	}

	/**
	 * setInitKey_xrecipeId
	 * @generated
	 */
	public void setInitKey_xrecipeId(Long newValue) {
		this.initKey_xrecipeId = (newValue);
	}

	/**
	 * setInitKey_langId
	 * @generated
	 */
	public void setInitKey_langId(Integer newValue) {
		this.initKey_langId = (newValue);
	}

	/**
	 * XrecipeDescriptionAccessBean
	 * @generated
	 */
	public XrecipeDescriptionAccessBean() {
		super();
	}

	/**
	 * XrecipeDescriptionAccessBean
	 * @generated
	 */
	public XrecipeDescriptionAccessBean(javax.ejb.EJBObject o)
		throws java.rmi.RemoteException {
		super(o);
	}

	/**
	 * defaultJNDIName
	 * @generated
	 */
	public String defaultJNDIName() {
		return "ejb/com/nl/sligro/commerce/menucalculator/objects/XrecipeDescriptionHome";
	}

	/**
	 * ejbHome
	 * @generated
	 */
	private com.nl.sligro.commerce.menucalculator.objects.XrecipeDescriptionHome ejbHome()
		throws java.rmi.RemoteException,
		javax.naming.NamingException {
		return (com.nl.sligro.commerce.menucalculator.objects.XrecipeDescriptionHome) PortableRemoteObject
			.narrow(
				getHome(),
				com.nl.sligro.commerce.menucalculator.objects.XrecipeDescriptionHome.class);
	}

	/**
	 * ejbRef
	 * @generated
	 */
	private com.nl.sligro.commerce.menucalculator.objects.XrecipeDescription ejbRef()
		throws java.rmi.RemoteException {
		if (ejbRef == null)
			return null;
		if (__ejbRef == null)
			__ejbRef = (com.nl.sligro.commerce.menucalculator.objects.XrecipeDescription) PortableRemoteObject
				.narrow(
					ejbRef,
					com.nl.sligro.commerce.menucalculator.objects.XrecipeDescription.class);
	
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
	
		com.nl.sligro.commerce.menucalculator.objects.XrecipeDescriptionKey key = keyFromFields(
			initKey_xrecipeId,
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
			com.nl.sligro.commerce.menucalculator.objects.XrecipeDescriptionKey pKey = (com.nl.sligro.commerce.menucalculator.objects.XrecipeDescriptionKey) this
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
	private com.nl.sligro.commerce.menucalculator.objects.XrecipeDescriptionKey keyFromFields(
		Long f0,
		Integer f1) {
		com.nl.sligro.commerce.menucalculator.objects.XrecipeDescriptionKey keyClass = new com.nl.sligro.commerce.menucalculator.objects.XrecipeDescriptionKey();
		keyClass.xrecipeId = f0;
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
	 * findByRecipeIdAndLangId
	 * @generated
	 */
	public XrecipeDescriptionAccessBean findByRecipeIdAndLangId(
		java.lang.Long xrecipeId,
		java.lang.Integer langId)
		throws javax.naming.NamingException,
		javax.ejb.FinderException,
		java.rmi.RemoteException {
		com.nl.sligro.commerce.menucalculator.objects.XrecipeDescriptionHome localHome = ejbHome();
		com.nl.sligro.commerce.menucalculator.objects.XrecipeDescription ejbs = localHome
			.findByRecipeIdAndLangId(xrecipeId, langId);
		return (XrecipeDescriptionAccessBean) createAccessBeans(ejbs);
	}

	/**
	 * XrecipeDescriptionAccessBean
	 * @generated
	 */
	public XrecipeDescriptionAccessBean(
		java.lang.Long xrecipeId,
		java.lang.Integer langId,
		java.lang.String name,
		java.lang.String shortDescription,
		java.lang.String longDescription,
		java.lang.String thumbnail,
		java.lang.String comment,
		java.lang.String field1,
		java.lang.String field2,
		java.lang.Double field3) throws javax.naming.NamingException,
		javax.ejb.CreateException, java.rmi.RemoteException {
		ejbRef = ejbHome().create(
			xrecipeId,
			langId,
			name,
			shortDescription,
			longDescription,
			thumbnail,
			comment,
			field1,
			field2,
			field3);
	}

	/**
	 * XrecipeDescriptionAccessBean
	 * @generated
	 */
	public XrecipeDescriptionAccessBean(
		java.lang.Long xrecipeId,
		java.lang.Integer langId) throws javax.naming.NamingException,
		javax.ejb.CreateException, java.rmi.RemoteException {
		ejbRef = ejbHome().create(xrecipeId, langId);
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
	 * findByName
	 * @generated
	 */
	public XrecipeDescriptionAccessBean findByName(java.lang.String name)
		throws javax.naming.NamingException,
		javax.ejb.FinderException,
		java.rmi.RemoteException {
		com.nl.sligro.commerce.menucalculator.objects.XrecipeDescriptionHome localHome = ejbHome();
		com.nl.sligro.commerce.menucalculator.objects.XrecipeDescription ejbs = localHome
			.findByName(name);
		return (XrecipeDescriptionAccessBean) createAccessBeans(ejbs);
	}

	/**
	 * findByNameAndLangId
	 * @generated
	 */
	public java.util.Enumeration findByNameAndLangId(
		java.lang.String name,
		java.lang.Long langId)
		throws javax.naming.NamingException,
		javax.ejb.FinderException,
		java.rmi.RemoteException {
		com.nl.sligro.commerce.menucalculator.objects.XrecipeDescriptionHome localHome = ejbHome();
		java.util.Enumeration ejbs = localHome
			.findByNameAndLangId(name, langId);
		return (java.util.Enumeration) createAccessBeans(ejbs);
	}
}
