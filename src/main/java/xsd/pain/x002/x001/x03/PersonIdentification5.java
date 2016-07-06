/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * PersonIdentification5. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>DtAndPlcOfBirth</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.DateAndPlaceOfBirth}
 * (0..1)</li>
 * <li><b>Othr</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.GenericPersonIdentification1}
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
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PersonIdentification5Cls
 */
public class PersonIdentification5 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"DtAndPlcOfBirth", "Othr"};

    /**
     * Field dtAndPlcOfBirth.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.DateAndPlaceOfBirth dtAndPlcOfBirth;

    /**
     * Field othr.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.GenericPersonIdentification1[] othr;

    public PersonIdentification5() {
        this(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PersonIdentification5Cls.getInstance().getNullDefiningElementDecl());
    }

    public PersonIdentification5(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public PersonIdentification5(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public PersonIdentification5(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PersonIdentification5 clone) {
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
                setDtAndPlcOfBirth((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.DateAndPlaceOfBirth) value);
                return;
            case 1:
                addOthr((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.GenericPersonIdentification1) value);
                return;
            default:
                super.addElement(name, value);
        }
    }

    /**
     * Adds a Othr (0..*).
     * 
     * @param value
     * @param value The new Othr.
     */
    public void addOthr(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.GenericPersonIdentification1 value) {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.GenericPersonIdentification1[] temp = this.othr;
        this.othr = new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.GenericPersonIdentification1[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.othr, 0, temp.length);
        this.othr[this.othr.length-1] = value;
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "Othr");
    }

    /**
     * Creates and returns a shallow clone of this object.
     * 
     * @see #cloneDeep()
     */
    public java.lang.Object clone() {
        return new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PersonIdentification5(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PersonIdentification5(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PersonIdentification5 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PersonIdentification5) clone;
        obj.dtAndPlcOfBirth = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.DateAndPlaceOfBirth) biz.c24.io.api.Utils.cloneDeep(this.dtAndPlcOfBirth, obj, "DtAndPlcOfBirth");
        obj.othr = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.GenericPersonIdentification1[]) biz.c24.io.api.Utils.cloneDeep(this.othr, obj, "Othr");
    }

    /**
     * Creates, adds and returns a new DtAndPlcOfBirth (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.DateAndPlaceOfBirth createDtAndPlcOfBirth() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.DateAndPlaceOfBirth obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.DateAndPlaceOfBirth) getElementDecl("DtAndPlcOfBirth").createObject();
        setDtAndPlcOfBirth(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Othr (0..*).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.GenericPersonIdentification1 createOthr() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.GenericPersonIdentification1 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.GenericPersonIdentification1) getElementDecl("Othr").createObject();
        addOthr(obj);
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
     * Gets the value of DtAndPlcOfBirth (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.DateAndPlaceOfBirth getDtAndPlcOfBirth() {
        return this.dtAndPlcOfBirth;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are:
     * <b>dtAndPlcOfBirth, othr</b>.
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
                return getDtAndPlcOfBirth();
            case 1:
            if (this.othr == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.othr[index];
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
                return this.dtAndPlcOfBirth == null ? 0 : 1;
            case 1:
                return this.othr == null ? 0 : this.othr.length;
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
                return this.dtAndPlcOfBirth != null && this.dtAndPlcOfBirth.equals(element) ? 0 : -1;
            case 1:
                return getOthrIndex((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.GenericPersonIdentification1) element);
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of Othr (0..*).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.GenericPersonIdentification1[] getOthr() {
        if (this.othr == null)
            return new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.GenericPersonIdentification1[]{};
        else
            return this.othr;
    }

    /**
     * Gets the value of Othr by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.GenericPersonIdentification1 getOthr(int ordinal) {
        if (this.othr == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.othr.length) {
            return this.othr[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (0..*).
     * 
     * @param value
     * @param value The Othr to get the index of.
     * @return The index.
     */
    public int getOthrIndex(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.GenericPersonIdentification1 value) {
        if (this.othr == null)
            return -1;
        for (int i=0; i<this.othr.length; i++)
            if (this.othr[i] == value)
                return i;
        return -1;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are:
     * <b>dtAndPlcOfBirth, othr</b>.
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
                return this.dtAndPlcOfBirth;
            case 1:
            if (this.othr == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.othr[index];
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.dtAndPlcOfBirth == null ? 0 : 1;
        count += this.othr == null ? 0 : this.othr.length;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(dtAndPlcOfBirth);
        result = 31 * result + hashCodeOf(othr);
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
                setDtAndPlcOfBirth(null);
                return;
            case 1:
                removeOthr(index);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * Removes a Othr (0..*).
     * 
     * @param index
     * @param index The index of the Othr to get.
     */
    public void removeOthr(int index) {
        if (this.othr == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.GenericPersonIdentification1[] temp = this.othr;
        this.othr = new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.GenericPersonIdentification1[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.othr, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.othr, index, temp.length-index-1);
        if (this.othr.length == 0)
            this.othr = null;
    }

    /**
     * [Virtual Element] Sets the value of DtAndPlcOfBirth (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setDtAndPlcOfBirth(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.DateAndPlaceOfBirth value) {
        this.dtAndPlcOfBirth = value;
        if (this.dtAndPlcOfBirth != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.dtAndPlcOfBirth).setParent(this, "DtAndPlcOfBirth");
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
                setDtAndPlcOfBirth((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.DateAndPlaceOfBirth) value);
                return;
            case 1:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.GenericPersonIdentification1[]) {
                    setOthr((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.GenericPersonIdentification1[])value);
                } else if (this.othr == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.othr[index] = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.GenericPersonIdentification1) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.othr[index]).setParent(this, "Othr");
                }
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of Othr (0..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setOthr(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.GenericPersonIdentification1[] value) {
        this.othr = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.GenericPersonIdentification1[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.othr != null && i<this.othr.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.othr[i]).setParent(this, "Othr");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.dtAndPlcOfBirth);
        out.writeObject(this.othr);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.dtAndPlcOfBirth = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.DateAndPlaceOfBirth) in.readObject();
        this.othr = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.GenericPersonIdentification1[]) in.readObject();
    }

}
