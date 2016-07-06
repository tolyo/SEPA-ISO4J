/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * GroupHeader32. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>MsgId</b> of type {@link java.lang.String} (1)</li>
 * <li><b>CreDtTm</b> of type {@link
 * biz.c24.io.api.data.ISO8601DateTime} (1)</li>
 * <li><b>Authstn</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Authorisation1Choice}
 * (0..2)</li>
 * <li><b>NbOfTxs</b> of type {@link java.lang.String} (1)</li>
 * <li><b>CtrlSum</b> of type {@link java.math.BigDecimal}
 * (0..1)</li>
 * <li><b>InitgPty</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32}
 * (1)</li>
 * <li><b>FwdgAgt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4}
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
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GroupHeader32Cls
 */
public class GroupHeader32 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"Authstn", "CreDtTm", "CtrlSum", "FwdgAgt", "InitgPty", "MsgId", "NbOfTxs"};

    /**
     * Field msgId.
     */
    private java.lang.String msgId;

    /**
     * Field creDtTm.
     */
    private biz.c24.io.api.data.ISO8601DateTime creDtTm;

    /**
     * Field authstn.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Authorisation1Choice[] authstn;

    /**
     * Field nbOfTxs.
     */
    private java.lang.String nbOfTxs;

    /**
     * Field ctrlSum.
     */
    private java.math.BigDecimal ctrlSum;

    /**
     * Field initgPty.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32 initgPty;

    /**
     * Field fwdgAgt.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4 fwdgAgt;

    public GroupHeader32() {
        this(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GroupHeader32Cls.getInstance().getNullDefiningElementDecl());
    }

    public GroupHeader32(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public GroupHeader32(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public GroupHeader32(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GroupHeader32 clone) {
        super(clone);
    }

    /**
     * Adds a Authstn (0..2).
     * 
     * @param value
     * @param value The new Authstn.
     */
    public void addAuthstn(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Authorisation1Choice value) {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Authorisation1Choice[] temp = this.authstn;
        this.authstn = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Authorisation1Choice[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.authstn, 0, temp.length);
        this.authstn[this.authstn.length-1] = value;
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "Authstn");
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
            case 0:
                addAuthstn((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Authorisation1Choice) value);
                return;
            case 6:
                setNbOfTxs((java.lang.String) value);
                return;
            case 2:
                setCtrlSum(biz.c24.io.api.Utils.decimalValue(value));
                return;
            case 4:
                setInitgPty((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32) value);
                return;
            case 3:
                setFwdgAgt((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4) value);
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
        return new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GroupHeader32(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GroupHeader32(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GroupHeader32 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GroupHeader32) clone;
        obj.msgId = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.msgId, obj, "MsgId");
        obj.creDtTm = (biz.c24.io.api.data.ISO8601DateTime) biz.c24.io.api.Utils.cloneDeep(this.creDtTm, obj, "CreDtTm");
        obj.authstn = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Authorisation1Choice[]) biz.c24.io.api.Utils.cloneDeep(this.authstn, obj, "Authstn");
        obj.nbOfTxs = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.nbOfTxs, obj, "NbOfTxs");
        obj.ctrlSum = (java.math.BigDecimal) biz.c24.io.api.Utils.cloneDeep(this.ctrlSum, obj, "CtrlSum");
        obj.initgPty = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32) biz.c24.io.api.Utils.cloneDeep(this.initgPty, obj, "InitgPty");
        obj.fwdgAgt = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4) biz.c24.io.api.Utils.cloneDeep(this.fwdgAgt, obj, "FwdgAgt");
    }

    /**
     * Creates, adds and returns a new Authstn (0..2).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Authorisation1Choice createAuthstn() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Authorisation1Choice obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Authorisation1Choice) getElementDecl("Authstn").createObject();
        addAuthstn(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new FwdgAgt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4 createFwdgAgt() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4) getElementDecl("FwdgAgt").createObject();
        setFwdgAgt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new InitgPty (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32 createInitgPty() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32) getElementDecl("InitgPty").createObject();
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
     * Gets the value of Authstn (0..2).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Authorisation1Choice[] getAuthstn() {
        if (this.authstn == null)
            return new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Authorisation1Choice[]{};
        else
            return this.authstn;
    }

    /**
     * Gets the value of Authstn by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Authorisation1Choice getAuthstn(int ordinal) {
        if (this.authstn == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.authstn.length) {
            return this.authstn[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (0..2).
     * 
     * @param value
     * @param value The Authstn to get the index of.
     * @return The index.
     */
    public int getAuthstnIndex(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Authorisation1Choice value) {
        if (this.authstn == null)
            return -1;
        for (int i=0; i<this.authstn.length; i++)
            if (this.authstn[i] == value)
                return i;
        return -1;
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
     * Gets the value of CtrlSum (0..1).
     * 
     * @return The value.
     */
    public java.math.BigDecimal getCtrlSum() {
        return this.ctrlSum;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>msgId,
     * creDtTm, authstn, nbOfTxs, ctrlSum, initgPty, fwdgAgt</b>.
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
            case 0:
            if (this.authstn == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.authstn[index];
            case 6:
                return getNbOfTxs();
            case 2:
                return getCtrlSum();
            case 4:
                return getInitgPty();
            case 3:
                return getFwdgAgt();
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
            case 0:
                return this.authstn == null ? 0 : this.authstn.length;
            case 6:
                return this.nbOfTxs == null ? 0 : 1;
            case 2:
                return this.ctrlSum == null ? 0 : 1;
            case 4:
                return this.initgPty == null ? 0 : 1;
            case 3:
                return this.fwdgAgt == null ? 0 : 1;
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
            case 0:
                return getAuthstnIndex((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Authorisation1Choice) element);
            case 6:
                return this.nbOfTxs != null && this.nbOfTxs.equals(element) ? 0 : -1;
            case 2:
                return this.ctrlSum != null && this.ctrlSum.equals(element) ? 0 : -1;
            case 4:
                return this.initgPty != null && this.initgPty.equals(element) ? 0 : -1;
            case 3:
                return this.fwdgAgt != null && this.fwdgAgt.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of FwdgAgt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4 getFwdgAgt() {
        return this.fwdgAgt;
    }

    /**
     * Gets the value of InitgPty (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32 getInitgPty() {
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
     * Gets the value of NbOfTxs (1).
     * 
     * @return The value.
     */
    public java.lang.String getNbOfTxs() {
        return this.nbOfTxs;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>msgId,
     * creDtTm, authstn, nbOfTxs, ctrlSum, initgPty, fwdgAgt</b>.
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
            case 0:
            if (this.authstn == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.authstn[index];
            case 6:
                return this.nbOfTxs;
            case 2:
                return this.ctrlSum;
            case 4:
                return this.initgPty;
            case 3:
                return this.fwdgAgt;
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
        count += this.authstn == null ? 0 : this.authstn.length;
        count += this.nbOfTxs == null ? 0 : 1;
        count += this.ctrlSum == null ? 0 : 1;
        count += this.initgPty == null ? 0 : 1;
        count += this.fwdgAgt == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(msgId);
        result = 31 * result + hashCodeOf(creDtTm);
        result = 31 * result + hashCodeOf(authstn);
        result = 31 * result + hashCodeOf(nbOfTxs);
        result = 31 * result + hashCodeOf(ctrlSum);
        result = 31 * result + hashCodeOf(initgPty);
        result = 31 * result + hashCodeOf(fwdgAgt);
        return result;
    }

    /**
     * Removes a Authstn (0..2).
     * 
     * @param index
     * @param index The index of the Authstn to get.
     */
    public void removeAuthstn(int index) {
        if (this.authstn == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Authorisation1Choice[] temp = this.authstn;
        this.authstn = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Authorisation1Choice[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.authstn, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.authstn, index, temp.length-index-1);
        if (this.authstn.length == 0)
            this.authstn = null;
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
            case 0:
                removeAuthstn(index);
                return;
            case 6:
                setNbOfTxs(null);
                return;
            case 2:
                setCtrlSum(null);
                return;
            case 4:
                setInitgPty(null);
                return;
            case 3:
                setFwdgAgt(null);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of Authstn (0..2).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAuthstn(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Authorisation1Choice[] value) {
        this.authstn = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Authorisation1Choice[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.authstn != null && i<this.authstn.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.authstn[i]).setParent(this, "Authstn");
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
     * [Virtual Element] Sets the value of CtrlSum (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCtrlSum(java.math.BigDecimal value) {
        this.ctrlSum = value;
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
            case 0:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Authorisation1Choice[]) {
                    setAuthstn((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Authorisation1Choice[])value);
                } else if (this.authstn == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.authstn[index] = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Authorisation1Choice) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.authstn[index]).setParent(this, "Authstn");
                }
                return;
            case 6:
                setNbOfTxs((java.lang.String) value);
                return;
            case 2:
                setCtrlSum(biz.c24.io.api.Utils.decimalValue(value));
                return;
            case 4:
                setInitgPty((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32) value);
                return;
            case 3:
                setFwdgAgt((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4) value);
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
    public void setFwdgAgt(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4 value) {
        this.fwdgAgt = value;
        if (this.fwdgAgt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.fwdgAgt).setParent(this, "FwdgAgt");
    }

    /**
     * [Virtual Element] Sets the value of InitgPty (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setInitgPty(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32 value) {
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
     * [Virtual Element] Sets the value of NbOfTxs (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setNbOfTxs(java.lang.String value) {
        this.nbOfTxs = value;
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.msgId);
        out.writeObject(this.creDtTm);
        out.writeObject(this.authstn);
        out.writeObject(this.nbOfTxs);
        out.writeObject(this.ctrlSum);
        out.writeObject(this.initgPty);
        out.writeObject(this.fwdgAgt);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.msgId = (java.lang.String) in.readObject();
        this.creDtTm = (biz.c24.io.api.data.ISO8601DateTime) in.readObject();
        this.authstn = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Authorisation1Choice[]) in.readObject();
        this.nbOfTxs = (java.lang.String) in.readObject();
        this.ctrlSum = (java.math.BigDecimal) in.readObject();
        this.initgPty = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32) in.readObject();
        this.fwdgAgt = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4) in.readObject();
    }

}
