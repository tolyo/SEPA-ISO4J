/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * TaxAmount1. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>Rate</b> of type {@link java.math.BigDecimal} (0..1)</li>
 * <li><b>TaxblBaseAmt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount}
 * (0..1)</li>
 * <li><b>TtlAmt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount}
 * (0..1)</li>
 * <li><b>Dtls</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecordDetails1}
 * (0..*)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxAmount1Cls
 */
public class TaxAmount1 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"Dtls", "Rate", "TaxblBaseAmt", "TtlAmt"};

    /**
     * Field rate.
     */
    private java.math.BigDecimal rate;

    /**
     * Field taxblBaseAmt.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount taxblBaseAmt;

    /**
     * Field ttlAmt.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount ttlAmt;

    /**
     * Field dtls.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecordDetails1[] dtls;

    public TaxAmount1() {
        this(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxAmount1Cls.getInstance().getNullDefiningElementDecl());
    }

    public TaxAmount1(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public TaxAmount1(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public TaxAmount1(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxAmount1 clone) {
        super(clone);
    }

    /**
     * Adds a Dtls (0..*).
     * 
     * @param value
     * @param value The new Dtls.
     */
    public void addDtls(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecordDetails1 value) {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecordDetails1[] temp = this.dtls;
        this.dtls = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecordDetails1[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.dtls, 0, temp.length);
        this.dtls[this.dtls.length-1] = value;
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "Dtls");
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
                setRate(biz.c24.io.api.Utils.decimalValue(value));
                return;
            case 2:
                setTaxblBaseAmt((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount) value);
                return;
            case 3:
                setTtlAmt((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount) value);
                return;
            case 0:
                addDtls((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecordDetails1) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxAmount1(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxAmount1(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxAmount1 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxAmount1) clone;
        obj.rate = (java.math.BigDecimal) biz.c24.io.api.Utils.cloneDeep(this.rate, obj, "Rate");
        obj.taxblBaseAmt = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount) biz.c24.io.api.Utils.cloneDeep(this.taxblBaseAmt, obj, "TaxblBaseAmt");
        obj.ttlAmt = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount) biz.c24.io.api.Utils.cloneDeep(this.ttlAmt, obj, "TtlAmt");
        obj.dtls = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecordDetails1[]) biz.c24.io.api.Utils.cloneDeep(this.dtls, obj, "Dtls");
    }

    /**
     * Creates, adds and returns a new Dtls (0..*).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecordDetails1 createDtls() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecordDetails1 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecordDetails1) getElementDecl("Dtls").createObject();
        addDtls(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new TaxblBaseAmt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount createTaxblBaseAmt() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount) getElementDecl("TaxblBaseAmt").createObject();
        setTaxblBaseAmt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new TtlAmt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount createTtlAmt() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount) getElementDecl("TtlAmt").createObject();
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
     * Gets the value of Dtls (0..*).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecordDetails1[] getDtls() {
        if (this.dtls == null)
            return new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecordDetails1[]{};
        else
            return this.dtls;
    }

    /**
     * Gets the value of Dtls by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecordDetails1 getDtls(int ordinal) {
        if (this.dtls == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.dtls.length) {
            return this.dtls[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (0..*).
     * 
     * @param value
     * @param value The Dtls to get the index of.
     * @return The index.
     */
    public int getDtlsIndex(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecordDetails1 value) {
        if (this.dtls == null)
            return -1;
        for (int i=0; i<this.dtls.length; i++)
            if (this.dtls[i] == value)
                return i;
        return -1;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>rate,
     * taxblBaseAmt, ttlAmt, dtls</b>.
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
                return getRate();
            case 2:
                return getTaxblBaseAmt();
            case 3:
                return getTtlAmt();
            case 0:
            if (this.dtls == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.dtls[index];
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
                return this.rate == null ? 0 : 1;
            case 2:
                return this.taxblBaseAmt == null ? 0 : 1;
            case 3:
                return this.ttlAmt == null ? 0 : 1;
            case 0:
                return this.dtls == null ? 0 : this.dtls.length;
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
                return this.rate != null && this.rate.equals(element) ? 0 : -1;
            case 2:
                return this.taxblBaseAmt != null && this.taxblBaseAmt.equals(element) ? 0 : -1;
            case 3:
                return this.ttlAmt != null && this.ttlAmt.equals(element) ? 0 : -1;
            case 0:
                return getDtlsIndex((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecordDetails1) element);
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of Rate (0..1).
     * 
     * @return The value.
     */
    public java.math.BigDecimal getRate() {
        return this.rate;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>rate,
     * taxblBaseAmt, ttlAmt, dtls</b>.
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
                return this.rate;
            case 2:
                return this.taxblBaseAmt;
            case 3:
                return this.ttlAmt;
            case 0:
            if (this.dtls == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.dtls[index];
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of TaxblBaseAmt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount getTaxblBaseAmt() {
        return this.taxblBaseAmt;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.rate == null ? 0 : 1;
        count += this.taxblBaseAmt == null ? 0 : 1;
        count += this.ttlAmt == null ? 0 : 1;
        count += this.dtls == null ? 0 : this.dtls.length;
        return count;
    }

    /**
     * Gets the value of TtlAmt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount getTtlAmt() {
        return this.ttlAmt;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(rate);
        result = 31 * result + hashCodeOf(taxblBaseAmt);
        result = 31 * result + hashCodeOf(ttlAmt);
        result = 31 * result + hashCodeOf(dtls);
        return result;
    }

    /**
     * Removes a Dtls (0..*).
     * 
     * @param index
     * @param index The index of the Dtls to get.
     */
    public void removeDtls(int index) {
        if (this.dtls == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecordDetails1[] temp = this.dtls;
        this.dtls = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecordDetails1[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.dtls, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.dtls, index, temp.length-index-1);
        if (this.dtls.length == 0)
            this.dtls = null;
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
                setRate(null);
                return;
            case 2:
                setTaxblBaseAmt(null);
                return;
            case 3:
                setTtlAmt(null);
                return;
            case 0:
                removeDtls(index);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of Dtls (0..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setDtls(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecordDetails1[] value) {
        this.dtls = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecordDetails1[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.dtls != null && i<this.dtls.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.dtls[i]).setParent(this, "Dtls");
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
                setRate(biz.c24.io.api.Utils.decimalValue(value));
                return;
            case 2:
                setTaxblBaseAmt((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount) value);
                return;
            case 3:
                setTtlAmt((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount) value);
                return;
            case 0:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecordDetails1[]) {
                    setDtls((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecordDetails1[])value);
                } else if (this.dtls == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.dtls[index] = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecordDetails1) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.dtls[index]).setParent(this, "Dtls");
                }
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of Rate (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setRate(java.math.BigDecimal value) {
        this.rate = value;
    }

    /**
     * [Virtual Element] Sets the value of TaxblBaseAmt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTaxblBaseAmt(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount value) {
        this.taxblBaseAmt = value;
        if (this.taxblBaseAmt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.taxblBaseAmt).setParent(this, "TaxblBaseAmt");
    }

    /**
     * [Virtual Element] Sets the value of TtlAmt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTtlAmt(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount value) {
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
        out.writeObject(this.rate);
        out.writeObject(this.taxblBaseAmt);
        out.writeObject(this.ttlAmt);
        out.writeObject(this.dtls);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.rate = (java.math.BigDecimal) in.readObject();
        this.taxblBaseAmt = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount) in.readObject();
        this.ttlAmt = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount) in.readObject();
        this.dtls = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecordDetails1[]) in.readObject();
    }

}
