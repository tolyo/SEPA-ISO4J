/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * Party11Choice. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>OrgId</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.OrganisationIdentification8}
 * (1)</li>
 * <li><b>PrvtId</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.PersonIdentification5}
 * (1)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Party11ChoiceCls
 */
public class Party11Choice extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"OrgId", "PrvtId"};

    /**
     * Field orgId.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.OrganisationIdentification8 orgId;

    /**
     * Field prvtId.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.PersonIdentification5 prvtId;

    public Party11Choice() {
        this(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Party11ChoiceCls.getInstance().getNullDefiningElementDecl());
    }

    public Party11Choice(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public Party11Choice(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public Party11Choice(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Party11Choice clone) {
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
                setOrgId((iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.OrganisationIdentification8) value);
                return;
            case 1:
                setPrvtId((iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.PersonIdentification5) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Party11Choice(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Party11Choice(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Party11Choice obj = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Party11Choice) clone;
        obj.orgId = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.OrganisationIdentification8) biz.c24.io.api.Utils.cloneDeep(this.orgId, obj, "OrgId");
        obj.prvtId = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.PersonIdentification5) biz.c24.io.api.Utils.cloneDeep(this.prvtId, obj, "PrvtId");
    }

    /**
     * Creates, adds and returns a new OrgId (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.OrganisationIdentification8 createOrgId() {
        iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.OrganisationIdentification8 obj = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.OrganisationIdentification8) getElementDecl("OrgId").createObject();
        setOrgId(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new PrvtId (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.PersonIdentification5 createPrvtId() {
        iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.PersonIdentification5 obj = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.PersonIdentification5) getElementDecl("PrvtId").createObject();
        setPrvtId(obj);
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
     * The legal value(s) for <code>name</code> are: <b>orgId,
     * prvtId</b>.
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
                return getOrgId();
            case 1:
                return getPrvtId();
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
                return this.orgId == null ? 0 : 1;
            case 1:
                return this.prvtId == null ? 0 : 1;
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
                return this.orgId != null && this.orgId.equals(element) ? 0 : -1;
            case 1:
                return this.prvtId != null && this.prvtId.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of OrgId (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.OrganisationIdentification8 getOrgId() {
        return this.orgId;
    }

    /**
     * Gets the value of PrvtId (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.PersonIdentification5 getPrvtId() {
        return this.prvtId;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>orgId,
     * prvtId</b>.
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
                return this.orgId;
            case 1:
                return this.prvtId;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.orgId == null ? 0 : 1;
        count += this.prvtId == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(orgId);
        result = 31 * result + hashCodeOf(prvtId);
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
                setOrgId(null);
                return;
            case 1:
                setPrvtId(null);
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
                setOrgId((iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.OrganisationIdentification8) value);
                return;
            case 1:
                setPrvtId((iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.PersonIdentification5) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of OrgId (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setOrgId(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.OrganisationIdentification8 value) {
        this.orgId = value;
        if (this.orgId != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.orgId).setParent(this, "OrgId");
    }

    /**
     * [Virtual Element] Sets the value of PrvtId (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setPrvtId(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.PersonIdentification5 value) {
        this.prvtId = value;
        if (this.prvtId != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.prvtId).setParent(this, "PrvtId");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.orgId);
        out.writeObject(this.prvtId);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.orgId = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.OrganisationIdentification8) in.readObject();
        this.prvtId = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.PersonIdentification5) in.readObject();
    }

}
