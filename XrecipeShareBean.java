package com.nl.sligro.commerce.menucalculator.objects;

/**
 * Bean implementation class for Enterprise Bean: XrecipeShare
 */
public class XrecipeShareBean
	extends
		com.ibm.commerce.base.objects.ECEntityBean
	implements
		javax.ejb.EntityBean {

	/**
	 * Implementation field for persistent attribute: xrecipeId
	 */
	public java.lang.Long xrecipeId;

	/**
	 * Implementation field for persistent attribute: orgentityIdOwner
	 */
	public java.lang.Long orgentityIdOwner;

	/**
	 * Implementation field for persistent attribute: orgentityIdSharedWith
	 */
	public java.lang.Long orgentityIdSharedWith;

	/**
	 * Implementation field for persistent attribute: sequence
	 */
	public java.lang.Double sequence;

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
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeShareKey ejbCreate(
		java.lang.Long xrecipeId,
		java.lang.Long orgentityIdOwner,
		java.lang.Long orgentityIdSharedWith) throws javax.ejb.CreateException {
		_initLinks();
		this.xrecipeId = xrecipeId;
		this.orgentityIdOwner = orgentityIdOwner;
		this.orgentityIdSharedWith = orgentityIdSharedWith;
		return null;
	}

	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(
		java.lang.Long xrecipeId,
		java.lang.Long orgentityIdOwner,
		java.lang.Long orgentityIdSharedWith) throws javax.ejb.CreateException {
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
	 * Get accessor for persistent attribute: sequence
	 */
	public java.lang.Double getSequence() {
		return sequence;
	}

	/**
	 * Set accessor for persistent attribute: sequence
	 */
	public void setSequence(java.lang.Double newSequence) {
		sequence = newSequence;
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
	
	public java.lang.Long getXrecipeId() {
	   return xrecipeId;
	}
	
	public java.lang.Long getOrgentityIdOwner() {
	   return orgentityIdOwner;
	}
	
	public java.lang.Long getOrgentityIdSharedWith() {
	   return orgentityIdSharedWith;
	}
	
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeShareKey ejbCreate(
	   java.lang.Long xrecipeId,java.lang.Long orgentityIdOwner, 
	   java.lang.Long orgentityIdSharedWith,java.lang.Double sequence, 
	   java.lang.String field1,java.lang.String field2, 
	   java.lang.Double field3)	
	   throws javax.ejb.CreateException {
		this.initializeFields();
	      _initLinks();
	      this.xrecipeId=xrecipeId;
	      this.orgentityIdOwner=orgentityIdOwner;
	      this.orgentityIdSharedWith=orgentityIdSharedWith;
	      this.sequence=sequence;
	      this.field1=field1;
	      this.field2=field2;
	      this.field3=field3;
	      XrecipeShareKey myNewKey = new XrecipeShareKey(xrecipeId, orgentityIdOwner, orgentityIdSharedWith); 
	      this.initializeOptCounter(myNewKey);
	      return null;
	}
	
	public void ejbPostCreate(java.lang.Long xrecipeId,java.lang.Long orgentityIdOwner, 
			   java.lang.Long orgentityIdSharedWith,java.lang.Double sequence, 
			   java.lang.String field1,java.lang.String field2, 
			   java.lang.Double field3) 
   throws javax.ejb.CreateException
   {
   }

	/**
	 * _copyFromEJB
	 */
	public java.util.Hashtable _copyFromEJB() {
		com.ibm.ivj.ejb.runtime.AccessBeanHashtable h = new com.ibm.ivj.ejb.runtime.AccessBeanHashtable();
	
		h.put("orgentityIdOwner", getOrgentityIdOwner());
		h.put("xrecipeId", getXrecipeId());
		h.put("sequence", getSequence());
		h.put("field1", getField1());
		h.put("field2", getField2());
		h.put("field3", getField3());
		h.put("orgentityIdSharedWith", getOrgentityIdSharedWith());
		h.put("__Key", getEntityContext().getPrimaryKey());
	
		return h;
	}

	/**
	 * _copyToEJB
	 */
	public void _copyToEJB(java.util.Hashtable h) {
		java.lang.Double localSequence = (java.lang.Double) h.get("sequence");
		java.lang.String localField1 = (java.lang.String) h.get("field1");
		java.lang.String localField2 = (java.lang.String) h.get("field2");
		java.lang.Double localField3 = (java.lang.Double) h.get("field3");
	
		if (h.containsKey("sequence"))
			setSequence((localSequence));
		if (h.containsKey("field1"))
			setField1((localField1));
		if (h.containsKey("field2"))
			setField2((localField2));
		if (h.containsKey("field3"))
			setField3((localField3));
	}
}
