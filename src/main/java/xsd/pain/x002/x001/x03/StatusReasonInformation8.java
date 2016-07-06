/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * StatusReasonInformation8. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>Orgtr</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32}
 * (0..1)</li>
 * <li><b>Rsn</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReason6Choice}
 * (0..1)</li>
 * <li><b>AddtlInf</b> of type {@link java.lang.String} (0..*)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8Cls
 */
public class StatusReasonInformation8 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"AddtlInf", "Orgtr", "Rsn"};

    /**
     * Field orgtr.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 orgtr;

    /**
     * Field rsn.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReason6Choice rsn;

    /**
     * Field addtlInf.
     */
    private java.lang.String[] addtlInf;

    public StatusReasonInformation8() {
        this(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8Cls.getInstance().getNullDefiningElementDecl());
    }

    public StatusReasonInformation8(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public StatusReasonInformation8(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public StatusReasonInformation8(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8 clone) {
        super(clone);
    }

    /**
     * Adds a AddtlInf (0..*).
     * 
     * @param value
     * @param value The new AddtlInf.
     */
    public void addAddtlInf(java.lang.String value) {
        java.lang.String[] temp = this.addtlInf;
        this.addtlInf = new java.lang.String[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.addtlInf, 0, temp.length);
        this.addtlInf[this.addtlInf.length-1] = value;
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
                setOrgtr((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) value);
                return;
            case 2:
                setRsn((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReason6Choice) value);
                return;
            case 0:
                addAddtlInf((java.lang.String) value);
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
        return new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8) clone;
        obj.orgtr = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) biz.c24.io.api.Utils.cloneDeep(this.orgtr, obj, "Orgtr");
        obj.rsn = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReason6Choice) biz.c24.io.api.Utils.cloneDeep(this.rsn, obj, "Rsn");
        obj.addtlInf = (java.lang.String[]) biz.c24.io.api.Utils.cloneDeep(this.addtlInf, obj, "AddtlInf");
    }

    /**
     * Creates, adds and returns a new Orgtr (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 createOrgtr() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) getElementDecl("Orgtr").createObject();
        setOrgtr(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Rsn (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReason6Choice createRsn() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReason6Choice obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReason6Choice) getElementDecl("Rsn").createObject();
        setRsn(obj);
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
     * Gets the value of AddtlInf (0..*).
     * 
     * @return The value.
     */
    public java.lang.String[] getAddtlInf() {
        if (this.addtlInf == null)
            return new java.lang.String[]{};
        else
            return this.addtlInf;
    }

    /**
     * Gets the value of AddtlInf by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public java.lang.String getAddtlInf(int ordinal) {
        if (this.addtlInf == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.addtlInf.length) {
            return this.addtlInf[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (0..*).
     * 
     * @param value
     * @param value The AddtlInf to get the index of.
     * @return The index.
     */
    public int getAddtlInfIndex(java.lang.String value) {
        if (this.addtlInf == null)
            return -1;
        for (int i=0; i<this.addtlInf.length; i++)
            if (this.addtlInf[i] == value)
                return i;
        return -1;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>orgtr, rsn,
     * addtlInf</b>.
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
                return getOrgtr();
            case 2:
                return getRsn();
            case 0:
            if (this.addtlInf == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.addtlInf[index];
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
                return this.orgtr == null ? 0 : 1;
            case 2:
                return this.rsn == null ? 0 : 1;
            case 0:
                return this.addtlInf == null ? 0 : this.addtlInf.length;
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
                return this.orgtr != null && this.orgtr.equals(element) ? 0 : -1;
            case 2:
                return this.rsn != null && this.rsn.equals(element) ? 0 : -1;
            case 0:
                return getAddtlInfIndex((java.lang.String) element);
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of Orgtr (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 getOrgtr() {
        return this.orgtr;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>orgtr, rsn,
     * addtlInf</b>.
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
                return this.orgtr;
            case 2:
                return this.rsn;
            case 0:
            if (this.addtlInf == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.addtlInf[index];
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of Rsn (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReason6Choice getRsn() {
        return this.rsn;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.orgtr == null ? 0 : 1;
        count += this.rsn == null ? 0 : 1;
        count += this.addtlInf == null ? 0 : this.addtlInf.length;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(orgtr);
        result = 31 * result + hashCodeOf(rsn);
        result = 31 * result + hashCodeOf(addtlInf);
        return result;
    }

    /**
     * Removes a AddtlInf (0..*).
     * 
     * @param index
     * @param index The index of the AddtlInf to get.
     */
    public void removeAddtlInf(int index) {
        if (this.addtlInf == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        java.lang.String[] temp = this.addtlInf;
        this.addtlInf = new java.lang.String[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.addtlInf, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.addtlInf, index, temp.length-index-1);
        if (this.addtlInf.length == 0)
            this.addtlInf = null;
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
                setOrgtr(null);
                return;
            case 2:
                setRsn(null);
                return;
            case 0:
                removeAddtlInf(index);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of AddtlInf (0..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAddtlInf(java.lang.String[] value) {
        this.addtlInf = (java.lang.String[]) biz.c24.io.api.Utils.clearNulls(value);
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
                setOrgtr((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) value);
                return;
            case 2:
                setRsn((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReason6Choice) value);
                return;
            case 0:
                if (value != null && value instanceof java.lang.String[]) {
                    setAddtlInf((java.lang.String[])value);
                } else if (this.addtlInf == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.addtlInf[index] = (java.lang.String) value;
                }
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of Orgtr (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setOrgtr(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 value) {
        this.orgtr = value;
        if (this.orgtr != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.orgtr).setParent(this, "Orgtr");
    }

    /**
     * [Virtual Element] Sets the value of Rsn (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setRsn(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReason6Choice value) {
        this.rsn = value;
        if (this.rsn != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.rsn).setParent(this, "Rsn");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.orgtr);
        out.writeObject(this.rsn);
        out.writeObject(this.addtlInf);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.orgtr = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) in.readObject();
        this.rsn = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReason6Choice) in.readObject();
        this.addtlInf = (java.lang.String[]) in.readObject();
    }

}
