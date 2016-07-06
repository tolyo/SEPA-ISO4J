/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * TaxInformation3. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>Cdtr</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxParty1}
 * (0..1)</li>
 * <li><b>Dbtr</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxParty2}
 * (0..1)</li>
 * <li><b>AdmstnZn</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>RefNb</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>Mtd</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>TtlTaxblBaseAmt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount}
 * (0..1)</li>
 * <li><b>TtlTaxAmt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount}
 * (0..1)</li>
 * <li><b>Dt</b> of type {@link biz.c24.io.api.data.ISO8601Date}
 * (0..1)</li>
 * <li><b>SeqNb</b> of type {@link java.math.BigDecimal}
 * (0..1)</li>
 * <li><b>Rcrd</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecord1}
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
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxInformation3Cls
 */
public class TaxInformation3 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"AdmstnZn", "Cdtr", "Dbtr", "Dt", "Mtd", "Rcrd", "RefNb", "SeqNb", "TtlTaxAmt", "TtlTaxblBaseAmt"};

    /**
     * Field cdtr.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxParty1 cdtr;

    /**
     * Field dbtr.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxParty2 dbtr;

    /**
     * Field admstnZn.
     */
    private java.lang.String admstnZn;

    /**
     * Field refNb.
     */
    private java.lang.String refNb;

    /**
     * Field mtd.
     */
    private java.lang.String mtd;

    /**
     * Field ttlTaxblBaseAmt.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount ttlTaxblBaseAmt;

    /**
     * Field ttlTaxAmt.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount ttlTaxAmt;

    /**
     * Field dt.
     */
    private biz.c24.io.api.data.ISO8601Date dt;

    /**
     * Field seqNb.
     */
    private java.math.BigDecimal seqNb;

    /**
     * Field rcrd.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecord1[] rcrd;

    public TaxInformation3() {
        this(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxInformation3Cls.getInstance().getNullDefiningElementDecl());
    }

    public TaxInformation3(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public TaxInformation3(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public TaxInformation3(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxInformation3 clone) {
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
            case 1:
                setCdtr((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxParty1) value);
                return;
            case 2:
                setDbtr((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxParty2) value);
                return;
            case 0:
                setAdmstnZn((java.lang.String) value);
                return;
            case 6:
                setRefNb((java.lang.String) value);
                return;
            case 4:
                setMtd((java.lang.String) value);
                return;
            case 9:
                setTtlTaxblBaseAmt((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount) value);
                return;
            case 8:
                setTtlTaxAmt((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount) value);
                return;
            case 3:
                setDt((biz.c24.io.api.data.ISO8601Date) value);
                return;
            case 7:
                setSeqNb(biz.c24.io.api.Utils.decimalValue(value));
                return;
            case 5:
                addRcrd((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecord1) value);
                return;
            default:
                super.addElement(name, value);
        }
    }

    /**
     * Adds a Rcrd (0..*).
     * 
     * @param value
     * @param value The new Rcrd.
     */
    public void addRcrd(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecord1 value) {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecord1[] temp = this.rcrd;
        this.rcrd = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecord1[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.rcrd, 0, temp.length);
        this.rcrd[this.rcrd.length-1] = value;
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "Rcrd");
    }

    /**
     * Creates and returns a shallow clone of this object.
     * 
     * @see #cloneDeep()
     */
    public java.lang.Object clone() {
        return new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxInformation3(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxInformation3(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxInformation3 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxInformation3) clone;
        obj.cdtr = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxParty1) biz.c24.io.api.Utils.cloneDeep(this.cdtr, obj, "Cdtr");
        obj.dbtr = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxParty2) biz.c24.io.api.Utils.cloneDeep(this.dbtr, obj, "Dbtr");
        obj.admstnZn = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.admstnZn, obj, "AdmstnZn");
        obj.refNb = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.refNb, obj, "RefNb");
        obj.mtd = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.mtd, obj, "Mtd");
        obj.ttlTaxblBaseAmt = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount) biz.c24.io.api.Utils.cloneDeep(this.ttlTaxblBaseAmt, obj, "TtlTaxblBaseAmt");
        obj.ttlTaxAmt = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount) biz.c24.io.api.Utils.cloneDeep(this.ttlTaxAmt, obj, "TtlTaxAmt");
        obj.dt = (biz.c24.io.api.data.ISO8601Date) biz.c24.io.api.Utils.cloneDeep(this.dt, obj, "Dt");
        obj.seqNb = (java.math.BigDecimal) biz.c24.io.api.Utils.cloneDeep(this.seqNb, obj, "SeqNb");
        obj.rcrd = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecord1[]) biz.c24.io.api.Utils.cloneDeep(this.rcrd, obj, "Rcrd");
    }

    /**
     * Creates, adds and returns a new Cdtr (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxParty1 createCdtr() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxParty1 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxParty1) getElementDecl("Cdtr").createObject();
        setCdtr(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Dbtr (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxParty2 createDbtr() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxParty2 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxParty2) getElementDecl("Dbtr").createObject();
        setDbtr(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Rcrd (0..*).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecord1 createRcrd() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecord1 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecord1) getElementDecl("Rcrd").createObject();
        addRcrd(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new TtlTaxAmt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount createTtlTaxAmt() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount) getElementDecl("TtlTaxAmt").createObject();
        setTtlTaxAmt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new TtlTaxblBaseAmt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount createTtlTaxblBaseAmt() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount) getElementDecl("TtlTaxblBaseAmt").createObject();
        setTtlTaxblBaseAmt(obj);
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
     * Gets the value of AdmstnZn (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getAdmstnZn() {
        return this.admstnZn;
    }

    /**
     * Gets the value of Cdtr (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxParty1 getCdtr() {
        return this.cdtr;
    }

    /**
     * Gets the value of Dbtr (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxParty2 getDbtr() {
        return this.dbtr;
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
     * The legal value(s) for <code>name</code> are: <b>cdtr, dbtr,
     * admstnZn, refNb, mtd, ttlTaxblBaseAmt, ttlTaxAmt, dt, seqNb,
     * rcrd</b>.
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
                return getCdtr();
            case 2:
                return getDbtr();
            case 0:
                return getAdmstnZn();
            case 6:
                return getRefNb();
            case 4:
                return getMtd();
            case 9:
                return getTtlTaxblBaseAmt();
            case 8:
                return getTtlTaxAmt();
            case 3:
                return getDt();
            case 7:
                return getSeqNb();
            case 5:
            if (this.rcrd == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.rcrd[index];
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
                return this.cdtr == null ? 0 : 1;
            case 2:
                return this.dbtr == null ? 0 : 1;
            case 0:
                return this.admstnZn == null ? 0 : 1;
            case 6:
                return this.refNb == null ? 0 : 1;
            case 4:
                return this.mtd == null ? 0 : 1;
            case 9:
                return this.ttlTaxblBaseAmt == null ? 0 : 1;
            case 8:
                return this.ttlTaxAmt == null ? 0 : 1;
            case 3:
                return this.dt == null ? 0 : 1;
            case 7:
                return this.seqNb == null ? 0 : 1;
            case 5:
                return this.rcrd == null ? 0 : this.rcrd.length;
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
                return this.cdtr != null && this.cdtr.equals(element) ? 0 : -1;
            case 2:
                return this.dbtr != null && this.dbtr.equals(element) ? 0 : -1;
            case 0:
                return this.admstnZn != null && this.admstnZn.equals(element) ? 0 : -1;
            case 6:
                return this.refNb != null && this.refNb.equals(element) ? 0 : -1;
            case 4:
                return this.mtd != null && this.mtd.equals(element) ? 0 : -1;
            case 9:
                return this.ttlTaxblBaseAmt != null && this.ttlTaxblBaseAmt.equals(element) ? 0 : -1;
            case 8:
                return this.ttlTaxAmt != null && this.ttlTaxAmt.equals(element) ? 0 : -1;
            case 3:
                return this.dt != null && this.dt.equals(element) ? 0 : -1;
            case 7:
                return this.seqNb != null && this.seqNb.equals(element) ? 0 : -1;
            case 5:
                return getRcrdIndex((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecord1) element);
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of Mtd (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getMtd() {
        return this.mtd;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>cdtr, dbtr,
     * admstnZn, refNb, mtd, ttlTaxblBaseAmt, ttlTaxAmt, dt, seqNb,
     * rcrd</b>.
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
                return this.cdtr;
            case 2:
                return this.dbtr;
            case 0:
                return this.admstnZn;
            case 6:
                return this.refNb;
            case 4:
                return this.mtd;
            case 9:
                return this.ttlTaxblBaseAmt;
            case 8:
                return this.ttlTaxAmt;
            case 3:
                return this.dt;
            case 7:
                return this.seqNb;
            case 5:
            if (this.rcrd == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.rcrd[index];
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of Rcrd (0..*).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecord1[] getRcrd() {
        if (this.rcrd == null)
            return new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecord1[]{};
        else
            return this.rcrd;
    }

    /**
     * Gets the value of Rcrd by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecord1 getRcrd(int ordinal) {
        if (this.rcrd == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.rcrd.length) {
            return this.rcrd[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (0..*).
     * 
     * @param value
     * @param value The Rcrd to get the index of.
     * @return The index.
     */
    public int getRcrdIndex(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecord1 value) {
        if (this.rcrd == null)
            return -1;
        for (int i=0; i<this.rcrd.length; i++)
            if (this.rcrd[i] == value)
                return i;
        return -1;
    }

    /**
     * Gets the value of RefNb (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getRefNb() {
        return this.refNb;
    }

    /**
     * Gets the value of SeqNb (0..1).
     * 
     * @return The value.
     */
    public java.math.BigDecimal getSeqNb() {
        return this.seqNb;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.cdtr == null ? 0 : 1;
        count += this.dbtr == null ? 0 : 1;
        count += this.admstnZn == null ? 0 : 1;
        count += this.refNb == null ? 0 : 1;
        count += this.mtd == null ? 0 : 1;
        count += this.ttlTaxblBaseAmt == null ? 0 : 1;
        count += this.ttlTaxAmt == null ? 0 : 1;
        count += this.dt == null ? 0 : 1;
        count += this.seqNb == null ? 0 : 1;
        count += this.rcrd == null ? 0 : this.rcrd.length;
        return count;
    }

    /**
     * Gets the value of TtlTaxAmt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount getTtlTaxAmt() {
        return this.ttlTaxAmt;
    }

    /**
     * Gets the value of TtlTaxblBaseAmt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount getTtlTaxblBaseAmt() {
        return this.ttlTaxblBaseAmt;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(cdtr);
        result = 31 * result + hashCodeOf(dbtr);
        result = 31 * result + hashCodeOf(admstnZn);
        result = 31 * result + hashCodeOf(refNb);
        result = 31 * result + hashCodeOf(mtd);
        result = 31 * result + hashCodeOf(ttlTaxblBaseAmt);
        result = 31 * result + hashCodeOf(ttlTaxAmt);
        result = 31 * result + hashCodeOf(dt);
        result = 31 * result + hashCodeOf(seqNb);
        result = 31 * result + hashCodeOf(rcrd);
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
            case 1:
                setCdtr(null);
                return;
            case 2:
                setDbtr(null);
                return;
            case 0:
                setAdmstnZn(null);
                return;
            case 6:
                setRefNb(null);
                return;
            case 4:
                setMtd(null);
                return;
            case 9:
                setTtlTaxblBaseAmt(null);
                return;
            case 8:
                setTtlTaxAmt(null);
                return;
            case 3:
                setDt(null);
                return;
            case 7:
                setSeqNb(null);
                return;
            case 5:
                removeRcrd(index);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * Removes a Rcrd (0..*).
     * 
     * @param index
     * @param index The index of the Rcrd to get.
     */
    public void removeRcrd(int index) {
        if (this.rcrd == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecord1[] temp = this.rcrd;
        this.rcrd = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecord1[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.rcrd, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.rcrd, index, temp.length-index-1);
        if (this.rcrd.length == 0)
            this.rcrd = null;
    }

    /**
     * [Virtual Element] Sets the value of AdmstnZn (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAdmstnZn(java.lang.String value) {
        this.admstnZn = value;
    }

    /**
     * [Virtual Element] Sets the value of Cdtr (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCdtr(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxParty1 value) {
        this.cdtr = value;
        if (this.cdtr != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.cdtr).setParent(this, "Cdtr");
    }

    /**
     * [Virtual Element] Sets the value of Dbtr (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setDbtr(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxParty2 value) {
        this.dbtr = value;
        if (this.dbtr != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.dbtr).setParent(this, "Dbtr");
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
            case 1:
                setCdtr((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxParty1) value);
                return;
            case 2:
                setDbtr((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxParty2) value);
                return;
            case 0:
                setAdmstnZn((java.lang.String) value);
                return;
            case 6:
                setRefNb((java.lang.String) value);
                return;
            case 4:
                setMtd((java.lang.String) value);
                return;
            case 9:
                setTtlTaxblBaseAmt((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount) value);
                return;
            case 8:
                setTtlTaxAmt((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount) value);
                return;
            case 3:
                setDt((biz.c24.io.api.data.ISO8601Date) value);
                return;
            case 7:
                setSeqNb(biz.c24.io.api.Utils.decimalValue(value));
                return;
            case 5:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecord1[]) {
                    setRcrd((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecord1[])value);
                } else if (this.rcrd == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.rcrd[index] = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecord1) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.rcrd[index]).setParent(this, "Rcrd");
                }
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of Mtd (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setMtd(java.lang.String value) {
        this.mtd = value;
    }

    /**
     * [Virtual Element] Sets the value of Rcrd (0..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setRcrd(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecord1[] value) {
        this.rcrd = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecord1[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.rcrd != null && i<this.rcrd.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.rcrd[i]).setParent(this, "Rcrd");
    }

    /**
     * [Virtual Element] Sets the value of RefNb (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setRefNb(java.lang.String value) {
        this.refNb = value;
    }

    /**
     * [Virtual Element] Sets the value of SeqNb (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setSeqNb(java.math.BigDecimal value) {
        this.seqNb = value;
    }

    /**
     * [Virtual Element] Sets the value of TtlTaxAmt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTtlTaxAmt(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlTaxAmt = value;
        if (this.ttlTaxAmt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.ttlTaxAmt).setParent(this, "TtlTaxAmt");
    }

    /**
     * [Virtual Element] Sets the value of TtlTaxblBaseAmt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTtlTaxblBaseAmt(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlTaxblBaseAmt = value;
        if (this.ttlTaxblBaseAmt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.ttlTaxblBaseAmt).setParent(this, "TtlTaxblBaseAmt");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.cdtr);
        out.writeObject(this.dbtr);
        out.writeObject(this.admstnZn);
        out.writeObject(this.refNb);
        out.writeObject(this.mtd);
        out.writeObject(this.ttlTaxblBaseAmt);
        out.writeObject(this.ttlTaxAmt);
        out.writeObject(this.dt);
        out.writeObject(this.seqNb);
        out.writeObject(this.rcrd);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.cdtr = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxParty1) in.readObject();
        this.dbtr = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxParty2) in.readObject();
        this.admstnZn = (java.lang.String) in.readObject();
        this.refNb = (java.lang.String) in.readObject();
        this.mtd = (java.lang.String) in.readObject();
        this.ttlTaxblBaseAmt = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount) in.readObject();
        this.ttlTaxAmt = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount) in.readObject();
        this.dt = (biz.c24.io.api.data.ISO8601Date) in.readObject();
        this.seqNb = (java.math.BigDecimal) in.readObject();
        this.rcrd = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecord1[]) in.readObject();
    }

}
