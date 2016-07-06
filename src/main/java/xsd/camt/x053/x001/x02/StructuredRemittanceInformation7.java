/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * StructuredRemittanceInformation7. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>RfrdDocInf</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReferredDocumentInformation3}
 * (0..*)</li>
 * <li><b>RfrdDocAmt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RemittanceAmount1}
 * (0..1)</li>
 * <li><b>CdtrRefInf</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CreditorReferenceInformation2}
 * (0..1)</li>
 * <li><b>Invcr</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32}
 * (0..1)</li>
 * <li><b>Invcee</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32}
 * (0..1)</li>
 * <li><b>AddtlRmtInf</b> of type {@link java.lang.String}
 * (0..3)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.StructuredRemittanceInformation7Cls
 */
public class StructuredRemittanceInformation7 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"AddtlRmtInf", "CdtrRefInf", "Invcee", "Invcr", "RfrdDocAmt", "RfrdDocInf"};

    /**
     * Field rfrdDocInf.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReferredDocumentInformation3[] rfrdDocInf;

    /**
     * Field rfrdDocAmt.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RemittanceAmount1 rfrdDocAmt;

    /**
     * Field cdtrRefInf.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CreditorReferenceInformation2 cdtrRefInf;

    /**
     * Field invcr.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 invcr;

    /**
     * Field invcee.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 invcee;

    /**
     * Field addtlRmtInf.
     */
    private java.lang.String[] addtlRmtInf;

    public StructuredRemittanceInformation7() {
        this(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.StructuredRemittanceInformation7Cls.getInstance().getNullDefiningElementDecl());
    }

    public StructuredRemittanceInformation7(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public StructuredRemittanceInformation7(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public StructuredRemittanceInformation7(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.StructuredRemittanceInformation7 clone) {
        super(clone);
    }

    /**
     * Adds a AddtlRmtInf (0..3).
     * 
     * @param value
     * @param value The new AddtlRmtInf.
     */
    public void addAddtlRmtInf(java.lang.String value) {
        java.lang.String[] temp = this.addtlRmtInf;
        this.addtlRmtInf = new java.lang.String[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.addtlRmtInf, 0, temp.length);
        this.addtlRmtInf[this.addtlRmtInf.length-1] = value;
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
                addRfrdDocInf((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReferredDocumentInformation3) value);
                return;
            case 4:
                setRfrdDocAmt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RemittanceAmount1) value);
                return;
            case 1:
                setCdtrRefInf((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CreditorReferenceInformation2) value);
                return;
            case 3:
                setInvcr((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) value);
                return;
            case 2:
                setInvcee((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) value);
                return;
            case 0:
                addAddtlRmtInf((java.lang.String) value);
                return;
            default:
                super.addElement(name, value);
        }
    }

    /**
     * Adds a RfrdDocInf (0..*).
     * 
     * @param value
     * @param value The new RfrdDocInf.
     */
    public void addRfrdDocInf(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReferredDocumentInformation3 value) {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReferredDocumentInformation3[] temp = this.rfrdDocInf;
        this.rfrdDocInf = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReferredDocumentInformation3[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.rfrdDocInf, 0, temp.length);
        this.rfrdDocInf[this.rfrdDocInf.length-1] = value;
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "RfrdDocInf");
    }

    /**
     * Creates and returns a shallow clone of this object.
     * 
     * @see #cloneDeep()
     */
    public java.lang.Object clone() {
        return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.StructuredRemittanceInformation7(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.StructuredRemittanceInformation7(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.StructuredRemittanceInformation7 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.StructuredRemittanceInformation7) clone;
        obj.rfrdDocInf = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReferredDocumentInformation3[]) biz.c24.io.api.Utils.cloneDeep(this.rfrdDocInf, obj, "RfrdDocInf");
        obj.rfrdDocAmt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RemittanceAmount1) biz.c24.io.api.Utils.cloneDeep(this.rfrdDocAmt, obj, "RfrdDocAmt");
        obj.cdtrRefInf = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CreditorReferenceInformation2) biz.c24.io.api.Utils.cloneDeep(this.cdtrRefInf, obj, "CdtrRefInf");
        obj.invcr = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) biz.c24.io.api.Utils.cloneDeep(this.invcr, obj, "Invcr");
        obj.invcee = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) biz.c24.io.api.Utils.cloneDeep(this.invcee, obj, "Invcee");
        obj.addtlRmtInf = (java.lang.String[]) biz.c24.io.api.Utils.cloneDeep(this.addtlRmtInf, obj, "AddtlRmtInf");
    }

    /**
     * Creates, adds and returns a new CdtrRefInf (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CreditorReferenceInformation2 createCdtrRefInf() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CreditorReferenceInformation2 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CreditorReferenceInformation2) getElementDecl("CdtrRefInf").createObject();
        setCdtrRefInf(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Invcee (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 createInvcee() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) getElementDecl("Invcee").createObject();
        setInvcee(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Invcr (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 createInvcr() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) getElementDecl("Invcr").createObject();
        setInvcr(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new RfrdDocAmt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RemittanceAmount1 createRfrdDocAmt() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RemittanceAmount1 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RemittanceAmount1) getElementDecl("RfrdDocAmt").createObject();
        setRfrdDocAmt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new RfrdDocInf (0..*).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReferredDocumentInformation3 createRfrdDocInf() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReferredDocumentInformation3 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReferredDocumentInformation3) getElementDecl("RfrdDocInf").createObject();
        addRfrdDocInf(obj);
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
     * Gets the value of AddtlRmtInf (0..3).
     * 
     * @return The value.
     */
    public java.lang.String[] getAddtlRmtInf() {
        if (this.addtlRmtInf == null)
            return new java.lang.String[]{};
        else
            return this.addtlRmtInf;
    }

    /**
     * Gets the value of AddtlRmtInf by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public java.lang.String getAddtlRmtInf(int ordinal) {
        if (this.addtlRmtInf == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.addtlRmtInf.length) {
            return this.addtlRmtInf[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (0..3).
     * 
     * @param value
     * @param value The AddtlRmtInf to get the index of.
     * @return The index.
     */
    public int getAddtlRmtInfIndex(java.lang.String value) {
        if (this.addtlRmtInf == null)
            return -1;
        for (int i=0; i<this.addtlRmtInf.length; i++)
            if (this.addtlRmtInf[i] == value)
                return i;
        return -1;
    }

    /**
     * Gets the value of CdtrRefInf (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CreditorReferenceInformation2 getCdtrRefInf() {
        return this.cdtrRefInf;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>rfrdDocInf,
     * rfrdDocAmt, cdtrRefInf, invcr, invcee, addtlRmtInf</b>.
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
            if (this.rfrdDocInf == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.rfrdDocInf[index];
            case 4:
                return getRfrdDocAmt();
            case 1:
                return getCdtrRefInf();
            case 3:
                return getInvcr();
            case 2:
                return getInvcee();
            case 0:
            if (this.addtlRmtInf == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.addtlRmtInf[index];
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
                return this.rfrdDocInf == null ? 0 : this.rfrdDocInf.length;
            case 4:
                return this.rfrdDocAmt == null ? 0 : 1;
            case 1:
                return this.cdtrRefInf == null ? 0 : 1;
            case 3:
                return this.invcr == null ? 0 : 1;
            case 2:
                return this.invcee == null ? 0 : 1;
            case 0:
                return this.addtlRmtInf == null ? 0 : this.addtlRmtInf.length;
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
                return getRfrdDocInfIndex((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReferredDocumentInformation3) element);
            case 4:
                return this.rfrdDocAmt != null && this.rfrdDocAmt.equals(element) ? 0 : -1;
            case 1:
                return this.cdtrRefInf != null && this.cdtrRefInf.equals(element) ? 0 : -1;
            case 3:
                return this.invcr != null && this.invcr.equals(element) ? 0 : -1;
            case 2:
                return this.invcee != null && this.invcee.equals(element) ? 0 : -1;
            case 0:
                return getAddtlRmtInfIndex((java.lang.String) element);
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of Invcee (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 getInvcee() {
        return this.invcee;
    }

    /**
     * Gets the value of Invcr (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 getInvcr() {
        return this.invcr;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>rfrdDocInf,
     * rfrdDocAmt, cdtrRefInf, invcr, invcee, addtlRmtInf</b>.
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
            if (this.rfrdDocInf == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.rfrdDocInf[index];
            case 4:
                return this.rfrdDocAmt;
            case 1:
                return this.cdtrRefInf;
            case 3:
                return this.invcr;
            case 2:
                return this.invcee;
            case 0:
            if (this.addtlRmtInf == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.addtlRmtInf[index];
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of RfrdDocAmt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RemittanceAmount1 getRfrdDocAmt() {
        return this.rfrdDocAmt;
    }

    /**
     * Gets the value of RfrdDocInf (0..*).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReferredDocumentInformation3[] getRfrdDocInf() {
        if (this.rfrdDocInf == null)
            return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReferredDocumentInformation3[]{};
        else
            return this.rfrdDocInf;
    }

    /**
     * Gets the value of RfrdDocInf by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReferredDocumentInformation3 getRfrdDocInf(int ordinal) {
        if (this.rfrdDocInf == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.rfrdDocInf.length) {
            return this.rfrdDocInf[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (0..*).
     * 
     * @param value
     * @param value The RfrdDocInf to get the index of.
     * @return The index.
     */
    public int getRfrdDocInfIndex(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReferredDocumentInformation3 value) {
        if (this.rfrdDocInf == null)
            return -1;
        for (int i=0; i<this.rfrdDocInf.length; i++)
            if (this.rfrdDocInf[i] == value)
                return i;
        return -1;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.rfrdDocInf == null ? 0 : this.rfrdDocInf.length;
        count += this.rfrdDocAmt == null ? 0 : 1;
        count += this.cdtrRefInf == null ? 0 : 1;
        count += this.invcr == null ? 0 : 1;
        count += this.invcee == null ? 0 : 1;
        count += this.addtlRmtInf == null ? 0 : this.addtlRmtInf.length;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(rfrdDocInf);
        result = 31 * result + hashCodeOf(rfrdDocAmt);
        result = 31 * result + hashCodeOf(cdtrRefInf);
        result = 31 * result + hashCodeOf(invcr);
        result = 31 * result + hashCodeOf(invcee);
        result = 31 * result + hashCodeOf(addtlRmtInf);
        return result;
    }

    /**
     * Removes a AddtlRmtInf (0..3).
     * 
     * @param index
     * @param index The index of the AddtlRmtInf to get.
     */
    public void removeAddtlRmtInf(int index) {
        if (this.addtlRmtInf == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        java.lang.String[] temp = this.addtlRmtInf;
        this.addtlRmtInf = new java.lang.String[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.addtlRmtInf, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.addtlRmtInf, index, temp.length-index-1);
        if (this.addtlRmtInf.length == 0)
            this.addtlRmtInf = null;
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
                removeRfrdDocInf(index);
                return;
            case 4:
                setRfrdDocAmt(null);
                return;
            case 1:
                setCdtrRefInf(null);
                return;
            case 3:
                setInvcr(null);
                return;
            case 2:
                setInvcee(null);
                return;
            case 0:
                removeAddtlRmtInf(index);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * Removes a RfrdDocInf (0..*).
     * 
     * @param index
     * @param index The index of the RfrdDocInf to get.
     */
    public void removeRfrdDocInf(int index) {
        if (this.rfrdDocInf == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReferredDocumentInformation3[] temp = this.rfrdDocInf;
        this.rfrdDocInf = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReferredDocumentInformation3[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.rfrdDocInf, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.rfrdDocInf, index, temp.length-index-1);
        if (this.rfrdDocInf.length == 0)
            this.rfrdDocInf = null;
    }

    /**
     * [Virtual Element] Sets the value of AddtlRmtInf (0..3).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAddtlRmtInf(java.lang.String[] value) {
        this.addtlRmtInf = (java.lang.String[]) biz.c24.io.api.Utils.clearNulls(value);
    }

    /**
     * [Virtual Element] Sets the value of CdtrRefInf (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCdtrRefInf(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CreditorReferenceInformation2 value) {
        this.cdtrRefInf = value;
        if (this.cdtrRefInf != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.cdtrRefInf).setParent(this, "CdtrRefInf");
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
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReferredDocumentInformation3[]) {
                    setRfrdDocInf((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReferredDocumentInformation3[])value);
                } else if (this.rfrdDocInf == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.rfrdDocInf[index] = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReferredDocumentInformation3) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.rfrdDocInf[index]).setParent(this, "RfrdDocInf");
                }
                return;
            case 4:
                setRfrdDocAmt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RemittanceAmount1) value);
                return;
            case 1:
                setCdtrRefInf((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CreditorReferenceInformation2) value);
                return;
            case 3:
                setInvcr((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) value);
                return;
            case 2:
                setInvcee((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) value);
                return;
            case 0:
                if (value != null && value instanceof java.lang.String[]) {
                    setAddtlRmtInf((java.lang.String[])value);
                } else if (this.addtlRmtInf == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.addtlRmtInf[index] = (java.lang.String) value;
                }
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of Invcee (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setInvcee(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 value) {
        this.invcee = value;
        if (this.invcee != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.invcee).setParent(this, "Invcee");
    }

    /**
     * [Virtual Element] Sets the value of Invcr (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setInvcr(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 value) {
        this.invcr = value;
        if (this.invcr != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.invcr).setParent(this, "Invcr");
    }

    /**
     * [Virtual Element] Sets the value of RfrdDocAmt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setRfrdDocAmt(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RemittanceAmount1 value) {
        this.rfrdDocAmt = value;
        if (this.rfrdDocAmt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.rfrdDocAmt).setParent(this, "RfrdDocAmt");
    }

    /**
     * [Virtual Element] Sets the value of RfrdDocInf (0..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setRfrdDocInf(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReferredDocumentInformation3[] value) {
        this.rfrdDocInf = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReferredDocumentInformation3[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.rfrdDocInf != null && i<this.rfrdDocInf.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.rfrdDocInf[i]).setParent(this, "RfrdDocInf");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.rfrdDocInf);
        out.writeObject(this.rfrdDocAmt);
        out.writeObject(this.cdtrRefInf);
        out.writeObject(this.invcr);
        out.writeObject(this.invcee);
        out.writeObject(this.addtlRmtInf);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.rfrdDocInf = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReferredDocumentInformation3[]) in.readObject();
        this.rfrdDocAmt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RemittanceAmount1) in.readObject();
        this.cdtrRefInf = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CreditorReferenceInformation2) in.readObject();
        this.invcr = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) in.readObject();
        this.invcee = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) in.readObject();
        this.addtlRmtInf = (java.lang.String[]) in.readObject();
    }

}
