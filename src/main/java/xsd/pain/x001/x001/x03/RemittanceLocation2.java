/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * RemittanceLocation2. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>RmtId</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>RmtLctnMtd</b> of type {@link java.lang.String}
 * (0..1)</li>
 * <li><b>RmtLctnElctrncAdr</b> of type {@link java.lang.String}
 * (0..1)</li>
 * <li><b>RmtLctnPstlAdr</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.NameAndAddress10}
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
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceLocation2Cls
 */
public class RemittanceLocation2 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"RmtId", "RmtLctnElctrncAdr", "RmtLctnMtd", "RmtLctnPstlAdr"};

    /**
     * Field rmtId.
     */
    private java.lang.String rmtId;

    /**
     * Field rmtLctnMtd.
     */
    private java.lang.String rmtLctnMtd;

    /**
     * Field rmtLctnElctrncAdr.
     */
    private java.lang.String rmtLctnElctrncAdr;

    /**
     * Field rmtLctnPstlAdr.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.NameAndAddress10 rmtLctnPstlAdr;

    public RemittanceLocation2() {
        this(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceLocation2Cls.getInstance().getNullDefiningElementDecl());
    }

    public RemittanceLocation2(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public RemittanceLocation2(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public RemittanceLocation2(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceLocation2 clone) {
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
                setRmtId((java.lang.String) value);
                return;
            case 2:
                setRmtLctnMtd((java.lang.String) value);
                return;
            case 1:
                setRmtLctnElctrncAdr((java.lang.String) value);
                return;
            case 3:
                setRmtLctnPstlAdr((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.NameAndAddress10) value);
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
        return new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceLocation2(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceLocation2(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceLocation2 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceLocation2) clone;
        obj.rmtId = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.rmtId, obj, "RmtId");
        obj.rmtLctnMtd = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.rmtLctnMtd, obj, "RmtLctnMtd");
        obj.rmtLctnElctrncAdr = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.rmtLctnElctrncAdr, obj, "RmtLctnElctrncAdr");
        obj.rmtLctnPstlAdr = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.NameAndAddress10) biz.c24.io.api.Utils.cloneDeep(this.rmtLctnPstlAdr, obj, "RmtLctnPstlAdr");
    }

    /**
     * Creates, adds and returns a new RmtLctnPstlAdr (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.NameAndAddress10 createRmtLctnPstlAdr() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.NameAndAddress10 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.NameAndAddress10) getElementDecl("RmtLctnPstlAdr").createObject();
        setRmtLctnPstlAdr(obj);
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
     * The legal value(s) for <code>name</code> are: <b>rmtId,
     * rmtLctnMtd, rmtLctnElctrncAdr, rmtLctnPstlAdr</b>.
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
                return getRmtId();
            case 2:
                return getRmtLctnMtd();
            case 1:
                return getRmtLctnElctrncAdr();
            case 3:
                return getRmtLctnPstlAdr();
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
                return this.rmtId == null ? 0 : 1;
            case 2:
                return this.rmtLctnMtd == null ? 0 : 1;
            case 1:
                return this.rmtLctnElctrncAdr == null ? 0 : 1;
            case 3:
                return this.rmtLctnPstlAdr == null ? 0 : 1;
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
                return this.rmtId != null && this.rmtId.equals(element) ? 0 : -1;
            case 2:
                return this.rmtLctnMtd != null && this.rmtLctnMtd.equals(element) ? 0 : -1;
            case 1:
                return this.rmtLctnElctrncAdr != null && this.rmtLctnElctrncAdr.equals(element) ? 0 : -1;
            case 3:
                return this.rmtLctnPstlAdr != null && this.rmtLctnPstlAdr.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>rmtId,
     * rmtLctnMtd, rmtLctnElctrncAdr, rmtLctnPstlAdr</b>.
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
                return this.rmtId;
            case 2:
                return this.rmtLctnMtd;
            case 1:
                return this.rmtLctnElctrncAdr;
            case 3:
                return this.rmtLctnPstlAdr;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of RmtId (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getRmtId() {
        return this.rmtId;
    }

    /**
     * Gets the value of RmtLctnElctrncAdr (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getRmtLctnElctrncAdr() {
        return this.rmtLctnElctrncAdr;
    }

    /**
     * Gets the value of RmtLctnMtd (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getRmtLctnMtd() {
        return this.rmtLctnMtd;
    }

    /**
     * Gets the value of RmtLctnPstlAdr (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.NameAndAddress10 getRmtLctnPstlAdr() {
        return this.rmtLctnPstlAdr;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.rmtId == null ? 0 : 1;
        count += this.rmtLctnMtd == null ? 0 : 1;
        count += this.rmtLctnElctrncAdr == null ? 0 : 1;
        count += this.rmtLctnPstlAdr == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(rmtId);
        result = 31 * result + hashCodeOf(rmtLctnMtd);
        result = 31 * result + hashCodeOf(rmtLctnElctrncAdr);
        result = 31 * result + hashCodeOf(rmtLctnPstlAdr);
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
                setRmtId(null);
                return;
            case 2:
                setRmtLctnMtd(null);
                return;
            case 1:
                setRmtLctnElctrncAdr(null);
                return;
            case 3:
                setRmtLctnPstlAdr(null);
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
                setRmtId((java.lang.String) value);
                return;
            case 2:
                setRmtLctnMtd((java.lang.String) value);
                return;
            case 1:
                setRmtLctnElctrncAdr((java.lang.String) value);
                return;
            case 3:
                setRmtLctnPstlAdr((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.NameAndAddress10) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of RmtId (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setRmtId(java.lang.String value) {
        this.rmtId = value;
    }

    /**
     * [Virtual Element] Sets the value of RmtLctnElctrncAdr
     * (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setRmtLctnElctrncAdr(java.lang.String value) {
        this.rmtLctnElctrncAdr = value;
    }

    /**
     * [Virtual Element] Sets the value of RmtLctnMtd (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setRmtLctnMtd(java.lang.String value) {
        this.rmtLctnMtd = value;
    }

    /**
     * [Virtual Element] Sets the value of RmtLctnPstlAdr (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setRmtLctnPstlAdr(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.NameAndAddress10 value) {
        this.rmtLctnPstlAdr = value;
        if (this.rmtLctnPstlAdr != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.rmtLctnPstlAdr).setParent(this, "RmtLctnPstlAdr");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.rmtId);
        out.writeObject(this.rmtLctnMtd);
        out.writeObject(this.rmtLctnElctrncAdr);
        out.writeObject(this.rmtLctnPstlAdr);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.rmtId = (java.lang.String) in.readObject();
        this.rmtLctnMtd = (java.lang.String) in.readObject();
        this.rmtLctnElctrncAdr = (java.lang.String) in.readObject();
        this.rmtLctnPstlAdr = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.NameAndAddress10) in.readObject();
    }

}
