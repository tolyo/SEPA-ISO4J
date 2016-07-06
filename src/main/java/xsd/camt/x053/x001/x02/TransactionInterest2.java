/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * TransactionInterest2. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>Amt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount}
 * (1)</li>
 * <li><b>CdtDbtInd</b> of type {@link java.lang.String} (1)</li>
 * <li><b>Tp</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.InterestType1Choice}
 * (0..1)</li>
 * <li><b>Rate</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Rate3}
 * (0..*)</li>
 * <li><b>FrToDt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateTimePeriodDetails}
 * (0..1)</li>
 * <li><b>Rsn</b> of type {@link java.lang.String} (0..1)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionInterest2Cls
 */
public class TransactionInterest2 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"Amt", "CdtDbtInd", "FrToDt", "Rate", "Rsn", "Tp"};

    /**
     * Field amt.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount amt;

    /**
     * Field cdtDbtInd.
     */
    private java.lang.String cdtDbtInd;

    /**
     * Field tp.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.InterestType1Choice tp;

    /**
     * Field rate.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Rate3[] rate;

    /**
     * Field frToDt.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateTimePeriodDetails frToDt;

    /**
     * Field rsn.
     */
    private java.lang.String rsn;

    public TransactionInterest2() {
        this(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionInterest2Cls.getInstance().getNullDefiningElementDecl());
    }

    public TransactionInterest2(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public TransactionInterest2(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public TransactionInterest2(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionInterest2 clone) {
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
                setAmt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) value);
                return;
            case 1:
                setCdtDbtInd((java.lang.String) value);
                return;
            case 5:
                setTp((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.InterestType1Choice) value);
                return;
            case 3:
                addRate((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Rate3) value);
                return;
            case 2:
                setFrToDt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateTimePeriodDetails) value);
                return;
            case 4:
                setRsn((java.lang.String) value);
                return;
            default:
                super.addElement(name, value);
        }
    }

    /**
     * Adds a Rate (0..*).
     * 
     * @param value
     * @param value The new Rate.
     */
    public void addRate(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Rate3 value) {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Rate3[] temp = this.rate;
        this.rate = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Rate3[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.rate, 0, temp.length);
        this.rate[this.rate.length-1] = value;
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "Rate");
    }

    /**
     * Creates and returns a shallow clone of this object.
     * 
     * @see #cloneDeep()
     */
    public java.lang.Object clone() {
        return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionInterest2(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionInterest2(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionInterest2 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionInterest2) clone;
        obj.amt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) biz.c24.io.api.Utils.cloneDeep(this.amt, obj, "Amt");
        obj.cdtDbtInd = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.cdtDbtInd, obj, "CdtDbtInd");
        obj.tp = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.InterestType1Choice) biz.c24.io.api.Utils.cloneDeep(this.tp, obj, "Tp");
        obj.rate = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Rate3[]) biz.c24.io.api.Utils.cloneDeep(this.rate, obj, "Rate");
        obj.frToDt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateTimePeriodDetails) biz.c24.io.api.Utils.cloneDeep(this.frToDt, obj, "FrToDt");
        obj.rsn = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.rsn, obj, "Rsn");
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
     * Creates, adds and returns a new FrToDt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateTimePeriodDetails createFrToDt() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateTimePeriodDetails obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateTimePeriodDetails) getElementDecl("FrToDt").createObject();
        setFrToDt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Rate (0..*).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Rate3 createRate() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Rate3 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Rate3) getElementDecl("Rate").createObject();
        addRate(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Tp (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.InterestType1Choice createTp() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.InterestType1Choice obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.InterestType1Choice) getElementDecl("Tp").createObject();
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
     * Gets the value of CdtDbtInd (1).
     * 
     * @return The value.
     */
    public java.lang.String getCdtDbtInd() {
        return this.cdtDbtInd;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>amt,
     * cdtDbtInd, tp, rate, frToDt, rsn</b>.
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
                return getAmt();
            case 1:
                return getCdtDbtInd();
            case 5:
                return getTp();
            case 3:
            if (this.rate == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.rate[index];
            case 2:
                return getFrToDt();
            case 4:
                return getRsn();
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
                return this.amt == null ? 0 : 1;
            case 1:
                return this.cdtDbtInd == null ? 0 : 1;
            case 5:
                return this.tp == null ? 0 : 1;
            case 3:
                return this.rate == null ? 0 : this.rate.length;
            case 2:
                return this.frToDt == null ? 0 : 1;
            case 4:
                return this.rsn == null ? 0 : 1;
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
                return this.amt != null && this.amt.equals(element) ? 0 : -1;
            case 1:
                return this.cdtDbtInd != null && this.cdtDbtInd.equals(element) ? 0 : -1;
            case 5:
                return this.tp != null && this.tp.equals(element) ? 0 : -1;
            case 3:
                return getRateIndex((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Rate3) element);
            case 2:
                return this.frToDt != null && this.frToDt.equals(element) ? 0 : -1;
            case 4:
                return this.rsn != null && this.rsn.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of FrToDt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateTimePeriodDetails getFrToDt() {
        return this.frToDt;
    }

    /**
     * Gets the value of Rate (0..*).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Rate3[] getRate() {
        if (this.rate == null)
            return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Rate3[]{};
        else
            return this.rate;
    }

    /**
     * Gets the value of Rate by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Rate3 getRate(int ordinal) {
        if (this.rate == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.rate.length) {
            return this.rate[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (0..*).
     * 
     * @param value
     * @param value The Rate to get the index of.
     * @return The index.
     */
    public int getRateIndex(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Rate3 value) {
        if (this.rate == null)
            return -1;
        for (int i=0; i<this.rate.length; i++)
            if (this.rate[i] == value)
                return i;
        return -1;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>amt,
     * cdtDbtInd, tp, rate, frToDt, rsn</b>.
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
                return this.amt;
            case 1:
                return this.cdtDbtInd;
            case 5:
                return this.tp;
            case 3:
            if (this.rate == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.rate[index];
            case 2:
                return this.frToDt;
            case 4:
                return this.rsn;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of Rsn (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getRsn() {
        return this.rsn;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.amt == null ? 0 : 1;
        count += this.cdtDbtInd == null ? 0 : 1;
        count += this.tp == null ? 0 : 1;
        count += this.rate == null ? 0 : this.rate.length;
        count += this.frToDt == null ? 0 : 1;
        count += this.rsn == null ? 0 : 1;
        return count;
    }

    /**
     * Gets the value of Tp (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.InterestType1Choice getTp() {
        return this.tp;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(amt);
        result = 31 * result + hashCodeOf(cdtDbtInd);
        result = 31 * result + hashCodeOf(tp);
        result = 31 * result + hashCodeOf(rate);
        result = 31 * result + hashCodeOf(frToDt);
        result = 31 * result + hashCodeOf(rsn);
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
                setAmt(null);
                return;
            case 1:
                setCdtDbtInd(null);
                return;
            case 5:
                setTp(null);
                return;
            case 3:
                removeRate(index);
                return;
            case 2:
                setFrToDt(null);
                return;
            case 4:
                setRsn(null);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * Removes a Rate (0..*).
     * 
     * @param index
     * @param index The index of the Rate to get.
     */
    public void removeRate(int index) {
        if (this.rate == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Rate3[] temp = this.rate;
        this.rate = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Rate3[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.rate, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.rate, index, temp.length-index-1);
        if (this.rate.length == 0)
            this.rate = null;
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
     * [Virtual Element] Sets the value of CdtDbtInd (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCdtDbtInd(java.lang.String value) {
        this.cdtDbtInd = value;
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
                setAmt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) value);
                return;
            case 1:
                setCdtDbtInd((java.lang.String) value);
                return;
            case 5:
                setTp((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.InterestType1Choice) value);
                return;
            case 3:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Rate3[]) {
                    setRate((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Rate3[])value);
                } else if (this.rate == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.rate[index] = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Rate3) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.rate[index]).setParent(this, "Rate");
                }
                return;
            case 2:
                setFrToDt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateTimePeriodDetails) value);
                return;
            case 4:
                setRsn((java.lang.String) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of FrToDt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setFrToDt(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateTimePeriodDetails value) {
        this.frToDt = value;
        if (this.frToDt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.frToDt).setParent(this, "FrToDt");
    }

    /**
     * [Virtual Element] Sets the value of Rate (0..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setRate(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Rate3[] value) {
        this.rate = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Rate3[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.rate != null && i<this.rate.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.rate[i]).setParent(this, "Rate");
    }

    /**
     * [Virtual Element] Sets the value of Rsn (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setRsn(java.lang.String value) {
        this.rsn = value;
    }

    /**
     * [Virtual Element] Sets the value of Tp (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTp(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.InterestType1Choice value) {
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
        out.writeObject(this.amt);
        out.writeObject(this.cdtDbtInd);
        out.writeObject(this.tp);
        out.writeObject(this.rate);
        out.writeObject(this.frToDt);
        out.writeObject(this.rsn);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.amt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) in.readObject();
        this.cdtDbtInd = (java.lang.String) in.readObject();
        this.tp = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.InterestType1Choice) in.readObject();
        this.rate = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Rate3[]) in.readObject();
        this.frToDt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateTimePeriodDetails) in.readObject();
        this.rsn = (java.lang.String) in.readObject();
    }

}
