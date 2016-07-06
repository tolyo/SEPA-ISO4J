/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * MandateRelatedInformation6. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>MndtId</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>DtOfSgntr</b> of type {@link
 * biz.c24.io.api.data.ISO8601Date} (0..1)</li>
 * <li><b>AmdmntInd</b> of type <code>boolean</code> (0..1)</li>
 * <li><b>AmdmntInfDtls</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmendmentInformationDetails6}
 * (0..1)</li>
 * <li><b>ElctrncSgntr</b> of type {@link java.lang.String}
 * (0..1)</li>
 * <li><b>FrstColltnDt</b> of type {@link
 * biz.c24.io.api.data.ISO8601Date} (0..1)</li>
 * <li><b>FnlColltnDt</b> of type {@link
 * biz.c24.io.api.data.ISO8601Date} (0..1)</li>
 * <li><b>Frqcy</b> of type {@link java.lang.String} (0..1)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.MandateRelatedInformation6Cls
 */
public class MandateRelatedInformation6 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"AmdmntInd", "AmdmntInfDtls", "DtOfSgntr", "ElctrncSgntr", "FnlColltnDt", "Frqcy", "FrstColltnDt", "MndtId"};

    /**
     * Field mndtId.
     */
    private java.lang.String mndtId;

    /**
     * Field dtOfSgntr.
     */
    private biz.c24.io.api.data.ISO8601Date dtOfSgntr;

    /**
     * Field amdmntInd.
     */
    private boolean amdmntInd;

    /**
     * Field isamdmntIndSet.
     */
    private boolean isamdmntIndSet;

    /**
     * Field amdmntInfDtls.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmendmentInformationDetails6 amdmntInfDtls;

    /**
     * Field elctrncSgntr.
     */
    private java.lang.String elctrncSgntr;

    /**
     * Field frstColltnDt.
     */
    private biz.c24.io.api.data.ISO8601Date frstColltnDt;

    /**
     * Field fnlColltnDt.
     */
    private biz.c24.io.api.data.ISO8601Date fnlColltnDt;

    /**
     * Field frqcy.
     */
    private java.lang.String frqcy;

    public MandateRelatedInformation6() {
        this(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.MandateRelatedInformation6Cls.getInstance().getNullDefiningElementDecl());
    }

    public MandateRelatedInformation6(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public MandateRelatedInformation6(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public MandateRelatedInformation6(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.MandateRelatedInformation6 clone) {
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
            case 7:
                setMndtId((java.lang.String) value);
                return;
            case 2:
                setDtOfSgntr((biz.c24.io.api.data.ISO8601Date) value);
                return;
            case 0:
                setAmdmntInd(biz.c24.io.api.Utils.booleanValue(value));
                return;
            case 1:
                setAmdmntInfDtls((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmendmentInformationDetails6) value);
                return;
            case 3:
                setElctrncSgntr((java.lang.String) value);
                return;
            case 6:
                setFrstColltnDt((biz.c24.io.api.data.ISO8601Date) value);
                return;
            case 4:
                setFnlColltnDt((biz.c24.io.api.data.ISO8601Date) value);
                return;
            case 5:
                setFrqcy((java.lang.String) value);
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
        return new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.MandateRelatedInformation6(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.MandateRelatedInformation6(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.MandateRelatedInformation6 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.MandateRelatedInformation6) clone;
        obj.mndtId = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.mndtId, obj, "MndtId");
        obj.dtOfSgntr = (biz.c24.io.api.data.ISO8601Date) biz.c24.io.api.Utils.cloneDeep(this.dtOfSgntr, obj, "DtOfSgntr");
        obj.isamdmntIndSet = this.isamdmntIndSet;
        obj.amdmntInd = this.amdmntInd;
        obj.amdmntInfDtls = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmendmentInformationDetails6) biz.c24.io.api.Utils.cloneDeep(this.amdmntInfDtls, obj, "AmdmntInfDtls");
        obj.elctrncSgntr = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.elctrncSgntr, obj, "ElctrncSgntr");
        obj.frstColltnDt = (biz.c24.io.api.data.ISO8601Date) biz.c24.io.api.Utils.cloneDeep(this.frstColltnDt, obj, "FrstColltnDt");
        obj.fnlColltnDt = (biz.c24.io.api.data.ISO8601Date) biz.c24.io.api.Utils.cloneDeep(this.fnlColltnDt, obj, "FnlColltnDt");
        obj.frqcy = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.frqcy, obj, "Frqcy");
    }

    /**
     * Creates, adds and returns a new AmdmntInfDtls (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmendmentInformationDetails6 createAmdmntInfDtls() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmendmentInformationDetails6 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmendmentInformationDetails6) getElementDecl("AmdmntInfDtls").createObject();
        setAmdmntInfDtls(obj);
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
     * Gets the value of AmdmntInd (0..1).
     * 
     * @return The value.
     */
    public boolean getAmdmntInd() {
        return this.amdmntInd;
    }

    /**
     * Gets the value of AmdmntInfDtls (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmendmentInformationDetails6 getAmdmntInfDtls() {
        return this.amdmntInfDtls;
    }

    /**
     * Gets the value of DtOfSgntr (0..1).
     * 
     * @return The value.
     */
    public biz.c24.io.api.data.ISO8601Date getDtOfSgntr() {
        return this.dtOfSgntr;
    }

    /**
     * Gets the value of ElctrncSgntr (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getElctrncSgntr() {
        return this.elctrncSgntr;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>mndtId,
     * dtOfSgntr, amdmntInd, amdmntInfDtls, elctrncSgntr,
     * frstColltnDt, fnlColltnDt, frqcy</b>.
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
            case 7:
                return getMndtId();
            case 2:
                return getDtOfSgntr();
            case 0:
                return getAmdmntInd();
            case 1:
                return getAmdmntInfDtls();
            case 3:
                return getElctrncSgntr();
            case 6:
                return getFrstColltnDt();
            case 4:
                return getFnlColltnDt();
            case 5:
                return getFrqcy();
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
            case 7:
                return this.mndtId == null ? 0 : 1;
            case 2:
                return this.dtOfSgntr == null ? 0 : 1;
            case 0:
                return this.isamdmntIndSet ? 1 : 0;
            case 1:
                return this.amdmntInfDtls == null ? 0 : 1;
            case 3:
                return this.elctrncSgntr == null ? 0 : 1;
            case 6:
                return this.frstColltnDt == null ? 0 : 1;
            case 4:
                return this.fnlColltnDt == null ? 0 : 1;
            case 5:
                return this.frqcy == null ? 0 : 1;
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
            case 7:
                return this.mndtId != null && this.mndtId.equals(element) ? 0 : -1;
            case 2:
                return this.dtOfSgntr != null && this.dtOfSgntr.equals(element) ? 0 : -1;
            case 0:
                return this.isamdmntIndSet ? (this.amdmntInd == biz.c24.io.api.Utils.booleanValue(element) ? 0 : -1) : -1;
            case 1:
                return this.amdmntInfDtls != null && this.amdmntInfDtls.equals(element) ? 0 : -1;
            case 3:
                return this.elctrncSgntr != null && this.elctrncSgntr.equals(element) ? 0 : -1;
            case 6:
                return this.frstColltnDt != null && this.frstColltnDt.equals(element) ? 0 : -1;
            case 4:
                return this.fnlColltnDt != null && this.fnlColltnDt.equals(element) ? 0 : -1;
            case 5:
                return this.frqcy != null && this.frqcy.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of FnlColltnDt (0..1).
     * 
     * @return The value.
     */
    public biz.c24.io.api.data.ISO8601Date getFnlColltnDt() {
        return this.fnlColltnDt;
    }

    /**
     * Gets the value of Frqcy (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getFrqcy() {
        return this.frqcy;
    }

    /**
     * Gets the value of FrstColltnDt (0..1).
     * 
     * @return The value.
     */
    public biz.c24.io.api.data.ISO8601Date getFrstColltnDt() {
        return this.frstColltnDt;
    }

    /**
     * Gets the value of MndtId (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getMndtId() {
        return this.mndtId;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>mndtId,
     * dtOfSgntr, amdmntInd, amdmntInfDtls, elctrncSgntr,
     * frstColltnDt, fnlColltnDt, frqcy</b>.
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
            case 7:
                return this.mndtId;
            case 2:
                return this.dtOfSgntr;
            case 0:
                return this.amdmntInd;
            case 1:
                return this.amdmntInfDtls;
            case 3:
                return this.elctrncSgntr;
            case 6:
                return this.frstColltnDt;
            case 4:
                return this.fnlColltnDt;
            case 5:
                return this.frqcy;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.mndtId == null ? 0 : 1;
        count += this.dtOfSgntr == null ? 0 : 1;
        count += this.isamdmntIndSet ? 1 : 0;
        count += this.amdmntInfDtls == null ? 0 : 1;
        count += this.elctrncSgntr == null ? 0 : 1;
        count += this.frstColltnDt == null ? 0 : 1;
        count += this.fnlColltnDt == null ? 0 : 1;
        count += this.frqcy == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(mndtId);
        result = 31 * result + hashCodeOf(dtOfSgntr);
        result = 31 * result + hashCodeOf(amdmntInd);
        result = 31 * result + hashCodeOf(isamdmntIndSet);
        result = 31 * result + hashCodeOf(amdmntInfDtls);
        result = 31 * result + hashCodeOf(elctrncSgntr);
        result = 31 * result + hashCodeOf(frstColltnDt);
        result = 31 * result + hashCodeOf(fnlColltnDt);
        result = 31 * result + hashCodeOf(frqcy);
        return result;
    }

    /**
     * Tests whether AmdmntInd has been set.
     */
    public boolean isAmdmntIndSet() {
        return isamdmntIndSet;
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
            case 7:
                setMndtId(null);
                return;
            case 2:
                setDtOfSgntr(null);
                return;
            case 0:
                setAmdmntInd(false);
                this.isamdmntIndSet = false;
                return;
            case 1:
                setAmdmntInfDtls(null);
                return;
            case 3:
                setElctrncSgntr(null);
                return;
            case 6:
                setFrstColltnDt(null);
                return;
            case 4:
                setFnlColltnDt(null);
                return;
            case 5:
                setFrqcy(null);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of AmdmntInd (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAmdmntInd(boolean value) {
        this.amdmntInd = value;
        this.isamdmntIndSet = true;
    }

    /**
     * [Virtual Element] Sets the value of AmdmntInfDtls (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAmdmntInfDtls(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmendmentInformationDetails6 value) {
        this.amdmntInfDtls = value;
        if (this.amdmntInfDtls != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.amdmntInfDtls).setParent(this, "AmdmntInfDtls");
    }

    /**
     * [Virtual Element] Sets the value of DtOfSgntr (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setDtOfSgntr(biz.c24.io.api.data.ISO8601Date value) {
        this.dtOfSgntr = value;
    }

    /**
     * [Virtual Element] Sets the value of ElctrncSgntr (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setElctrncSgntr(java.lang.String value) {
        this.elctrncSgntr = value;
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
            case 7:
                setMndtId((java.lang.String) value);
                return;
            case 2:
                setDtOfSgntr((biz.c24.io.api.data.ISO8601Date) value);
                return;
            case 0:
                setAmdmntInd(biz.c24.io.api.Utils.booleanValue(value));
                return;
            case 1:
                setAmdmntInfDtls((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmendmentInformationDetails6) value);
                return;
            case 3:
                setElctrncSgntr((java.lang.String) value);
                return;
            case 6:
                setFrstColltnDt((biz.c24.io.api.data.ISO8601Date) value);
                return;
            case 4:
                setFnlColltnDt((biz.c24.io.api.data.ISO8601Date) value);
                return;
            case 5:
                setFrqcy((java.lang.String) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of FnlColltnDt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setFnlColltnDt(biz.c24.io.api.data.ISO8601Date value) {
        this.fnlColltnDt = value;
    }

    /**
     * [Virtual Element] Sets the value of Frqcy (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setFrqcy(java.lang.String value) {
        this.frqcy = value;
    }

    /**
     * [Virtual Element] Sets the value of FrstColltnDt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setFrstColltnDt(biz.c24.io.api.data.ISO8601Date value) {
        this.frstColltnDt = value;
    }

    /**
     * [Virtual Element] Sets the value of MndtId (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setMndtId(java.lang.String value) {
        this.mndtId = value;
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.mndtId);
        out.writeObject(this.dtOfSgntr);
        out.writeBoolean(this.isamdmntIndSet);
        if (this.isamdmntIndSet)
            out.writeBoolean(this.amdmntInd);
        out.writeObject(this.amdmntInfDtls);
        out.writeObject(this.elctrncSgntr);
        out.writeObject(this.frstColltnDt);
        out.writeObject(this.fnlColltnDt);
        out.writeObject(this.frqcy);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.mndtId = (java.lang.String) in.readObject();
        this.dtOfSgntr = (biz.c24.io.api.data.ISO8601Date) in.readObject();
        this.isamdmntIndSet = in.readBoolean();
        if (this.isamdmntIndSet)
            this.amdmntInd = in.readBoolean();
        this.amdmntInfDtls = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmendmentInformationDetails6) in.readObject();
        this.elctrncSgntr = (java.lang.String) in.readObject();
        this.frstColltnDt = (biz.c24.io.api.data.ISO8601Date) in.readObject();
        this.fnlColltnDt = (biz.c24.io.api.data.ISO8601Date) in.readObject();
        this.frqcy = (java.lang.String) in.readObject();
    }

}
