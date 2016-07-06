/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * NumberAndSumOfTransactions2. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>NbOfNtries</b> of type {@link java.lang.String}
 * (0..1)</li>
 * <li><b>Sum</b> of type {@link java.math.BigDecimal} (0..1)</li>
 * <li><b>TtlNetNtryAmt</b> of type {@link java.math.BigDecimal}
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
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.NumberAndSumOfTransactions2Cls
 */
public class NumberAndSumOfTransactions2 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"CdtDbtInd", "NbOfNtries", "Sum", "TtlNetNtryAmt"};

    /**
     * Field nbOfNtries.
     */
    private java.lang.String nbOfNtries;

    /**
     * Field sum.
     */
    private java.math.BigDecimal sum;

    /**
     * Field ttlNetNtryAmt.
     */
    private java.math.BigDecimal ttlNetNtryAmt;

    /**
     * Field cdtDbtInd.
     */
    private java.lang.String cdtDbtInd;

    public NumberAndSumOfTransactions2() {
        this(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.NumberAndSumOfTransactions2Cls.getInstance().getNullDefiningElementDecl());
    }

    public NumberAndSumOfTransactions2(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public NumberAndSumOfTransactions2(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public NumberAndSumOfTransactions2(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.NumberAndSumOfTransactions2 clone) {
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
                setNbOfNtries((java.lang.String) value);
                return;
            case 2:
                setSum(biz.c24.io.api.Utils.decimalValue(value));
                return;
            case 3:
                setTtlNetNtryAmt(biz.c24.io.api.Utils.decimalValue(value));
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
        return new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.NumberAndSumOfTransactions2(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.NumberAndSumOfTransactions2(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.NumberAndSumOfTransactions2 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.NumberAndSumOfTransactions2) clone;
        obj.nbOfNtries = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.nbOfNtries, obj, "NbOfNtries");
        obj.sum = (java.math.BigDecimal) biz.c24.io.api.Utils.cloneDeep(this.sum, obj, "Sum");
        obj.ttlNetNtryAmt = (java.math.BigDecimal) biz.c24.io.api.Utils.cloneDeep(this.ttlNetNtryAmt, obj, "TtlNetNtryAmt");
        obj.cdtDbtInd = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.cdtDbtInd, obj, "CdtDbtInd");
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
     * The legal value(s) for <code>name</code> are: <b>nbOfNtries,
     * sum, ttlNetNtryAmt, cdtDbtInd</b>.
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
                return getNbOfNtries();
            case 2:
                return getSum();
            case 3:
                return getTtlNetNtryAmt();
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
                return this.nbOfNtries == null ? 0 : 1;
            case 2:
                return this.sum == null ? 0 : 1;
            case 3:
                return this.ttlNetNtryAmt == null ? 0 : 1;
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
                return this.nbOfNtries != null && this.nbOfNtries.equals(element) ? 0 : -1;
            case 2:
                return this.sum != null && this.sum.equals(element) ? 0 : -1;
            case 3:
                return this.ttlNetNtryAmt != null && this.ttlNetNtryAmt.equals(element) ? 0 : -1;
            case 0:
                return this.cdtDbtInd != null && this.cdtDbtInd.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of NbOfNtries (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getNbOfNtries() {
        return this.nbOfNtries;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>nbOfNtries,
     * sum, ttlNetNtryAmt, cdtDbtInd</b>.
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
                return this.nbOfNtries;
            case 2:
                return this.sum;
            case 3:
                return this.ttlNetNtryAmt;
            case 0:
                return this.cdtDbtInd;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of Sum (0..1).
     * 
     * @return The value.
     */
    public java.math.BigDecimal getSum() {
        return this.sum;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.nbOfNtries == null ? 0 : 1;
        count += this.sum == null ? 0 : 1;
        count += this.ttlNetNtryAmt == null ? 0 : 1;
        count += this.cdtDbtInd == null ? 0 : 1;
        return count;
    }

    /**
     * Gets the value of TtlNetNtryAmt (0..1).
     * 
     * @return The value.
     */
    public java.math.BigDecimal getTtlNetNtryAmt() {
        return this.ttlNetNtryAmt;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(nbOfNtries);
        result = 31 * result + hashCodeOf(sum);
        result = 31 * result + hashCodeOf(ttlNetNtryAmt);
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
                setNbOfNtries(null);
                return;
            case 2:
                setSum(null);
                return;
            case 3:
                setTtlNetNtryAmt(null);
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
                setNbOfNtries((java.lang.String) value);
                return;
            case 2:
                setSum(biz.c24.io.api.Utils.decimalValue(value));
                return;
            case 3:
                setTtlNetNtryAmt(biz.c24.io.api.Utils.decimalValue(value));
                return;
            case 0:
                setCdtDbtInd((java.lang.String) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of NbOfNtries (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setNbOfNtries(java.lang.String value) {
        this.nbOfNtries = value;
    }

    /**
     * [Virtual Element] Sets the value of Sum (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setSum(java.math.BigDecimal value) {
        this.sum = value;
    }

    /**
     * [Virtual Element] Sets the value of TtlNetNtryAmt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTtlNetNtryAmt(java.math.BigDecimal value) {
        this.ttlNetNtryAmt = value;
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.nbOfNtries);
        out.writeObject(this.sum);
        out.writeObject(this.ttlNetNtryAmt);
        out.writeObject(this.cdtDbtInd);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.nbOfNtries = (java.lang.String) in.readObject();
        this.sum = (java.math.BigDecimal) in.readObject();
        this.ttlNetNtryAmt = (java.math.BigDecimal) in.readObject();
        this.cdtDbtInd = (java.lang.String) in.readObject();
    }

}
