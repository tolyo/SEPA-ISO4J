/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * CashAccount20. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>Id</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountIdentification4Choice}
 * (1)</li>
 * <li><b>Tp</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccountType2}
 * (0..1)</li>
 * <li><b>Ccy</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>Nm</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>Ownr</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32}
 * (0..1)</li>
 * <li><b>Svcr</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BranchAndFinancialInstitutionIdentification4}
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
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount20Cls
 */
public class CashAccount20 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"Ccy", "Id", "Nm", "Ownr", "Svcr", "Tp"};

    /**
     * Field id.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountIdentification4Choice id;

    /**
     * Field tp.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccountType2 tp;

    /**
     * Field ccy.
     */
    private java.lang.String ccy;

    /**
     * Field nm.
     */
    private java.lang.String nm;

    /**
     * Field ownr.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 ownr;

    /**
     * Field svcr.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BranchAndFinancialInstitutionIdentification4 svcr;

    public CashAccount20() {
        this(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount20Cls.getInstance().getNullDefiningElementDecl());
    }

    public CashAccount20(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public CashAccount20(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public CashAccount20(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount20 clone) {
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
                setId((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountIdentification4Choice) value);
                return;
            case 5:
                setTp((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccountType2) value);
                return;
            case 0:
                setCcy((java.lang.String) value);
                return;
            case 2:
                setNm((java.lang.String) value);
                return;
            case 3:
                setOwnr((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) value);
                return;
            case 4:
                setSvcr((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BranchAndFinancialInstitutionIdentification4) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount20(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount20(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount20 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount20) clone;
        obj.id = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountIdentification4Choice) biz.c24.io.api.Utils.cloneDeep(this.id, obj, "Id");
        obj.tp = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccountType2) biz.c24.io.api.Utils.cloneDeep(this.tp, obj, "Tp");
        obj.ccy = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.ccy, obj, "Ccy");
        obj.nm = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.nm, obj, "Nm");
        obj.ownr = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) biz.c24.io.api.Utils.cloneDeep(this.ownr, obj, "Ownr");
        obj.svcr = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BranchAndFinancialInstitutionIdentification4) biz.c24.io.api.Utils.cloneDeep(this.svcr, obj, "Svcr");
    }

    /**
     * Creates, adds and returns a new Id (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountIdentification4Choice createId() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountIdentification4Choice obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountIdentification4Choice) getElementDecl("Id").createObject();
        setId(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Ownr (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 createOwnr() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) getElementDecl("Ownr").createObject();
        setOwnr(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Svcr (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BranchAndFinancialInstitutionIdentification4 createSvcr() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BranchAndFinancialInstitutionIdentification4 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BranchAndFinancialInstitutionIdentification4) getElementDecl("Svcr").createObject();
        setSvcr(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Tp (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccountType2 createTp() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccountType2 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccountType2) getElementDecl("Tp").createObject();
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
     * Gets the value of Ccy (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getCcy() {
        return this.ccy;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>id, tp,
     * ccy, nm, ownr, svcr</b>.
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
                return getId();
            case 5:
                return getTp();
            case 0:
                return getCcy();
            case 2:
                return getNm();
            case 3:
                return getOwnr();
            case 4:
                return getSvcr();
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
                return this.id == null ? 0 : 1;
            case 5:
                return this.tp == null ? 0 : 1;
            case 0:
                return this.ccy == null ? 0 : 1;
            case 2:
                return this.nm == null ? 0 : 1;
            case 3:
                return this.ownr == null ? 0 : 1;
            case 4:
                return this.svcr == null ? 0 : 1;
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
                return this.id != null && this.id.equals(element) ? 0 : -1;
            case 5:
                return this.tp != null && this.tp.equals(element) ? 0 : -1;
            case 0:
                return this.ccy != null && this.ccy.equals(element) ? 0 : -1;
            case 2:
                return this.nm != null && this.nm.equals(element) ? 0 : -1;
            case 3:
                return this.ownr != null && this.ownr.equals(element) ? 0 : -1;
            case 4:
                return this.svcr != null && this.svcr.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of Id (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountIdentification4Choice getId() {
        return this.id;
    }

    /**
     * Gets the value of Nm (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getNm() {
        return this.nm;
    }

    /**
     * Gets the value of Ownr (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 getOwnr() {
        return this.ownr;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>id, tp,
     * ccy, nm, ownr, svcr</b>.
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
                return this.id;
            case 5:
                return this.tp;
            case 0:
                return this.ccy;
            case 2:
                return this.nm;
            case 3:
                return this.ownr;
            case 4:
                return this.svcr;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of Svcr (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BranchAndFinancialInstitutionIdentification4 getSvcr() {
        return this.svcr;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.id == null ? 0 : 1;
        count += this.tp == null ? 0 : 1;
        count += this.ccy == null ? 0 : 1;
        count += this.nm == null ? 0 : 1;
        count += this.ownr == null ? 0 : 1;
        count += this.svcr == null ? 0 : 1;
        return count;
    }

    /**
     * Gets the value of Tp (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccountType2 getTp() {
        return this.tp;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(id);
        result = 31 * result + hashCodeOf(tp);
        result = 31 * result + hashCodeOf(ccy);
        result = 31 * result + hashCodeOf(nm);
        result = 31 * result + hashCodeOf(ownr);
        result = 31 * result + hashCodeOf(svcr);
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
                setId(null);
                return;
            case 5:
                setTp(null);
                return;
            case 0:
                setCcy(null);
                return;
            case 2:
                setNm(null);
                return;
            case 3:
                setOwnr(null);
                return;
            case 4:
                setSvcr(null);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of Ccy (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCcy(java.lang.String value) {
        this.ccy = value;
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
                setId((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountIdentification4Choice) value);
                return;
            case 5:
                setTp((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccountType2) value);
                return;
            case 0:
                setCcy((java.lang.String) value);
                return;
            case 2:
                setNm((java.lang.String) value);
                return;
            case 3:
                setOwnr((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) value);
                return;
            case 4:
                setSvcr((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BranchAndFinancialInstitutionIdentification4) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of Id (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setId(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountIdentification4Choice value) {
        this.id = value;
        if (this.id != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.id).setParent(this, "Id");
    }

    /**
     * [Virtual Element] Sets the value of Nm (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setNm(java.lang.String value) {
        this.nm = value;
    }

    /**
     * [Virtual Element] Sets the value of Ownr (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setOwnr(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 value) {
        this.ownr = value;
        if (this.ownr != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.ownr).setParent(this, "Ownr");
    }

    /**
     * [Virtual Element] Sets the value of Svcr (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setSvcr(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BranchAndFinancialInstitutionIdentification4 value) {
        this.svcr = value;
        if (this.svcr != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.svcr).setParent(this, "Svcr");
    }

    /**
     * [Virtual Element] Sets the value of Tp (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTp(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccountType2 value) {
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
        out.writeObject(this.id);
        out.writeObject(this.tp);
        out.writeObject(this.ccy);
        out.writeObject(this.nm);
        out.writeObject(this.ownr);
        out.writeObject(this.svcr);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.id = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountIdentification4Choice) in.readObject();
        this.tp = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccountType2) in.readObject();
        this.ccy = (java.lang.String) in.readObject();
        this.nm = (java.lang.String) in.readObject();
        this.ownr = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) in.readObject();
        this.svcr = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BranchAndFinancialInstitutionIdentification4) in.readObject();
    }

}
