/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * ChargesInformation6. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>TtlChrgsAndTaxAmt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount}
 * (0..1)</li>
 * <li><b>Amt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount}
 * (1)</li>
 * <li><b>CdtDbtInd</b> of type {@link java.lang.String}
 * (0..1)</li>
 * <li><b>Tp</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ChargeType2Choice}
 * (0..1)</li>
 * <li><b>Rate</b> of type {@link java.math.BigDecimal} (0..1)</li>
 * <li><b>Br</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>Pty</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BranchAndFinancialInstitutionIdentification4}
 * (0..1)</li>
 * <li><b>Tax</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TaxCharges2}
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
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ChargesInformation6Cls
 */
public class ChargesInformation6 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"Amt", "Br", "CdtDbtInd", "Pty", "Rate", "Tax", "Tp", "TtlChrgsAndTaxAmt"};

    /**
     * Field ttlChrgsAndTaxAmt.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount ttlChrgsAndTaxAmt;

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
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ChargeType2Choice tp;

    /**
     * Field rate.
     */
    private java.math.BigDecimal rate;

    /**
     * Field br.
     */
    private java.lang.String br;

    /**
     * Field pty.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BranchAndFinancialInstitutionIdentification4 pty;

    /**
     * Field tax.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TaxCharges2 tax;

    public ChargesInformation6() {
        this(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ChargesInformation6Cls.getInstance().getNullDefiningElementDecl());
    }

    public ChargesInformation6(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public ChargesInformation6(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public ChargesInformation6(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ChargesInformation6 clone) {
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
                setTtlChrgsAndTaxAmt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) value);
                return;
            case 0:
                setAmt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) value);
                return;
            case 2:
                setCdtDbtInd((java.lang.String) value);
                return;
            case 6:
                setTp((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ChargeType2Choice) value);
                return;
            case 4:
                setRate(biz.c24.io.api.Utils.decimalValue(value));
                return;
            case 1:
                setBr((java.lang.String) value);
                return;
            case 3:
                setPty((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 5:
                setTax((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TaxCharges2) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ChargesInformation6(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ChargesInformation6(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ChargesInformation6 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ChargesInformation6) clone;
        obj.ttlChrgsAndTaxAmt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) biz.c24.io.api.Utils.cloneDeep(this.ttlChrgsAndTaxAmt, obj, "TtlChrgsAndTaxAmt");
        obj.amt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) biz.c24.io.api.Utils.cloneDeep(this.amt, obj, "Amt");
        obj.cdtDbtInd = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.cdtDbtInd, obj, "CdtDbtInd");
        obj.tp = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ChargeType2Choice) biz.c24.io.api.Utils.cloneDeep(this.tp, obj, "Tp");
        obj.rate = (java.math.BigDecimal) biz.c24.io.api.Utils.cloneDeep(this.rate, obj, "Rate");
        obj.br = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.br, obj, "Br");
        obj.pty = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BranchAndFinancialInstitutionIdentification4) biz.c24.io.api.Utils.cloneDeep(this.pty, obj, "Pty");
        obj.tax = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TaxCharges2) biz.c24.io.api.Utils.cloneDeep(this.tax, obj, "Tax");
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
     * Creates, adds and returns a new Pty (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BranchAndFinancialInstitutionIdentification4 createPty() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BranchAndFinancialInstitutionIdentification4 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BranchAndFinancialInstitutionIdentification4) getElementDecl("Pty").createObject();
        setPty(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Tax (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TaxCharges2 createTax() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TaxCharges2 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TaxCharges2) getElementDecl("Tax").createObject();
        setTax(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Tp (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ChargeType2Choice createTp() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ChargeType2Choice obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ChargeType2Choice) getElementDecl("Tp").createObject();
        setTp(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new TtlChrgsAndTaxAmt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount createTtlChrgsAndTaxAmt() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) getElementDecl("TtlChrgsAndTaxAmt").createObject();
        setTtlChrgsAndTaxAmt(obj);
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
     * Gets the value of Br (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getBr() {
        return this.br;
    }

    /**
     * Gets the value of CdtDbtInd (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getCdtDbtInd() {
        return this.cdtDbtInd;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are:
     * <b>ttlChrgsAndTaxAmt, amt, cdtDbtInd, tp, rate, br, pty,
     * tax</b>.
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
                return getTtlChrgsAndTaxAmt();
            case 0:
                return getAmt();
            case 2:
                return getCdtDbtInd();
            case 6:
                return getTp();
            case 4:
                return getRate();
            case 1:
                return getBr();
            case 3:
                return getPty();
            case 5:
                return getTax();
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
                return this.ttlChrgsAndTaxAmt == null ? 0 : 1;
            case 0:
                return this.amt == null ? 0 : 1;
            case 2:
                return this.cdtDbtInd == null ? 0 : 1;
            case 6:
                return this.tp == null ? 0 : 1;
            case 4:
                return this.rate == null ? 0 : 1;
            case 1:
                return this.br == null ? 0 : 1;
            case 3:
                return this.pty == null ? 0 : 1;
            case 5:
                return this.tax == null ? 0 : 1;
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
                return this.ttlChrgsAndTaxAmt != null && this.ttlChrgsAndTaxAmt.equals(element) ? 0 : -1;
            case 0:
                return this.amt != null && this.amt.equals(element) ? 0 : -1;
            case 2:
                return this.cdtDbtInd != null && this.cdtDbtInd.equals(element) ? 0 : -1;
            case 6:
                return this.tp != null && this.tp.equals(element) ? 0 : -1;
            case 4:
                return this.rate != null && this.rate.equals(element) ? 0 : -1;
            case 1:
                return this.br != null && this.br.equals(element) ? 0 : -1;
            case 3:
                return this.pty != null && this.pty.equals(element) ? 0 : -1;
            case 5:
                return this.tax != null && this.tax.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of Pty (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BranchAndFinancialInstitutionIdentification4 getPty() {
        return this.pty;
    }

    /**
     * Gets the value of Rate (0..1).
     * 
     * @return The value.
     */
    public java.math.BigDecimal getRate() {
        return this.rate;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are:
     * <b>ttlChrgsAndTaxAmt, amt, cdtDbtInd, tp, rate, br, pty,
     * tax</b>.
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
                return this.ttlChrgsAndTaxAmt;
            case 0:
                return this.amt;
            case 2:
                return this.cdtDbtInd;
            case 6:
                return this.tp;
            case 4:
                return this.rate;
            case 1:
                return this.br;
            case 3:
                return this.pty;
            case 5:
                return this.tax;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of Tax (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TaxCharges2 getTax() {
        return this.tax;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.ttlChrgsAndTaxAmt == null ? 0 : 1;
        count += this.amt == null ? 0 : 1;
        count += this.cdtDbtInd == null ? 0 : 1;
        count += this.tp == null ? 0 : 1;
        count += this.rate == null ? 0 : 1;
        count += this.br == null ? 0 : 1;
        count += this.pty == null ? 0 : 1;
        count += this.tax == null ? 0 : 1;
        return count;
    }

    /**
     * Gets the value of Tp (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ChargeType2Choice getTp() {
        return this.tp;
    }

    /**
     * Gets the value of TtlChrgsAndTaxAmt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount getTtlChrgsAndTaxAmt() {
        return this.ttlChrgsAndTaxAmt;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(ttlChrgsAndTaxAmt);
        result = 31 * result + hashCodeOf(amt);
        result = 31 * result + hashCodeOf(cdtDbtInd);
        result = 31 * result + hashCodeOf(tp);
        result = 31 * result + hashCodeOf(rate);
        result = 31 * result + hashCodeOf(br);
        result = 31 * result + hashCodeOf(pty);
        result = 31 * result + hashCodeOf(tax);
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
            case 7:
                setTtlChrgsAndTaxAmt(null);
                return;
            case 0:
                setAmt(null);
                return;
            case 2:
                setCdtDbtInd(null);
                return;
            case 6:
                setTp(null);
                return;
            case 4:
                setRate(null);
                return;
            case 1:
                setBr(null);
                return;
            case 3:
                setPty(null);
                return;
            case 5:
                setTax(null);
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
     * [Virtual Element] Sets the value of Br (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setBr(java.lang.String value) {
        this.br = value;
    }

    /**
     * [Virtual Element] Sets the value of CdtDbtInd (0..1).
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
            case 7:
                setTtlChrgsAndTaxAmt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) value);
                return;
            case 0:
                setAmt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) value);
                return;
            case 2:
                setCdtDbtInd((java.lang.String) value);
                return;
            case 6:
                setTp((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ChargeType2Choice) value);
                return;
            case 4:
                setRate(biz.c24.io.api.Utils.decimalValue(value));
                return;
            case 1:
                setBr((java.lang.String) value);
                return;
            case 3:
                setPty((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 5:
                setTax((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TaxCharges2) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of Pty (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setPty(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BranchAndFinancialInstitutionIdentification4 value) {
        this.pty = value;
        if (this.pty != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.pty).setParent(this, "Pty");
    }

    /**
     * [Virtual Element] Sets the value of Rate (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setRate(java.math.BigDecimal value) {
        this.rate = value;
    }

    /**
     * [Virtual Element] Sets the value of Tax (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTax(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TaxCharges2 value) {
        this.tax = value;
        if (this.tax != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.tax).setParent(this, "Tax");
    }

    /**
     * [Virtual Element] Sets the value of Tp (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTp(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ChargeType2Choice value) {
        this.tp = value;
        if (this.tp != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.tp).setParent(this, "Tp");
    }

    /**
     * [Virtual Element] Sets the value of TtlChrgsAndTaxAmt
     * (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTtlChrgsAndTaxAmt(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlChrgsAndTaxAmt = value;
        if (this.ttlChrgsAndTaxAmt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.ttlChrgsAndTaxAmt).setParent(this, "TtlChrgsAndTaxAmt");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.ttlChrgsAndTaxAmt);
        out.writeObject(this.amt);
        out.writeObject(this.cdtDbtInd);
        out.writeObject(this.tp);
        out.writeObject(this.rate);
        out.writeObject(this.br);
        out.writeObject(this.pty);
        out.writeObject(this.tax);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.ttlChrgsAndTaxAmt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) in.readObject();
        this.amt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) in.readObject();
        this.cdtDbtInd = (java.lang.String) in.readObject();
        this.tp = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ChargeType2Choice) in.readObject();
        this.rate = (java.math.BigDecimal) in.readObject();
        this.br = (java.lang.String) in.readObject();
        this.pty = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BranchAndFinancialInstitutionIdentification4) in.readObject();
        this.tax = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TaxCharges2) in.readObject();
    }

}
