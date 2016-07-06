/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * Cheque6. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>ChqTp</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>ChqNb</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>ChqFr</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.NameAndAddress10}
 * (0..1)</li>
 * <li><b>DlvryMtd</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ChequeDeliveryMethod1Choice}
 * (0..1)</li>
 * <li><b>DlvrTo</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.NameAndAddress10}
 * (0..1)</li>
 * <li><b>InstrPrty</b> of type {@link java.lang.String}
 * (0..1)</li>
 * <li><b>ChqMtrtyDt</b> of type {@link
 * biz.c24.io.api.data.ISO8601Date} (0..1)</li>
 * <li><b>FrmsCd</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>MemoFld</b> of type {@link java.lang.String} (0..2)</li>
 * <li><b>RgnlClrZone</b> of type {@link java.lang.String}
 * (0..1)</li>
 * <li><b>PrtLctn</b> of type {@link java.lang.String} (0..1)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Cheque6Cls
 */
public class Cheque6 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"ChqFr", "ChqMtrtyDt", "ChqNb", "ChqTp", "DlvrTo", "DlvryMtd", "FrmsCd", "InstrPrty", "MemoFld", "PrtLctn", "RgnlClrZone"};

    /**
     * Field chqTp.
     */
    private java.lang.String chqTp;

    /**
     * Field chqNb.
     */
    private java.lang.String chqNb;

    /**
     * Field chqFr.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.NameAndAddress10 chqFr;

    /**
     * Field dlvryMtd.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ChequeDeliveryMethod1Choice dlvryMtd;

    /**
     * Field dlvrTo.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.NameAndAddress10 dlvrTo;

    /**
     * Field instrPrty.
     */
    private java.lang.String instrPrty;

    /**
     * Field chqMtrtyDt.
     */
    private biz.c24.io.api.data.ISO8601Date chqMtrtyDt;

    /**
     * Field frmsCd.
     */
    private java.lang.String frmsCd;

    /**
     * Field memoFld.
     */
    private java.lang.String[] memoFld;

    /**
     * Field rgnlClrZone.
     */
    private java.lang.String rgnlClrZone;

    /**
     * Field prtLctn.
     */
    private java.lang.String prtLctn;

    public Cheque6() {
        this(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Cheque6Cls.getInstance().getNullDefiningElementDecl());
    }

    public Cheque6(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public Cheque6(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public Cheque6(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Cheque6 clone) {
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
            case 3:
                setChqTp((java.lang.String) value);
                return;
            case 2:
                setChqNb((java.lang.String) value);
                return;
            case 0:
                setChqFr((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.NameAndAddress10) value);
                return;
            case 5:
                setDlvryMtd((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ChequeDeliveryMethod1Choice) value);
                return;
            case 4:
                setDlvrTo((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.NameAndAddress10) value);
                return;
            case 7:
                setInstrPrty((java.lang.String) value);
                return;
            case 1:
                setChqMtrtyDt((biz.c24.io.api.data.ISO8601Date) value);
                return;
            case 6:
                setFrmsCd((java.lang.String) value);
                return;
            case 8:
                addMemoFld((java.lang.String) value);
                return;
            case 10:
                setRgnlClrZone((java.lang.String) value);
                return;
            case 9:
                setPrtLctn((java.lang.String) value);
                return;
            default:
                super.addElement(name, value);
        }
    }

    /**
     * Adds a MemoFld (0..2).
     * 
     * @param value
     * @param value The new MemoFld.
     */
    public void addMemoFld(java.lang.String value) {
        java.lang.String[] temp = this.memoFld;
        this.memoFld = new java.lang.String[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.memoFld, 0, temp.length);
        this.memoFld[this.memoFld.length-1] = value;
    }

    /**
     * Creates and returns a shallow clone of this object.
     * 
     * @see #cloneDeep()
     */
    public java.lang.Object clone() {
        return new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Cheque6(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Cheque6(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Cheque6 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Cheque6) clone;
        obj.chqTp = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.chqTp, obj, "ChqTp");
        obj.chqNb = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.chqNb, obj, "ChqNb");
        obj.chqFr = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.NameAndAddress10) biz.c24.io.api.Utils.cloneDeep(this.chqFr, obj, "ChqFr");
        obj.dlvryMtd = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ChequeDeliveryMethod1Choice) biz.c24.io.api.Utils.cloneDeep(this.dlvryMtd, obj, "DlvryMtd");
        obj.dlvrTo = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.NameAndAddress10) biz.c24.io.api.Utils.cloneDeep(this.dlvrTo, obj, "DlvrTo");
        obj.instrPrty = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.instrPrty, obj, "InstrPrty");
        obj.chqMtrtyDt = (biz.c24.io.api.data.ISO8601Date) biz.c24.io.api.Utils.cloneDeep(this.chqMtrtyDt, obj, "ChqMtrtyDt");
        obj.frmsCd = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.frmsCd, obj, "FrmsCd");
        obj.memoFld = (java.lang.String[]) biz.c24.io.api.Utils.cloneDeep(this.memoFld, obj, "MemoFld");
        obj.rgnlClrZone = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.rgnlClrZone, obj, "RgnlClrZone");
        obj.prtLctn = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.prtLctn, obj, "PrtLctn");
    }

    /**
     * Creates, adds and returns a new ChqFr (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.NameAndAddress10 createChqFr() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.NameAndAddress10 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.NameAndAddress10) getElementDecl("ChqFr").createObject();
        setChqFr(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new DlvrTo (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.NameAndAddress10 createDlvrTo() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.NameAndAddress10 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.NameAndAddress10) getElementDecl("DlvrTo").createObject();
        setDlvrTo(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new DlvryMtd (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ChequeDeliveryMethod1Choice createDlvryMtd() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ChequeDeliveryMethod1Choice obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ChequeDeliveryMethod1Choice) getElementDecl("DlvryMtd").createObject();
        setDlvryMtd(obj);
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
     * Gets the value of ChqFr (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.NameAndAddress10 getChqFr() {
        return this.chqFr;
    }

    /**
     * Gets the value of ChqMtrtyDt (0..1).
     * 
     * @return The value.
     */
    public biz.c24.io.api.data.ISO8601Date getChqMtrtyDt() {
        return this.chqMtrtyDt;
    }

    /**
     * Gets the value of ChqNb (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getChqNb() {
        return this.chqNb;
    }

    /**
     * Gets the value of ChqTp (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getChqTp() {
        return this.chqTp;
    }

    /**
     * Gets the value of DlvrTo (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.NameAndAddress10 getDlvrTo() {
        return this.dlvrTo;
    }

    /**
     * Gets the value of DlvryMtd (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ChequeDeliveryMethod1Choice getDlvryMtd() {
        return this.dlvryMtd;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>chqTp,
     * chqNb, chqFr, dlvryMtd, dlvrTo, instrPrty, chqMtrtyDt,
     * frmsCd, memoFld, rgnlClrZone, prtLctn</b>.
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
            case 3:
                return getChqTp();
            case 2:
                return getChqNb();
            case 0:
                return getChqFr();
            case 5:
                return getDlvryMtd();
            case 4:
                return getDlvrTo();
            case 7:
                return getInstrPrty();
            case 1:
                return getChqMtrtyDt();
            case 6:
                return getFrmsCd();
            case 8:
            if (this.memoFld == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.memoFld[index];
            case 10:
                return getRgnlClrZone();
            case 9:
                return getPrtLctn();
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
            case 3:
                return this.chqTp == null ? 0 : 1;
            case 2:
                return this.chqNb == null ? 0 : 1;
            case 0:
                return this.chqFr == null ? 0 : 1;
            case 5:
                return this.dlvryMtd == null ? 0 : 1;
            case 4:
                return this.dlvrTo == null ? 0 : 1;
            case 7:
                return this.instrPrty == null ? 0 : 1;
            case 1:
                return this.chqMtrtyDt == null ? 0 : 1;
            case 6:
                return this.frmsCd == null ? 0 : 1;
            case 8:
                return this.memoFld == null ? 0 : this.memoFld.length;
            case 10:
                return this.rgnlClrZone == null ? 0 : 1;
            case 9:
                return this.prtLctn == null ? 0 : 1;
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
            case 3:
                return this.chqTp != null && this.chqTp.equals(element) ? 0 : -1;
            case 2:
                return this.chqNb != null && this.chqNb.equals(element) ? 0 : -1;
            case 0:
                return this.chqFr != null && this.chqFr.equals(element) ? 0 : -1;
            case 5:
                return this.dlvryMtd != null && this.dlvryMtd.equals(element) ? 0 : -1;
            case 4:
                return this.dlvrTo != null && this.dlvrTo.equals(element) ? 0 : -1;
            case 7:
                return this.instrPrty != null && this.instrPrty.equals(element) ? 0 : -1;
            case 1:
                return this.chqMtrtyDt != null && this.chqMtrtyDt.equals(element) ? 0 : -1;
            case 6:
                return this.frmsCd != null && this.frmsCd.equals(element) ? 0 : -1;
            case 8:
                return getMemoFldIndex((java.lang.String) element);
            case 10:
                return this.rgnlClrZone != null && this.rgnlClrZone.equals(element) ? 0 : -1;
            case 9:
                return this.prtLctn != null && this.prtLctn.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of FrmsCd (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getFrmsCd() {
        return this.frmsCd;
    }

    /**
     * Gets the value of InstrPrty (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getInstrPrty() {
        return this.instrPrty;
    }

    /**
     * Gets the value of MemoFld (0..2).
     * 
     * @return The value.
     */
    public java.lang.String[] getMemoFld() {
        if (this.memoFld == null)
            return new java.lang.String[]{};
        else
            return this.memoFld;
    }

    /**
     * Gets the value of MemoFld by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public java.lang.String getMemoFld(int ordinal) {
        if (this.memoFld == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.memoFld.length) {
            return this.memoFld[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (0..2).
     * 
     * @param value
     * @param value The MemoFld to get the index of.
     * @return The index.
     */
    public int getMemoFldIndex(java.lang.String value) {
        if (this.memoFld == null)
            return -1;
        for (int i=0; i<this.memoFld.length; i++)
            if (this.memoFld[i] == value)
                return i;
        return -1;
    }

    /**
     * Gets the value of PrtLctn (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getPrtLctn() {
        return this.prtLctn;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>chqTp,
     * chqNb, chqFr, dlvryMtd, dlvrTo, instrPrty, chqMtrtyDt,
     * frmsCd, memoFld, rgnlClrZone, prtLctn</b>.
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
            case 3:
                return this.chqTp;
            case 2:
                return this.chqNb;
            case 0:
                return this.chqFr;
            case 5:
                return this.dlvryMtd;
            case 4:
                return this.dlvrTo;
            case 7:
                return this.instrPrty;
            case 1:
                return this.chqMtrtyDt;
            case 6:
                return this.frmsCd;
            case 8:
            if (this.memoFld == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.memoFld[index];
            case 10:
                return this.rgnlClrZone;
            case 9:
                return this.prtLctn;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of RgnlClrZone (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getRgnlClrZone() {
        return this.rgnlClrZone;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.chqTp == null ? 0 : 1;
        count += this.chqNb == null ? 0 : 1;
        count += this.chqFr == null ? 0 : 1;
        count += this.dlvryMtd == null ? 0 : 1;
        count += this.dlvrTo == null ? 0 : 1;
        count += this.instrPrty == null ? 0 : 1;
        count += this.chqMtrtyDt == null ? 0 : 1;
        count += this.frmsCd == null ? 0 : 1;
        count += this.memoFld == null ? 0 : this.memoFld.length;
        count += this.rgnlClrZone == null ? 0 : 1;
        count += this.prtLctn == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(chqTp);
        result = 31 * result + hashCodeOf(chqNb);
        result = 31 * result + hashCodeOf(chqFr);
        result = 31 * result + hashCodeOf(dlvryMtd);
        result = 31 * result + hashCodeOf(dlvrTo);
        result = 31 * result + hashCodeOf(instrPrty);
        result = 31 * result + hashCodeOf(chqMtrtyDt);
        result = 31 * result + hashCodeOf(frmsCd);
        result = 31 * result + hashCodeOf(memoFld);
        result = 31 * result + hashCodeOf(rgnlClrZone);
        result = 31 * result + hashCodeOf(prtLctn);
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
            case 3:
                setChqTp(null);
                return;
            case 2:
                setChqNb(null);
                return;
            case 0:
                setChqFr(null);
                return;
            case 5:
                setDlvryMtd(null);
                return;
            case 4:
                setDlvrTo(null);
                return;
            case 7:
                setInstrPrty(null);
                return;
            case 1:
                setChqMtrtyDt(null);
                return;
            case 6:
                setFrmsCd(null);
                return;
            case 8:
                removeMemoFld(index);
                return;
            case 10:
                setRgnlClrZone(null);
                return;
            case 9:
                setPrtLctn(null);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * Removes a MemoFld (0..2).
     * 
     * @param index
     * @param index The index of the MemoFld to get.
     */
    public void removeMemoFld(int index) {
        if (this.memoFld == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        java.lang.String[] temp = this.memoFld;
        this.memoFld = new java.lang.String[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.memoFld, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.memoFld, index, temp.length-index-1);
        if (this.memoFld.length == 0)
            this.memoFld = null;
    }

    /**
     * [Virtual Element] Sets the value of ChqFr (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setChqFr(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.NameAndAddress10 value) {
        this.chqFr = value;
        if (this.chqFr != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.chqFr).setParent(this, "ChqFr");
    }

    /**
     * [Virtual Element] Sets the value of ChqMtrtyDt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setChqMtrtyDt(biz.c24.io.api.data.ISO8601Date value) {
        this.chqMtrtyDt = value;
    }

    /**
     * [Virtual Element] Sets the value of ChqNb (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setChqNb(java.lang.String value) {
        this.chqNb = value;
    }

    /**
     * [Virtual Element] Sets the value of ChqTp (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setChqTp(java.lang.String value) {
        this.chqTp = value;
    }

    /**
     * [Virtual Element] Sets the value of DlvrTo (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setDlvrTo(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.NameAndAddress10 value) {
        this.dlvrTo = value;
        if (this.dlvrTo != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.dlvrTo).setParent(this, "DlvrTo");
    }

    /**
     * [Virtual Element] Sets the value of DlvryMtd (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setDlvryMtd(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ChequeDeliveryMethod1Choice value) {
        this.dlvryMtd = value;
        if (this.dlvryMtd != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.dlvryMtd).setParent(this, "DlvryMtd");
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
            case 3:
                setChqTp((java.lang.String) value);
                return;
            case 2:
                setChqNb((java.lang.String) value);
                return;
            case 0:
                setChqFr((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.NameAndAddress10) value);
                return;
            case 5:
                setDlvryMtd((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ChequeDeliveryMethod1Choice) value);
                return;
            case 4:
                setDlvrTo((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.NameAndAddress10) value);
                return;
            case 7:
                setInstrPrty((java.lang.String) value);
                return;
            case 1:
                setChqMtrtyDt((biz.c24.io.api.data.ISO8601Date) value);
                return;
            case 6:
                setFrmsCd((java.lang.String) value);
                return;
            case 8:
                if (value != null && value instanceof java.lang.String[]) {
                    setMemoFld((java.lang.String[])value);
                } else if (this.memoFld == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.memoFld[index] = (java.lang.String) value;
                }
                return;
            case 10:
                setRgnlClrZone((java.lang.String) value);
                return;
            case 9:
                setPrtLctn((java.lang.String) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of FrmsCd (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setFrmsCd(java.lang.String value) {
        this.frmsCd = value;
    }

    /**
     * [Virtual Element] Sets the value of InstrPrty (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setInstrPrty(java.lang.String value) {
        this.instrPrty = value;
    }

    /**
     * [Virtual Element] Sets the value of MemoFld (0..2).
     * 
     * @param value
     * @param value The new value.
     */
    public void setMemoFld(java.lang.String[] value) {
        this.memoFld = (java.lang.String[]) biz.c24.io.api.Utils.clearNulls(value);
    }

    /**
     * [Virtual Element] Sets the value of PrtLctn (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setPrtLctn(java.lang.String value) {
        this.prtLctn = value;
    }

    /**
     * [Virtual Element] Sets the value of RgnlClrZone (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setRgnlClrZone(java.lang.String value) {
        this.rgnlClrZone = value;
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.chqTp);
        out.writeObject(this.chqNb);
        out.writeObject(this.chqFr);
        out.writeObject(this.dlvryMtd);
        out.writeObject(this.dlvrTo);
        out.writeObject(this.instrPrty);
        out.writeObject(this.chqMtrtyDt);
        out.writeObject(this.frmsCd);
        out.writeObject(this.memoFld);
        out.writeObject(this.rgnlClrZone);
        out.writeObject(this.prtLctn);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.chqTp = (java.lang.String) in.readObject();
        this.chqNb = (java.lang.String) in.readObject();
        this.chqFr = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.NameAndAddress10) in.readObject();
        this.dlvryMtd = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ChequeDeliveryMethod1Choice) in.readObject();
        this.dlvrTo = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.NameAndAddress10) in.readObject();
        this.instrPrty = (java.lang.String) in.readObject();
        this.chqMtrtyDt = (biz.c24.io.api.data.ISO8601Date) in.readObject();
        this.frmsCd = (java.lang.String) in.readObject();
        this.memoFld = (java.lang.String[]) in.readObject();
        this.rgnlClrZone = (java.lang.String) in.readObject();
        this.prtLctn = (java.lang.String) in.readObject();
    }

}
