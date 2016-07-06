/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * PostalAddress6. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>AdrTp</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>Dept</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>SubDept</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>StrtNm</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>BldgNb</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>PstCd</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>TwnNm</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>CtrySubDvsn</b> of type {@link java.lang.String}
 * (0..1)</li>
 * <li><b>Ctry</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>AdrLine</b> of type {@link java.lang.String} (0..7)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.PostalAddress6Cls
 */
public class PostalAddress6 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"AdrLine", "AdrTp", "BldgNb", "Ctry", "CtrySubDvsn", "Dept", "PstCd", "StrtNm", "SubDept", "TwnNm"};

    /**
     * Field adrTp.
     */
    private java.lang.String adrTp;

    /**
     * Field dept.
     */
    private java.lang.String dept;

    /**
     * Field subDept.
     */
    private java.lang.String subDept;

    /**
     * Field strtNm.
     */
    private java.lang.String strtNm;

    /**
     * Field bldgNb.
     */
    private java.lang.String bldgNb;

    /**
     * Field pstCd.
     */
    private java.lang.String pstCd;

    /**
     * Field twnNm.
     */
    private java.lang.String twnNm;

    /**
     * Field ctrySubDvsn.
     */
    private java.lang.String ctrySubDvsn;

    /**
     * Field ctry.
     */
    private java.lang.String ctry;

    /**
     * Field adrLine.
     */
    private java.lang.String[] adrLine;

    public PostalAddress6() {
        this(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.PostalAddress6Cls.getInstance().getNullDefiningElementDecl());
    }

    public PostalAddress6(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public PostalAddress6(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public PostalAddress6(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.PostalAddress6 clone) {
        super(clone);
    }

    /**
     * Adds a AdrLine (0..7).
     * 
     * @param value
     * @param value The new AdrLine.
     */
    public void addAdrLine(java.lang.String value) {
        java.lang.String[] temp = this.adrLine;
        this.adrLine = new java.lang.String[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.adrLine, 0, temp.length);
        this.adrLine[this.adrLine.length-1] = value;
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
                setAdrTp((java.lang.String) value);
                return;
            case 5:
                setDept((java.lang.String) value);
                return;
            case 8:
                setSubDept((java.lang.String) value);
                return;
            case 7:
                setStrtNm((java.lang.String) value);
                return;
            case 2:
                setBldgNb((java.lang.String) value);
                return;
            case 6:
                setPstCd((java.lang.String) value);
                return;
            case 9:
                setTwnNm((java.lang.String) value);
                return;
            case 4:
                setCtrySubDvsn((java.lang.String) value);
                return;
            case 3:
                setCtry((java.lang.String) value);
                return;
            case 0:
                addAdrLine((java.lang.String) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.PostalAddress6(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.PostalAddress6(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.PostalAddress6 obj = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.PostalAddress6) clone;
        obj.adrTp = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.adrTp, obj, "AdrTp");
        obj.dept = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.dept, obj, "Dept");
        obj.subDept = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.subDept, obj, "SubDept");
        obj.strtNm = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.strtNm, obj, "StrtNm");
        obj.bldgNb = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.bldgNb, obj, "BldgNb");
        obj.pstCd = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.pstCd, obj, "PstCd");
        obj.twnNm = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.twnNm, obj, "TwnNm");
        obj.ctrySubDvsn = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.ctrySubDvsn, obj, "CtrySubDvsn");
        obj.ctry = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.ctry, obj, "Ctry");
        obj.adrLine = (java.lang.String[]) biz.c24.io.api.Utils.cloneDeep(this.adrLine, obj, "AdrLine");
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
     * Gets the value of AdrLine (0..7).
     * 
     * @return The value.
     */
    public java.lang.String[] getAdrLine() {
        if (this.adrLine == null)
            return new java.lang.String[]{};
        else
            return this.adrLine;
    }

    /**
     * Gets the value of AdrLine by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public java.lang.String getAdrLine(int ordinal) {
        if (this.adrLine == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.adrLine.length) {
            return this.adrLine[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (0..7).
     * 
     * @param value
     * @param value The AdrLine to get the index of.
     * @return The index.
     */
    public int getAdrLineIndex(java.lang.String value) {
        if (this.adrLine == null)
            return -1;
        for (int i=0; i<this.adrLine.length; i++)
            if (this.adrLine[i] == value)
                return i;
        return -1;
    }

    /**
     * Gets the value of AdrTp (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getAdrTp() {
        return this.adrTp;
    }

    /**
     * Gets the value of BldgNb (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getBldgNb() {
        return this.bldgNb;
    }

    /**
     * Gets the value of Ctry (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getCtry() {
        return this.ctry;
    }

    /**
     * Gets the value of CtrySubDvsn (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getCtrySubDvsn() {
        return this.ctrySubDvsn;
    }

    /**
     * Gets the value of Dept (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getDept() {
        return this.dept;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>adrTp,
     * dept, subDept, strtNm, bldgNb, pstCd, twnNm, ctrySubDvsn,
     * ctry, adrLine</b>.
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
                return getAdrTp();
            case 5:
                return getDept();
            case 8:
                return getSubDept();
            case 7:
                return getStrtNm();
            case 2:
                return getBldgNb();
            case 6:
                return getPstCd();
            case 9:
                return getTwnNm();
            case 4:
                return getCtrySubDvsn();
            case 3:
                return getCtry();
            case 0:
            if (this.adrLine == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.adrLine[index];
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
                return this.adrTp == null ? 0 : 1;
            case 5:
                return this.dept == null ? 0 : 1;
            case 8:
                return this.subDept == null ? 0 : 1;
            case 7:
                return this.strtNm == null ? 0 : 1;
            case 2:
                return this.bldgNb == null ? 0 : 1;
            case 6:
                return this.pstCd == null ? 0 : 1;
            case 9:
                return this.twnNm == null ? 0 : 1;
            case 4:
                return this.ctrySubDvsn == null ? 0 : 1;
            case 3:
                return this.ctry == null ? 0 : 1;
            case 0:
                return this.adrLine == null ? 0 : this.adrLine.length;
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
                return this.adrTp != null && this.adrTp.equals(element) ? 0 : -1;
            case 5:
                return this.dept != null && this.dept.equals(element) ? 0 : -1;
            case 8:
                return this.subDept != null && this.subDept.equals(element) ? 0 : -1;
            case 7:
                return this.strtNm != null && this.strtNm.equals(element) ? 0 : -1;
            case 2:
                return this.bldgNb != null && this.bldgNb.equals(element) ? 0 : -1;
            case 6:
                return this.pstCd != null && this.pstCd.equals(element) ? 0 : -1;
            case 9:
                return this.twnNm != null && this.twnNm.equals(element) ? 0 : -1;
            case 4:
                return this.ctrySubDvsn != null && this.ctrySubDvsn.equals(element) ? 0 : -1;
            case 3:
                return this.ctry != null && this.ctry.equals(element) ? 0 : -1;
            case 0:
                return getAdrLineIndex((java.lang.String) element);
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of PstCd (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getPstCd() {
        return this.pstCd;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>adrTp,
     * dept, subDept, strtNm, bldgNb, pstCd, twnNm, ctrySubDvsn,
     * ctry, adrLine</b>.
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
                return this.adrTp;
            case 5:
                return this.dept;
            case 8:
                return this.subDept;
            case 7:
                return this.strtNm;
            case 2:
                return this.bldgNb;
            case 6:
                return this.pstCd;
            case 9:
                return this.twnNm;
            case 4:
                return this.ctrySubDvsn;
            case 3:
                return this.ctry;
            case 0:
            if (this.adrLine == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.adrLine[index];
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of StrtNm (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getStrtNm() {
        return this.strtNm;
    }

    /**
     * Gets the value of SubDept (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getSubDept() {
        return this.subDept;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.adrTp == null ? 0 : 1;
        count += this.dept == null ? 0 : 1;
        count += this.subDept == null ? 0 : 1;
        count += this.strtNm == null ? 0 : 1;
        count += this.bldgNb == null ? 0 : 1;
        count += this.pstCd == null ? 0 : 1;
        count += this.twnNm == null ? 0 : 1;
        count += this.ctrySubDvsn == null ? 0 : 1;
        count += this.ctry == null ? 0 : 1;
        count += this.adrLine == null ? 0 : this.adrLine.length;
        return count;
    }

    /**
     * Gets the value of TwnNm (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getTwnNm() {
        return this.twnNm;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(adrTp);
        result = 31 * result + hashCodeOf(dept);
        result = 31 * result + hashCodeOf(subDept);
        result = 31 * result + hashCodeOf(strtNm);
        result = 31 * result + hashCodeOf(bldgNb);
        result = 31 * result + hashCodeOf(pstCd);
        result = 31 * result + hashCodeOf(twnNm);
        result = 31 * result + hashCodeOf(ctrySubDvsn);
        result = 31 * result + hashCodeOf(ctry);
        result = 31 * result + hashCodeOf(adrLine);
        return result;
    }

    /**
     * Removes a AdrLine (0..7).
     * 
     * @param index
     * @param index The index of the AdrLine to get.
     */
    public void removeAdrLine(int index) {
        if (this.adrLine == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        java.lang.String[] temp = this.adrLine;
        this.adrLine = new java.lang.String[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.adrLine, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.adrLine, index, temp.length-index-1);
        if (this.adrLine.length == 0)
            this.adrLine = null;
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
                setAdrTp(null);
                return;
            case 5:
                setDept(null);
                return;
            case 8:
                setSubDept(null);
                return;
            case 7:
                setStrtNm(null);
                return;
            case 2:
                setBldgNb(null);
                return;
            case 6:
                setPstCd(null);
                return;
            case 9:
                setTwnNm(null);
                return;
            case 4:
                setCtrySubDvsn(null);
                return;
            case 3:
                setCtry(null);
                return;
            case 0:
                removeAdrLine(index);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of AdrLine (0..7).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAdrLine(java.lang.String[] value) {
        this.adrLine = (java.lang.String[]) biz.c24.io.api.Utils.clearNulls(value);
    }

    /**
     * [Virtual Element] Sets the value of AdrTp (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAdrTp(java.lang.String value) {
        this.adrTp = value;
    }

    /**
     * [Virtual Element] Sets the value of BldgNb (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setBldgNb(java.lang.String value) {
        this.bldgNb = value;
    }

    /**
     * [Virtual Element] Sets the value of Ctry (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCtry(java.lang.String value) {
        this.ctry = value;
    }

    /**
     * [Virtual Element] Sets the value of CtrySubDvsn (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCtrySubDvsn(java.lang.String value) {
        this.ctrySubDvsn = value;
    }

    /**
     * [Virtual Element] Sets the value of Dept (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setDept(java.lang.String value) {
        this.dept = value;
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
                setAdrTp((java.lang.String) value);
                return;
            case 5:
                setDept((java.lang.String) value);
                return;
            case 8:
                setSubDept((java.lang.String) value);
                return;
            case 7:
                setStrtNm((java.lang.String) value);
                return;
            case 2:
                setBldgNb((java.lang.String) value);
                return;
            case 6:
                setPstCd((java.lang.String) value);
                return;
            case 9:
                setTwnNm((java.lang.String) value);
                return;
            case 4:
                setCtrySubDvsn((java.lang.String) value);
                return;
            case 3:
                setCtry((java.lang.String) value);
                return;
            case 0:
                if (value != null && value instanceof java.lang.String[]) {
                    setAdrLine((java.lang.String[])value);
                } else if (this.adrLine == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.adrLine[index] = (java.lang.String) value;
                }
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of PstCd (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setPstCd(java.lang.String value) {
        this.pstCd = value;
    }

    /**
     * [Virtual Element] Sets the value of StrtNm (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setStrtNm(java.lang.String value) {
        this.strtNm = value;
    }

    /**
     * [Virtual Element] Sets the value of SubDept (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setSubDept(java.lang.String value) {
        this.subDept = value;
    }

    /**
     * [Virtual Element] Sets the value of TwnNm (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTwnNm(java.lang.String value) {
        this.twnNm = value;
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.adrTp);
        out.writeObject(this.dept);
        out.writeObject(this.subDept);
        out.writeObject(this.strtNm);
        out.writeObject(this.bldgNb);
        out.writeObject(this.pstCd);
        out.writeObject(this.twnNm);
        out.writeObject(this.ctrySubDvsn);
        out.writeObject(this.ctry);
        out.writeObject(this.adrLine);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.adrTp = (java.lang.String) in.readObject();
        this.dept = (java.lang.String) in.readObject();
        this.subDept = (java.lang.String) in.readObject();
        this.strtNm = (java.lang.String) in.readObject();
        this.bldgNb = (java.lang.String) in.readObject();
        this.pstCd = (java.lang.String) in.readObject();
        this.twnNm = (java.lang.String) in.readObject();
        this.ctrySubDvsn = (java.lang.String) in.readObject();
        this.ctry = (java.lang.String) in.readObject();
        this.adrLine = (java.lang.String[]) in.readObject();
    }

}
