/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * AmendmentInformationDetails6. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>OrgnlMndtId</b> of type {@link java.lang.String}
 * (0..1)</li>
 * <li><b>OrgnlCdtrSchmeId</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32}
 * (0..1)</li>
 * <li><b>OrgnlCdtrAgt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4}
 * (0..1)</li>
 * <li><b>OrgnlCdtrAgtAcct</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16}
 * (0..1)</li>
 * <li><b>OrgnlDbtr</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32}
 * (0..1)</li>
 * <li><b>OrgnlDbtrAcct</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16}
 * (0..1)</li>
 * <li><b>OrgnlDbtrAgt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4}
 * (0..1)</li>
 * <li><b>OrgnlDbtrAgtAcct</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16}
 * (0..1)</li>
 * <li><b>OrgnlFnlColltnDt</b> of type {@link
 * biz.c24.io.api.data.ISO8601Date} (0..1)</li>
 * <li><b>OrgnlFrqcy</b> of type {@link java.lang.String}
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
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmendmentInformationDetails6Cls
 */
public class AmendmentInformationDetails6 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"OrgnlCdtrAgt", "OrgnlCdtrAgtAcct", "OrgnlCdtrSchmeId", "OrgnlDbtr", "OrgnlDbtrAcct", "OrgnlDbtrAgt", "OrgnlDbtrAgtAcct", "OrgnlFnlColltnDt", "OrgnlFrqcy", "OrgnlMndtId"};

    /**
     * Field orgnlMndtId.
     */
    private java.lang.String orgnlMndtId;

    /**
     * Field orgnlCdtrSchmeId.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 orgnlCdtrSchmeId;

    /**
     * Field orgnlCdtrAgt.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 orgnlCdtrAgt;

    /**
     * Field orgnlCdtrAgtAcct.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 orgnlCdtrAgtAcct;

    /**
     * Field orgnlDbtr.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 orgnlDbtr;

    /**
     * Field orgnlDbtrAcct.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 orgnlDbtrAcct;

    /**
     * Field orgnlDbtrAgt.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 orgnlDbtrAgt;

    /**
     * Field orgnlDbtrAgtAcct.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 orgnlDbtrAgtAcct;

    /**
     * Field orgnlFnlColltnDt.
     */
    private biz.c24.io.api.data.ISO8601Date orgnlFnlColltnDt;

    /**
     * Field orgnlFrqcy.
     */
    private java.lang.String orgnlFrqcy;

    public AmendmentInformationDetails6() {
        this(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmendmentInformationDetails6Cls.getInstance().getNullDefiningElementDecl());
    }

    public AmendmentInformationDetails6(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public AmendmentInformationDetails6(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public AmendmentInformationDetails6(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmendmentInformationDetails6 clone) {
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
            case 9:
                setOrgnlMndtId((java.lang.String) value);
                return;
            case 2:
                setOrgnlCdtrSchmeId((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) value);
                return;
            case 0:
                setOrgnlCdtrAgt((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 1:
                setOrgnlCdtrAgtAcct((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) value);
                return;
            case 3:
                setOrgnlDbtr((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) value);
                return;
            case 4:
                setOrgnlDbtrAcct((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) value);
                return;
            case 5:
                setOrgnlDbtrAgt((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 6:
                setOrgnlDbtrAgtAcct((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) value);
                return;
            case 7:
                setOrgnlFnlColltnDt((biz.c24.io.api.data.ISO8601Date) value);
                return;
            case 8:
                setOrgnlFrqcy((java.lang.String) value);
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
        return new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmendmentInformationDetails6(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmendmentInformationDetails6(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmendmentInformationDetails6 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmendmentInformationDetails6) clone;
        obj.orgnlMndtId = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.orgnlMndtId, obj, "OrgnlMndtId");
        obj.orgnlCdtrSchmeId = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) biz.c24.io.api.Utils.cloneDeep(this.orgnlCdtrSchmeId, obj, "OrgnlCdtrSchmeId");
        obj.orgnlCdtrAgt = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) biz.c24.io.api.Utils.cloneDeep(this.orgnlCdtrAgt, obj, "OrgnlCdtrAgt");
        obj.orgnlCdtrAgtAcct = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) biz.c24.io.api.Utils.cloneDeep(this.orgnlCdtrAgtAcct, obj, "OrgnlCdtrAgtAcct");
        obj.orgnlDbtr = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) biz.c24.io.api.Utils.cloneDeep(this.orgnlDbtr, obj, "OrgnlDbtr");
        obj.orgnlDbtrAcct = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) biz.c24.io.api.Utils.cloneDeep(this.orgnlDbtrAcct, obj, "OrgnlDbtrAcct");
        obj.orgnlDbtrAgt = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) biz.c24.io.api.Utils.cloneDeep(this.orgnlDbtrAgt, obj, "OrgnlDbtrAgt");
        obj.orgnlDbtrAgtAcct = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) biz.c24.io.api.Utils.cloneDeep(this.orgnlDbtrAgtAcct, obj, "OrgnlDbtrAgtAcct");
        obj.orgnlFnlColltnDt = (biz.c24.io.api.data.ISO8601Date) biz.c24.io.api.Utils.cloneDeep(this.orgnlFnlColltnDt, obj, "OrgnlFnlColltnDt");
        obj.orgnlFrqcy = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.orgnlFrqcy, obj, "OrgnlFrqcy");
    }

    /**
     * Creates, adds and returns a new OrgnlCdtrAgt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 createOrgnlCdtrAgt() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) getElementDecl("OrgnlCdtrAgt").createObject();
        setOrgnlCdtrAgt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new OrgnlCdtrAgtAcct (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 createOrgnlCdtrAgtAcct() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) getElementDecl("OrgnlCdtrAgtAcct").createObject();
        setOrgnlCdtrAgtAcct(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new OrgnlCdtrSchmeId (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 createOrgnlCdtrSchmeId() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) getElementDecl("OrgnlCdtrSchmeId").createObject();
        setOrgnlCdtrSchmeId(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new OrgnlDbtr (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 createOrgnlDbtr() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) getElementDecl("OrgnlDbtr").createObject();
        setOrgnlDbtr(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new OrgnlDbtrAcct (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 createOrgnlDbtrAcct() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) getElementDecl("OrgnlDbtrAcct").createObject();
        setOrgnlDbtrAcct(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new OrgnlDbtrAgt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 createOrgnlDbtrAgt() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) getElementDecl("OrgnlDbtrAgt").createObject();
        setOrgnlDbtrAgt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new OrgnlDbtrAgtAcct (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 createOrgnlDbtrAgtAcct() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) getElementDecl("OrgnlDbtrAgtAcct").createObject();
        setOrgnlDbtrAgtAcct(obj);
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
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are:
     * <b>orgnlMndtId, orgnlCdtrSchmeId, orgnlCdtrAgt,
     * orgnlCdtrAgtAcct, orgnlDbtr, orgnlDbtrAcct, orgnlDbtrAgt,
     * orgnlDbtrAgtAcct, orgnlFnlColltnDt, orgnlFrqcy</b>.
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
            case 9:
                return getOrgnlMndtId();
            case 2:
                return getOrgnlCdtrSchmeId();
            case 0:
                return getOrgnlCdtrAgt();
            case 1:
                return getOrgnlCdtrAgtAcct();
            case 3:
                return getOrgnlDbtr();
            case 4:
                return getOrgnlDbtrAcct();
            case 5:
                return getOrgnlDbtrAgt();
            case 6:
                return getOrgnlDbtrAgtAcct();
            case 7:
                return getOrgnlFnlColltnDt();
            case 8:
                return getOrgnlFrqcy();
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
            case 9:
                return this.orgnlMndtId == null ? 0 : 1;
            case 2:
                return this.orgnlCdtrSchmeId == null ? 0 : 1;
            case 0:
                return this.orgnlCdtrAgt == null ? 0 : 1;
            case 1:
                return this.orgnlCdtrAgtAcct == null ? 0 : 1;
            case 3:
                return this.orgnlDbtr == null ? 0 : 1;
            case 4:
                return this.orgnlDbtrAcct == null ? 0 : 1;
            case 5:
                return this.orgnlDbtrAgt == null ? 0 : 1;
            case 6:
                return this.orgnlDbtrAgtAcct == null ? 0 : 1;
            case 7:
                return this.orgnlFnlColltnDt == null ? 0 : 1;
            case 8:
                return this.orgnlFrqcy == null ? 0 : 1;
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
            case 9:
                return this.orgnlMndtId != null && this.orgnlMndtId.equals(element) ? 0 : -1;
            case 2:
                return this.orgnlCdtrSchmeId != null && this.orgnlCdtrSchmeId.equals(element) ? 0 : -1;
            case 0:
                return this.orgnlCdtrAgt != null && this.orgnlCdtrAgt.equals(element) ? 0 : -1;
            case 1:
                return this.orgnlCdtrAgtAcct != null && this.orgnlCdtrAgtAcct.equals(element) ? 0 : -1;
            case 3:
                return this.orgnlDbtr != null && this.orgnlDbtr.equals(element) ? 0 : -1;
            case 4:
                return this.orgnlDbtrAcct != null && this.orgnlDbtrAcct.equals(element) ? 0 : -1;
            case 5:
                return this.orgnlDbtrAgt != null && this.orgnlDbtrAgt.equals(element) ? 0 : -1;
            case 6:
                return this.orgnlDbtrAgtAcct != null && this.orgnlDbtrAgtAcct.equals(element) ? 0 : -1;
            case 7:
                return this.orgnlFnlColltnDt != null && this.orgnlFnlColltnDt.equals(element) ? 0 : -1;
            case 8:
                return this.orgnlFrqcy != null && this.orgnlFrqcy.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of OrgnlCdtrAgt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 getOrgnlCdtrAgt() {
        return this.orgnlCdtrAgt;
    }

    /**
     * Gets the value of OrgnlCdtrAgtAcct (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 getOrgnlCdtrAgtAcct() {
        return this.orgnlCdtrAgtAcct;
    }

    /**
     * Gets the value of OrgnlCdtrSchmeId (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 getOrgnlCdtrSchmeId() {
        return this.orgnlCdtrSchmeId;
    }

    /**
     * Gets the value of OrgnlDbtr (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 getOrgnlDbtr() {
        return this.orgnlDbtr;
    }

    /**
     * Gets the value of OrgnlDbtrAcct (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 getOrgnlDbtrAcct() {
        return this.orgnlDbtrAcct;
    }

    /**
     * Gets the value of OrgnlDbtrAgt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 getOrgnlDbtrAgt() {
        return this.orgnlDbtrAgt;
    }

    /**
     * Gets the value of OrgnlDbtrAgtAcct (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 getOrgnlDbtrAgtAcct() {
        return this.orgnlDbtrAgtAcct;
    }

    /**
     * Gets the value of OrgnlFnlColltnDt (0..1).
     * 
     * @return The value.
     */
    public biz.c24.io.api.data.ISO8601Date getOrgnlFnlColltnDt() {
        return this.orgnlFnlColltnDt;
    }

    /**
     * Gets the value of OrgnlFrqcy (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getOrgnlFrqcy() {
        return this.orgnlFrqcy;
    }

    /**
     * Gets the value of OrgnlMndtId (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getOrgnlMndtId() {
        return this.orgnlMndtId;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are:
     * <b>orgnlMndtId, orgnlCdtrSchmeId, orgnlCdtrAgt,
     * orgnlCdtrAgtAcct, orgnlDbtr, orgnlDbtrAcct, orgnlDbtrAgt,
     * orgnlDbtrAgtAcct, orgnlFnlColltnDt, orgnlFrqcy</b>.
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
            case 9:
                return this.orgnlMndtId;
            case 2:
                return this.orgnlCdtrSchmeId;
            case 0:
                return this.orgnlCdtrAgt;
            case 1:
                return this.orgnlCdtrAgtAcct;
            case 3:
                return this.orgnlDbtr;
            case 4:
                return this.orgnlDbtrAcct;
            case 5:
                return this.orgnlDbtrAgt;
            case 6:
                return this.orgnlDbtrAgtAcct;
            case 7:
                return this.orgnlFnlColltnDt;
            case 8:
                return this.orgnlFrqcy;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.orgnlMndtId == null ? 0 : 1;
        count += this.orgnlCdtrSchmeId == null ? 0 : 1;
        count += this.orgnlCdtrAgt == null ? 0 : 1;
        count += this.orgnlCdtrAgtAcct == null ? 0 : 1;
        count += this.orgnlDbtr == null ? 0 : 1;
        count += this.orgnlDbtrAcct == null ? 0 : 1;
        count += this.orgnlDbtrAgt == null ? 0 : 1;
        count += this.orgnlDbtrAgtAcct == null ? 0 : 1;
        count += this.orgnlFnlColltnDt == null ? 0 : 1;
        count += this.orgnlFrqcy == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(orgnlMndtId);
        result = 31 * result + hashCodeOf(orgnlCdtrSchmeId);
        result = 31 * result + hashCodeOf(orgnlCdtrAgt);
        result = 31 * result + hashCodeOf(orgnlCdtrAgtAcct);
        result = 31 * result + hashCodeOf(orgnlDbtr);
        result = 31 * result + hashCodeOf(orgnlDbtrAcct);
        result = 31 * result + hashCodeOf(orgnlDbtrAgt);
        result = 31 * result + hashCodeOf(orgnlDbtrAgtAcct);
        result = 31 * result + hashCodeOf(orgnlFnlColltnDt);
        result = 31 * result + hashCodeOf(orgnlFrqcy);
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
            case 9:
                setOrgnlMndtId(null);
                return;
            case 2:
                setOrgnlCdtrSchmeId(null);
                return;
            case 0:
                setOrgnlCdtrAgt(null);
                return;
            case 1:
                setOrgnlCdtrAgtAcct(null);
                return;
            case 3:
                setOrgnlDbtr(null);
                return;
            case 4:
                setOrgnlDbtrAcct(null);
                return;
            case 5:
                setOrgnlDbtrAgt(null);
                return;
            case 6:
                setOrgnlDbtrAgtAcct(null);
                return;
            case 7:
                setOrgnlFnlColltnDt(null);
                return;
            case 8:
                setOrgnlFrqcy(null);
                return;
            default:
            super.removeElement(name, index);
        }
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
            case 9:
                setOrgnlMndtId((java.lang.String) value);
                return;
            case 2:
                setOrgnlCdtrSchmeId((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) value);
                return;
            case 0:
                setOrgnlCdtrAgt((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 1:
                setOrgnlCdtrAgtAcct((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) value);
                return;
            case 3:
                setOrgnlDbtr((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) value);
                return;
            case 4:
                setOrgnlDbtrAcct((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) value);
                return;
            case 5:
                setOrgnlDbtrAgt((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 6:
                setOrgnlDbtrAgtAcct((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) value);
                return;
            case 7:
                setOrgnlFnlColltnDt((biz.c24.io.api.data.ISO8601Date) value);
                return;
            case 8:
                setOrgnlFrqcy((java.lang.String) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of OrgnlCdtrAgt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setOrgnlCdtrAgt(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 value) {
        this.orgnlCdtrAgt = value;
        if (this.orgnlCdtrAgt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.orgnlCdtrAgt).setParent(this, "OrgnlCdtrAgt");
    }

    /**
     * [Virtual Element] Sets the value of OrgnlCdtrAgtAcct (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setOrgnlCdtrAgtAcct(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 value) {
        this.orgnlCdtrAgtAcct = value;
        if (this.orgnlCdtrAgtAcct != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.orgnlCdtrAgtAcct).setParent(this, "OrgnlCdtrAgtAcct");
    }

    /**
     * [Virtual Element] Sets the value of OrgnlCdtrSchmeId (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setOrgnlCdtrSchmeId(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 value) {
        this.orgnlCdtrSchmeId = value;
        if (this.orgnlCdtrSchmeId != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.orgnlCdtrSchmeId).setParent(this, "OrgnlCdtrSchmeId");
    }

    /**
     * [Virtual Element] Sets the value of OrgnlDbtr (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setOrgnlDbtr(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 value) {
        this.orgnlDbtr = value;
        if (this.orgnlDbtr != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.orgnlDbtr).setParent(this, "OrgnlDbtr");
    }

    /**
     * [Virtual Element] Sets the value of OrgnlDbtrAcct (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setOrgnlDbtrAcct(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 value) {
        this.orgnlDbtrAcct = value;
        if (this.orgnlDbtrAcct != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.orgnlDbtrAcct).setParent(this, "OrgnlDbtrAcct");
    }

    /**
     * [Virtual Element] Sets the value of OrgnlDbtrAgt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setOrgnlDbtrAgt(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 value) {
        this.orgnlDbtrAgt = value;
        if (this.orgnlDbtrAgt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.orgnlDbtrAgt).setParent(this, "OrgnlDbtrAgt");
    }

    /**
     * [Virtual Element] Sets the value of OrgnlDbtrAgtAcct (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setOrgnlDbtrAgtAcct(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 value) {
        this.orgnlDbtrAgtAcct = value;
        if (this.orgnlDbtrAgtAcct != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.orgnlDbtrAgtAcct).setParent(this, "OrgnlDbtrAgtAcct");
    }

    /**
     * [Virtual Element] Sets the value of OrgnlFnlColltnDt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setOrgnlFnlColltnDt(biz.c24.io.api.data.ISO8601Date value) {
        this.orgnlFnlColltnDt = value;
    }

    /**
     * [Virtual Element] Sets the value of OrgnlFrqcy (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setOrgnlFrqcy(java.lang.String value) {
        this.orgnlFrqcy = value;
    }

    /**
     * [Virtual Element] Sets the value of OrgnlMndtId (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setOrgnlMndtId(java.lang.String value) {
        this.orgnlMndtId = value;
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.orgnlMndtId);
        out.writeObject(this.orgnlCdtrSchmeId);
        out.writeObject(this.orgnlCdtrAgt);
        out.writeObject(this.orgnlCdtrAgtAcct);
        out.writeObject(this.orgnlDbtr);
        out.writeObject(this.orgnlDbtrAcct);
        out.writeObject(this.orgnlDbtrAgt);
        out.writeObject(this.orgnlDbtrAgtAcct);
        out.writeObject(this.orgnlFnlColltnDt);
        out.writeObject(this.orgnlFrqcy);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.orgnlMndtId = (java.lang.String) in.readObject();
        this.orgnlCdtrSchmeId = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) in.readObject();
        this.orgnlCdtrAgt = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) in.readObject();
        this.orgnlCdtrAgtAcct = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) in.readObject();
        this.orgnlDbtr = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) in.readObject();
        this.orgnlDbtrAcct = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) in.readObject();
        this.orgnlDbtrAgt = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) in.readObject();
        this.orgnlDbtrAgtAcct = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) in.readObject();
        this.orgnlFnlColltnDt = (biz.c24.io.api.data.ISO8601Date) in.readObject();
        this.orgnlFrqcy = (java.lang.String) in.readObject();
    }

}
