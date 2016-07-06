/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * StructuredRegulatoryReporting3. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>Tp</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>Dt</b> of type {@link biz.c24.io.api.data.ISO8601Date}
 * (0..1)</li>
 * <li><b>Ctry</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>Cd</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>Amt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ActiveOrHistoricCurrencyAndAmount}
 * (0..1)</li>
 * <li><b>Inf</b> of type {@link java.lang.String} (0..*)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.StructuredRegulatoryReporting3Cls
 */
public class StructuredRegulatoryReporting3 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"Amt", "Cd", "Ctry", "Dt", "Inf", "Tp"};

    /**
     * Field tp.
     */
    private java.lang.String tp;

    /**
     * Field dt.
     */
    private biz.c24.io.api.data.ISO8601Date dt;

    /**
     * Field ctry.
     */
    private java.lang.String ctry;

    /**
     * Field cd.
     */
    private java.lang.String cd;

    /**
     * Field amt.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ActiveOrHistoricCurrencyAndAmount amt;

    /**
     * Field inf.
     */
    private java.lang.String[] inf;

    public StructuredRegulatoryReporting3() {
        this(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.StructuredRegulatoryReporting3Cls.getInstance().getNullDefiningElementDecl());
    }

    public StructuredRegulatoryReporting3(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public StructuredRegulatoryReporting3(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public StructuredRegulatoryReporting3(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.StructuredRegulatoryReporting3 clone) {
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
            case 5:
                setTp((java.lang.String) value);
                return;
            case 3:
                setDt((biz.c24.io.api.data.ISO8601Date) value);
                return;
            case 2:
                setCtry((java.lang.String) value);
                return;
            case 1:
                setCd((java.lang.String) value);
                return;
            case 0:
                setAmt((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ActiveOrHistoricCurrencyAndAmount) value);
                return;
            case 4:
                addInf((java.lang.String) value);
                return;
            default:
                super.addElement(name, value);
        }
    }

    /**
     * Adds a Inf (0..*).
     * 
     * @param value
     * @param value The new Inf.
     */
    public void addInf(java.lang.String value) {
        java.lang.String[] temp = this.inf;
        this.inf = new java.lang.String[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.inf, 0, temp.length);
        this.inf[this.inf.length-1] = value;
    }

    /**
     * Creates and returns a shallow clone of this object.
     * 
     * @see #cloneDeep()
     */
    public java.lang.Object clone() {
        return new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.StructuredRegulatoryReporting3(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.StructuredRegulatoryReporting3(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.StructuredRegulatoryReporting3 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.StructuredRegulatoryReporting3) clone;
        obj.tp = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.tp, obj, "Tp");
        obj.dt = (biz.c24.io.api.data.ISO8601Date) biz.c24.io.api.Utils.cloneDeep(this.dt, obj, "Dt");
        obj.ctry = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.ctry, obj, "Ctry");
        obj.cd = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.cd, obj, "Cd");
        obj.amt = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ActiveOrHistoricCurrencyAndAmount) biz.c24.io.api.Utils.cloneDeep(this.amt, obj, "Amt");
        obj.inf = (java.lang.String[]) biz.c24.io.api.Utils.cloneDeep(this.inf, obj, "Inf");
    }

    /**
     * Creates, adds and returns a new Amt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ActiveOrHistoricCurrencyAndAmount createAmt() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ActiveOrHistoricCurrencyAndAmount obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ActiveOrHistoricCurrencyAndAmount) getElementDecl("Amt").createObject();
        setAmt(obj);
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
     * Gets the value of Amt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ActiveOrHistoricCurrencyAndAmount getAmt() {
        return this.amt;
    }

    /**
     * Gets the value of Cd (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getCd() {
        return this.cd;
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
     * Gets the value of Dt (0..1).
     * 
     * @return The value.
     */
    public biz.c24.io.api.data.ISO8601Date getDt() {
        return this.dt;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>tp, dt,
     * ctry, cd, amt, inf</b>.
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
            case 5:
                return getTp();
            case 3:
                return getDt();
            case 2:
                return getCtry();
            case 1:
                return getCd();
            case 0:
                return getAmt();
            case 4:
            if (this.inf == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.inf[index];
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
            case 5:
                return this.tp == null ? 0 : 1;
            case 3:
                return this.dt == null ? 0 : 1;
            case 2:
                return this.ctry == null ? 0 : 1;
            case 1:
                return this.cd == null ? 0 : 1;
            case 0:
                return this.amt == null ? 0 : 1;
            case 4:
                return this.inf == null ? 0 : this.inf.length;
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
            case 5:
                return this.tp != null && this.tp.equals(element) ? 0 : -1;
            case 3:
                return this.dt != null && this.dt.equals(element) ? 0 : -1;
            case 2:
                return this.ctry != null && this.ctry.equals(element) ? 0 : -1;
            case 1:
                return this.cd != null && this.cd.equals(element) ? 0 : -1;
            case 0:
                return this.amt != null && this.amt.equals(element) ? 0 : -1;
            case 4:
                return getInfIndex((java.lang.String) element);
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of Inf (0..*).
     * 
     * @return The value.
     */
    public java.lang.String[] getInf() {
        if (this.inf == null)
            return new java.lang.String[]{};
        else
            return this.inf;
    }

    /**
     * Gets the value of Inf by ordinal position in the collection.
     * 
     * @param ordinal
     */
    public java.lang.String getInf(int ordinal) {
        if (this.inf == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.inf.length) {
            return this.inf[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (0..*).
     * 
     * @param value
     * @param value The Inf to get the index of.
     * @return The index.
     */
    public int getInfIndex(java.lang.String value) {
        if (this.inf == null)
            return -1;
        for (int i=0; i<this.inf.length; i++)
            if (this.inf[i] == value)
                return i;
        return -1;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>tp, dt,
     * ctry, cd, amt, inf</b>.
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
            case 5:
                return this.tp;
            case 3:
                return this.dt;
            case 2:
                return this.ctry;
            case 1:
                return this.cd;
            case 0:
                return this.amt;
            case 4:
            if (this.inf == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.inf[index];
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.tp == null ? 0 : 1;
        count += this.dt == null ? 0 : 1;
        count += this.ctry == null ? 0 : 1;
        count += this.cd == null ? 0 : 1;
        count += this.amt == null ? 0 : 1;
        count += this.inf == null ? 0 : this.inf.length;
        return count;
    }

    /**
     * Gets the value of Tp (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getTp() {
        return this.tp;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(tp);
        result = 31 * result + hashCodeOf(dt);
        result = 31 * result + hashCodeOf(ctry);
        result = 31 * result + hashCodeOf(cd);
        result = 31 * result + hashCodeOf(amt);
        result = 31 * result + hashCodeOf(inf);
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
            case 5:
                setTp(null);
                return;
            case 3:
                setDt(null);
                return;
            case 2:
                setCtry(null);
                return;
            case 1:
                setCd(null);
                return;
            case 0:
                setAmt(null);
                return;
            case 4:
                removeInf(index);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * Removes a Inf (0..*).
     * 
     * @param index
     * @param index The index of the Inf to get.
     */
    public void removeInf(int index) {
        if (this.inf == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        java.lang.String[] temp = this.inf;
        this.inf = new java.lang.String[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.inf, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.inf, index, temp.length-index-1);
        if (this.inf.length == 0)
            this.inf = null;
    }

    /**
     * [Virtual Element] Sets the value of Amt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAmt(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ActiveOrHistoricCurrencyAndAmount value) {
        this.amt = value;
        if (this.amt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.amt).setParent(this, "Amt");
    }

    /**
     * [Virtual Element] Sets the value of Cd (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCd(java.lang.String value) {
        this.cd = value;
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
     * [Virtual Element] Sets the value of Dt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setDt(biz.c24.io.api.data.ISO8601Date value) {
        this.dt = value;
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
            case 5:
                setTp((java.lang.String) value);
                return;
            case 3:
                setDt((biz.c24.io.api.data.ISO8601Date) value);
                return;
            case 2:
                setCtry((java.lang.String) value);
                return;
            case 1:
                setCd((java.lang.String) value);
                return;
            case 0:
                setAmt((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ActiveOrHistoricCurrencyAndAmount) value);
                return;
            case 4:
                if (value != null && value instanceof java.lang.String[]) {
                    setInf((java.lang.String[])value);
                } else if (this.inf == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.inf[index] = (java.lang.String) value;
                }
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of Inf (0..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setInf(java.lang.String[] value) {
        this.inf = (java.lang.String[]) biz.c24.io.api.Utils.clearNulls(value);
    }

    /**
     * [Virtual Element] Sets the value of Tp (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTp(java.lang.String value) {
        this.tp = value;
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.tp);
        out.writeObject(this.dt);
        out.writeObject(this.ctry);
        out.writeObject(this.cd);
        out.writeObject(this.amt);
        out.writeObject(this.inf);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.tp = (java.lang.String) in.readObject();
        this.dt = (biz.c24.io.api.data.ISO8601Date) in.readObject();
        this.ctry = (java.lang.String) in.readObject();
        this.cd = (java.lang.String) in.readObject();
        this.amt = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ActiveOrHistoricCurrencyAndAmount) in.readObject();
        this.inf = (java.lang.String[]) in.readObject();
    }

}
