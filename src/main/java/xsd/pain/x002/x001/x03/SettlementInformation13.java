/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * SettlementInformation13. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>SttlmMtd</b> of type {@link java.lang.String} (1)</li>
 * <li><b>SttlmAcct</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16}
 * (0..1)</li>
 * <li><b>ClrSys</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ClearingSystemIdentification3Choice}
 * (0..1)</li>
 * <li><b>InstgRmbrsmntAgt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4}
 * (0..1)</li>
 * <li><b>InstgRmbrsmntAgtAcct</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16}
 * (0..1)</li>
 * <li><b>InstdRmbrsmntAgt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4}
 * (0..1)</li>
 * <li><b>InstdRmbrsmntAgtAcct</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16}
 * (0..1)</li>
 * <li><b>ThrdRmbrsmntAgt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4}
 * (0..1)</li>
 * <li><b>ThrdRmbrsmntAgtAcct</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16}
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
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.SettlementInformation13Cls
 */
public class SettlementInformation13 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"ClrSys", "InstdRmbrsmntAgt", "InstdRmbrsmntAgtAcct", "InstgRmbrsmntAgt", "InstgRmbrsmntAgtAcct", "SttlmAcct", "SttlmMtd", "ThrdRmbrsmntAgt", "ThrdRmbrsmntAgtAcct"};

    /**
     * Field sttlmMtd.
     */
    private java.lang.String sttlmMtd;

    /**
     * Field sttlmAcct.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 sttlmAcct;

    /**
     * Field clrSys.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ClearingSystemIdentification3Choice clrSys;

    /**
     * Field instgRmbrsmntAgt.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 instgRmbrsmntAgt;

    /**
     * Field instgRmbrsmntAgtAcct.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 instgRmbrsmntAgtAcct;

    /**
     * Field instdRmbrsmntAgt.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 instdRmbrsmntAgt;

    /**
     * Field instdRmbrsmntAgtAcct.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 instdRmbrsmntAgtAcct;

    /**
     * Field thrdRmbrsmntAgt.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 thrdRmbrsmntAgt;

    /**
     * Field thrdRmbrsmntAgtAcct.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 thrdRmbrsmntAgtAcct;

    public SettlementInformation13() {
        this(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.SettlementInformation13Cls.getInstance().getNullDefiningElementDecl());
    }

    public SettlementInformation13(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public SettlementInformation13(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public SettlementInformation13(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.SettlementInformation13 clone) {
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
            case 6:
                setSttlmMtd((java.lang.String) value);
                return;
            case 5:
                setSttlmAcct((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) value);
                return;
            case 0:
                setClrSys((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ClearingSystemIdentification3Choice) value);
                return;
            case 3:
                setInstgRmbrsmntAgt((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 4:
                setInstgRmbrsmntAgtAcct((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) value);
                return;
            case 1:
                setInstdRmbrsmntAgt((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 2:
                setInstdRmbrsmntAgtAcct((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) value);
                return;
            case 7:
                setThrdRmbrsmntAgt((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 8:
                setThrdRmbrsmntAgtAcct((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) value);
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
        return new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.SettlementInformation13(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.SettlementInformation13(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.SettlementInformation13 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.SettlementInformation13) clone;
        obj.sttlmMtd = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.sttlmMtd, obj, "SttlmMtd");
        obj.sttlmAcct = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) biz.c24.io.api.Utils.cloneDeep(this.sttlmAcct, obj, "SttlmAcct");
        obj.clrSys = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ClearingSystemIdentification3Choice) biz.c24.io.api.Utils.cloneDeep(this.clrSys, obj, "ClrSys");
        obj.instgRmbrsmntAgt = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) biz.c24.io.api.Utils.cloneDeep(this.instgRmbrsmntAgt, obj, "InstgRmbrsmntAgt");
        obj.instgRmbrsmntAgtAcct = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) biz.c24.io.api.Utils.cloneDeep(this.instgRmbrsmntAgtAcct, obj, "InstgRmbrsmntAgtAcct");
        obj.instdRmbrsmntAgt = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) biz.c24.io.api.Utils.cloneDeep(this.instdRmbrsmntAgt, obj, "InstdRmbrsmntAgt");
        obj.instdRmbrsmntAgtAcct = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) biz.c24.io.api.Utils.cloneDeep(this.instdRmbrsmntAgtAcct, obj, "InstdRmbrsmntAgtAcct");
        obj.thrdRmbrsmntAgt = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) biz.c24.io.api.Utils.cloneDeep(this.thrdRmbrsmntAgt, obj, "ThrdRmbrsmntAgt");
        obj.thrdRmbrsmntAgtAcct = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) biz.c24.io.api.Utils.cloneDeep(this.thrdRmbrsmntAgtAcct, obj, "ThrdRmbrsmntAgtAcct");
    }

    /**
     * Creates, adds and returns a new ClrSys (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ClearingSystemIdentification3Choice createClrSys() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ClearingSystemIdentification3Choice obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ClearingSystemIdentification3Choice) getElementDecl("ClrSys").createObject();
        setClrSys(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new InstdRmbrsmntAgt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 createInstdRmbrsmntAgt() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) getElementDecl("InstdRmbrsmntAgt").createObject();
        setInstdRmbrsmntAgt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new InstdRmbrsmntAgtAcct (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 createInstdRmbrsmntAgtAcct() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) getElementDecl("InstdRmbrsmntAgtAcct").createObject();
        setInstdRmbrsmntAgtAcct(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new InstgRmbrsmntAgt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 createInstgRmbrsmntAgt() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) getElementDecl("InstgRmbrsmntAgt").createObject();
        setInstgRmbrsmntAgt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new InstgRmbrsmntAgtAcct (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 createInstgRmbrsmntAgtAcct() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) getElementDecl("InstgRmbrsmntAgtAcct").createObject();
        setInstgRmbrsmntAgtAcct(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new SttlmAcct (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 createSttlmAcct() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) getElementDecl("SttlmAcct").createObject();
        setSttlmAcct(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new ThrdRmbrsmntAgt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 createThrdRmbrsmntAgt() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) getElementDecl("ThrdRmbrsmntAgt").createObject();
        setThrdRmbrsmntAgt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new ThrdRmbrsmntAgtAcct (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 createThrdRmbrsmntAgtAcct() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) getElementDecl("ThrdRmbrsmntAgtAcct").createObject();
        setThrdRmbrsmntAgtAcct(obj);
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
     * Gets the value of ClrSys (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ClearingSystemIdentification3Choice getClrSys() {
        return this.clrSys;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>sttlmMtd,
     * sttlmAcct, clrSys, instgRmbrsmntAgt, instgRmbrsmntAgtAcct,
     * instdRmbrsmntAgt, instdRmbrsmntAgtAcct, thrdRmbrsmntAgt,
     * thrdRmbrsmntAgtAcct</b>.
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
            case 6:
                return getSttlmMtd();
            case 5:
                return getSttlmAcct();
            case 0:
                return getClrSys();
            case 3:
                return getInstgRmbrsmntAgt();
            case 4:
                return getInstgRmbrsmntAgtAcct();
            case 1:
                return getInstdRmbrsmntAgt();
            case 2:
                return getInstdRmbrsmntAgtAcct();
            case 7:
                return getThrdRmbrsmntAgt();
            case 8:
                return getThrdRmbrsmntAgtAcct();
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
            case 6:
                return this.sttlmMtd == null ? 0 : 1;
            case 5:
                return this.sttlmAcct == null ? 0 : 1;
            case 0:
                return this.clrSys == null ? 0 : 1;
            case 3:
                return this.instgRmbrsmntAgt == null ? 0 : 1;
            case 4:
                return this.instgRmbrsmntAgtAcct == null ? 0 : 1;
            case 1:
                return this.instdRmbrsmntAgt == null ? 0 : 1;
            case 2:
                return this.instdRmbrsmntAgtAcct == null ? 0 : 1;
            case 7:
                return this.thrdRmbrsmntAgt == null ? 0 : 1;
            case 8:
                return this.thrdRmbrsmntAgtAcct == null ? 0 : 1;
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
            case 6:
                return this.sttlmMtd != null && this.sttlmMtd.equals(element) ? 0 : -1;
            case 5:
                return this.sttlmAcct != null && this.sttlmAcct.equals(element) ? 0 : -1;
            case 0:
                return this.clrSys != null && this.clrSys.equals(element) ? 0 : -1;
            case 3:
                return this.instgRmbrsmntAgt != null && this.instgRmbrsmntAgt.equals(element) ? 0 : -1;
            case 4:
                return this.instgRmbrsmntAgtAcct != null && this.instgRmbrsmntAgtAcct.equals(element) ? 0 : -1;
            case 1:
                return this.instdRmbrsmntAgt != null && this.instdRmbrsmntAgt.equals(element) ? 0 : -1;
            case 2:
                return this.instdRmbrsmntAgtAcct != null && this.instdRmbrsmntAgtAcct.equals(element) ? 0 : -1;
            case 7:
                return this.thrdRmbrsmntAgt != null && this.thrdRmbrsmntAgt.equals(element) ? 0 : -1;
            case 8:
                return this.thrdRmbrsmntAgtAcct != null && this.thrdRmbrsmntAgtAcct.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of InstdRmbrsmntAgt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 getInstdRmbrsmntAgt() {
        return this.instdRmbrsmntAgt;
    }

    /**
     * Gets the value of InstdRmbrsmntAgtAcct (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 getInstdRmbrsmntAgtAcct() {
        return this.instdRmbrsmntAgtAcct;
    }

    /**
     * Gets the value of InstgRmbrsmntAgt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 getInstgRmbrsmntAgt() {
        return this.instgRmbrsmntAgt;
    }

    /**
     * Gets the value of InstgRmbrsmntAgtAcct (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 getInstgRmbrsmntAgtAcct() {
        return this.instgRmbrsmntAgtAcct;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>sttlmMtd,
     * sttlmAcct, clrSys, instgRmbrsmntAgt, instgRmbrsmntAgtAcct,
     * instdRmbrsmntAgt, instdRmbrsmntAgtAcct, thrdRmbrsmntAgt,
     * thrdRmbrsmntAgtAcct</b>.
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
            case 6:
                return this.sttlmMtd;
            case 5:
                return this.sttlmAcct;
            case 0:
                return this.clrSys;
            case 3:
                return this.instgRmbrsmntAgt;
            case 4:
                return this.instgRmbrsmntAgtAcct;
            case 1:
                return this.instdRmbrsmntAgt;
            case 2:
                return this.instdRmbrsmntAgtAcct;
            case 7:
                return this.thrdRmbrsmntAgt;
            case 8:
                return this.thrdRmbrsmntAgtAcct;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of SttlmAcct (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 getSttlmAcct() {
        return this.sttlmAcct;
    }

    /**
     * Gets the value of SttlmMtd (1).
     * 
     * @return The value.
     */
    public java.lang.String getSttlmMtd() {
        return this.sttlmMtd;
    }

    /**
     * Gets the value of ThrdRmbrsmntAgt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 getThrdRmbrsmntAgt() {
        return this.thrdRmbrsmntAgt;
    }

    /**
     * Gets the value of ThrdRmbrsmntAgtAcct (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 getThrdRmbrsmntAgtAcct() {
        return this.thrdRmbrsmntAgtAcct;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.sttlmMtd == null ? 0 : 1;
        count += this.sttlmAcct == null ? 0 : 1;
        count += this.clrSys == null ? 0 : 1;
        count += this.instgRmbrsmntAgt == null ? 0 : 1;
        count += this.instgRmbrsmntAgtAcct == null ? 0 : 1;
        count += this.instdRmbrsmntAgt == null ? 0 : 1;
        count += this.instdRmbrsmntAgtAcct == null ? 0 : 1;
        count += this.thrdRmbrsmntAgt == null ? 0 : 1;
        count += this.thrdRmbrsmntAgtAcct == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(sttlmMtd);
        result = 31 * result + hashCodeOf(sttlmAcct);
        result = 31 * result + hashCodeOf(clrSys);
        result = 31 * result + hashCodeOf(instgRmbrsmntAgt);
        result = 31 * result + hashCodeOf(instgRmbrsmntAgtAcct);
        result = 31 * result + hashCodeOf(instdRmbrsmntAgt);
        result = 31 * result + hashCodeOf(instdRmbrsmntAgtAcct);
        result = 31 * result + hashCodeOf(thrdRmbrsmntAgt);
        result = 31 * result + hashCodeOf(thrdRmbrsmntAgtAcct);
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
            case 6:
                setSttlmMtd(null);
                return;
            case 5:
                setSttlmAcct(null);
                return;
            case 0:
                setClrSys(null);
                return;
            case 3:
                setInstgRmbrsmntAgt(null);
                return;
            case 4:
                setInstgRmbrsmntAgtAcct(null);
                return;
            case 1:
                setInstdRmbrsmntAgt(null);
                return;
            case 2:
                setInstdRmbrsmntAgtAcct(null);
                return;
            case 7:
                setThrdRmbrsmntAgt(null);
                return;
            case 8:
                setThrdRmbrsmntAgtAcct(null);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of ClrSys (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setClrSys(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ClearingSystemIdentification3Choice value) {
        this.clrSys = value;
        if (this.clrSys != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.clrSys).setParent(this, "ClrSys");
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
            case 6:
                setSttlmMtd((java.lang.String) value);
                return;
            case 5:
                setSttlmAcct((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) value);
                return;
            case 0:
                setClrSys((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ClearingSystemIdentification3Choice) value);
                return;
            case 3:
                setInstgRmbrsmntAgt((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 4:
                setInstgRmbrsmntAgtAcct((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) value);
                return;
            case 1:
                setInstdRmbrsmntAgt((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 2:
                setInstdRmbrsmntAgtAcct((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) value);
                return;
            case 7:
                setThrdRmbrsmntAgt((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 8:
                setThrdRmbrsmntAgtAcct((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of InstdRmbrsmntAgt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setInstdRmbrsmntAgt(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 value) {
        this.instdRmbrsmntAgt = value;
        if (this.instdRmbrsmntAgt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.instdRmbrsmntAgt).setParent(this, "InstdRmbrsmntAgt");
    }

    /**
     * [Virtual Element] Sets the value of InstdRmbrsmntAgtAcct
     * (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setInstdRmbrsmntAgtAcct(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 value) {
        this.instdRmbrsmntAgtAcct = value;
        if (this.instdRmbrsmntAgtAcct != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.instdRmbrsmntAgtAcct).setParent(this, "InstdRmbrsmntAgtAcct");
    }

    /**
     * [Virtual Element] Sets the value of InstgRmbrsmntAgt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setInstgRmbrsmntAgt(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 value) {
        this.instgRmbrsmntAgt = value;
        if (this.instgRmbrsmntAgt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.instgRmbrsmntAgt).setParent(this, "InstgRmbrsmntAgt");
    }

    /**
     * [Virtual Element] Sets the value of InstgRmbrsmntAgtAcct
     * (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setInstgRmbrsmntAgtAcct(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 value) {
        this.instgRmbrsmntAgtAcct = value;
        if (this.instgRmbrsmntAgtAcct != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.instgRmbrsmntAgtAcct).setParent(this, "InstgRmbrsmntAgtAcct");
    }

    /**
     * [Virtual Element] Sets the value of SttlmAcct (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setSttlmAcct(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 value) {
        this.sttlmAcct = value;
        if (this.sttlmAcct != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.sttlmAcct).setParent(this, "SttlmAcct");
    }

    /**
     * [Virtual Element] Sets the value of SttlmMtd (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setSttlmMtd(java.lang.String value) {
        this.sttlmMtd = value;
    }

    /**
     * [Virtual Element] Sets the value of ThrdRmbrsmntAgt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setThrdRmbrsmntAgt(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 value) {
        this.thrdRmbrsmntAgt = value;
        if (this.thrdRmbrsmntAgt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.thrdRmbrsmntAgt).setParent(this, "ThrdRmbrsmntAgt");
    }

    /**
     * [Virtual Element] Sets the value of ThrdRmbrsmntAgtAcct
     * (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setThrdRmbrsmntAgtAcct(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 value) {
        this.thrdRmbrsmntAgtAcct = value;
        if (this.thrdRmbrsmntAgtAcct != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.thrdRmbrsmntAgtAcct).setParent(this, "ThrdRmbrsmntAgtAcct");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.sttlmMtd);
        out.writeObject(this.sttlmAcct);
        out.writeObject(this.clrSys);
        out.writeObject(this.instgRmbrsmntAgt);
        out.writeObject(this.instgRmbrsmntAgtAcct);
        out.writeObject(this.instdRmbrsmntAgt);
        out.writeObject(this.instdRmbrsmntAgtAcct);
        out.writeObject(this.thrdRmbrsmntAgt);
        out.writeObject(this.thrdRmbrsmntAgtAcct);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.sttlmMtd = (java.lang.String) in.readObject();
        this.sttlmAcct = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) in.readObject();
        this.clrSys = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ClearingSystemIdentification3Choice) in.readObject();
        this.instgRmbrsmntAgt = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) in.readObject();
        this.instgRmbrsmntAgtAcct = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) in.readObject();
        this.instdRmbrsmntAgt = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) in.readObject();
        this.instdRmbrsmntAgtAcct = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) in.readObject();
        this.thrdRmbrsmntAgt = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) in.readObject();
        this.thrdRmbrsmntAgtAcct = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) in.readObject();
    }

}
