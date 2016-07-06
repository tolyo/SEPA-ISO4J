/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * ClearingSystemMemberIdentification2. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>ClrSysId</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ClearingSystemIdentification2Choice}
 * (0..1)</li>
 * <li><b>MmbId</b> of type {@link java.lang.String} (1)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ClearingSystemMemberIdentification2Cls
 */
public class ClearingSystemMemberIdentification2 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"ClrSysId", "MmbId"};

    /**
     * Field clrSysId.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ClearingSystemIdentification2Choice clrSysId;

    /**
     * Field mmbId.
     */
    private java.lang.String mmbId;

    public ClearingSystemMemberIdentification2() {
        this(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ClearingSystemMemberIdentification2Cls.getInstance().getNullDefiningElementDecl());
    }

    public ClearingSystemMemberIdentification2(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public ClearingSystemMemberIdentification2(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public ClearingSystemMemberIdentification2(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ClearingSystemMemberIdentification2 clone) {
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
                setClrSysId((iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ClearingSystemIdentification2Choice) value);
                return;
            case 1:
                setMmbId((java.lang.String) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ClearingSystemMemberIdentification2(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ClearingSystemMemberIdentification2(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ClearingSystemMemberIdentification2 obj = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ClearingSystemMemberIdentification2) clone;
        obj.clrSysId = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ClearingSystemIdentification2Choice) biz.c24.io.api.Utils.cloneDeep(this.clrSysId, obj, "ClrSysId");
        obj.mmbId = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.mmbId, obj, "MmbId");
    }

    /**
     * Creates, adds and returns a new ClrSysId (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ClearingSystemIdentification2Choice createClrSysId() {
        iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ClearingSystemIdentification2Choice obj = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ClearingSystemIdentification2Choice) getElementDecl("ClrSysId").createObject();
        setClrSysId(obj);
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
     * Gets the value of ClrSysId (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ClearingSystemIdentification2Choice getClrSysId() {
        return this.clrSysId;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>clrSysId,
     * mmbId</b>.
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
                return getClrSysId();
            case 1:
                return getMmbId();
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
                return this.clrSysId == null ? 0 : 1;
            case 1:
                return this.mmbId == null ? 0 : 1;
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
                return this.clrSysId != null && this.clrSysId.equals(element) ? 0 : -1;
            case 1:
                return this.mmbId != null && this.mmbId.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of MmbId (1).
     * 
     * @return The value.
     */
    public java.lang.String getMmbId() {
        return this.mmbId;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>clrSysId,
     * mmbId</b>.
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
                return this.clrSysId;
            case 1:
                return this.mmbId;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.clrSysId == null ? 0 : 1;
        count += this.mmbId == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(clrSysId);
        result = 31 * result + hashCodeOf(mmbId);
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
                setClrSysId(null);
                return;
            case 1:
                setMmbId(null);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of ClrSysId (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setClrSysId(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ClearingSystemIdentification2Choice value) {
        this.clrSysId = value;
        if (this.clrSysId != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.clrSysId).setParent(this, "ClrSysId");
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
                setClrSysId((iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ClearingSystemIdentification2Choice) value);
                return;
            case 1:
                setMmbId((java.lang.String) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of MmbId (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setMmbId(java.lang.String value) {
        this.mmbId = value;
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.clrSysId);
        out.writeObject(this.mmbId);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.clrSysId = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ClearingSystemIdentification2Choice) in.readObject();
        this.mmbId = (java.lang.String) in.readObject();
    }

}
