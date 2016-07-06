/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * NumberOfTransactionsPerStatus3. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>DtldNbOfTxs</b> of type {@link java.lang.String} (1)</li>
 * <li><b>DtldSts</b> of type {@link java.lang.String} (1)</li>
 * <li><b>DtldCtrlSum</b> of type {@link java.math.BigDecimal}
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
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.NumberOfTransactionsPerStatus3Cls
 */
public class NumberOfTransactionsPerStatus3 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"DtldCtrlSum", "DtldNbOfTxs", "DtldSts"};

    /**
     * Field dtldNbOfTxs.
     */
    private java.lang.String dtldNbOfTxs;

    /**
     * Field dtldSts.
     */
    private java.lang.String dtldSts;

    /**
     * Field dtldCtrlSum.
     */
    private java.math.BigDecimal dtldCtrlSum;

    public NumberOfTransactionsPerStatus3() {
        this(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.NumberOfTransactionsPerStatus3Cls.getInstance().getNullDefiningElementDecl());
    }

    public NumberOfTransactionsPerStatus3(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public NumberOfTransactionsPerStatus3(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public NumberOfTransactionsPerStatus3(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.NumberOfTransactionsPerStatus3 clone) {
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
                setDtldNbOfTxs((java.lang.String) value);
                return;
            case 2:
                setDtldSts((java.lang.String) value);
                return;
            case 0:
                setDtldCtrlSum(biz.c24.io.api.Utils.decimalValue(value));
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
        return new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.NumberOfTransactionsPerStatus3(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.NumberOfTransactionsPerStatus3(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.NumberOfTransactionsPerStatus3 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.NumberOfTransactionsPerStatus3) clone;
        obj.dtldNbOfTxs = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.dtldNbOfTxs, obj, "DtldNbOfTxs");
        obj.dtldSts = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.dtldSts, obj, "DtldSts");
        obj.dtldCtrlSum = (java.math.BigDecimal) biz.c24.io.api.Utils.cloneDeep(this.dtldCtrlSum, obj, "DtldCtrlSum");
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
     * Gets the value of DtldCtrlSum (0..1).
     * 
     * @return The value.
     */
    public java.math.BigDecimal getDtldCtrlSum() {
        return this.dtldCtrlSum;
    }

    /**
     * Gets the value of DtldNbOfTxs (1).
     * 
     * @return The value.
     */
    public java.lang.String getDtldNbOfTxs() {
        return this.dtldNbOfTxs;
    }

    /**
     * Gets the value of DtldSts (1).
     * 
     * @return The value.
     */
    public java.lang.String getDtldSts() {
        return this.dtldSts;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are:
     * <b>dtldNbOfTxs, dtldSts, dtldCtrlSum</b>.
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
                return getDtldNbOfTxs();
            case 2:
                return getDtldSts();
            case 0:
                return getDtldCtrlSum();
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
                return this.dtldNbOfTxs == null ? 0 : 1;
            case 2:
                return this.dtldSts == null ? 0 : 1;
            case 0:
                return this.dtldCtrlSum == null ? 0 : 1;
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
                return this.dtldNbOfTxs != null && this.dtldNbOfTxs.equals(element) ? 0 : -1;
            case 2:
                return this.dtldSts != null && this.dtldSts.equals(element) ? 0 : -1;
            case 0:
                return this.dtldCtrlSum != null && this.dtldCtrlSum.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are:
     * <b>dtldNbOfTxs, dtldSts, dtldCtrlSum</b>.
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
                return this.dtldNbOfTxs;
            case 2:
                return this.dtldSts;
            case 0:
                return this.dtldCtrlSum;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.dtldNbOfTxs == null ? 0 : 1;
        count += this.dtldSts == null ? 0 : 1;
        count += this.dtldCtrlSum == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(dtldNbOfTxs);
        result = 31 * result + hashCodeOf(dtldSts);
        result = 31 * result + hashCodeOf(dtldCtrlSum);
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
                setDtldNbOfTxs(null);
                return;
            case 2:
                setDtldSts(null);
                return;
            case 0:
                setDtldCtrlSum(null);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of DtldCtrlSum (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setDtldCtrlSum(java.math.BigDecimal value) {
        this.dtldCtrlSum = value;
    }

    /**
     * [Virtual Element] Sets the value of DtldNbOfTxs (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setDtldNbOfTxs(java.lang.String value) {
        this.dtldNbOfTxs = value;
    }

    /**
     * [Virtual Element] Sets the value of DtldSts (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setDtldSts(java.lang.String value) {
        this.dtldSts = value;
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
                setDtldNbOfTxs((java.lang.String) value);
                return;
            case 2:
                setDtldSts((java.lang.String) value);
                return;
            case 0:
                setDtldCtrlSum(biz.c24.io.api.Utils.decimalValue(value));
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.dtldNbOfTxs);
        out.writeObject(this.dtldSts);
        out.writeObject(this.dtldCtrlSum);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.dtldNbOfTxs = (java.lang.String) in.readObject();
        this.dtldSts = (java.lang.String) in.readObject();
        this.dtldCtrlSum = (java.math.BigDecimal) in.readObject();
    }

}
