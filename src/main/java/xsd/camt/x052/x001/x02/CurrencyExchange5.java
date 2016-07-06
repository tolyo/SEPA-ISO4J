/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * CurrencyExchange5. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>SrcCcy</b> of type {@link java.lang.String} (1)</li>
 * <li><b>TrgtCcy</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>UnitCcy</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>XchgRate</b> of type {@link java.math.BigDecimal}
 * (1)</li>
 * <li><b>CtrctId</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>QtnDt</b> of type {@link
 * biz.c24.io.api.data.ISO8601DateTime} (0..1)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CurrencyExchange5Cls
 */
public class CurrencyExchange5 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"CtrctId", "QtnDt", "SrcCcy", "TrgtCcy", "UnitCcy", "XchgRate"};

    /**
     * Field srcCcy.
     */
    private java.lang.String srcCcy;

    /**
     * Field trgtCcy.
     */
    private java.lang.String trgtCcy;

    /**
     * Field unitCcy.
     */
    private java.lang.String unitCcy;

    /**
     * Field xchgRate.
     */
    private java.math.BigDecimal xchgRate;

    /**
     * Field ctrctId.
     */
    private java.lang.String ctrctId;

    /**
     * Field qtnDt.
     */
    private biz.c24.io.api.data.ISO8601DateTime qtnDt;

    public CurrencyExchange5() {
        this(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CurrencyExchange5Cls.getInstance().getNullDefiningElementDecl());
    }

    public CurrencyExchange5(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public CurrencyExchange5(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public CurrencyExchange5(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CurrencyExchange5 clone) {
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
            case 2:
                setSrcCcy((java.lang.String) value);
                return;
            case 3:
                setTrgtCcy((java.lang.String) value);
                return;
            case 4:
                setUnitCcy((java.lang.String) value);
                return;
            case 5:
                setXchgRate(biz.c24.io.api.Utils.decimalValue(value));
                return;
            case 0:
                setCtrctId((java.lang.String) value);
                return;
            case 1:
                setQtnDt((biz.c24.io.api.data.ISO8601DateTime) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CurrencyExchange5(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CurrencyExchange5(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CurrencyExchange5 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CurrencyExchange5) clone;
        obj.srcCcy = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.srcCcy, obj, "SrcCcy");
        obj.trgtCcy = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.trgtCcy, obj, "TrgtCcy");
        obj.unitCcy = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.unitCcy, obj, "UnitCcy");
        obj.xchgRate = (java.math.BigDecimal) biz.c24.io.api.Utils.cloneDeep(this.xchgRate, obj, "XchgRate");
        obj.ctrctId = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.ctrctId, obj, "CtrctId");
        obj.qtnDt = (biz.c24.io.api.data.ISO8601DateTime) biz.c24.io.api.Utils.cloneDeep(this.qtnDt, obj, "QtnDt");
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
     * Gets the value of CtrctId (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getCtrctId() {
        return this.ctrctId;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>srcCcy,
     * trgtCcy, unitCcy, xchgRate, ctrctId, qtnDt</b>.
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
            case 2:
                return getSrcCcy();
            case 3:
                return getTrgtCcy();
            case 4:
                return getUnitCcy();
            case 5:
                return getXchgRate();
            case 0:
                return getCtrctId();
            case 1:
                return getQtnDt();
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
            case 2:
                return this.srcCcy == null ? 0 : 1;
            case 3:
                return this.trgtCcy == null ? 0 : 1;
            case 4:
                return this.unitCcy == null ? 0 : 1;
            case 5:
                return this.xchgRate == null ? 0 : 1;
            case 0:
                return this.ctrctId == null ? 0 : 1;
            case 1:
                return this.qtnDt == null ? 0 : 1;
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
            case 2:
                return this.srcCcy != null && this.srcCcy.equals(element) ? 0 : -1;
            case 3:
                return this.trgtCcy != null && this.trgtCcy.equals(element) ? 0 : -1;
            case 4:
                return this.unitCcy != null && this.unitCcy.equals(element) ? 0 : -1;
            case 5:
                return this.xchgRate != null && this.xchgRate.equals(element) ? 0 : -1;
            case 0:
                return this.ctrctId != null && this.ctrctId.equals(element) ? 0 : -1;
            case 1:
                return this.qtnDt != null && this.qtnDt.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of QtnDt (0..1).
     * 
     * @return The value.
     */
    public biz.c24.io.api.data.ISO8601DateTime getQtnDt() {
        return this.qtnDt;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>srcCcy,
     * trgtCcy, unitCcy, xchgRate, ctrctId, qtnDt</b>.
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
            case 2:
                return this.srcCcy;
            case 3:
                return this.trgtCcy;
            case 4:
                return this.unitCcy;
            case 5:
                return this.xchgRate;
            case 0:
                return this.ctrctId;
            case 1:
                return this.qtnDt;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of SrcCcy (1).
     * 
     * @return The value.
     */
    public java.lang.String getSrcCcy() {
        return this.srcCcy;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.srcCcy == null ? 0 : 1;
        count += this.trgtCcy == null ? 0 : 1;
        count += this.unitCcy == null ? 0 : 1;
        count += this.xchgRate == null ? 0 : 1;
        count += this.ctrctId == null ? 0 : 1;
        count += this.qtnDt == null ? 0 : 1;
        return count;
    }

    /**
     * Gets the value of TrgtCcy (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getTrgtCcy() {
        return this.trgtCcy;
    }

    /**
     * Gets the value of UnitCcy (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getUnitCcy() {
        return this.unitCcy;
    }

    /**
     * Gets the value of XchgRate (1).
     * 
     * @return The value.
     */
    public java.math.BigDecimal getXchgRate() {
        return this.xchgRate;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(srcCcy);
        result = 31 * result + hashCodeOf(trgtCcy);
        result = 31 * result + hashCodeOf(unitCcy);
        result = 31 * result + hashCodeOf(xchgRate);
        result = 31 * result + hashCodeOf(ctrctId);
        result = 31 * result + hashCodeOf(qtnDt);
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
            case 2:
                setSrcCcy(null);
                return;
            case 3:
                setTrgtCcy(null);
                return;
            case 4:
                setUnitCcy(null);
                return;
            case 5:
                setXchgRate(null);
                return;
            case 0:
                setCtrctId(null);
                return;
            case 1:
                setQtnDt(null);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of CtrctId (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCtrctId(java.lang.String value) {
        this.ctrctId = value;
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
            case 2:
                setSrcCcy((java.lang.String) value);
                return;
            case 3:
                setTrgtCcy((java.lang.String) value);
                return;
            case 4:
                setUnitCcy((java.lang.String) value);
                return;
            case 5:
                setXchgRate(biz.c24.io.api.Utils.decimalValue(value));
                return;
            case 0:
                setCtrctId((java.lang.String) value);
                return;
            case 1:
                setQtnDt((biz.c24.io.api.data.ISO8601DateTime) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of QtnDt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setQtnDt(biz.c24.io.api.data.ISO8601DateTime value) {
        this.qtnDt = value;
    }

    /**
     * [Virtual Element] Sets the value of SrcCcy (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setSrcCcy(java.lang.String value) {
        this.srcCcy = value;
    }

    /**
     * [Virtual Element] Sets the value of TrgtCcy (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTrgtCcy(java.lang.String value) {
        this.trgtCcy = value;
    }

    /**
     * [Virtual Element] Sets the value of UnitCcy (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setUnitCcy(java.lang.String value) {
        this.unitCcy = value;
    }

    /**
     * [Virtual Element] Sets the value of XchgRate (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setXchgRate(java.math.BigDecimal value) {
        this.xchgRate = value;
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.srcCcy);
        out.writeObject(this.trgtCcy);
        out.writeObject(this.unitCcy);
        out.writeObject(this.xchgRate);
        out.writeObject(this.ctrctId);
        out.writeObject(this.qtnDt);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.srcCcy = (java.lang.String) in.readObject();
        this.trgtCcy = (java.lang.String) in.readObject();
        this.unitCcy = (java.lang.String) in.readObject();
        this.xchgRate = (java.math.BigDecimal) in.readObject();
        this.ctrctId = (java.lang.String) in.readObject();
        this.qtnDt = (biz.c24.io.api.data.ISO8601DateTime) in.readObject();
    }

}
