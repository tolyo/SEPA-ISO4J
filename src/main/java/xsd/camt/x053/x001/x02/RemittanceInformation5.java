/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * RemittanceInformation5. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>Ustrd</b> of type {@link java.lang.String} (0..*)</li>
 * <li><b>Strd</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.StructuredRemittanceInformation7}
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
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RemittanceInformation5Cls
 */
public class RemittanceInformation5 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"Strd", "Ustrd"};

    /**
     * Field ustrd.
     */
    private java.lang.String[] ustrd;

    /**
     * Field strd.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.StructuredRemittanceInformation7[] strd;

    public RemittanceInformation5() {
        this(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RemittanceInformation5Cls.getInstance().getNullDefiningElementDecl());
    }

    public RemittanceInformation5(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public RemittanceInformation5(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public RemittanceInformation5(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RemittanceInformation5 clone) {
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
                addUstrd((java.lang.String) value);
                return;
            case 0:
                addStrd((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.StructuredRemittanceInformation7) value);
                return;
            default:
                super.addElement(name, value);
        }
    }

    /**
     * Adds a Strd (0..*).
     * 
     * @param value
     * @param value The new Strd.
     */
    public void addStrd(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.StructuredRemittanceInformation7 value) {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.StructuredRemittanceInformation7[] temp = this.strd;
        this.strd = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.StructuredRemittanceInformation7[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.strd, 0, temp.length);
        this.strd[this.strd.length-1] = value;
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "Strd");
    }

    /**
     * Adds a Ustrd (0..*).
     * 
     * @param value
     * @param value The new Ustrd.
     */
    public void addUstrd(java.lang.String value) {
        java.lang.String[] temp = this.ustrd;
        this.ustrd = new java.lang.String[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.ustrd, 0, temp.length);
        this.ustrd[this.ustrd.length-1] = value;
    }

    /**
     * Creates and returns a shallow clone of this object.
     * 
     * @see #cloneDeep()
     */
    public java.lang.Object clone() {
        return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RemittanceInformation5(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RemittanceInformation5(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RemittanceInformation5 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RemittanceInformation5) clone;
        obj.ustrd = (java.lang.String[]) biz.c24.io.api.Utils.cloneDeep(this.ustrd, obj, "Ustrd");
        obj.strd = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.StructuredRemittanceInformation7[]) biz.c24.io.api.Utils.cloneDeep(this.strd, obj, "Strd");
    }

    /**
     * Creates, adds and returns a new Strd (0..*).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.StructuredRemittanceInformation7 createStrd() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.StructuredRemittanceInformation7 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.StructuredRemittanceInformation7) getElementDecl("Strd").createObject();
        addStrd(obj);
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
     * The legal value(s) for <code>name</code> are: <b>ustrd,
     * strd</b>.
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
            if (this.ustrd == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.ustrd[index];
            case 0:
            if (this.strd == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.strd[index];
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
                return this.ustrd == null ? 0 : this.ustrd.length;
            case 0:
                return this.strd == null ? 0 : this.strd.length;
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
                return getUstrdIndex((java.lang.String) element);
            case 0:
                return getStrdIndex((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.StructuredRemittanceInformation7) element);
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>ustrd,
     * strd</b>.
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
            if (this.ustrd == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.ustrd[index];
            case 0:
            if (this.strd == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.strd[index];
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of Strd (0..*).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.StructuredRemittanceInformation7[] getStrd() {
        if (this.strd == null)
            return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.StructuredRemittanceInformation7[]{};
        else
            return this.strd;
    }

    /**
     * Gets the value of Strd by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.StructuredRemittanceInformation7 getStrd(int ordinal) {
        if (this.strd == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.strd.length) {
            return this.strd[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (0..*).
     * 
     * @param value
     * @param value The Strd to get the index of.
     * @return The index.
     */
    public int getStrdIndex(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.StructuredRemittanceInformation7 value) {
        if (this.strd == null)
            return -1;
        for (int i=0; i<this.strd.length; i++)
            if (this.strd[i] == value)
                return i;
        return -1;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.ustrd == null ? 0 : this.ustrd.length;
        count += this.strd == null ? 0 : this.strd.length;
        return count;
    }

    /**
     * Gets the value of Ustrd (0..*).
     * 
     * @return The value.
     */
    public java.lang.String[] getUstrd() {
        if (this.ustrd == null)
            return new java.lang.String[]{};
        else
            return this.ustrd;
    }

    /**
     * Gets the value of Ustrd by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public java.lang.String getUstrd(int ordinal) {
        if (this.ustrd == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.ustrd.length) {
            return this.ustrd[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (0..*).
     * 
     * @param value
     * @param value The Ustrd to get the index of.
     * @return The index.
     */
    public int getUstrdIndex(java.lang.String value) {
        if (this.ustrd == null)
            return -1;
        for (int i=0; i<this.ustrd.length; i++)
            if (this.ustrd[i] == value)
                return i;
        return -1;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(ustrd);
        result = 31 * result + hashCodeOf(strd);
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
                removeUstrd(index);
                return;
            case 0:
                removeStrd(index);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * Removes a Strd (0..*).
     * 
     * @param index
     * @param index The index of the Strd to get.
     */
    public void removeStrd(int index) {
        if (this.strd == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.StructuredRemittanceInformation7[] temp = this.strd;
        this.strd = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.StructuredRemittanceInformation7[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.strd, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.strd, index, temp.length-index-1);
        if (this.strd.length == 0)
            this.strd = null;
    }

    /**
     * Removes a Ustrd (0..*).
     * 
     * @param index
     * @param index The index of the Ustrd to get.
     */
    public void removeUstrd(int index) {
        if (this.ustrd == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        java.lang.String[] temp = this.ustrd;
        this.ustrd = new java.lang.String[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.ustrd, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.ustrd, index, temp.length-index-1);
        if (this.ustrd.length == 0)
            this.ustrd = null;
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
                if (value != null && value instanceof java.lang.String[]) {
                    setUstrd((java.lang.String[])value);
                } else if (this.ustrd == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.ustrd[index] = (java.lang.String) value;
                }
                return;
            case 0:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.StructuredRemittanceInformation7[]) {
                    setStrd((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.StructuredRemittanceInformation7[])value);
                } else if (this.strd == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.strd[index] = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.StructuredRemittanceInformation7) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.strd[index]).setParent(this, "Strd");
                }
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of Strd (0..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setStrd(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.StructuredRemittanceInformation7[] value) {
        this.strd = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.StructuredRemittanceInformation7[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.strd != null && i<this.strd.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.strd[i]).setParent(this, "Strd");
    }

    /**
     * [Virtual Element] Sets the value of Ustrd (0..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setUstrd(java.lang.String[] value) {
        this.ustrd = (java.lang.String[]) biz.c24.io.api.Utils.clearNulls(value);
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.ustrd);
        out.writeObject(this.strd);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.ustrd = (java.lang.String[]) in.readObject();
        this.strd = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.StructuredRemittanceInformation7[]) in.readObject();
    }

}
