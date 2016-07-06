/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * ActiveOrHistoricCurrencyAndAmount. <p/>
 * 
 * This object is composed of the following <i>attribute</i>:
 * <ul>
 * <li><b>Ccy</b> of type {@link java.lang.String} (required)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmountCls
 */
public class ActiveOrHistoricCurrencyAndAmount extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ATTRIBUTES.
     */
    private static final java.lang.String[] NATIVE_ATTRIBUTES = new String[] {"Ccy"};

    /**
     * Field ccy.
     */
    private java.lang.String ccy;

    public ActiveOrHistoricCurrencyAndAmount() {
        this(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmountCls.getInstance().getNullDefiningElementDecl());
    }

    public ActiveOrHistoricCurrencyAndAmount(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public ActiveOrHistoricCurrencyAndAmount(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public ActiveOrHistoricCurrencyAndAmount(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount clone) {
        super(clone);
    }

    /**
     * Creates and returns a shallow clone of this object.
     * 
     * @see #cloneDeep()
     */
    public java.lang.Object clone() {
        return new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount) clone;
        obj.ccy = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.ccy, obj, "Ccy");
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
     * Gets the attribute called <code>name</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>ccy</b>.
     * 
     * @param name
     */
    public java.lang.Object getAttr(java.lang.String name) {
        switch (Arrays.binarySearch(NATIVE_ATTRIBUTES, name))
        {
            case 0:
                return this.ccy;
            default:
                return super.getAttr(name);
        }
    }

    /**
     * Gets the value of Ccy (required).
     */
    public java.lang.String getCcy() {
        return this.ccy;
    }

    /**
     */
    public int getTotalAttrCount() {
        int count = super.getTotalAttrCount();
        count += this.ccy == null ? 0 : 1;
        return count;
    }

    /**
     * Get content.
     * 
     * @return The value.
     */
    public java.math.BigDecimal getValue() {
        return biz.c24.io.api.Utils.decimalValue(getContent());
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ATTRIBUTES);
        result = 31 * result + hashCodeOf(ccy);
        return result;
    }

    /**
     * Returns whether the attribute called <code>name</code> is
     * present.<p>
     * The legal value(s) for <code>name</code> are defined in
     * {@link #getAttr}.
     * 
     * @param name
     */
    public boolean isAttrPresent(java.lang.String name) {
        int i = Arrays.binarySearch(NATIVE_ATTRIBUTES, name);
        switch (i)
        {
            case 0:
                return this.ccy == null ? false : true;
            default:
                return super.isAttrPresent(name);
        }
    }

    /**
     * Removes the attribute called <code>name</code>.<p>
     * The legal value(s) for <code>name</code> are defined in
     * {@link #getAttr}.
     * 
     * @param name
     */
    public void removeAttr(java.lang.String name) {
        switch (Arrays.binarySearch(NATIVE_ATTRIBUTES, name))
        {
            case 0:
                this.ccy = null;
                return;
            default:
                super.removeAttr(name);
        }
    }

    /**
     * Sets the attribute called <code>name</code> to
     * <code>value<code>.<p>
     * The legal value(s) for <code>name</code> are defined in
     * {@link #getAttr}.
     * 
     * @param name
     * @param value
     */
    public void setAttr(java.lang.String name,java.lang.Object value) {
        switch (Arrays.binarySearch(NATIVE_ATTRIBUTES, name))
        {
            case 0:
                setCcy((java.lang.String) value);
                return;
            default:
                super.setAttr(name, value);
        }
    }

    /**
     * Sets the value of Ccy (required).
     * 
     * @param value
     * @param value The value to use.
     */
    public void setCcy(java.lang.String value) {
        this.ccy = value;
    }

    public void setContent(java.lang.Object value) {
        if (value instanceof java.math.BigDecimal || value == null)
            super.setContent(value);
        else
            throw new ClassCastException("Expecting instance of java.math.BigDecimal");
    }

    /**
     * Set content.
     * 
     * @param value
     * @param value The value to use.
     */
    public void setValue(java.math.BigDecimal value) {
        setContent(value);
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.ccy);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.ccy = (java.lang.String) in.readObject();
    }

}
