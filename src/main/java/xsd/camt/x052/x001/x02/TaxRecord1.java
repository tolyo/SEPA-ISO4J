/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * TaxRecord1. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>Tp</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>Ctgy</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>CtgyDtls</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>DbtrSts</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>CertId</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>FrmsCd</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>Prd</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxPeriod1}
 * (0..1)</li>
 * <li><b>TaxAmt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxAmount1}
 * (0..1)</li>
 * <li><b>AddtlInf</b> of type {@link java.lang.String} (0..1)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecord1Cls
 */
public class TaxRecord1 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"AddtlInf", "CertId", "Ctgy", "CtgyDtls", "DbtrSts", "FrmsCd", "Prd", "TaxAmt", "Tp"};

    /**
     * Field tp.
     */
    private java.lang.String tp;

    /**
     * Field ctgy.
     */
    private java.lang.String ctgy;

    /**
     * Field ctgyDtls.
     */
    private java.lang.String ctgyDtls;

    /**
     * Field dbtrSts.
     */
    private java.lang.String dbtrSts;

    /**
     * Field certId.
     */
    private java.lang.String certId;

    /**
     * Field frmsCd.
     */
    private java.lang.String frmsCd;

    /**
     * Field prd.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxPeriod1 prd;

    /**
     * Field taxAmt.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxAmount1 taxAmt;

    /**
     * Field addtlInf.
     */
    private java.lang.String addtlInf;

    public TaxRecord1() {
        this(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecord1Cls.getInstance().getNullDefiningElementDecl());
    }

    public TaxRecord1(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public TaxRecord1(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public TaxRecord1(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecord1 clone) {
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
            case 8:
                setTp((java.lang.String) value);
                return;
            case 2:
                setCtgy((java.lang.String) value);
                return;
            case 3:
                setCtgyDtls((java.lang.String) value);
                return;
            case 4:
                setDbtrSts((java.lang.String) value);
                return;
            case 1:
                setCertId((java.lang.String) value);
                return;
            case 5:
                setFrmsCd((java.lang.String) value);
                return;
            case 6:
                setPrd((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxPeriod1) value);
                return;
            case 7:
                setTaxAmt((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxAmount1) value);
                return;
            case 0:
                setAddtlInf((java.lang.String) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecord1(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecord1(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecord1 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecord1) clone;
        obj.tp = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.tp, obj, "Tp");
        obj.ctgy = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.ctgy, obj, "Ctgy");
        obj.ctgyDtls = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.ctgyDtls, obj, "CtgyDtls");
        obj.dbtrSts = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.dbtrSts, obj, "DbtrSts");
        obj.certId = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.certId, obj, "CertId");
        obj.frmsCd = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.frmsCd, obj, "FrmsCd");
        obj.prd = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxPeriod1) biz.c24.io.api.Utils.cloneDeep(this.prd, obj, "Prd");
        obj.taxAmt = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxAmount1) biz.c24.io.api.Utils.cloneDeep(this.taxAmt, obj, "TaxAmt");
        obj.addtlInf = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.addtlInf, obj, "AddtlInf");
    }

    /**
     * Creates, adds and returns a new Prd (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxPeriod1 createPrd() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxPeriod1 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxPeriod1) getElementDecl("Prd").createObject();
        setPrd(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new TaxAmt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxAmount1 createTaxAmt() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxAmount1 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxAmount1) getElementDecl("TaxAmt").createObject();
        setTaxAmt(obj);
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
     * Gets the value of AddtlInf (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getAddtlInf() {
        return this.addtlInf;
    }

    /**
     * Gets the value of CertId (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getCertId() {
        return this.certId;
    }

    /**
     * Gets the value of Ctgy (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getCtgy() {
        return this.ctgy;
    }

    /**
     * Gets the value of CtgyDtls (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getCtgyDtls() {
        return this.ctgyDtls;
    }

    /**
     * Gets the value of DbtrSts (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getDbtrSts() {
        return this.dbtrSts;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>tp, ctgy,
     * ctgyDtls, dbtrSts, certId, frmsCd, prd, taxAmt,
     * addtlInf</b>.
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
            case 8:
                return getTp();
            case 2:
                return getCtgy();
            case 3:
                return getCtgyDtls();
            case 4:
                return getDbtrSts();
            case 1:
                return getCertId();
            case 5:
                return getFrmsCd();
            case 6:
                return getPrd();
            case 7:
                return getTaxAmt();
            case 0:
                return getAddtlInf();
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
            case 8:
                return this.tp == null ? 0 : 1;
            case 2:
                return this.ctgy == null ? 0 : 1;
            case 3:
                return this.ctgyDtls == null ? 0 : 1;
            case 4:
                return this.dbtrSts == null ? 0 : 1;
            case 1:
                return this.certId == null ? 0 : 1;
            case 5:
                return this.frmsCd == null ? 0 : 1;
            case 6:
                return this.prd == null ? 0 : 1;
            case 7:
                return this.taxAmt == null ? 0 : 1;
            case 0:
                return this.addtlInf == null ? 0 : 1;
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
            case 8:
                return this.tp != null && this.tp.equals(element) ? 0 : -1;
            case 2:
                return this.ctgy != null && this.ctgy.equals(element) ? 0 : -1;
            case 3:
                return this.ctgyDtls != null && this.ctgyDtls.equals(element) ? 0 : -1;
            case 4:
                return this.dbtrSts != null && this.dbtrSts.equals(element) ? 0 : -1;
            case 1:
                return this.certId != null && this.certId.equals(element) ? 0 : -1;
            case 5:
                return this.frmsCd != null && this.frmsCd.equals(element) ? 0 : -1;
            case 6:
                return this.prd != null && this.prd.equals(element) ? 0 : -1;
            case 7:
                return this.taxAmt != null && this.taxAmt.equals(element) ? 0 : -1;
            case 0:
                return this.addtlInf != null && this.addtlInf.equals(element) ? 0 : -1;
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
     * Gets the value of Prd (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxPeriod1 getPrd() {
        return this.prd;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>tp, ctgy,
     * ctgyDtls, dbtrSts, certId, frmsCd, prd, taxAmt,
     * addtlInf</b>.
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
            case 8:
                return this.tp;
            case 2:
                return this.ctgy;
            case 3:
                return this.ctgyDtls;
            case 4:
                return this.dbtrSts;
            case 1:
                return this.certId;
            case 5:
                return this.frmsCd;
            case 6:
                return this.prd;
            case 7:
                return this.taxAmt;
            case 0:
                return this.addtlInf;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of TaxAmt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxAmount1 getTaxAmt() {
        return this.taxAmt;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.tp == null ? 0 : 1;
        count += this.ctgy == null ? 0 : 1;
        count += this.ctgyDtls == null ? 0 : 1;
        count += this.dbtrSts == null ? 0 : 1;
        count += this.certId == null ? 0 : 1;
        count += this.frmsCd == null ? 0 : 1;
        count += this.prd == null ? 0 : 1;
        count += this.taxAmt == null ? 0 : 1;
        count += this.addtlInf == null ? 0 : 1;
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
        result = 31 * result + hashCodeOf(ctgy);
        result = 31 * result + hashCodeOf(ctgyDtls);
        result = 31 * result + hashCodeOf(dbtrSts);
        result = 31 * result + hashCodeOf(certId);
        result = 31 * result + hashCodeOf(frmsCd);
        result = 31 * result + hashCodeOf(prd);
        result = 31 * result + hashCodeOf(taxAmt);
        result = 31 * result + hashCodeOf(addtlInf);
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
            case 8:
                setTp(null);
                return;
            case 2:
                setCtgy(null);
                return;
            case 3:
                setCtgyDtls(null);
                return;
            case 4:
                setDbtrSts(null);
                return;
            case 1:
                setCertId(null);
                return;
            case 5:
                setFrmsCd(null);
                return;
            case 6:
                setPrd(null);
                return;
            case 7:
                setTaxAmt(null);
                return;
            case 0:
                setAddtlInf(null);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of AddtlInf (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAddtlInf(java.lang.String value) {
        this.addtlInf = value;
    }

    /**
     * [Virtual Element] Sets the value of CertId (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCertId(java.lang.String value) {
        this.certId = value;
    }

    /**
     * [Virtual Element] Sets the value of Ctgy (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCtgy(java.lang.String value) {
        this.ctgy = value;
    }

    /**
     * [Virtual Element] Sets the value of CtgyDtls (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCtgyDtls(java.lang.String value) {
        this.ctgyDtls = value;
    }

    /**
     * [Virtual Element] Sets the value of DbtrSts (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setDbtrSts(java.lang.String value) {
        this.dbtrSts = value;
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
            case 8:
                setTp((java.lang.String) value);
                return;
            case 2:
                setCtgy((java.lang.String) value);
                return;
            case 3:
                setCtgyDtls((java.lang.String) value);
                return;
            case 4:
                setDbtrSts((java.lang.String) value);
                return;
            case 1:
                setCertId((java.lang.String) value);
                return;
            case 5:
                setFrmsCd((java.lang.String) value);
                return;
            case 6:
                setPrd((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxPeriod1) value);
                return;
            case 7:
                setTaxAmt((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxAmount1) value);
                return;
            case 0:
                setAddtlInf((java.lang.String) value);
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
     * [Virtual Element] Sets the value of Prd (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setPrd(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxPeriod1 value) {
        this.prd = value;
        if (this.prd != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.prd).setParent(this, "Prd");
    }

    /**
     * [Virtual Element] Sets the value of TaxAmt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTaxAmt(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxAmount1 value) {
        this.taxAmt = value;
        if (this.taxAmt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.taxAmt).setParent(this, "TaxAmt");
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
        out.writeObject(this.ctgy);
        out.writeObject(this.ctgyDtls);
        out.writeObject(this.dbtrSts);
        out.writeObject(this.certId);
        out.writeObject(this.frmsCd);
        out.writeObject(this.prd);
        out.writeObject(this.taxAmt);
        out.writeObject(this.addtlInf);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.tp = (java.lang.String) in.readObject();
        this.ctgy = (java.lang.String) in.readObject();
        this.ctgyDtls = (java.lang.String) in.readObject();
        this.dbtrSts = (java.lang.String) in.readObject();
        this.certId = (java.lang.String) in.readObject();
        this.frmsCd = (java.lang.String) in.readObject();
        this.prd = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxPeriod1) in.readObject();
        this.taxAmt = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxAmount1) in.readObject();
        this.addtlInf = (java.lang.String) in.readObject();
    }

}
