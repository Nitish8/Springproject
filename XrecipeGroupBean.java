package com.nl.sligro.commerce.menucalculator.objects;

/**
 * Bean implementation class for Enterprise Bean: XrecipeGroup
 */
public class XrecipeGroupBean
	extends
		com.ibm.commerce.base.objects.ECEntityBean
	implements
		javax.ejb.EntityBean {

	/**
	 * Implementation field for persistent attribute: xrecipeGroupId
	 */
	public java.lang.Long xrecipeGroupId;

	/**
	 * Implementation field for persistent attribute: identifier
	 */
	public java.lang.String identifier;

	/**
	 * Implementation field for persistent attribute: createdBy
	 */
	public java.lang.Long createdBy;

	/**
	 * Implementation field for persistent attribute: markForDelete
	 */
	public java.lang.Integer markForDelete;

	/**
	 * Implementation field for persistent attribute: orgentityId
	 */
	public java.lang.Long orgentityId;

	/**
	 * Implementation field for persistent attribute: isParentGroup
	 */
	public java.lang.Integer isParentGroup;

	/**
	 * Implementation field for persistent attribute: field1
	 */
	public java.lang.String field1;

	/**
	 * Implementation field for persistent attribute: field2
	 */
	public java.lang.String field2;

	/**
	 * Implementation field for persistent attribute: field3
	 */
	public java.lang.Double field3;

	/**
	 * Implementation field for persistent attribute: optCounter
	 */
	public short optCounter;

	/**
	 * ejbCreate method for a CMP entity bean.
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupKey ejbCreate(
		java.lang.Long xrecipeGroupId) throws javax.ejb.CreateException {
		_initLinks();
		this.xrecipeGroupId = xrecipeGroupId;
		return null;
	}

	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(java.lang.Long xrecipeGroupId)
		throws javax.ejb.CreateException {
	}

	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
		_initLinks();
	}

	/**
	 * ejbLoad
	 */
	public void ejbLoad() {
		super.ejbLoad();
		_initLinks();
	}

	/**
	 * ejbPassivate
	 */
	public void ejbPassivate() {
	}

	/**
	 * ejbRemove
	 */
	public void ejbRemove() throws javax.ejb.RemoveException {
		try {
			_removeLinks();
		} catch (java.rmi.RemoteException e) {
			throw new javax.ejb.RemoveException(e.getMessage());
		}
	}

	/**
	 * ejbStore
	 */
	public void ejbStore() {
		super.ejbStore();
	}

	/**
	 * This method was generated for supporting the associations.
	 */
	protected void _initLinks() {
	}

	/**
	 * This method was generated for supporting the associations.
	 */
	protected java.util.Vector _getLinks() {
		java.util.Vector links = new java.util.Vector();
		return links;
	}

	/**
	 * This method was generated for supporting the associations.
	 */
	protected void _removeLinks()
		throws java.rmi.RemoteException,
		javax.ejb.RemoveException {
		java.util.List links = _getLinks();
		for (int i = 0; i < links.size(); i++) {
			try {
				((com.ibm.ivj.ejb.associations.interfaces.Link) links.get(i))
					.remove();
			} catch (javax.ejb.FinderException e) {
			} //Consume Finder error since I am going away
		}
	}

	/**
	 * Get accessor for persistent attribute: identifier
	 */
	public java.lang.String getIdentifier() {
		return identifier;
	}

	/**
	 * Set accessor for persistent attribute: identifier
	 */
	public void setIdentifier(java.lang.String newIdentifier) {
		identifier = newIdentifier;
	}

	/**
	 * Get accessor for persistent attribute: createdBy
	 */
	public java.lang.Long getCreatedBy() {
		return createdBy;
	}

	/**
	 * Set accessor for persistent attribute: createdBy
	 */
	public void setCreatedBy(java.lang.Long newCreatedBy) {
		createdBy = newCreatedBy;
	}

	/**
	 * Get accessor for persistent attribute: markForDelete
	 */
	public java.lang.Integer getMarkForDelete() {
		return markForDelete;
	}

	/**
	 * Set accessor for persistent attribute: markForDelete
	 */
	public void setMarkForDelete(java.lang.Integer newMarkForDelete) {
		markForDelete = newMarkForDelete;
	}

	/**
	 * Get accessor for persistent attribute: orgentityId
	 */
	public java.lang.Long getOrgentityId() {
		return orgentityId;
	}

	/**
	 * Set accessor for persistent attribute: orgentityId
	 */
	public void setOrgentityId(java.lang.Long newOrgentityId) {
		orgentityId = newOrgentityId;
	}

	/**
	 * Get accessor for persistent attribute: isParentGroup
	 */
	public java.lang.Integer getIsParentGroup() {
		return isParentGroup;
	}

	/**
	 * Set accessor for persistent attribute: isParentGroup
	 */
	public void setIsParentGroup(java.lang.Integer newIsParentGroup) {
		isParentGroup = newIsParentGroup;
	}

	/**
	 * Get accessor for persistent attribute: field1
	 */
	public java.lang.String getField1() {
		return field1;
	}

	/**
	 * Set accessor for persistent attribute: field1
	 */
	public void setField1(java.lang.String newField1) {
		field1 = newField1;
	}

	/**
	 * Get accessor for persistent attribute: field2
	 */
	public java.lang.String getField2() {
		return field2;
	}

	/**
	 * Set accessor for persistent attribute: field2
	 */
	public void setField2(java.lang.String newField2) {
		field2 = newField2;
	}

	/**
	 * Get accessor for persistent attribute: field3
	 */
	public java.lang.Double getField3() {
		return field3;
	}

	/**
	 * Set accessor for persistent attribute: field3
	 */
	public void setField3(java.lang.Double newField3) {
		field3 = newField3;
	}
	
	public java.lang.Long getXrecipeGroupId() {
	   return xrecipeGroupId;
	}
	
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupKey ejbCreate(
	   java.lang.Long xrecipeGroupId, java.lang.String identifier,
	   java.lang.Long createdBy, java.lang.Integer markForDelete,
	   java.lang.Long orgentityId, java.lang.Integer isParentGroup,
	   java.lang.String field1, java.lang.String field2, java.lang.Double field3)
	   throws javax.ejb.CreateException {
		 this.initializeFields();
	      _initLinks();
	      this.xrecipeGroupId=xrecipeGroupId;
	      this.identifier=identifier;
	      this.createdBy=createdBy;
	      this.markForDelete=markForDelete;
	      this.orgentityId=orgentityId;
	      this.isParentGroup=isParentGroup;
	      this.field1=field1;
	      this.field2=field2;
	      this.field3=field3;
	      XrecipeGroupKey myNewKey = new XrecipeGroupKey(xrecipeGroupId); 
	      this.initializeOptCounter(myNewKey);
	      return null;
	}
	
	public void ejbPostCreate(java.lang.Long xrecipeGroupId, java.lang.String identifier,
			   java.lang.Long createdBy, java.lang.Integer markForDelete,
			   java.lang.Long orgentityId, java.lang.Integer isParentGroup,
			   java.lang.String field1, java.lang.String field2, java.lang.Double field3) 
   throws javax.ejb.CreateException
   {
   }

	/**
	 * _copyFromEJB
	 */
	public java.util.Hashtable _copyFromEJB() {
		com.ibm.ivj.ejb.runtime.AccessBeanHashtable h = new com.ibm.ivj.ejb.runtime.AccessBeanHashtable();
	
		h.put("orgentityId", getOrgentityId());
		h.put("xrecipeGroupId", getXrecipeGroupId());
		h.put("field1", getField1());
		h.put("markForDelete", getMarkForDelete());
		h.put("field2", getField2());
		h.put("field3", getField3());
		h.put("identifier", getIdentifier());
		h.put("isParentGroup", getIsParentGroup());
		h.put("createdBy", getCreatedBy());
		h.put("__Key", getEntityContext().getPrimaryKey());
	
		return h;
	}

	/**
	 * _copyToEJB
	 */
	public void _copyToEJB(java.util.Hashtable h) {
		java.lang.Long localOrgentityId = (java.lang.Long) h.get("orgentityId");
		java.lang.String localField1 = (java.lang.String) h.get("field1");
		java.lang.Integer localMarkForDelete = (java.lang.Integer) h
			.get("markForDelete");
		java.lang.String localField2 = (java.lang.String) h.get("field2");
		java.lang.Double localField3 = (java.lang.Double) h.get("field3");
		java.lang.String localIdentifier = (java.lang.String) h
			.get("identifier");
		java.lang.Integer localIsParentGroup = (java.lang.Integer) h
			.get("isParentGroup");
		java.lang.Long localCreatedBy = (java.lang.Long) h.get("createdBy");
	
		if (h.containsKey("orgentityId"))
			setOrgentityId((localOrgentityId));
		if (h.containsKey("field1"))
			setField1((localField1));
		if (h.containsKey("markForDelete"))
			setMarkForDelete((localMarkForDelete));
		if (h.containsKey("field2"))
			setField2((localField2));
		if (h.containsKey("field3"))
			setField3((localField3));
		if (h.containsKey("identifier"))
			setIdentifier((localIdentifier));
		if (h.containsKey("isParentGroup"))
			setIsParentGroup((localIsParentGroup));
		if (h.containsKey("createdBy"))
			setCreatedBy((localCreatedBy));
	}
}
