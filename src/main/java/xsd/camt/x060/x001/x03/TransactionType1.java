/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * TransactionType1. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>Sts</b> of type {@link java.lang.String} (1)</li>
 * <li><b>CdtDbtInd</b> of type {@link java.lang.String} (1)</li>
 * <li><b>FlrLmt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Limit2}
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
 * iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.TransactionType1Cl
 */
public class TransactionType1 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"CdtDbtInd", "FlrLmt", "Sts"};

    /**
     * Field sts.
     */
    private java.lang.String sts;

    /**
     * Field cdtDbtInd.
     */
    private java.lang.String cdtDbtInd;

    /**
     * Field flrLmt.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Limit2[] flrLmt;

    public TransactionType1() {
        this(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.TransactionType1Cls.getInstance().getNullDefiningElementDecl());
    }

    public TransactionType1(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public TransactionType1(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public TransactionType1(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.TransactionType1 clone) {
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
                setSts((java.lang.String) value);
                return;
            case 0:
                setCdtDbtInd((java.lang.String) value);
                return;
            case 1:
                addFlrLmt((iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Limit2) value);
                return;
            default:
                super.addElement(name, value);
        }
    }

    /**
     * Adds a FlrLmt (0..*).
     * 
     * @param value
     * @param value The new FlrLmt.
     */
    public void addFlrLmt(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Limit2 value) {
        iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Limit2[] temp = this.flrLmt;
        this.flrLmt = new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Limit2[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.flrLmt, 0, temp.length);
        this.flrLmt[this.flrLmt.length-1] = value;
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "FlrLmt");
    }

    /**
     * Creates and returns a shallow clone of this object.
     * 
     * @see #cloneDeep()
     */
    public java.lang.Object clone() {
        return new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.TransactionType1(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.TransactionType1(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.TransactionType1 obj = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.TransactionType1) clone;
        obj.sts = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.sts, obj, "Sts");
        obj.cdtDbtInd = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.cdtDbtInd, obj, "CdtDbtInd");
        obj.flrLmt = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Limit2[]) biz.c24.io.api.Utils.cloneDeep(this.flrLmt, obj, "FlrLmt");
    }

    /**
     * Creates, adds and returns a new FlrLmt (0..*).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Limit2 createFlrLmt() {
        iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Limit2 obj = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Limit2) getElementDecl("FlrLmt").createObject();
        addFlrLmt(obj);
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
     * Gets the value of CdtDbtInd (1).
     * 
     * @return The value.
     */
    public java.lang.String getCdtDbtInd() {
        return this.cdtDbtInd;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>sts,
     * cdtDbtInd, flrLmt</b>.
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
                return getSts();
            case 0:
                return getCdtDbtInd();
            case 1:
            if (this.flrLmt == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.flrLmt[index];
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
                return this.sts == null ? 0 : 1;
            case 0:
                return this.cdtDbtInd == null ? 0 : 1;
            case 1:
                return this.flrLmt == null ? 0 : this.flrLmt.length;
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
                return this.sts != null && this.sts.equals(element) ? 0 : -1;
            case 0:
                return this.cdtDbtInd != null && this.cdtDbtInd.equals(element) ? 0 : -1;
            case 1:
                return getFlrLmtIndex((iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Limit2) element);
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of FlrLmt (0..*).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Limit2[] getFlrLmt() {
        if (this.flrLmt == null)
            return new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Limit2[]{};
        else
            return this.flrLmt;
    }

    /**
     * Gets the value of FlrLmt by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Limit2 getFlrLmt(int ordinal) {
        if (this.flrLmt == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.flrLmt.length) {
            return this.flrLmt[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (0..*).
     * 
     * @param value
     * @param value The FlrLmt to get the index of.
     * @return The index.
     */
    public int getFlrLmtIndex(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Limit2 value) {
        if (this.flrLmt == null)
            return -1;
        for (int i=0; i<this.flrLmt.length; i++)
            if (this.flrLmt[i] == value)
                return i;
        return -1;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>sts,
     * cdtDbtInd, flrLmt</b>.
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
                return this.sts;
            case 0:
                return this.cdtDbtInd;
            case 1:
            if (this.flrLmt == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.flrLmt[index];
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of Sts (1).
     * 
     * @return The value.
     */
    public java.lang.String getSts() {
        return this.sts;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.sts == null ? 0 : 1;
        count += this.cdtDbtInd == null ? 0 : 1;
        count += this.flrLmt == null ? 0 : this.flrLmt.length;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(sts);
        result = 31 * result + hashCodeOf(cdtDbtInd);
        result = 31 * result + hashCodeOf(flrLmt);
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
                setSts(null);
                return;
            case 0:
                setCdtDbtInd(null);
                return;
            case 1:
                removeFlrLmt(index);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * Removes a FlrLmt (0..*).
     * 
     * @param index
     * @param index The index of the FlrLmt to get.
     */
    public void removeFlrLmt(int index) {
        if (this.flrLmt == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Limit2[] temp = this.flrLmt;
        this.flrLmt = new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Limit2[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.flrLmt, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.flrLmt, index, temp.length-index-1);
        if (this.flrLmt.length == 0)
            this.flrLmt = null;
    }

    /**
     * [Virtual Element] Sets the value of CdtDbtInd (1).
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
            case 2:
                setSts((java.lang.String) value);
                return;
            case 0:
                setCdtDbtInd((java.lang.String) value);
                return;
            case 1:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Limit2[]) {
                    setFlrLmt((iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Limit2[])value);
                } else if (this.flrLmt == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.flrLmt[index] = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Limit2) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.flrLmt[index]).setParent(this, "FlrLmt");
                }
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of FlrLmt (0..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setFlrLmt(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Limit2[] value) {
        this.flrLmt = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Limit2[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.flrLmt != null && i<this.flrLmt.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.flrLmt[i]).setParent(this, "FlrLmt");
    }

    /**
     * [Virtual Element] Sets the value of Sts (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setSts(java.lang.String value) {
        this.sts = value;
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.sts);
        out.writeObject(this.cdtDbtInd);
        out.writeObject(this.flrLmt);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.sts = (java.lang.String) in.readObject();
        this.cdtDbtInd = (java.lang.String) in.readObject();
        this.flrLmt = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Limit2[]) in.readObject();
    }

}
