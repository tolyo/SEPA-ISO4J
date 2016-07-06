/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * TotalTransactions2. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>TtlNtries</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.NumberAndSumOfTransactions2}
 * (0..1)</li>
 * <li><b>TtlCdtNtries</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.NumberAndSumOfTransactions1}
 * (0..1)</li>
 * <li><b>TtlDbtNtries</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.NumberAndSumOfTransactions1}
 * (0..1)</li>
 * <li><b>TtlNtriesPerBkTxCd</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalsPerBankTransactionCode2}
 * (0..*)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalTransactions2Cls
 */
public class TotalTransactions2 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"TtlCdtNtries", "TtlDbtNtries", "TtlNtries", "TtlNtriesPerBkTxCd"};

    /**
     * Field ttlNtries.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.NumberAndSumOfTransactions2 ttlNtries;

    /**
     * Field ttlCdtNtries.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.NumberAndSumOfTransactions1 ttlCdtNtries;

    /**
     * Field ttlDbtNtries.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.NumberAndSumOfTransactions1 ttlDbtNtries;

    /**
     * Field ttlNtriesPerBkTxCd.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalsPerBankTransactionCode2[] ttlNtriesPerBkTxCd;

    public TotalTransactions2() {
        this(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalTransactions2Cls.getInstance().getNullDefiningElementDecl());
    }

    public TotalTransactions2(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public TotalTransactions2(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public TotalTransactions2(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalTransactions2 clone) {
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
                setTtlNtries((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.NumberAndSumOfTransactions2) value);
                return;
            case 0:
                setTtlCdtNtries((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.NumberAndSumOfTransactions1) value);
                return;
            case 1:
                setTtlDbtNtries((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.NumberAndSumOfTransactions1) value);
                return;
            case 3:
                addTtlNtriesPerBkTxCd((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalsPerBankTransactionCode2) value);
                return;
            default:
                super.addElement(name, value);
        }
    }

    /**
     * Adds a TtlNtriesPerBkTxCd (0..*).
     * 
     * @param value
     * @param value The new TtlNtriesPerBkTxCd.
     */
    public void addTtlNtriesPerBkTxCd(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalsPerBankTransactionCode2 value) {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalsPerBankTransactionCode2[] temp = this.ttlNtriesPerBkTxCd;
        this.ttlNtriesPerBkTxCd = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalsPerBankTransactionCode2[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.ttlNtriesPerBkTxCd, 0, temp.length);
        this.ttlNtriesPerBkTxCd[this.ttlNtriesPerBkTxCd.length-1] = value;
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "TtlNtriesPerBkTxCd");
    }

    /**
     * Creates and returns a shallow clone of this object.
     * 
     * @see #cloneDeep()
     */
    public java.lang.Object clone() {
        return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalTransactions2(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalTransactions2(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalTransactions2 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalTransactions2) clone;
        obj.ttlNtries = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.NumberAndSumOfTransactions2) biz.c24.io.api.Utils.cloneDeep(this.ttlNtries, obj, "TtlNtries");
        obj.ttlCdtNtries = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.NumberAndSumOfTransactions1) biz.c24.io.api.Utils.cloneDeep(this.ttlCdtNtries, obj, "TtlCdtNtries");
        obj.ttlDbtNtries = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.NumberAndSumOfTransactions1) biz.c24.io.api.Utils.cloneDeep(this.ttlDbtNtries, obj, "TtlDbtNtries");
        obj.ttlNtriesPerBkTxCd = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalsPerBankTransactionCode2[]) biz.c24.io.api.Utils.cloneDeep(this.ttlNtriesPerBkTxCd, obj, "TtlNtriesPerBkTxCd");
    }

    /**
     * Creates, adds and returns a new TtlCdtNtries (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.NumberAndSumOfTransactions1 createTtlCdtNtries() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.NumberAndSumOfTransactions1 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.NumberAndSumOfTransactions1) getElementDecl("TtlCdtNtries").createObject();
        setTtlCdtNtries(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new TtlDbtNtries (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.NumberAndSumOfTransactions1 createTtlDbtNtries() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.NumberAndSumOfTransactions1 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.NumberAndSumOfTransactions1) getElementDecl("TtlDbtNtries").createObject();
        setTtlDbtNtries(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new TtlNtries (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.NumberAndSumOfTransactions2 createTtlNtries() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.NumberAndSumOfTransactions2 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.NumberAndSumOfTransactions2) getElementDecl("TtlNtries").createObject();
        setTtlNtries(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new TtlNtriesPerBkTxCd (0..*).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalsPerBankTransactionCode2 createTtlNtriesPerBkTxCd() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalsPerBankTransactionCode2 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalsPerBankTransactionCode2) getElementDecl("TtlNtriesPerBkTxCd").createObject();
        addTtlNtriesPerBkTxCd(obj);
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
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>ttlNtries,
     * ttlCdtNtries, ttlDbtNtries, ttlNtriesPerBkTxCd</b>.
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
                return getTtlNtries();
            case 0:
                return getTtlCdtNtries();
            case 1:
                return getTtlDbtNtries();
            case 3:
            if (this.ttlNtriesPerBkTxCd == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.ttlNtriesPerBkTxCd[index];
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
                return this.ttlNtries == null ? 0 : 1;
            case 0:
                return this.ttlCdtNtries == null ? 0 : 1;
            case 1:
                return this.ttlDbtNtries == null ? 0 : 1;
            case 3:
                return this.ttlNtriesPerBkTxCd == null ? 0 : this.ttlNtriesPerBkTxCd.length;
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
                return this.ttlNtries != null && this.ttlNtries.equals(element) ? 0 : -1;
            case 0:
                return this.ttlCdtNtries != null && this.ttlCdtNtries.equals(element) ? 0 : -1;
            case 1:
                return this.ttlDbtNtries != null && this.ttlDbtNtries.equals(element) ? 0 : -1;
            case 3:
                return getTtlNtriesPerBkTxCdIndex((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalsPerBankTransactionCode2) element);
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>ttlNtries,
     * ttlCdtNtries, ttlDbtNtries, ttlNtriesPerBkTxCd</b>.
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
                return this.ttlNtries;
            case 0:
                return this.ttlCdtNtries;
            case 1:
                return this.ttlDbtNtries;
            case 3:
            if (this.ttlNtriesPerBkTxCd == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.ttlNtriesPerBkTxCd[index];
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.ttlNtries == null ? 0 : 1;
        count += this.ttlCdtNtries == null ? 0 : 1;
        count += this.ttlDbtNtries == null ? 0 : 1;
        count += this.ttlNtriesPerBkTxCd == null ? 0 : this.ttlNtriesPerBkTxCd.length;
        return count;
    }

    /**
     * Gets the value of TtlCdtNtries (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.NumberAndSumOfTransactions1 getTtlCdtNtries() {
        return this.ttlCdtNtries;
    }

    /**
     * Gets the value of TtlDbtNtries (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.NumberAndSumOfTransactions1 getTtlDbtNtries() {
        return this.ttlDbtNtries;
    }

    /**
     * Gets the value of TtlNtries (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.NumberAndSumOfTransactions2 getTtlNtries() {
        return this.ttlNtries;
    }

    /**
     * Gets the value of TtlNtriesPerBkTxCd (0..*).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalsPerBankTransactionCode2[] getTtlNtriesPerBkTxCd() {
        if (this.ttlNtriesPerBkTxCd == null)
            return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalsPerBankTransactionCode2[]{};
        else
            return this.ttlNtriesPerBkTxCd;
    }

    /**
     * Gets the value of TtlNtriesPerBkTxCd by ordinal position in
     * the collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalsPerBankTransactionCode2 getTtlNtriesPerBkTxCd(int ordinal) {
        if (this.ttlNtriesPerBkTxCd == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.ttlNtriesPerBkTxCd.length) {
            return this.ttlNtriesPerBkTxCd[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (0..*).
     * 
     * @param value
     * @param value The TtlNtriesPerBkTxCd to get the index of.
     * @return The index.
     */
    public int getTtlNtriesPerBkTxCdIndex(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalsPerBankTransactionCode2 value) {
        if (this.ttlNtriesPerBkTxCd == null)
            return -1;
        for (int i=0; i<this.ttlNtriesPerBkTxCd.length; i++)
            if (this.ttlNtriesPerBkTxCd[i] == value)
                return i;
        return -1;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(ttlNtries);
        result = 31 * result + hashCodeOf(ttlCdtNtries);
        result = 31 * result + hashCodeOf(ttlDbtNtries);
        result = 31 * result + hashCodeOf(ttlNtriesPerBkTxCd);
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
                setTtlNtries(null);
                return;
            case 0:
                setTtlCdtNtries(null);
                return;
            case 1:
                setTtlDbtNtries(null);
                return;
            case 3:
                removeTtlNtriesPerBkTxCd(index);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * Removes a TtlNtriesPerBkTxCd (0..*).
     * 
     * @param index
     * @param index The index of the TtlNtriesPerBkTxCd to get.
     */
    public void removeTtlNtriesPerBkTxCd(int index) {
        if (this.ttlNtriesPerBkTxCd == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalsPerBankTransactionCode2[] temp = this.ttlNtriesPerBkTxCd;
        this.ttlNtriesPerBkTxCd = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalsPerBankTransactionCode2[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.ttlNtriesPerBkTxCd, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.ttlNtriesPerBkTxCd, index, temp.length-index-1);
        if (this.ttlNtriesPerBkTxCd.length == 0)
            this.ttlNtriesPerBkTxCd = null;
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
                setTtlNtries((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.NumberAndSumOfTransactions2) value);
                return;
            case 0:
                setTtlCdtNtries((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.NumberAndSumOfTransactions1) value);
                return;
            case 1:
                setTtlDbtNtries((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.NumberAndSumOfTransactions1) value);
                return;
            case 3:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalsPerBankTransactionCode2[]) {
                    setTtlNtriesPerBkTxCd((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalsPerBankTransactionCode2[])value);
                } else if (this.ttlNtriesPerBkTxCd == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.ttlNtriesPerBkTxCd[index] = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalsPerBankTransactionCode2) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.ttlNtriesPerBkTxCd[index]).setParent(this, "TtlNtriesPerBkTxCd");
                }
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of TtlCdtNtries (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTtlCdtNtries(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.NumberAndSumOfTransactions1 value) {
        this.ttlCdtNtries = value;
        if (this.ttlCdtNtries != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.ttlCdtNtries).setParent(this, "TtlCdtNtries");
    }

    /**
     * [Virtual Element] Sets the value of TtlDbtNtries (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTtlDbtNtries(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.NumberAndSumOfTransactions1 value) {
        this.ttlDbtNtries = value;
        if (this.ttlDbtNtries != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.ttlDbtNtries).setParent(this, "TtlDbtNtries");
    }

    /**
     * [Virtual Element] Sets the value of TtlNtries (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTtlNtries(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.NumberAndSumOfTransactions2 value) {
        this.ttlNtries = value;
        if (this.ttlNtries != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.ttlNtries).setParent(this, "TtlNtries");
    }

    /**
     * [Virtual Element] Sets the value of TtlNtriesPerBkTxCd
     * (0..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTtlNtriesPerBkTxCd(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalsPerBankTransactionCode2[] value) {
        this.ttlNtriesPerBkTxCd = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalsPerBankTransactionCode2[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.ttlNtriesPerBkTxCd != null && i<this.ttlNtriesPerBkTxCd.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.ttlNtriesPerBkTxCd[i]).setParent(this, "TtlNtriesPerBkTxCd");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.ttlNtries);
        out.writeObject(this.ttlCdtNtries);
        out.writeObject(this.ttlDbtNtries);
        out.writeObject(this.ttlNtriesPerBkTxCd);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.ttlNtries = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.NumberAndSumOfTransactions2) in.readObject();
        this.ttlCdtNtries = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.NumberAndSumOfTransactions1) in.readObject();
        this.ttlDbtNtries = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.NumberAndSumOfTransactions1) in.readObject();
        this.ttlNtriesPerBkTxCd = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalsPerBankTransactionCode2[]) in.readObject();
    }

}
