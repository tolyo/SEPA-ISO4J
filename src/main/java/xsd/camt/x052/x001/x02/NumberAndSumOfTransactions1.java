/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * NumberAndSumOfTransactions1. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>NbOfNtries</b> of type {@link java.lang.String}
 * (0..1)</li>
 * <li><b>Sum</b> of type {@link java.math.BigDecimal} (0..1)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.NumberAndSumOfTransactions1Cls
 */
public class NumberAndSumOfTransactions1 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"NbOfNtries", "Sum"};

    /**
     * Field nbOfNtries.
     */
    private java.lang.String nbOfNtries;

    /**
     * Field sum.
     */
    private java.math.BigDecimal sum;

    public NumberAndSumOfTransactions1() {
        this(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.NumberAndSumOfTransactions1Cls.getInstance().getNullDefiningElementDecl());
    }

    public NumberAndSumOfTransactions1(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public NumberAndSumOfTransactions1(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public NumberAndSumOfTransactions1(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.NumberAndSumOfTransactions1 clone) {
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
            case 0:
                setNbOfNtries((java.lang.String) value);
                return;
            case 1:
                setSum(biz.c24.io.api.Utils.decimalValue(value));
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
        return new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.NumberAndSumOfTransactions1(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.NumberAndSumOfTransactions1(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.NumberAndSumOfTransactions1 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.NumberAndSumOfTransactions1) clone;
        obj.nbOfNtries = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.nbOfNtries, obj, "NbOfNtries");
        obj.sum = (java.math.BigDecimal) biz.c24.io.api.Utils.cloneDeep(this.sum, obj, "Sum");
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
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>nbOfNtries,
     * sum</b>.
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
            case 0:
                return getNbOfNtries();
            case 1:
                return getSum();
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
            case 0:
                return this.nbOfNtries == null ? 0 : 1;
            case 1:
                return this.sum == null ? 0 : 1;
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
            case 0:
                return this.nbOfNtries != null && this.nbOfNtries.equals(element) ? 0 : -1;
            case 1:
                return this.sum != null && this.sum.equals(element) ? 0 : -1;
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
     * sum</b>.
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
            case 0:
                return this.nbOfNtries;
            case 1:
                return this.sum;
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
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(nbOfNtries);
        result = 31 * result + hashCodeOf(sum);
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
            case 0:
                setNbOfNtries(null);
                return;
            case 1:
                setSum(null);
                return;
            default:
            super.removeElement(name, index);
        }
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
            case 0:
                setNbOfNtries((java.lang.String) value);
                return;
            case 1:
                setSum(biz.c24.io.api.Utils.decimalValue(value));
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
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.nbOfNtries);
        out.writeObject(this.sum);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.nbOfNtries = (java.lang.String) in.readObject();
        this.sum = (java.math.BigDecimal) in.readObject();
    }

}
