/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * TransactionDates2. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>AccptncDtTm</b> of type {@link
 * biz.c24.io.api.data.ISO8601DateTime} (0..1)</li>
 * <li><b>TradActvtyCtrctlSttlmDt</b> of type {@link
 * biz.c24.io.api.data.ISO8601Date} (0..1)</li>
 * <li><b>TradDt</b> of type {@link
 * biz.c24.io.api.data.ISO8601Date} (0..1)</li>
 * <li><b>IntrBkSttlmDt</b> of type {@link
 * biz.c24.io.api.data.ISO8601Date} (0..1)</li>
 * <li><b>StartDt</b> of type {@link
 * biz.c24.io.api.data.ISO8601Date} (0..1)</li>
 * <li><b>EndDt</b> of type {@link biz.c24.io.api.data.ISO8601Date}
 * (0..1)</li>
 * <li><b>TxDtTm</b> of type {@link
 * biz.c24.io.api.data.ISO8601DateTime} (0..1)</li>
 * <li><b>Prtry</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryDate2}
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
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionDates2Cls
 */
public class TransactionDates2 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"AccptncDtTm", "EndDt", "IntrBkSttlmDt", "Prtry", "StartDt", "TradActvtyCtrctlSttlmDt", "TradDt", "TxDtTm"};

    /**
     * Field accptncDtTm.
     */
    private biz.c24.io.api.data.ISO8601DateTime accptncDtTm;

    /**
     * Field tradActvtyCtrctlSttlmDt.
     */
    private biz.c24.io.api.data.ISO8601Date tradActvtyCtrctlSttlmDt;

    /**
     * Field tradDt.
     */
    private biz.c24.io.api.data.ISO8601Date tradDt;

    /**
     * Field intrBkSttlmDt.
     */
    private biz.c24.io.api.data.ISO8601Date intrBkSttlmDt;

    /**
     * Field startDt.
     */
    private biz.c24.io.api.data.ISO8601Date startDt;

    /**
     * Field endDt.
     */
    private biz.c24.io.api.data.ISO8601Date endDt;

    /**
     * Field txDtTm.
     */
    private biz.c24.io.api.data.ISO8601DateTime txDtTm;

    /**
     * Field prtry.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryDate2[] prtry;

    public TransactionDates2() {
        this(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionDates2Cls.getInstance().getNullDefiningElementDecl());
    }

    public TransactionDates2(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public TransactionDates2(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public TransactionDates2(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionDates2 clone) {
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
                setAccptncDtTm((biz.c24.io.api.data.ISO8601DateTime) value);
                return;
            case 5:
                setTradActvtyCtrctlSttlmDt((biz.c24.io.api.data.ISO8601Date) value);
                return;
            case 6:
                setTradDt((biz.c24.io.api.data.ISO8601Date) value);
                return;
            case 2:
                setIntrBkSttlmDt((biz.c24.io.api.data.ISO8601Date) value);
                return;
            case 4:
                setStartDt((biz.c24.io.api.data.ISO8601Date) value);
                return;
            case 1:
                setEndDt((biz.c24.io.api.data.ISO8601Date) value);
                return;
            case 7:
                setTxDtTm((biz.c24.io.api.data.ISO8601DateTime) value);
                return;
            case 3:
                addPrtry((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryDate2) value);
                return;
            default:
                super.addElement(name, value);
        }
    }

    /**
     * Adds a Prtry (0..*).
     * 
     * @param value
     * @param value The new Prtry.
     */
    public void addPrtry(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryDate2 value) {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryDate2[] temp = this.prtry;
        this.prtry = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryDate2[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.prtry, 0, temp.length);
        this.prtry[this.prtry.length-1] = value;
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "Prtry");
    }

    /**
     * Creates and returns a shallow clone of this object.
     * 
     * @see #cloneDeep()
     */
    public java.lang.Object clone() {
        return new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionDates2(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionDates2(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionDates2 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionDates2) clone;
        obj.accptncDtTm = (biz.c24.io.api.data.ISO8601DateTime) biz.c24.io.api.Utils.cloneDeep(this.accptncDtTm, obj, "AccptncDtTm");
        obj.tradActvtyCtrctlSttlmDt = (biz.c24.io.api.data.ISO8601Date) biz.c24.io.api.Utils.cloneDeep(this.tradActvtyCtrctlSttlmDt, obj, "TradActvtyCtrctlSttlmDt");
        obj.tradDt = (biz.c24.io.api.data.ISO8601Date) biz.c24.io.api.Utils.cloneDeep(this.tradDt, obj, "TradDt");
        obj.intrBkSttlmDt = (biz.c24.io.api.data.ISO8601Date) biz.c24.io.api.Utils.cloneDeep(this.intrBkSttlmDt, obj, "IntrBkSttlmDt");
        obj.startDt = (biz.c24.io.api.data.ISO8601Date) biz.c24.io.api.Utils.cloneDeep(this.startDt, obj, "StartDt");
        obj.endDt = (biz.c24.io.api.data.ISO8601Date) biz.c24.io.api.Utils.cloneDeep(this.endDt, obj, "EndDt");
        obj.txDtTm = (biz.c24.io.api.data.ISO8601DateTime) biz.c24.io.api.Utils.cloneDeep(this.txDtTm, obj, "TxDtTm");
        obj.prtry = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryDate2[]) biz.c24.io.api.Utils.cloneDeep(this.prtry, obj, "Prtry");
    }

    /**
     * Creates, adds and returns a new Prtry (0..*).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryDate2 createPrtry() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryDate2 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryDate2) getElementDecl("Prtry").createObject();
        addPrtry(obj);
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
     * Gets the value of AccptncDtTm (0..1).
     * 
     * @return The value.
     */
    public biz.c24.io.api.data.ISO8601DateTime getAccptncDtTm() {
        return this.accptncDtTm;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are:
     * <b>accptncDtTm, tradActvtyCtrctlSttlmDt, tradDt,
     * intrBkSttlmDt, startDt, endDt, txDtTm, prtry</b>.
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
                return getAccptncDtTm();
            case 5:
                return getTradActvtyCtrctlSttlmDt();
            case 6:
                return getTradDt();
            case 2:
                return getIntrBkSttlmDt();
            case 4:
                return getStartDt();
            case 1:
                return getEndDt();
            case 7:
                return getTxDtTm();
            case 3:
            if (this.prtry == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.prtry[index];
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
                return this.accptncDtTm == null ? 0 : 1;
            case 5:
                return this.tradActvtyCtrctlSttlmDt == null ? 0 : 1;
            case 6:
                return this.tradDt == null ? 0 : 1;
            case 2:
                return this.intrBkSttlmDt == null ? 0 : 1;
            case 4:
                return this.startDt == null ? 0 : 1;
            case 1:
                return this.endDt == null ? 0 : 1;
            case 7:
                return this.txDtTm == null ? 0 : 1;
            case 3:
                return this.prtry == null ? 0 : this.prtry.length;
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
                return this.accptncDtTm != null && this.accptncDtTm.equals(element) ? 0 : -1;
            case 5:
                return this.tradActvtyCtrctlSttlmDt != null && this.tradActvtyCtrctlSttlmDt.equals(element) ? 0 : -1;
            case 6:
                return this.tradDt != null && this.tradDt.equals(element) ? 0 : -1;
            case 2:
                return this.intrBkSttlmDt != null && this.intrBkSttlmDt.equals(element) ? 0 : -1;
            case 4:
                return this.startDt != null && this.startDt.equals(element) ? 0 : -1;
            case 1:
                return this.endDt != null && this.endDt.equals(element) ? 0 : -1;
            case 7:
                return this.txDtTm != null && this.txDtTm.equals(element) ? 0 : -1;
            case 3:
                return getPrtryIndex((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryDate2) element);
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of EndDt (0..1).
     * 
     * @return The value.
     */
    public biz.c24.io.api.data.ISO8601Date getEndDt() {
        return this.endDt;
    }

    /**
     * Gets the value of IntrBkSttlmDt (0..1).
     * 
     * @return The value.
     */
    public biz.c24.io.api.data.ISO8601Date getIntrBkSttlmDt() {
        return this.intrBkSttlmDt;
    }

    /**
     * Gets the value of Prtry (0..*).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryDate2[] getPrtry() {
        if (this.prtry == null)
            return new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryDate2[]{};
        else
            return this.prtry;
    }

    /**
     * Gets the value of Prtry by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryDate2 getPrtry(int ordinal) {
        if (this.prtry == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.prtry.length) {
            return this.prtry[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (0..*).
     * 
     * @param value
     * @param value The Prtry to get the index of.
     * @return The index.
     */
    public int getPrtryIndex(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryDate2 value) {
        if (this.prtry == null)
            return -1;
        for (int i=0; i<this.prtry.length; i++)
            if (this.prtry[i] == value)
                return i;
        return -1;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are:
     * <b>accptncDtTm, tradActvtyCtrctlSttlmDt, tradDt,
     * intrBkSttlmDt, startDt, endDt, txDtTm, prtry</b>.
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
                return this.accptncDtTm;
            case 5:
                return this.tradActvtyCtrctlSttlmDt;
            case 6:
                return this.tradDt;
            case 2:
                return this.intrBkSttlmDt;
            case 4:
                return this.startDt;
            case 1:
                return this.endDt;
            case 7:
                return this.txDtTm;
            case 3:
            if (this.prtry == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.prtry[index];
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of StartDt (0..1).
     * 
     * @return The value.
     */
    public biz.c24.io.api.data.ISO8601Date getStartDt() {
        return this.startDt;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.accptncDtTm == null ? 0 : 1;
        count += this.tradActvtyCtrctlSttlmDt == null ? 0 : 1;
        count += this.tradDt == null ? 0 : 1;
        count += this.intrBkSttlmDt == null ? 0 : 1;
        count += this.startDt == null ? 0 : 1;
        count += this.endDt == null ? 0 : 1;
        count += this.txDtTm == null ? 0 : 1;
        count += this.prtry == null ? 0 : this.prtry.length;
        return count;
    }

    /**
     * Gets the value of TradActvtyCtrctlSttlmDt (0..1).
     * 
     * @return The value.
     */
    public biz.c24.io.api.data.ISO8601Date getTradActvtyCtrctlSttlmDt() {
        return this.tradActvtyCtrctlSttlmDt;
    }

    /**
     * Gets the value of TradDt (0..1).
     * 
     * @return The value.
     */
    public biz.c24.io.api.data.ISO8601Date getTradDt() {
        return this.tradDt;
    }

    /**
     * Gets the value of TxDtTm (0..1).
     * 
     * @return The value.
     */
    public biz.c24.io.api.data.ISO8601DateTime getTxDtTm() {
        return this.txDtTm;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(accptncDtTm);
        result = 31 * result + hashCodeOf(tradActvtyCtrctlSttlmDt);
        result = 31 * result + hashCodeOf(tradDt);
        result = 31 * result + hashCodeOf(intrBkSttlmDt);
        result = 31 * result + hashCodeOf(startDt);
        result = 31 * result + hashCodeOf(endDt);
        result = 31 * result + hashCodeOf(txDtTm);
        result = 31 * result + hashCodeOf(prtry);
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
                setAccptncDtTm(null);
                return;
            case 5:
                setTradActvtyCtrctlSttlmDt(null);
                return;
            case 6:
                setTradDt(null);
                return;
            case 2:
                setIntrBkSttlmDt(null);
                return;
            case 4:
                setStartDt(null);
                return;
            case 1:
                setEndDt(null);
                return;
            case 7:
                setTxDtTm(null);
                return;
            case 3:
                removePrtry(index);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * Removes a Prtry (0..*).
     * 
     * @param index
     * @param index The index of the Prtry to get.
     */
    public void removePrtry(int index) {
        if (this.prtry == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryDate2[] temp = this.prtry;
        this.prtry = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryDate2[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.prtry, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.prtry, index, temp.length-index-1);
        if (this.prtry.length == 0)
            this.prtry = null;
    }

    /**
     * [Virtual Element] Sets the value of AccptncDtTm (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAccptncDtTm(biz.c24.io.api.data.ISO8601DateTime value) {
        this.accptncDtTm = value;
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
                setAccptncDtTm((biz.c24.io.api.data.ISO8601DateTime) value);
                return;
            case 5:
                setTradActvtyCtrctlSttlmDt((biz.c24.io.api.data.ISO8601Date) value);
                return;
            case 6:
                setTradDt((biz.c24.io.api.data.ISO8601Date) value);
                return;
            case 2:
                setIntrBkSttlmDt((biz.c24.io.api.data.ISO8601Date) value);
                return;
            case 4:
                setStartDt((biz.c24.io.api.data.ISO8601Date) value);
                return;
            case 1:
                setEndDt((biz.c24.io.api.data.ISO8601Date) value);
                return;
            case 7:
                setTxDtTm((biz.c24.io.api.data.ISO8601DateTime) value);
                return;
            case 3:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryDate2[]) {
                    setPrtry((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryDate2[])value);
                } else if (this.prtry == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.prtry[index] = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryDate2) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.prtry[index]).setParent(this, "Prtry");
                }
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of EndDt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setEndDt(biz.c24.io.api.data.ISO8601Date value) {
        this.endDt = value;
    }

    /**
     * [Virtual Element] Sets the value of IntrBkSttlmDt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setIntrBkSttlmDt(biz.c24.io.api.data.ISO8601Date value) {
        this.intrBkSttlmDt = value;
    }

    /**
     * [Virtual Element] Sets the value of Prtry (0..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setPrtry(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryDate2[] value) {
        this.prtry = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryDate2[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.prtry != null && i<this.prtry.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.prtry[i]).setParent(this, "Prtry");
    }

    /**
     * [Virtual Element] Sets the value of StartDt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setStartDt(biz.c24.io.api.data.ISO8601Date value) {
        this.startDt = value;
    }

    /**
     * [Virtual Element] Sets the value of TradActvtyCtrctlSttlmDt
     * (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTradActvtyCtrctlSttlmDt(biz.c24.io.api.data.ISO8601Date value) {
        this.tradActvtyCtrctlSttlmDt = value;
    }

    /**
     * [Virtual Element] Sets the value of TradDt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTradDt(biz.c24.io.api.data.ISO8601Date value) {
        this.tradDt = value;
    }

    /**
     * [Virtual Element] Sets the value of TxDtTm (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTxDtTm(biz.c24.io.api.data.ISO8601DateTime value) {
        this.txDtTm = value;
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.accptncDtTm);
        out.writeObject(this.tradActvtyCtrctlSttlmDt);
        out.writeObject(this.tradDt);
        out.writeObject(this.intrBkSttlmDt);
        out.writeObject(this.startDt);
        out.writeObject(this.endDt);
        out.writeObject(this.txDtTm);
        out.writeObject(this.prtry);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.accptncDtTm = (biz.c24.io.api.data.ISO8601DateTime) in.readObject();
        this.tradActvtyCtrctlSttlmDt = (biz.c24.io.api.data.ISO8601Date) in.readObject();
        this.tradDt = (biz.c24.io.api.data.ISO8601Date) in.readObject();
        this.intrBkSttlmDt = (biz.c24.io.api.data.ISO8601Date) in.readObject();
        this.startDt = (biz.c24.io.api.data.ISO8601Date) in.readObject();
        this.endDt = (biz.c24.io.api.data.ISO8601Date) in.readObject();
        this.txDtTm = (biz.c24.io.api.data.ISO8601DateTime) in.readObject();
        this.prtry = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryDate2[]) in.readObject();
    }

}
