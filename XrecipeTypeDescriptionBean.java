package com.nl.sligro.commerce.menucalculator.objects;

/**
 * Bean implementation class for Enterprise Bean: XrecipeTypeDescription
 */
public class XrecipeTypeDescriptionBean
	extends
		com.ibm.commerce.base.objects.ECEntityBean
	implements
		javax.ejb.EntityBean {

	/**
	 * Implementation field for persistent attribute: xrecipeTypeId
	 */
	public java.lang.Integer xrecipeTypeId;

	/**
	 * Implementation field for persistent attribute: langId
	 */
	public java.lang.Integer langId;

	/**
	 * Implementation field for persistent attribute: name
	 */
	public java.lang.String name;

	/**
	 * Implementation field for persistent attribute: description
	 */
	public java.lang.String description;

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
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeDescriptionKey ejbCreate(
		java.lang.Integer xrecipeTypeId,
		java.lang.Integer langId) throws javax.ejb.CreateException {
		_initLinks();
		this.xrecipeTypeId = xrecipeTypeId;
		this.langId = langId;
		return null;
	}

	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(
		java.lang.Integer xrecipeTypeId,
		java.lang.Integer langId) throws javax.ejb.CreateException {
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
	 * Get accessor for persistent attribute: name
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * Set accessor for persistent attribute: name
	 */
	public void setName(java.lang.String newName) {
		name = newName;
	}

	/**
	 * Get accessor for persistent attribute: description
	 */
	public java.lang.String getDescription() {
		return description;
	}

	/**
	 * Set accessor for persistent attribute: description
	 */
	public void setDescription(java.lang.String newDescription) {
		description = newDescription;
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
	
	public java.lang.Integer getXrecipeTypeId() {
	   return xrecipeTypeId;
	}
	
	public java.lang.Integer getLangId() {
	   return langId;
	}
	
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeDescriptionKey ejbCreate(
	   java.lang.Integer xrecipeTypeId, java.lang.Integer langId,
	   java.lang.String name, java.lang.String description,
	   java.lang.String field1, java.lang.String field2, java.lang.Double field3)
	   throws javax.ejb.CreateException {
		 this.initializeFields();
	      _initLinks();
	      this.xrecipeTypeId=xrecipeTypeId;
	      this.langId=langId;
	      this.name=name;
	      this.description=description;
	      this.field1=field1;
	      this.field2=field2;
	      this.field3=field3;
	      XrecipeTypeDescriptionKey myNewKey = new XrecipeTypeDescriptionKey(xrecipeTypeId, langId); 
	      this.initializeOptCounter(myNewKey);
	      return null;
	}
	
	public void ejbPostCreate(java.lang.Integer xrecipeTypeId, java.lang.Integer langId,
			   java.lang.String name, java.lang.String description,
			   java.lang.String field1, java.lang.String field2, java.lang.Double field3) 
			   throws javax.ejb.CreateException
			   {
			   }

	/**
	 * _copyFromEJB
	 */
	public java.util.Hashtable _copyFromEJB() {
		com.ibm.ivj.ejb.runtime.AccessBeanHashtable h = new com.ibm.ivj.ejb.runtime.AccessBeanHashtable();
	
		h.put("field1", getField1());
		h.put("field2", getField2());
		h.put("langId", getLangId());
		h.put("field3", getField3());
		h.put("xrecipeTypeId", getXrecipeTypeId());
		h.put("name", getName());
		h.put("description", getDescription());
		h.put("__Key", getEntityContext().getPrimaryKey());
	
		return h;
	}

	/**
	 * _copyToEJB
	 */
	public void _copyToEJB(java.util.Hashtable h) {
		java.lang.String localField1 = (java.lang.String) h.get("field1");
		java.lang.String localField2 = (java.lang.String) h.get("field2");
		java.lang.Double localField3 = (java.lang.Double) h.get("field3");
		java.lang.String localName = (java.lang.String) h.get("name");
		java.lang.String localDescription = (java.lang.String) h
			.get("description");
	
		if (h.containsKey("field1"))
			setField1((localField1));
		if (h.containsKey("field2"))
			setField2((localField2));
		if (h.containsKey("field3"))
			setField3((localField3));
		if (h.containsKey("name"))
			setName((localName));
		if (h.containsKey("description"))
			setDescription((localDescription));
	}
}
