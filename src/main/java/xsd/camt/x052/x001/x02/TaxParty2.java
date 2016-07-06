/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * TaxParty2. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>TaxId</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>RegnId</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>TaxTp</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>Authstn</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxAuthorisation1}
 * (0..1)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxParty2Cls
 */
public class TaxParty2 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"Authstn", "RegnId", "TaxId", "TaxTp"};

    /**
     * Field taxId.
     */
    private java.lang.String taxId;

    /**
     * Field regnId.
     */
    private java.lang.String regnId;

    /**
     * Field taxTp.
     */
    private java.lang.String taxTp;

    /**
     * Field authstn.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxAuthorisation1 authstn;

    public TaxParty2() {
        this(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxParty2Cls.getInstance().getNullDefiningElementDecl());
    }

    public TaxParty2(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public TaxParty2(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public TaxParty2(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxParty2 clone) {
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
            case 2:
                setTaxId((java.lang.String) value);
                return;
            case 1:
                setRegnId((java.lang.String) value);
                return;
            case 3:
                setTaxTp((java.lang.String) value);
                return;
            case 0:
                setAuthstn((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxAuthorisation1) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxParty2(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxParty2(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxParty2 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxParty2) clone;
        obj.taxId = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.taxId, obj, "TaxId");
        obj.regnId = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.regnId, obj, "RegnId");
        obj.taxTp = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.taxTp, obj, "TaxTp");
        obj.authstn = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxAuthorisation1) biz.c24.io.api.Utils.cloneDeep(this.authstn, obj, "Authstn");
    }

    /**
     * Creates, adds and returns a new Authstn (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxAuthorisation1 createAuthstn() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxAuthorisation1 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxAuthorisation1) getElementDecl("Authstn").createObject();
        setAuthstn(obj);
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
     * Gets the value of Authstn (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxAuthorisation1 getAuthstn() {
        return this.authstn;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>taxId,
     * regnId, taxTp, authstn</b>.
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
            case 2:
                return getTaxId();
            case 1:
                return getRegnId();
            case 3:
                return getTaxTp();
            case 0:
                return getAuthstn();
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
            case 2:
                return this.taxId == null ? 0 : 1;
            case 1:
                return this.regnId == null ? 0 : 1;
            case 3:
                return this.taxTp == null ? 0 : 1;
            case 0:
                return this.authstn == null ? 0 : 1;
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
            case 2:
                return this.taxId != null && this.taxId.equals(element) ? 0 : -1;
            case 1:
                return this.regnId != null && this.regnId.equals(element) ? 0 : -1;
            case 3:
                return this.taxTp != null && this.taxTp.equals(element) ? 0 : -1;
            case 0:
                return this.authstn != null && this.authstn.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>taxId,
     * regnId, taxTp, authstn</b>.
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
            case 2:
                return this.taxId;
            case 1:
                return this.regnId;
            case 3:
                return this.taxTp;
            case 0:
                return this.authstn;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of RegnId (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getRegnId() {
        return this.regnId;
    }

    /**
     * Gets the value of TaxId (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getTaxId() {
        return this.taxId;
    }

    /**
     * Gets the value of TaxTp (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getTaxTp() {
        return this.taxTp;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.taxId == null ? 0 : 1;
        count += this.regnId == null ? 0 : 1;
        count += this.taxTp == null ? 0 : 1;
        count += this.authstn == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(taxId);
        result = 31 * result + hashCodeOf(regnId);
        result = 31 * result + hashCodeOf(taxTp);
        result = 31 * result + hashCodeOf(authstn);
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
            case 2:
                setTaxId(null);
                return;
            case 1:
                setRegnId(null);
                return;
            case 3:
                setTaxTp(null);
                return;
            case 0:
                setAuthstn(null);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of Authstn (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAuthstn(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxAuthorisation1 value) {
        this.authstn = value;
        if (this.authstn != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.authstn).setParent(this, "Authstn");
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
            case 2:
                setTaxId((java.lang.String) value);
                return;
            case 1:
                setRegnId((java.lang.String) value);
                return;
            case 3:
                setTaxTp((java.lang.String) value);
                return;
            case 0:
                setAuthstn((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxAuthorisation1) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of RegnId (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setRegnId(java.lang.String value) {
        this.regnId = value;
    }

    /**
     * [Virtual Element] Sets the value of TaxId (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTaxId(java.lang.String value) {
        this.taxId = value;
    }

    /**
     * [Virtual Element] Sets the value of TaxTp (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTaxTp(java.lang.String value) {
        this.taxTp = value;
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.taxId);
        out.writeObject(this.regnId);
        out.writeObject(this.taxTp);
        out.writeObject(this.authstn);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.taxId = (java.lang.String) in.readObject();
        this.regnId = (java.lang.String) in.readObject();
        this.taxTp = (java.lang.String) in.readObject();
        this.authstn = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxAuthorisation1) in.readObject();
    }

}
