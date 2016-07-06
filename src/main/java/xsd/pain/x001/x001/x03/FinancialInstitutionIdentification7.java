/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * FinancialInstitutionIdentification7. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>BIC</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>ClrSysMmbId</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ClearingSystemMemberIdentification2}
 * (0..1)</li>
 * <li><b>Nm</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>PstlAdr</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PostalAddress6}
 * (0..1)</li>
 * <li><b>Othr</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GenericFinancialIdentification1}
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
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.FinancialInstitutionIdentification7Cls
 */
public class FinancialInstitutionIdentification7 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"BIC", "ClrSysMmbId", "Nm", "Othr", "PstlAdr"};

    /**
     * Field bIC.
     */
    private java.lang.String bIC;

    /**
     * Field clrSysMmbId.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ClearingSystemMemberIdentification2 clrSysMmbId;

    /**
     * Field nm.
     */
    private java.lang.String nm;

    /**
     * Field pstlAdr.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PostalAddress6 pstlAdr;

    /**
     * Field othr.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GenericFinancialIdentification1 othr;

    public FinancialInstitutionIdentification7() {
        this(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.FinancialInstitutionIdentification7Cls.getInstance().getNullDefiningElementDecl());
    }

    public FinancialInstitutionIdentification7(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public FinancialInstitutionIdentification7(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public FinancialInstitutionIdentification7(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.FinancialInstitutionIdentification7 clone) {
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
                setBIC((java.lang.String) value);
                return;
            case 1:
                setClrSysMmbId((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ClearingSystemMemberIdentification2) value);
                return;
            case 2:
                setNm((java.lang.String) value);
                return;
            case 4:
                setPstlAdr((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PostalAddress6) value);
                return;
            case 3:
                setOthr((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GenericFinancialIdentification1) value);
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
        return new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.FinancialInstitutionIdentification7(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.FinancialInstitutionIdentification7(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.FinancialInstitutionIdentification7 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.FinancialInstitutionIdentification7) clone;
        obj.bIC = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.bIC, obj, "BIC");
        obj.clrSysMmbId = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ClearingSystemMemberIdentification2) biz.c24.io.api.Utils.cloneDeep(this.clrSysMmbId, obj, "ClrSysMmbId");
        obj.nm = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.nm, obj, "Nm");
        obj.pstlAdr = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PostalAddress6) biz.c24.io.api.Utils.cloneDeep(this.pstlAdr, obj, "PstlAdr");
        obj.othr = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GenericFinancialIdentification1) biz.c24.io.api.Utils.cloneDeep(this.othr, obj, "Othr");
    }

    /**
     * Creates, adds and returns a new ClrSysMmbId (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ClearingSystemMemberIdentification2 createClrSysMmbId() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ClearingSystemMemberIdentification2 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ClearingSystemMemberIdentification2) getElementDecl("ClrSysMmbId").createObject();
        setClrSysMmbId(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Othr (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GenericFinancialIdentification1 createOthr() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GenericFinancialIdentification1 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GenericFinancialIdentification1) getElementDecl("Othr").createObject();
        setOthr(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new PstlAdr (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PostalAddress6 createPstlAdr() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PostalAddress6 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PostalAddress6) getElementDecl("PstlAdr").createObject();
        setPstlAdr(obj);
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
     * Gets the value of BIC (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getBIC() {
        return this.bIC;
    }

    /**
     * Gets the value of ClrSysMmbId (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ClearingSystemMemberIdentification2 getClrSysMmbId() {
        return this.clrSysMmbId;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>bIC,
     * clrSysMmbId, nm, pstlAdr, othr</b>.
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
                return getBIC();
            case 1:
                return getClrSysMmbId();
            case 2:
                return getNm();
            case 4:
                return getPstlAdr();
            case 3:
                return getOthr();
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
                return this.bIC == null ? 0 : 1;
            case 1:
                return this.clrSysMmbId == null ? 0 : 1;
            case 2:
                return this.nm == null ? 0 : 1;
            case 4:
                return this.pstlAdr == null ? 0 : 1;
            case 3:
                return this.othr == null ? 0 : 1;
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
                return this.bIC != null && this.bIC.equals(element) ? 0 : -1;
            case 1:
                return this.clrSysMmbId != null && this.clrSysMmbId.equals(element) ? 0 : -1;
            case 2:
                return this.nm != null && this.nm.equals(element) ? 0 : -1;
            case 4:
                return this.pstlAdr != null && this.pstlAdr.equals(element) ? 0 : -1;
            case 3:
                return this.othr != null && this.othr.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of Nm (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getNm() {
        return this.nm;
    }

    /**
     * Gets the value of Othr (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GenericFinancialIdentification1 getOthr() {
        return this.othr;
    }

    /**
     * Gets the value of PstlAdr (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PostalAddress6 getPstlAdr() {
        return this.pstlAdr;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>bIC,
     * clrSysMmbId, nm, pstlAdr, othr</b>.
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
                return this.bIC;
            case 1:
                return this.clrSysMmbId;
            case 2:
                return this.nm;
            case 4:
                return this.pstlAdr;
            case 3:
                return this.othr;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.bIC == null ? 0 : 1;
        count += this.clrSysMmbId == null ? 0 : 1;
        count += this.nm == null ? 0 : 1;
        count += this.pstlAdr == null ? 0 : 1;
        count += this.othr == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(bIC);
        result = 31 * result + hashCodeOf(clrSysMmbId);
        result = 31 * result + hashCodeOf(nm);
        result = 31 * result + hashCodeOf(pstlAdr);
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
                setBIC(null);
                return;
            case 1:
                setClrSysMmbId(null);
                return;
            case 2:
                setNm(null);
                return;
            case 4:
                setPstlAdr(null);
                return;
            case 3:
                setOthr(null);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of BIC (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setBIC(java.lang.String value) {
        this.bIC = value;
    }

    /**
     * [Virtual Element] Sets the value of ClrSysMmbId (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setClrSysMmbId(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ClearingSystemMemberIdentification2 value) {
        this.clrSysMmbId = value;
        if (this.clrSysMmbId != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.clrSysMmbId).setParent(this, "ClrSysMmbId");
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
                setBIC((java.lang.String) value);
                return;
            case 1:
                setClrSysMmbId((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ClearingSystemMemberIdentification2) value);
                return;
            case 2:
                setNm((java.lang.String) value);
                return;
            case 4:
                setPstlAdr((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PostalAddress6) value);
                return;
            case 3:
                setOthr((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GenericFinancialIdentification1) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of Nm (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setNm(java.lang.String value) {
        this.nm = value;
    }

    /**
     * [Virtual Element] Sets the value of Othr (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setOthr(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GenericFinancialIdentification1 value) {
        this.othr = value;
        if (this.othr != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.othr).setParent(this, "Othr");
    }

    /**
     * [Virtual Element] Sets the value of PstlAdr (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setPstlAdr(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PostalAddress6 value) {
        this.pstlAdr = value;
        if (this.pstlAdr != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.pstlAdr).setParent(this, "PstlAdr");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.bIC);
        out.writeObject(this.clrSysMmbId);
        out.writeObject(this.nm);
        out.writeObject(this.pstlAdr);
        out.writeObject(this.othr);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.bIC = (java.lang.String) in.readObject();
        this.clrSysMmbId = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ClearingSystemMemberIdentification2) in.readObject();
        this.nm = (java.lang.String) in.readObject();
        this.pstlAdr = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PostalAddress6) in.readObject();
        this.othr = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GenericFinancialIdentification1) in.readObject();
    }

}
