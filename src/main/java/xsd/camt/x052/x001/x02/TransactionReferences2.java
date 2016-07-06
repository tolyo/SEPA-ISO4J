/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * TransactionReferences2. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>MsgId</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>AcctSvcrRef</b> of type {@link java.lang.String}
 * (0..1)</li>
 * <li><b>PmtInfId</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>InstrId</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>EndToEndId</b> of type {@link java.lang.String}
 * (0..1)</li>
 * <li><b>TxId</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>MndtId</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>ChqNb</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>ClrSysRef</b> of type {@link java.lang.String}
 * (0..1)</li>
 * <li><b>Prtry</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryReference1}
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
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionReferences2Cls
 */
public class TransactionReferences2 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"AcctSvcrRef", "ChqNb", "ClrSysRef", "EndToEndId", "InstrId", "MndtId", "MsgId", "PmtInfId", "Prtry", "TxId"};

    /**
     * Field msgId.
     */
    private java.lang.String msgId;

    /**
     * Field acctSvcrRef.
     */
    private java.lang.String acctSvcrRef;

    /**
     * Field pmtInfId.
     */
    private java.lang.String pmtInfId;

    /**
     * Field instrId.
     */
    private java.lang.String instrId;

    /**
     * Field endToEndId.
     */
    private java.lang.String endToEndId;

    /**
     * Field txId.
     */
    private java.lang.String txId;

    /**
     * Field mndtId.
     */
    private java.lang.String mndtId;

    /**
     * Field chqNb.
     */
    private java.lang.String chqNb;

    /**
     * Field clrSysRef.
     */
    private java.lang.String clrSysRef;

    /**
     * Field prtry.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryReference1 prtry;

    public TransactionReferences2() {
        this(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionReferences2Cls.getInstance().getNullDefiningElementDecl());
    }

    public TransactionReferences2(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public TransactionReferences2(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public TransactionReferences2(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionReferences2 clone) {
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
            case 6:
                setMsgId((java.lang.String) value);
                return;
            case 0:
                setAcctSvcrRef((java.lang.String) value);
                return;
            case 7:
                setPmtInfId((java.lang.String) value);
                return;
            case 4:
                setInstrId((java.lang.String) value);
                return;
            case 3:
                setEndToEndId((java.lang.String) value);
                return;
            case 9:
                setTxId((java.lang.String) value);
                return;
            case 5:
                setMndtId((java.lang.String) value);
                return;
            case 1:
                setChqNb((java.lang.String) value);
                return;
            case 2:
                setClrSysRef((java.lang.String) value);
                return;
            case 8:
                setPrtry((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryReference1) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionReferences2(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionReferences2(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionReferences2 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionReferences2) clone;
        obj.msgId = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.msgId, obj, "MsgId");
        obj.acctSvcrRef = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.acctSvcrRef, obj, "AcctSvcrRef");
        obj.pmtInfId = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.pmtInfId, obj, "PmtInfId");
        obj.instrId = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.instrId, obj, "InstrId");
        obj.endToEndId = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.endToEndId, obj, "EndToEndId");
        obj.txId = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.txId, obj, "TxId");
        obj.mndtId = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.mndtId, obj, "MndtId");
        obj.chqNb = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.chqNb, obj, "ChqNb");
        obj.clrSysRef = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.clrSysRef, obj, "ClrSysRef");
        obj.prtry = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryReference1) biz.c24.io.api.Utils.cloneDeep(this.prtry, obj, "Prtry");
    }

    /**
     * Creates, adds and returns a new Prtry (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryReference1 createPrtry() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryReference1 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryReference1) getElementDecl("Prtry").createObject();
        setPrtry(obj);
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
     * Gets the value of AcctSvcrRef (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getAcctSvcrRef() {
        return this.acctSvcrRef;
    }

    /**
     * Gets the value of ChqNb (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getChqNb() {
        return this.chqNb;
    }

    /**
     * Gets the value of ClrSysRef (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getClrSysRef() {
        return this.clrSysRef;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>msgId,
     * acctSvcrRef, pmtInfId, instrId, endToEndId, txId, mndtId,
     * chqNb, clrSysRef, prtry</b>.
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
            case 6:
                return getMsgId();
            case 0:
                return getAcctSvcrRef();
            case 7:
                return getPmtInfId();
            case 4:
                return getInstrId();
            case 3:
                return getEndToEndId();
            case 9:
                return getTxId();
            case 5:
                return getMndtId();
            case 1:
                return getChqNb();
            case 2:
                return getClrSysRef();
            case 8:
                return getPrtry();
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
            case 6:
                return this.msgId == null ? 0 : 1;
            case 0:
                return this.acctSvcrRef == null ? 0 : 1;
            case 7:
                return this.pmtInfId == null ? 0 : 1;
            case 4:
                return this.instrId == null ? 0 : 1;
            case 3:
                return this.endToEndId == null ? 0 : 1;
            case 9:
                return this.txId == null ? 0 : 1;
            case 5:
                return this.mndtId == null ? 0 : 1;
            case 1:
                return this.chqNb == null ? 0 : 1;
            case 2:
                return this.clrSysRef == null ? 0 : 1;
            case 8:
                return this.prtry == null ? 0 : 1;
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
            case 6:
                return this.msgId != null && this.msgId.equals(element) ? 0 : -1;
            case 0:
                return this.acctSvcrRef != null && this.acctSvcrRef.equals(element) ? 0 : -1;
            case 7:
                return this.pmtInfId != null && this.pmtInfId.equals(element) ? 0 : -1;
            case 4:
                return this.instrId != null && this.instrId.equals(element) ? 0 : -1;
            case 3:
                return this.endToEndId != null && this.endToEndId.equals(element) ? 0 : -1;
            case 9:
                return this.txId != null && this.txId.equals(element) ? 0 : -1;
            case 5:
                return this.mndtId != null && this.mndtId.equals(element) ? 0 : -1;
            case 1:
                return this.chqNb != null && this.chqNb.equals(element) ? 0 : -1;
            case 2:
                return this.clrSysRef != null && this.clrSysRef.equals(element) ? 0 : -1;
            case 8:
                return this.prtry != null && this.prtry.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of EndToEndId (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getEndToEndId() {
        return this.endToEndId;
    }

    /**
     * Gets the value of InstrId (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getInstrId() {
        return this.instrId;
    }

    /**
     * Gets the value of MndtId (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getMndtId() {
        return this.mndtId;
    }

    /**
     * Gets the value of MsgId (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getMsgId() {
        return this.msgId;
    }

    /**
     * Gets the value of PmtInfId (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getPmtInfId() {
        return this.pmtInfId;
    }

    /**
     * Gets the value of Prtry (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryReference1 getPrtry() {
        return this.prtry;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>msgId,
     * acctSvcrRef, pmtInfId, instrId, endToEndId, txId, mndtId,
     * chqNb, clrSysRef, prtry</b>.
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
            case 6:
                return this.msgId;
            case 0:
                return this.acctSvcrRef;
            case 7:
                return this.pmtInfId;
            case 4:
                return this.instrId;
            case 3:
                return this.endToEndId;
            case 9:
                return this.txId;
            case 5:
                return this.mndtId;
            case 1:
                return this.chqNb;
            case 2:
                return this.clrSysRef;
            case 8:
                return this.prtry;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.msgId == null ? 0 : 1;
        count += this.acctSvcrRef == null ? 0 : 1;
        count += this.pmtInfId == null ? 0 : 1;
        count += this.instrId == null ? 0 : 1;
        count += this.endToEndId == null ? 0 : 1;
        count += this.txId == null ? 0 : 1;
        count += this.mndtId == null ? 0 : 1;
        count += this.chqNb == null ? 0 : 1;
        count += this.clrSysRef == null ? 0 : 1;
        count += this.prtry == null ? 0 : 1;
        return count;
    }

    /**
     * Gets the value of TxId (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getTxId() {
        return this.txId;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(msgId);
        result = 31 * result + hashCodeOf(acctSvcrRef);
        result = 31 * result + hashCodeOf(pmtInfId);
        result = 31 * result + hashCodeOf(instrId);
        result = 31 * result + hashCodeOf(endToEndId);
        result = 31 * result + hashCodeOf(txId);
        result = 31 * result + hashCodeOf(mndtId);
        result = 31 * result + hashCodeOf(chqNb);
        result = 31 * result + hashCodeOf(clrSysRef);
        result = 31 * result + hashCodeOf(prtry);
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
            case 6:
                setMsgId(null);
                return;
            case 0:
                setAcctSvcrRef(null);
                return;
            case 7:
                setPmtInfId(null);
                return;
            case 4:
                setInstrId(null);
                return;
            case 3:
                setEndToEndId(null);
                return;
            case 9:
                setTxId(null);
                return;
            case 5:
                setMndtId(null);
                return;
            case 1:
                setChqNb(null);
                return;
            case 2:
                setClrSysRef(null);
                return;
            case 8:
                setPrtry(null);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of AcctSvcrRef (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAcctSvcrRef(java.lang.String value) {
        this.acctSvcrRef = value;
    }

    /**
     * [Virtual Element] Sets the value of ChqNb (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setChqNb(java.lang.String value) {
        this.chqNb = value;
    }

    /**
     * [Virtual Element] Sets the value of ClrSysRef (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setClrSysRef(java.lang.String value) {
        this.clrSysRef = value;
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
            case 6:
                setMsgId((java.lang.String) value);
                return;
            case 0:
                setAcctSvcrRef((java.lang.String) value);
                return;
            case 7:
                setPmtInfId((java.lang.String) value);
                return;
            case 4:
                setInstrId((java.lang.String) value);
                return;
            case 3:
                setEndToEndId((java.lang.String) value);
                return;
            case 9:
                setTxId((java.lang.String) value);
                return;
            case 5:
                setMndtId((java.lang.String) value);
                return;
            case 1:
                setChqNb((java.lang.String) value);
                return;
            case 2:
                setClrSysRef((java.lang.String) value);
                return;
            case 8:
                setPrtry((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryReference1) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of EndToEndId (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setEndToEndId(java.lang.String value) {
        this.endToEndId = value;
    }

    /**
     * [Virtual Element] Sets the value of InstrId (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setInstrId(java.lang.String value) {
        this.instrId = value;
    }

    /**
     * [Virtual Element] Sets the value of MndtId (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setMndtId(java.lang.String value) {
        this.mndtId = value;
    }

    /**
     * [Virtual Element] Sets the value of MsgId (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setMsgId(java.lang.String value) {
        this.msgId = value;
    }

    /**
     * [Virtual Element] Sets the value of PmtInfId (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setPmtInfId(java.lang.String value) {
        this.pmtInfId = value;
    }

    /**
     * [Virtual Element] Sets the value of Prtry (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setPrtry(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryReference1 value) {
        this.prtry = value;
        if (this.prtry != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.prtry).setParent(this, "Prtry");
    }

    /**
     * [Virtual Element] Sets the value of TxId (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTxId(java.lang.String value) {
        this.txId = value;
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.msgId);
        out.writeObject(this.acctSvcrRef);
        out.writeObject(this.pmtInfId);
        out.writeObject(this.instrId);
        out.writeObject(this.endToEndId);
        out.writeObject(this.txId);
        out.writeObject(this.mndtId);
        out.writeObject(this.chqNb);
        out.writeObject(this.clrSysRef);
        out.writeObject(this.prtry);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.msgId = (java.lang.String) in.readObject();
        this.acctSvcrRef = (java.lang.String) in.readObject();
        this.pmtInfId = (java.lang.String) in.readObject();
        this.instrId = (java.lang.String) in.readObject();
        this.endToEndId = (java.lang.String) in.readObject();
        this.txId = (java.lang.String) in.readObject();
        this.mndtId = (java.lang.String) in.readObject();
        this.chqNb = (java.lang.String) in.readObject();
        this.clrSysRef = (java.lang.String) in.readObject();
        this.prtry = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryReference1) in.readObject();
    }

}
