/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * BatchInformation2. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>MsgId</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>PmtInfId</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>NbOfTxs</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>TtlAmt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount}
 * (0..1)</li>
 * <li><b>CdtDbtInd</b> of type {@link java.lang.String}
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
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BatchInformation2Cls
 */
public class BatchInformation2 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"CdtDbtInd", "MsgId", "NbOfTxs", "PmtInfId", "TtlAmt"};

    /**
     * Field msgId.
     */
    private java.lang.String msgId;

    /**
     * Field pmtInfId.
     */
    private java.lang.String pmtInfId;

    /**
     * Field nbOfTxs.
     */
    private java.lang.String nbOfTxs;

    /**
     * Field ttlAmt.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount ttlAmt;

    /**
     * Field cdtDbtInd.
     */
    private java.lang.String cdtDbtInd;

    public BatchInformation2() {
        this(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BatchInformation2Cls.getInstance().getNullDefiningElementDecl());
    }

    public BatchInformation2(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public BatchInformation2(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public BatchInformation2(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BatchInformation2 clone) {
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
            case 1:
                setMsgId((java.lang.String) value);
                return;
            case 3:
                setPmtInfId((java.lang.String) value);
                return;
            case 2:
                setNbOfTxs((java.lang.String) value);
                return;
            case 4:
                setTtlAmt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) value);
                return;
            case 0:
                setCdtDbtInd((java.lang.String) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BatchInformation2(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BatchInformation2(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BatchInformation2 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BatchInformation2) clone;
        obj.msgId = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.msgId, obj, "MsgId");
        obj.pmtInfId = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.pmtInfId, obj, "PmtInfId");
        obj.nbOfTxs = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.nbOfTxs, obj, "NbOfTxs");
        obj.ttlAmt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) biz.c24.io.api.Utils.cloneDeep(this.ttlAmt, obj, "TtlAmt");
        obj.cdtDbtInd = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.cdtDbtInd, obj, "CdtDbtInd");
    }

    /**
     * Creates, adds and returns a new TtlAmt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount createTtlAmt() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) getElementDecl("TtlAmt").createObject();
        setTtlAmt(obj);
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
     * Gets the value of CdtDbtInd (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getCdtDbtInd() {
        return this.cdtDbtInd;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>msgId,
     * pmtInfId, nbOfTxs, ttlAmt, cdtDbtInd</b>.
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
            case 1:
                return getMsgId();
            case 3:
                return getPmtInfId();
            case 2:
                return getNbOfTxs();
            case 4:
                return getTtlAmt();
            case 0:
                return getCdtDbtInd();
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
            case 1:
                return this.msgId == null ? 0 : 1;
            case 3:
                return this.pmtInfId == null ? 0 : 1;
            case 2:
                return this.nbOfTxs == null ? 0 : 1;
            case 4:
                return this.ttlAmt == null ? 0 : 1;
            case 0:
                return this.cdtDbtInd == null ? 0 : 1;
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
            case 1:
                return this.msgId != null && this.msgId.equals(element) ? 0 : -1;
            case 3:
                return this.pmtInfId != null && this.pmtInfId.equals(element) ? 0 : -1;
            case 2:
                return this.nbOfTxs != null && this.nbOfTxs.equals(element) ? 0 : -1;
            case 4:
                return this.ttlAmt != null && this.ttlAmt.equals(element) ? 0 : -1;
            case 0:
                return this.cdtDbtInd != null && this.cdtDbtInd.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
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
     * Gets the value of NbOfTxs (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getNbOfTxs() {
        return this.nbOfTxs;
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
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>msgId,
     * pmtInfId, nbOfTxs, ttlAmt, cdtDbtInd</b>.
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
            case 1:
                return this.msgId;
            case 3:
                return this.pmtInfId;
            case 2:
                return this.nbOfTxs;
            case 4:
                return this.ttlAmt;
            case 0:
                return this.cdtDbtInd;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.msgId == null ? 0 : 1;
        count += this.pmtInfId == null ? 0 : 1;
        count += this.nbOfTxs == null ? 0 : 1;
        count += this.ttlAmt == null ? 0 : 1;
        count += this.cdtDbtInd == null ? 0 : 1;
        return count;
    }

    /**
     * Gets the value of TtlAmt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount getTtlAmt() {
        return this.ttlAmt;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(msgId);
        result = 31 * result + hashCodeOf(pmtInfId);
        result = 31 * result + hashCodeOf(nbOfTxs);
        result = 31 * result + hashCodeOf(ttlAmt);
        result = 31 * result + hashCodeOf(cdtDbtInd);
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
            case 1:
                setMsgId(null);
                return;
            case 3:
                setPmtInfId(null);
                return;
            case 2:
                setNbOfTxs(null);
                return;
            case 4:
                setTtlAmt(null);
                return;
            case 0:
                setCdtDbtInd(null);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of CdtDbtInd (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCdtDbtInd(java.lang.String value) {
        this.cdtDbtInd = value;
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
            case 1:
                setMsgId((java.lang.String) value);
                return;
            case 3:
                setPmtInfId((java.lang.String) value);
                return;
            case 2:
                setNbOfTxs((java.lang.String) value);
                return;
            case 4:
                setTtlAmt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) value);
                return;
            case 0:
                setCdtDbtInd((java.lang.String) value);
                return;
            default:
                super.setElement(name, index, value);
        }
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
     * [Virtual Element] Sets the value of NbOfTxs (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setNbOfTxs(java.lang.String value) {
        this.nbOfTxs = value;
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
     * [Virtual Element] Sets the value of TtlAmt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTtlAmt(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlAmt = value;
        if (this.ttlAmt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.ttlAmt).setParent(this, "TtlAmt");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.msgId);
        out.writeObject(this.pmtInfId);
        out.writeObject(this.nbOfTxs);
        out.writeObject(this.ttlAmt);
        out.writeObject(this.cdtDbtInd);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.msgId = (java.lang.String) in.readObject();
        this.pmtInfId = (java.lang.String) in.readObject();
        this.nbOfTxs = (java.lang.String) in.readObject();
        this.ttlAmt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) in.readObject();
        this.cdtDbtInd = (java.lang.String) in.readObject();
    }

}
