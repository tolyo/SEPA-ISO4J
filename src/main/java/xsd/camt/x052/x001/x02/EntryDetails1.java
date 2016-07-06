/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * EntryDetails1. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>Btch</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BatchInformation2}
 * (0..1)</li>
 * <li><b>TxDtls</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.EntryTransaction2}
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
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.EntryDetails1Cls
 */
public class EntryDetails1 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"Btch", "TxDtls"};

    /**
     * Field btch.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BatchInformation2 btch;

    /**
     * Field txDtls.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.EntryTransaction2[] txDtls;

    public EntryDetails1() {
        this(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.EntryDetails1Cls.getInstance().getNullDefiningElementDecl());
    }

    public EntryDetails1(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public EntryDetails1(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public EntryDetails1(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.EntryDetails1 clone) {
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
                setBtch((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BatchInformation2) value);
                return;
            case 1:
                addTxDtls((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.EntryTransaction2) value);
                return;
            default:
                super.addElement(name, value);
        }
    }

    /**
     * Adds a TxDtls (0..*).
     * 
     * @param value
     * @param value The new TxDtls.
     */
    public void addTxDtls(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.EntryTransaction2 value) {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.EntryTransaction2[] temp = this.txDtls;
        this.txDtls = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.EntryTransaction2[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.txDtls, 0, temp.length);
        this.txDtls[this.txDtls.length-1] = value;
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "TxDtls");
    }

    /**
     * Creates and returns a shallow clone of this object.
     * 
     * @see #cloneDeep()
     */
    public java.lang.Object clone() {
        return new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.EntryDetails1(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.EntryDetails1(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.EntryDetails1 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.EntryDetails1) clone;
        obj.btch = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BatchInformation2) biz.c24.io.api.Utils.cloneDeep(this.btch, obj, "Btch");
        obj.txDtls = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.EntryTransaction2[]) biz.c24.io.api.Utils.cloneDeep(this.txDtls, obj, "TxDtls");
    }

    /**
     * Creates, adds and returns a new Btch (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BatchInformation2 createBtch() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BatchInformation2 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BatchInformation2) getElementDecl("Btch").createObject();
        setBtch(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new TxDtls (0..*).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.EntryTransaction2 createTxDtls() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.EntryTransaction2 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.EntryTransaction2) getElementDecl("TxDtls").createObject();
        addTxDtls(obj);
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
     * Gets the value of Btch (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BatchInformation2 getBtch() {
        return this.btch;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>btch,
     * txDtls</b>.
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
                return getBtch();
            case 1:
            if (this.txDtls == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.txDtls[index];
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
                return this.btch == null ? 0 : 1;
            case 1:
                return this.txDtls == null ? 0 : this.txDtls.length;
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
                return this.btch != null && this.btch.equals(element) ? 0 : -1;
            case 1:
                return getTxDtlsIndex((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.EntryTransaction2) element);
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>btch,
     * txDtls</b>.
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
                return this.btch;
            case 1:
            if (this.txDtls == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.txDtls[index];
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.btch == null ? 0 : 1;
        count += this.txDtls == null ? 0 : this.txDtls.length;
        return count;
    }

    /**
     * Gets the value of TxDtls (0..*).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.EntryTransaction2[] getTxDtls() {
        if (this.txDtls == null)
            return new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.EntryTransaction2[]{};
        else
            return this.txDtls;
    }

    /**
     * Gets the value of TxDtls by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.EntryTransaction2 getTxDtls(int ordinal) {
        if (this.txDtls == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.txDtls.length) {
            return this.txDtls[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (0..*).
     * 
     * @param value
     * @param value The TxDtls to get the index of.
     * @return The index.
     */
    public int getTxDtlsIndex(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.EntryTransaction2 value) {
        if (this.txDtls == null)
            return -1;
        for (int i=0; i<this.txDtls.length; i++)
            if (this.txDtls[i] == value)
                return i;
        return -1;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(btch);
        result = 31 * result + hashCodeOf(txDtls);
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
                setBtch(null);
                return;
            case 1:
                removeTxDtls(index);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * Removes a TxDtls (0..*).
     * 
     * @param index
     * @param index The index of the TxDtls to get.
     */
    public void removeTxDtls(int index) {
        if (this.txDtls == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.EntryTransaction2[] temp = this.txDtls;
        this.txDtls = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.EntryTransaction2[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.txDtls, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.txDtls, index, temp.length-index-1);
        if (this.txDtls.length == 0)
            this.txDtls = null;
    }

    /**
     * [Virtual Element] Sets the value of Btch (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setBtch(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BatchInformation2 value) {
        this.btch = value;
        if (this.btch != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.btch).setParent(this, "Btch");
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
                setBtch((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BatchInformation2) value);
                return;
            case 1:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.EntryTransaction2[]) {
                    setTxDtls((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.EntryTransaction2[])value);
                } else if (this.txDtls == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.txDtls[index] = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.EntryTransaction2) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.txDtls[index]).setParent(this, "TxDtls");
                }
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of TxDtls (0..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTxDtls(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.EntryTransaction2[] value) {
        this.txDtls = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.EntryTransaction2[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.txDtls != null && i<this.txDtls.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.txDtls[i]).setParent(this, "TxDtls");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.btch);
        out.writeObject(this.txDtls);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.btch = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BatchInformation2) in.readObject();
        this.txDtls = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.EntryTransaction2[]) in.readObject();
    }

}
