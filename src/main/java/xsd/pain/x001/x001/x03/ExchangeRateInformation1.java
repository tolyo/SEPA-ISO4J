/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * ExchangeRateInformation1. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>XchgRate</b> of type {@link java.math.BigDecimal}
 * (0..1)</li>
 * <li><b>RateTp</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>CtrctId</b> of type {@link java.lang.String} (0..1)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ExchangeRateInformation1Cls
 */
public class ExchangeRateInformation1 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"CtrctId", "RateTp", "XchgRate"};

    /**
     * Field xchgRate.
     */
    private java.math.BigDecimal xchgRate;

    /**
     * Field rateTp.
     */
    private java.lang.String rateTp;

    /**
     * Field ctrctId.
     */
    private java.lang.String ctrctId;

    public ExchangeRateInformation1() {
        this(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ExchangeRateInformation1Cls.getInstance().getNullDefiningElementDecl());
    }

    public ExchangeRateInformation1(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public ExchangeRateInformation1(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public ExchangeRateInformation1(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ExchangeRateInformation1 clone) {
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
                setXchgRate(biz.c24.io.api.Utils.decimalValue(value));
                return;
            case 1:
                setRateTp((java.lang.String) value);
                return;
            case 0:
                setCtrctId((java.lang.String) value);
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
        return new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ExchangeRateInformation1(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ExchangeRateInformation1(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ExchangeRateInformation1 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ExchangeRateInformation1) clone;
        obj.xchgRate = (java.math.BigDecimal) biz.c24.io.api.Utils.cloneDeep(this.xchgRate, obj, "XchgRate");
        obj.rateTp = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.rateTp, obj, "RateTp");
        obj.ctrctId = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.ctrctId, obj, "CtrctId");
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
     * The legal value(s) for <code>name</code> are: <b>xchgRate,
     * rateTp, ctrctId</b>.
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
                return getXchgRate();
            case 1:
                return getRateTp();
            case 0:
                return getCtrctId();
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
                return this.xchgRate == null ? 0 : 1;
            case 1:
                return this.rateTp == null ? 0 : 1;
            case 0:
                return this.ctrctId == null ? 0 : 1;
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
                return this.xchgRate != null && this.xchgRate.equals(element) ? 0 : -1;
            case 1:
                return this.rateTp != null && this.rateTp.equals(element) ? 0 : -1;
            case 0:
                return this.ctrctId != null && this.ctrctId.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of RateTp (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getRateTp() {
        return this.rateTp;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>xchgRate,
     * rateTp, ctrctId</b>.
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
                return this.xchgRate;
            case 1:
                return this.rateTp;
            case 0:
                return this.ctrctId;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.xchgRate == null ? 0 : 1;
        count += this.rateTp == null ? 0 : 1;
        count += this.ctrctId == null ? 0 : 1;
        return count;
    }

    /**
     * Gets the value of XchgRate (0..1).
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
        result = 31 * result + hashCodeOf(xchgRate);
        result = 31 * result + hashCodeOf(rateTp);
        result = 31 * result + hashCodeOf(ctrctId);
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
                setXchgRate(null);
                return;
            case 1:
                setRateTp(null);
                return;
            case 0:
                setCtrctId(null);
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
                setXchgRate(biz.c24.io.api.Utils.decimalValue(value));
                return;
            case 1:
                setRateTp((java.lang.String) value);
                return;
            case 0:
                setCtrctId((java.lang.String) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of RateTp (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setRateTp(java.lang.String value) {
        this.rateTp = value;
    }

    /**
     * [Virtual Element] Sets the value of XchgRate (0..1).
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
        out.writeObject(this.xchgRate);
        out.writeObject(this.rateTp);
        out.writeObject(this.ctrctId);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.xchgRate = (java.math.BigDecimal) in.readObject();
        this.rateTp = (java.lang.String) in.readObject();
        this.ctrctId = (java.lang.String) in.readObject();
    }

}
