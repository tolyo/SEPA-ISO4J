/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * PartyIdentification32. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>Nm</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>PstlAdr</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PostalAddress6}
 * (0..1)</li>
 * <li><b>Id</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Party6Choice}
 * (0..1)</li>
 * <li><b>CtryOfRes</b> of type {@link java.lang.String}
 * (0..1)</li>
 * <li><b>CtctDtls</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ContactDetails2}
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
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32Cls
 */
public class PartyIdentification32 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"CtctDtls", "CtryOfRes", "Id", "Nm", "PstlAdr"};

    /**
     * Field nm.
     */
    private java.lang.String nm;

    /**
     * Field pstlAdr.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PostalAddress6 pstlAdr;

    /**
     * Field id.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Party6Choice id;

    /**
     * Field ctryOfRes.
     */
    private java.lang.String ctryOfRes;

    /**
     * Field ctctDtls.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ContactDetails2 ctctDtls;

    public PartyIdentification32() {
        this(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32Cls.getInstance().getNullDefiningElementDecl());
    }

    public PartyIdentification32(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public PartyIdentification32(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public PartyIdentification32(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 clone) {
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
            case 3:
                setNm((java.lang.String) value);
                return;
            case 4:
                setPstlAdr((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PostalAddress6) value);
                return;
            case 2:
                setId((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Party6Choice) value);
                return;
            case 1:
                setCtryOfRes((java.lang.String) value);
                return;
            case 0:
                setCtctDtls((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ContactDetails2) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) clone;
        obj.nm = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.nm, obj, "Nm");
        obj.pstlAdr = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PostalAddress6) biz.c24.io.api.Utils.cloneDeep(this.pstlAdr, obj, "PstlAdr");
        obj.id = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Party6Choice) biz.c24.io.api.Utils.cloneDeep(this.id, obj, "Id");
        obj.ctryOfRes = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.ctryOfRes, obj, "CtryOfRes");
        obj.ctctDtls = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ContactDetails2) biz.c24.io.api.Utils.cloneDeep(this.ctctDtls, obj, "CtctDtls");
    }

    /**
     * Creates, adds and returns a new CtctDtls (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ContactDetails2 createCtctDtls() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ContactDetails2 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ContactDetails2) getElementDecl("CtctDtls").createObject();
        setCtctDtls(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Id (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Party6Choice createId() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Party6Choice obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Party6Choice) getElementDecl("Id").createObject();
        setId(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new PstlAdr (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PostalAddress6 createPstlAdr() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PostalAddress6 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PostalAddress6) getElementDecl("PstlAdr").createObject();
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
     * Gets the value of CtctDtls (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ContactDetails2 getCtctDtls() {
        return this.ctctDtls;
    }

    /**
     * Gets the value of CtryOfRes (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getCtryOfRes() {
        return this.ctryOfRes;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>nm,
     * pstlAdr, id, ctryOfRes, ctctDtls</b>.
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
            case 3:
                return getNm();
            case 4:
                return getPstlAdr();
            case 2:
                return getId();
            case 1:
                return getCtryOfRes();
            case 0:
                return getCtctDtls();
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
            case 3:
                return this.nm == null ? 0 : 1;
            case 4:
                return this.pstlAdr == null ? 0 : 1;
            case 2:
                return this.id == null ? 0 : 1;
            case 1:
                return this.ctryOfRes == null ? 0 : 1;
            case 0:
                return this.ctctDtls == null ? 0 : 1;
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
            case 3:
                return this.nm != null && this.nm.equals(element) ? 0 : -1;
            case 4:
                return this.pstlAdr != null && this.pstlAdr.equals(element) ? 0 : -1;
            case 2:
                return this.id != null && this.id.equals(element) ? 0 : -1;
            case 1:
                return this.ctryOfRes != null && this.ctryOfRes.equals(element) ? 0 : -1;
            case 0:
                return this.ctctDtls != null && this.ctctDtls.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of Id (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Party6Choice getId() {
        return this.id;
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
     * Gets the value of PstlAdr (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PostalAddress6 getPstlAdr() {
        return this.pstlAdr;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>nm,
     * pstlAdr, id, ctryOfRes, ctctDtls</b>.
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
            case 3:
                return this.nm;
            case 4:
                return this.pstlAdr;
            case 2:
                return this.id;
            case 1:
                return this.ctryOfRes;
            case 0:
                return this.ctctDtls;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.nm == null ? 0 : 1;
        count += this.pstlAdr == null ? 0 : 1;
        count += this.id == null ? 0 : 1;
        count += this.ctryOfRes == null ? 0 : 1;
        count += this.ctctDtls == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(nm);
        result = 31 * result + hashCodeOf(pstlAdr);
        result = 31 * result + hashCodeOf(id);
        result = 31 * result + hashCodeOf(ctryOfRes);
        result = 31 * result + hashCodeOf(ctctDtls);
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
            case 3:
                setNm(null);
                return;
            case 4:
                setPstlAdr(null);
                return;
            case 2:
                setId(null);
                return;
            case 1:
                setCtryOfRes(null);
                return;
            case 0:
                setCtctDtls(null);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of CtctDtls (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCtctDtls(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ContactDetails2 value) {
        this.ctctDtls = value;
        if (this.ctctDtls != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.ctctDtls).setParent(this, "CtctDtls");
    }

    /**
     * [Virtual Element] Sets the value of CtryOfRes (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCtryOfRes(java.lang.String value) {
        this.ctryOfRes = value;
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
            case 3:
                setNm((java.lang.String) value);
                return;
            case 4:
                setPstlAdr((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PostalAddress6) value);
                return;
            case 2:
                setId((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Party6Choice) value);
                return;
            case 1:
                setCtryOfRes((java.lang.String) value);
                return;
            case 0:
                setCtctDtls((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ContactDetails2) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of Id (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setId(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Party6Choice value) {
        this.id = value;
        if (this.id != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.id).setParent(this, "Id");
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
     * [Virtual Element] Sets the value of PstlAdr (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setPstlAdr(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PostalAddress6 value) {
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
        out.writeObject(this.nm);
        out.writeObject(this.pstlAdr);
        out.writeObject(this.id);
        out.writeObject(this.ctryOfRes);
        out.writeObject(this.ctctDtls);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.nm = (java.lang.String) in.readObject();
        this.pstlAdr = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PostalAddress6) in.readObject();
        this.id = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Party6Choice) in.readObject();
        this.ctryOfRes = (java.lang.String) in.readObject();
        this.ctctDtls = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ContactDetails2) in.readObject();
    }

}
