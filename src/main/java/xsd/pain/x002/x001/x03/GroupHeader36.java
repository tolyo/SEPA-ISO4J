/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * GroupHeader36. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>MsgId</b> of type {@link java.lang.String} (1)</li>
 * <li><b>CreDtTm</b> of type {@link
 * biz.c24.io.api.data.ISO8601DateTime} (1)</li>
 * <li><b>InitgPty</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32}
 * (0..1)</li>
 * <li><b>FwdgAgt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4}
 * (0..1)</li>
 * <li><b>DbtrAgt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4}
 * (0..1)</li>
 * <li><b>CdtrAgt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4}
 * (0..1)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.GroupHeader36Cls
 */
public class GroupHeader36 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"CdtrAgt", "CreDtTm", "DbtrAgt", "FwdgAgt", "InitgPty", "MsgId"};

    /**
     * Field msgId.
     */
    private java.lang.String msgId;

    /**
     * Field creDtTm.
     */
    private biz.c24.io.api.data.ISO8601DateTime creDtTm;

    /**
     * Field initgPty.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 initgPty;

    /**
     * Field fwdgAgt.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 fwdgAgt;

    /**
     * Field dbtrAgt.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 dbtrAgt;

    /**
     * Field cdtrAgt.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 cdtrAgt;

    public GroupHeader36() {
        this(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.GroupHeader36Cls.getInstance().getNullDefiningElementDecl());
    }

    public GroupHeader36(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public GroupHeader36(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public GroupHeader36(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.GroupHeader36 clone) {
        super(clone);
    }

    /**
     * Adds <code>value</code> as an element called
     * <code>name</code>.<p>
     * The legal value(s) for <code>name</code> are defined in
     * {@link #getElement}.
     * 
     * @param name
     * @param value
     */
    public void addElement(java.lang.String name,java.lang.Object value) {
        name = makeSubstitution(name, -1);
        int i = Arrays.binarySearch(NATIVE_ELEMENTS, name);
        switch (i)
        {
            case 5:
                setMsgId((java.lang.String) value);
                return;
            case 1:
                setCreDtTm((biz.c24.io.api.data.ISO8601DateTime) value);
                return;
            case 4:
                setInitgPty((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) value);
                return;
            case 3:
                setFwdgAgt((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 2:
                setDbtrAgt((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 0:
                setCdtrAgt((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) value);
                return;
            default:
                super.addElement(name, value);
        }
    }

    /**
     * Creates and returns a shallow clone of this object.
     * 
     * @see #cloneDeep()
     */
    public java.lang.Object clone() {
        return new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.GroupHeader36(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.GroupHeader36(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.GroupHeader36 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.GroupHeader36) clone;
        obj.msgId = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.msgId, obj, "MsgId");
        obj.creDtTm = (biz.c24.io.api.data.ISO8601DateTime) biz.c24.io.api.Utils.cloneDeep(this.creDtTm, obj, "CreDtTm");
        obj.initgPty = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) biz.c24.io.api.Utils.cloneDeep(this.initgPty, obj, "InitgPty");
        obj.fwdgAgt = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) biz.c24.io.api.Utils.cloneDeep(this.fwdgAgt, obj, "FwdgAgt");
        obj.dbtrAgt = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) biz.c24.io.api.Utils.cloneDeep(this.dbtrAgt, obj, "DbtrAgt");
        obj.cdtrAgt = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) biz.c24.io.api.Utils.cloneDeep(this.cdtrAgt, obj, "CdtrAgt");
    }

    /**
     * Creates, adds and returns a new CdtrAgt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 createCdtrAgt() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) getElementDecl("CdtrAgt").createObject();
        setCdtrAgt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new DbtrAgt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 createDbtrAgt() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) getElementDecl("DbtrAgt").createObject();
        setDbtrAgt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new FwdgAgt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 createFwdgAgt() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) getElementDecl("FwdgAgt").createObject();
        setFwdgAgt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new InitgPty (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 createInitgPty() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) getElementDecl("InitgPty").createObject();
        setInitgPty(obj);
        return obj;
    }

    public boolean equals(java.lang.Object obj) {

        if(obj == null)
            return false;
        else if(obj instanceof biz.c24.io.api.data.ComplexDataObject)
            return equalContents((biz.c24.io.api.data.ComplexDataObject) obj, true, true, true, true);
        else
            return obj.equals(this);
    }

    /**
     * Gets the value of CdtrAgt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 getCdtrAgt() {
        return this.cdtrAgt;
    }

    /**
     * Gets the value of CreDtTm (1).
     * 
     * @return The value.
     */
    public biz.c24.io.api.data.ISO8601DateTime getCreDtTm() {
        return this.creDtTm;
    }

    /**
     * Gets the value of DbtrAgt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 getDbtrAgt() {
        return this.dbtrAgt;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>msgId,
     * creDtTm, initgPty, fwdgAgt, dbtrAgt, cdtrAgt</b>.
     * 
     * @param name
     * @param index
     */
    public java.lang.Object getElement(java.lang.String name,int index) {
        int i = Arrays.binarySearch(NATIVE_ELEMENTS, name);
        if (i < 0)
        {
            name = getSubstitute(name);
            i = Arrays.binarySearch(NATIVE_ELEMENTS, name);
        }
        switch (i)
        {
            case 5:
                return getMsgId();
            case 1:
                return getCreDtTm();
            case 4:
                return getInitgPty();
            case 3:
                return getFwdgAgt();
            case 2:
                return getDbtrAgt();
            case 0:
                return getCdtrAgt();
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Returns the count of elements called <code>name</code>.<p>
     * The legal value(s) for <code>name</code> are defined in
     * {@link #getElement}.
     * 
     * @param name
     */
    public int getElementCount(java.lang.String name) {
        if (null == name) throw new NullPointerException(toString() + " was asked to calculate elements without name");
        int i = Arrays.binarySearch(NATIVE_ELEMENTS, name);
        if (i < 0)
        {
            name = getSubstitute(name);
            i = Arrays.binarySearch(NATIVE_ELEMENTS, name);
        }
        switch (i)
        {
            case 5:
                return this.msgId == null ? 0 : 1;
            case 1:
                return this.creDtTm == null ? 0 : 1;
            case 4:
                return this.initgPty == null ? 0 : 1;
            case 3:
                return this.fwdgAgt == null ? 0 : 1;
            case 2:
                return this.dbtrAgt == null ? 0 : 1;
            case 0:
                return this.cdtrAgt == null ? 0 : 1;
            default:
                return super.getElementCount(name);
        }
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are defined in
     * {@link #getElement}.
     * 
     * @param name
     * @param element
     */
    public int getElementIndex(java.lang.String name,java.lang.Object element) {
        int i = Arrays.binarySearch(NATIVE_ELEMENTS, name);
        if (i < 0)
        {
            name = getSubstitute(name);
            i = Arrays.binarySearch(NATIVE_ELEMENTS, name);
        }
        switch (i)
        {
            case 5:
                return this.msgId != null && this.msgId.equals(element) ? 0 : -1;
            case 1:
                return this.creDtTm != null && this.creDtTm.equals(element) ? 0 : -1;
            case 4:
                return this.initgPty != null && this.initgPty.equals(element) ? 0 : -1;
            case 3:
                return this.fwdgAgt != null && this.fwdgAgt.equals(element) ? 0 : -1;
            case 2:
                return this.dbtrAgt != null && this.dbtrAgt.equals(element) ? 0 : -1;
            case 0:
                return this.cdtrAgt != null && this.cdtrAgt.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of FwdgAgt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 getFwdgAgt() {
        return this.fwdgAgt;
    }

    /**
     * Gets the value of InitgPty (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 getInitgPty() {
        return this.initgPty;
    }

    /**
     * Gets the value of MsgId (1).
     * 
     * @return The value.
     */
    public java.lang.String getMsgId() {
        return this.msgId;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>msgId,
     * creDtTm, initgPty, fwdgAgt, dbtrAgt, cdtrAgt</b>.
     * 
     * @param name
     * @param index
     */
    public java.lang.Object getRawElement(java.lang.String name,int index) {
        int i = Arrays.binarySearch(NATIVE_ELEMENTS, name);
        if (i < 0)
        {
            name = getSubstitute(name);
            i = Arrays.binarySearch(NATIVE_ELEMENTS, name);
        }
        switch (i)
        {
            case 5:
                return this.msgId;
            case 1:
                return this.creDtTm;
            case 4:
                return this.initgPty;
            case 3:
                return this.fwdgAgt;
            case 2:
                return this.dbtrAgt;
            case 0:
                return this.cdtrAgt;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.msgId == null ? 0 : 1;
        count += this.creDtTm == null ? 0 : 1;
        count += this.initgPty == null ? 0 : 1;
        count += this.fwdgAgt == null ? 0 : 1;
        count += this.dbtrAgt == null ? 0 : 1;
        count += this.cdtrAgt == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(msgId);
        result = 31 * result + hashCodeOf(creDtTm);
        result = 31 * result + hashCodeOf(initgPty);
        result = 31 * result + hashCodeOf(fwdgAgt);
        result = 31 * result + hashCodeOf(dbtrAgt);
        result = 31 * result + hashCodeOf(cdtrAgt);
        return result;
    }

    /**
     * Removes the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are defined in
     * {@link #getElement}.
     * 
     * @param name
     * @param index
     */
    public void removeElement(java.lang.String name,int index) {
        name = unmakeSubstitution(name, index);
        int i = Arrays.binarySearch(NATIVE_ELEMENTS, name);
        switch (i)
        {
            case 5:
                setMsgId(null);
                return;
            case 1:
                setCreDtTm(null);
                return;
            case 4:
                setInitgPty(null);
                return;
            case 3:
                setFwdgAgt(null);
                return;
            case 2:
                setDbtrAgt(null);
                return;
            case 0:
                setCdtrAgt(null);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of CdtrAgt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCdtrAgt(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 value) {
        this.cdtrAgt = value;
        if (this.cdtrAgt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.cdtrAgt).setParent(this, "CdtrAgt");
    }

    /**
     * [Virtual Element] Sets the value of CreDtTm (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCreDtTm(biz.c24.io.api.data.ISO8601DateTime value) {
        this.creDtTm = value;
    }

    /**
     * [Virtual Element] Sets the value of DbtrAgt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setDbtrAgt(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 value) {
        this.dbtrAgt = value;
        if (this.dbtrAgt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.dbtrAgt).setParent(this, "DbtrAgt");
    }

    /**
     * Sets <code>value</code> as an element called
     * <code>name</code> at <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are defined in
     * {@link #getElement}.
     * 
     * @param name
     * @param value
     * @param index
     */
    public void setElement(java.lang.String name,int index,java.lang.Object value) {
        name = makeSubstitution(name, index);
        int i = (Arrays.binarySearch(NATIVE_ELEMENTS, name));
        switch (i)
        {
            case 5:
                setMsgId((java.lang.String) value);
                return;
            case 1:
                setCreDtTm((biz.c24.io.api.data.ISO8601DateTime) value);
                return;
            case 4:
                setInitgPty((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) value);
                return;
            case 3:
                setFwdgAgt((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 2:
                setDbtrAgt((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 0:
                setCdtrAgt((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of FwdgAgt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setFwdgAgt(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 value) {
        this.fwdgAgt = value;
        if (this.fwdgAgt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.fwdgAgt).setParent(this, "FwdgAgt");
    }

    /**
     * [Virtual Element] Sets the value of InitgPty (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setInitgPty(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 value) {
        this.initgPty = value;
        if (this.initgPty != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.initgPty).setParent(this, "InitgPty");
    }

    /**
     * [Virtual Element] Sets the value of MsgId (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setMsgId(java.lang.String value) {
        this.msgId = value;
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.msgId);
        out.writeObject(this.creDtTm);
        out.writeObject(this.initgPty);
        out.writeObject(this.fwdgAgt);
        out.writeObject(this.dbtrAgt);
        out.writeObject(this.cdtrAgt);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.msgId = (java.lang.String) in.readObject();
        this.creDtTm = (biz.c24.io.api.data.ISO8601DateTime) in.readObject();
        this.initgPty = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) in.readObject();
        this.fwdgAgt = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) in.readObject();
        this.dbtrAgt = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) in.readObject();
        this.cdtrAgt = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) in.readObject();
    }

}
