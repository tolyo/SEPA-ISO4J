/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * CashBalance3. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>Tp</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BalanceType12}
 * (1)</li>
 * <li><b>CdtLine</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CreditLine2}
 * (0..1)</li>
 * <li><b>Amt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount}
 * (1)</li>
 * <li><b>CdtDbtInd</b> of type {@link java.lang.String} (1)</li>
 * <li><b>Dt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateAndDateTimeChoice}
 * (1)</li>
 * <li><b>Avlbty</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2}
 * (0..*)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalance3Cls
 */
public class CashBalance3 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"Amt", "Avlbty", "CdtDbtInd", "CdtLine", "Dt", "Tp"};

    /**
     * Field tp.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BalanceType12 tp;

    /**
     * Field cdtLine.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CreditLine2 cdtLine;

    /**
     * Field amt.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount amt;

    /**
     * Field cdtDbtInd.
     */
    private java.lang.String cdtDbtInd;

    /**
     * Field dt.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateAndDateTimeChoice dt;

    /**
     * Field avlbty.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2[] avlbty;

    public CashBalance3() {
        this(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalance3Cls.getInstance().getNullDefiningElementDecl());
    }

    public CashBalance3(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public CashBalance3(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public CashBalance3(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalance3 clone) {
        super(clone);
    }

    /**
     * Adds a Avlbty (0..*).
     * 
     * @param value
     * @param value The new Avlbty.
     */
    public void addAvlbty(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2 value) {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2[] temp = this.avlbty;
        this.avlbty = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.avlbty, 0, temp.length);
        this.avlbty[this.avlbty.length-1] = value;
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "Avlbty");
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
                setTp((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BalanceType12) value);
                return;
            case 3:
                setCdtLine((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CreditLine2) value);
                return;
            case 0:
                setAmt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) value);
                return;
            case 2:
                setCdtDbtInd((java.lang.String) value);
                return;
            case 4:
                setDt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateAndDateTimeChoice) value);
                return;
            case 1:
                addAvlbty((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalance3(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalance3(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalance3 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalance3) clone;
        obj.tp = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BalanceType12) biz.c24.io.api.Utils.cloneDeep(this.tp, obj, "Tp");
        obj.cdtLine = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CreditLine2) biz.c24.io.api.Utils.cloneDeep(this.cdtLine, obj, "CdtLine");
        obj.amt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) biz.c24.io.api.Utils.cloneDeep(this.amt, obj, "Amt");
        obj.cdtDbtInd = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.cdtDbtInd, obj, "CdtDbtInd");
        obj.dt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateAndDateTimeChoice) biz.c24.io.api.Utils.cloneDeep(this.dt, obj, "Dt");
        obj.avlbty = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2[]) biz.c24.io.api.Utils.cloneDeep(this.avlbty, obj, "Avlbty");
    }

    /**
     * Creates, adds and returns a new Amt (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount createAmt() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) getElementDecl("Amt").createObject();
        setAmt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Avlbty (0..*).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2 createAvlbty() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2) getElementDecl("Avlbty").createObject();
        addAvlbty(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new CdtLine (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CreditLine2 createCdtLine() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CreditLine2 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CreditLine2) getElementDecl("CdtLine").createObject();
        setCdtLine(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Dt (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateAndDateTimeChoice createDt() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateAndDateTimeChoice obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateAndDateTimeChoice) getElementDecl("Dt").createObject();
        setDt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Tp (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BalanceType12 createTp() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BalanceType12 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BalanceType12) getElementDecl("Tp").createObject();
        setTp(obj);
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
     * Gets the value of Amt (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount getAmt() {
        return this.amt;
    }

    /**
     * Gets the value of Avlbty (0..*).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2[] getAvlbty() {
        if (this.avlbty == null)
            return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2[]{};
        else
            return this.avlbty;
    }

    /**
     * Gets the value of Avlbty by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2 getAvlbty(int ordinal) {
        if (this.avlbty == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.avlbty.length) {
            return this.avlbty[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (0..*).
     * 
     * @param value
     * @param value The Avlbty to get the index of.
     * @return The index.
     */
    public int getAvlbtyIndex(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2 value) {
        if (this.avlbty == null)
            return -1;
        for (int i=0; i<this.avlbty.length; i++)
            if (this.avlbty[i] == value)
                return i;
        return -1;
    }

    /**
     * Gets the value of CdtDbtInd (1).
     * 
     * @return The value.
     */
    public java.lang.String getCdtDbtInd() {
        return this.cdtDbtInd;
    }

    /**
     * Gets the value of CdtLine (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CreditLine2 getCdtLine() {
        return this.cdtLine;
    }

    /**
     * Gets the value of Dt (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateAndDateTimeChoice getDt() {
        return this.dt;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>tp,
     * cdtLine, amt, cdtDbtInd, dt, avlbty</b>.
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
                return getCdtLine();
            case 0:
                return getAmt();
            case 2:
                return getCdtDbtInd();
            case 4:
                return getDt();
            case 1:
            if (this.avlbty == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.avlbty[index];
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
                return this.cdtLine == null ? 0 : 1;
            case 0:
                return this.amt == null ? 0 : 1;
            case 2:
                return this.cdtDbtInd == null ? 0 : 1;
            case 4:
                return this.dt == null ? 0 : 1;
            case 1:
                return this.avlbty == null ? 0 : this.avlbty.length;
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
                return this.cdtLine != null && this.cdtLine.equals(element) ? 0 : -1;
            case 0:
                return this.amt != null && this.amt.equals(element) ? 0 : -1;
            case 2:
                return this.cdtDbtInd != null && this.cdtDbtInd.equals(element) ? 0 : -1;
            case 4:
                return this.dt != null && this.dt.equals(element) ? 0 : -1;
            case 1:
                return getAvlbtyIndex((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2) element);
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>tp,
     * cdtLine, amt, cdtDbtInd, dt, avlbty</b>.
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
                return this.cdtLine;
            case 0:
                return this.amt;
            case 2:
                return this.cdtDbtInd;
            case 4:
                return this.dt;
            case 1:
            if (this.avlbty == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.avlbty[index];
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.tp == null ? 0 : 1;
        count += this.cdtLine == null ? 0 : 1;
        count += this.amt == null ? 0 : 1;
        count += this.cdtDbtInd == null ? 0 : 1;
        count += this.dt == null ? 0 : 1;
        count += this.avlbty == null ? 0 : this.avlbty.length;
        return count;
    }

    /**
     * Gets the value of Tp (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BalanceType12 getTp() {
        return this.tp;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(tp);
        result = 31 * result + hashCodeOf(cdtLine);
        result = 31 * result + hashCodeOf(amt);
        result = 31 * result + hashCodeOf(cdtDbtInd);
        result = 31 * result + hashCodeOf(dt);
        result = 31 * result + hashCodeOf(avlbty);
        return result;
    }

    /**
     * Removes a Avlbty (0..*).
     * 
     * @param index
     * @param index The index of the Avlbty to get.
     */
    public void removeAvlbty(int index) {
        if (this.avlbty == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2[] temp = this.avlbty;
        this.avlbty = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.avlbty, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.avlbty, index, temp.length-index-1);
        if (this.avlbty.length == 0)
            this.avlbty = null;
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
                setCdtLine(null);
                return;
            case 0:
                setAmt(null);
                return;
            case 2:
                setCdtDbtInd(null);
                return;
            case 4:
                setDt(null);
                return;
            case 1:
                removeAvlbty(index);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of Amt (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAmt(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount value) {
        this.amt = value;
        if (this.amt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.amt).setParent(this, "Amt");
    }

    /**
     * [Virtual Element] Sets the value of Avlbty (0..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAvlbty(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2[] value) {
        this.avlbty = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.avlbty != null && i<this.avlbty.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.avlbty[i]).setParent(this, "Avlbty");
    }

    /**
     * [Virtual Element] Sets the value of CdtDbtInd (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCdtDbtInd(java.lang.String value) {
        this.cdtDbtInd = value;
    }

    /**
     * [Virtual Element] Sets the value of CdtLine (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCdtLine(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CreditLine2 value) {
        this.cdtLine = value;
        if (this.cdtLine != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.cdtLine).setParent(this, "CdtLine");
    }

    /**
     * [Virtual Element] Sets the value of Dt (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setDt(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateAndDateTimeChoice value) {
        this.dt = value;
        if (this.dt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.dt).setParent(this, "Dt");
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
                setTp((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BalanceType12) value);
                return;
            case 3:
                setCdtLine((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CreditLine2) value);
                return;
            case 0:
                setAmt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) value);
                return;
            case 2:
                setCdtDbtInd((java.lang.String) value);
                return;
            case 4:
                setDt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateAndDateTimeChoice) value);
                return;
            case 1:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2[]) {
                    setAvlbty((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2[])value);
                } else if (this.avlbty == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.avlbty[index] = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.avlbty[index]).setParent(this, "Avlbty");
                }
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of Tp (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTp(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BalanceType12 value) {
        this.tp = value;
        if (this.tp != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.tp).setParent(this, "Tp");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.tp);
        out.writeObject(this.cdtLine);
        out.writeObject(this.amt);
        out.writeObject(this.cdtDbtInd);
        out.writeObject(this.dt);
        out.writeObject(this.avlbty);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.tp = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BalanceType12) in.readObject();
        this.cdtLine = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CreditLine2) in.readObject();
        this.amt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) in.readObject();
        this.cdtDbtInd = (java.lang.String) in.readObject();
        this.dt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateAndDateTimeChoice) in.readObject();
        this.avlbty = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2[]) in.readObject();
    }

}
