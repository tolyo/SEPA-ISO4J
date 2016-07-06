/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * ContactDetails2. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>NmPrfx</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>Nm</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>PhneNb</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>MobNb</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>FaxNb</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>EmailAdr</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>Othr</b> of type {@link java.lang.String} (0..1)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ContactDetails2Cls
 */
public class ContactDetails2 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"EmailAdr", "FaxNb", "MobNb", "Nm", "NmPrfx", "Othr", "PhneNb"};

    /**
     * Field nmPrfx.
     */
    private java.lang.String nmPrfx;

    /**
     * Field nm.
     */
    private java.lang.String nm;

    /**
     * Field phneNb.
     */
    private java.lang.String phneNb;

    /**
     * Field mobNb.
     */
    private java.lang.String mobNb;

    /**
     * Field faxNb.
     */
    private java.lang.String faxNb;

    /**
     * Field emailAdr.
     */
    private java.lang.String emailAdr;

    /**
     * Field othr.
     */
    private java.lang.String othr;

    public ContactDetails2() {
        this(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ContactDetails2Cls.getInstance().getNullDefiningElementDecl());
    }

    public ContactDetails2(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public ContactDetails2(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public ContactDetails2(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ContactDetails2 clone) {
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
            case 4:
                setNmPrfx((java.lang.String) value);
                return;
            case 3:
                setNm((java.lang.String) value);
                return;
            case 6:
                setPhneNb((java.lang.String) value);
                return;
            case 2:
                setMobNb((java.lang.String) value);
                return;
            case 1:
                setFaxNb((java.lang.String) value);
                return;
            case 0:
                setEmailAdr((java.lang.String) value);
                return;
            case 5:
                setOthr((java.lang.String) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ContactDetails2(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ContactDetails2(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ContactDetails2 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ContactDetails2) clone;
        obj.nmPrfx = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.nmPrfx, obj, "NmPrfx");
        obj.nm = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.nm, obj, "Nm");
        obj.phneNb = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.phneNb, obj, "PhneNb");
        obj.mobNb = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.mobNb, obj, "MobNb");
        obj.faxNb = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.faxNb, obj, "FaxNb");
        obj.emailAdr = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.emailAdr, obj, "EmailAdr");
        obj.othr = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.othr, obj, "Othr");
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
     * The legal value(s) for <code>name</code> are: <b>nmPrfx, nm,
     * phneNb, mobNb, faxNb, emailAdr, othr</b>.
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
            case 4:
                return getNmPrfx();
            case 3:
                return getNm();
            case 6:
                return getPhneNb();
            case 2:
                return getMobNb();
            case 1:
                return getFaxNb();
            case 0:
                return getEmailAdr();
            case 5:
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
            case 4:
                return this.nmPrfx == null ? 0 : 1;
            case 3:
                return this.nm == null ? 0 : 1;
            case 6:
                return this.phneNb == null ? 0 : 1;
            case 2:
                return this.mobNb == null ? 0 : 1;
            case 1:
                return this.faxNb == null ? 0 : 1;
            case 0:
                return this.emailAdr == null ? 0 : 1;
            case 5:
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
            case 4:
                return this.nmPrfx != null && this.nmPrfx.equals(element) ? 0 : -1;
            case 3:
                return this.nm != null && this.nm.equals(element) ? 0 : -1;
            case 6:
                return this.phneNb != null && this.phneNb.equals(element) ? 0 : -1;
            case 2:
                return this.mobNb != null && this.mobNb.equals(element) ? 0 : -1;
            case 1:
                return this.faxNb != null && this.faxNb.equals(element) ? 0 : -1;
            case 0:
                return this.emailAdr != null && this.emailAdr.equals(element) ? 0 : -1;
            case 5:
                return this.othr != null && this.othr.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of EmailAdr (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getEmailAdr() {
        return this.emailAdr;
    }

    /**
     * Gets the value of FaxNb (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getFaxNb() {
        return this.faxNb;
    }

    /**
     * Gets the value of MobNb (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getMobNb() {
        return this.mobNb;
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
     * Gets the value of NmPrfx (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getNmPrfx() {
        return this.nmPrfx;
    }

    /**
     * Gets the value of Othr (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getOthr() {
        return this.othr;
    }

    /**
     * Gets the value of PhneNb (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getPhneNb() {
        return this.phneNb;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>nmPrfx, nm,
     * phneNb, mobNb, faxNb, emailAdr, othr</b>.
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
            case 4:
                return this.nmPrfx;
            case 3:
                return this.nm;
            case 6:
                return this.phneNb;
            case 2:
                return this.mobNb;
            case 1:
                return this.faxNb;
            case 0:
                return this.emailAdr;
            case 5:
                return this.othr;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.nmPrfx == null ? 0 : 1;
        count += this.nm == null ? 0 : 1;
        count += this.phneNb == null ? 0 : 1;
        count += this.mobNb == null ? 0 : 1;
        count += this.faxNb == null ? 0 : 1;
        count += this.emailAdr == null ? 0 : 1;
        count += this.othr == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(nmPrfx);
        result = 31 * result + hashCodeOf(nm);
        result = 31 * result + hashCodeOf(phneNb);
        result = 31 * result + hashCodeOf(mobNb);
        result = 31 * result + hashCodeOf(faxNb);
        result = 31 * result + hashCodeOf(emailAdr);
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
            case 4:
                setNmPrfx(null);
                return;
            case 3:
                setNm(null);
                return;
            case 6:
                setPhneNb(null);
                return;
            case 2:
                setMobNb(null);
                return;
            case 1:
                setFaxNb(null);
                return;
            case 0:
                setEmailAdr(null);
                return;
            case 5:
                setOthr(null);
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
            case 4:
                setNmPrfx((java.lang.String) value);
                return;
            case 3:
                setNm((java.lang.String) value);
                return;
            case 6:
                setPhneNb((java.lang.String) value);
                return;
            case 2:
                setMobNb((java.lang.String) value);
                return;
            case 1:
                setFaxNb((java.lang.String) value);
                return;
            case 0:
                setEmailAdr((java.lang.String) value);
                return;
            case 5:
                setOthr((java.lang.String) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of EmailAdr (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setEmailAdr(java.lang.String value) {
        this.emailAdr = value;
    }

    /**
     * [Virtual Element] Sets the value of FaxNb (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setFaxNb(java.lang.String value) {
        this.faxNb = value;
    }

    /**
     * [Virtual Element] Sets the value of MobNb (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setMobNb(java.lang.String value) {
        this.mobNb = value;
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
     * [Virtual Element] Sets the value of NmPrfx (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setNmPrfx(java.lang.String value) {
        this.nmPrfx = value;
    }

    /**
     * [Virtual Element] Sets the value of Othr (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setOthr(java.lang.String value) {
        this.othr = value;
    }

    /**
     * [Virtual Element] Sets the value of PhneNb (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setPhneNb(java.lang.String value) {
        this.phneNb = value;
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.nmPrfx);
        out.writeObject(this.nm);
        out.writeObject(this.phneNb);
        out.writeObject(this.mobNb);
        out.writeObject(this.faxNb);
        out.writeObject(this.emailAdr);
        out.writeObject(this.othr);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.nmPrfx = (java.lang.String) in.readObject();
        this.nm = (java.lang.String) in.readObject();
        this.phneNb = (java.lang.String) in.readObject();
        this.mobNb = (java.lang.String) in.readObject();
        this.faxNb = (java.lang.String) in.readObject();
        this.emailAdr = (java.lang.String) in.readObject();
        this.othr = (java.lang.String) in.readObject();
    }

}
