/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * OrganisationIdentification4. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>BICOrBEI</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>Othr</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GenericOrganisationIdentification1}
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
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.OrganisationIdentification4Cls
 */
public class OrganisationIdentification4 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"BICOrBEI", "Othr"};

    /**
     * Field bICOrBEI.
     */
    private java.lang.String bICOrBEI;

    /**
     * Field othr.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GenericOrganisationIdentification1[] othr;

    public OrganisationIdentification4() {
        this(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.OrganisationIdentification4Cls.getInstance().getNullDefiningElementDecl());
    }

    public OrganisationIdentification4(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public OrganisationIdentification4(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public OrganisationIdentification4(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.OrganisationIdentification4 clone) {
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
                setBICOrBEI((java.lang.String) value);
                return;
            case 1:
                addOthr((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GenericOrganisationIdentification1) value);
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
    public void addOthr(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GenericOrganisationIdentification1 value) {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GenericOrganisationIdentification1[] temp = this.othr;
        this.othr = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GenericOrganisationIdentification1[temp == null ? 1 : (temp.length+1)];
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
        return new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.OrganisationIdentification4(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.OrganisationIdentification4(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.OrganisationIdentification4 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.OrganisationIdentification4) clone;
        obj.bICOrBEI = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.bICOrBEI, obj, "BICOrBEI");
        obj.othr = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GenericOrganisationIdentification1[]) biz.c24.io.api.Utils.cloneDeep(this.othr, obj, "Othr");
    }

    /**
     * Creates, adds and returns a new Othr (0..*).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GenericOrganisationIdentification1 createOthr() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GenericOrganisationIdentification1 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GenericOrganisationIdentification1) getElementDecl("Othr").createObject();
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
     * Gets the value of BICOrBEI (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getBICOrBEI() {
        return this.bICOrBEI;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>bICOrBEI,
     * othr</b>.
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
                return getBICOrBEI();
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
                return this.bICOrBEI == null ? 0 : 1;
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
                return this.bICOrBEI != null && this.bICOrBEI.equals(element) ? 0 : -1;
            case 1:
                return getOthrIndex((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GenericOrganisationIdentification1) element);
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of Othr (0..*).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GenericOrganisationIdentification1[] getOthr() {
        if (this.othr == null)
            return new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GenericOrganisationIdentification1[]{};
        else
            return this.othr;
    }

    /**
     * Gets the value of Othr by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GenericOrganisationIdentification1 getOthr(int ordinal) {
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
    public int getOthrIndex(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GenericOrganisationIdentification1 value) {
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
     * The legal value(s) for <code>name</code> are: <b>bICOrBEI,
     * othr</b>.
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
                return this.bICOrBEI;
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
        count += this.bICOrBEI == null ? 0 : 1;
        count += this.othr == null ? 0 : this.othr.length;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(bICOrBEI);
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
                setBICOrBEI(null);
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
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GenericOrganisationIdentification1[] temp = this.othr;
        this.othr = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GenericOrganisationIdentification1[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.othr, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.othr, index, temp.length-index-1);
        if (this.othr.length == 0)
            this.othr = null;
    }

    /**
     * [Virtual Element] Sets the value of BICOrBEI (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setBICOrBEI(java.lang.String value) {
        this.bICOrBEI = value;
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
                setBICOrBEI((java.lang.String) value);
                return;
            case 1:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GenericOrganisationIdentification1[]) {
                    setOthr((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GenericOrganisationIdentification1[])value);
                } else if (this.othr == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.othr[index] = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GenericOrganisationIdentification1) value;
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
    public void setOthr(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GenericOrganisationIdentification1[] value) {
        this.othr = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GenericOrganisationIdentification1[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.othr != null && i<this.othr.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.othr[i]).setParent(this, "Othr");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.bICOrBEI);
        out.writeObject(this.othr);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.bICOrBEI = (java.lang.String) in.readObject();
        this.othr = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GenericOrganisationIdentification1[]) in.readObject();
    }

}
