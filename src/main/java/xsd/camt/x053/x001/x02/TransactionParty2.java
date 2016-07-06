/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * TransactionParty2. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>InitgPty</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32}
 * (0..1)</li>
 * <li><b>Dbtr</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32}
 * (0..1)</li>
 * <li><b>DbtrAcct</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount16}
 * (0..1)</li>
 * <li><b>UltmtDbtr</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32}
 * (0..1)</li>
 * <li><b>Cdtr</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32}
 * (0..1)</li>
 * <li><b>CdtrAcct</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount16}
 * (0..1)</li>
 * <li><b>UltmtCdtr</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32}
 * (0..1)</li>
 * <li><b>TradgPty</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32}
 * (0..1)</li>
 * <li><b>Prtry</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryParty2}
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
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionParty2Cls
 */
public class TransactionParty2 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"Cdtr", "CdtrAcct", "Dbtr", "DbtrAcct", "InitgPty", "Prtry", "TradgPty", "UltmtCdtr", "UltmtDbtr"};

    /**
     * Field initgPty.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 initgPty;

    /**
     * Field dbtr.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 dbtr;

    /**
     * Field dbtrAcct.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount16 dbtrAcct;

    /**
     * Field ultmtDbtr.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 ultmtDbtr;

    /**
     * Field cdtr.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 cdtr;

    /**
     * Field cdtrAcct.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount16 cdtrAcct;

    /**
     * Field ultmtCdtr.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 ultmtCdtr;

    /**
     * Field tradgPty.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 tradgPty;

    /**
     * Field prtry.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryParty2[] prtry;

    public TransactionParty2() {
        this(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionParty2Cls.getInstance().getNullDefiningElementDecl());
    }

    public TransactionParty2(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public TransactionParty2(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public TransactionParty2(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionParty2 clone) {
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
            case 4:
                setInitgPty((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) value);
                return;
            case 2:
                setDbtr((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) value);
                return;
            case 3:
                setDbtrAcct((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount16) value);
                return;
            case 8:
                setUltmtDbtr((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) value);
                return;
            case 0:
                setCdtr((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) value);
                return;
            case 1:
                setCdtrAcct((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount16) value);
                return;
            case 7:
                setUltmtCdtr((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) value);
                return;
            case 6:
                setTradgPty((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) value);
                return;
            case 5:
                addPrtry((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryParty2) value);
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
    public void addPrtry(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryParty2 value) {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryParty2[] temp = this.prtry;
        this.prtry = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryParty2[temp == null ? 1 : (temp.length+1)];
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
        return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionParty2(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionParty2(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionParty2 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionParty2) clone;
        obj.initgPty = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) biz.c24.io.api.Utils.cloneDeep(this.initgPty, obj, "InitgPty");
        obj.dbtr = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) biz.c24.io.api.Utils.cloneDeep(this.dbtr, obj, "Dbtr");
        obj.dbtrAcct = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount16) biz.c24.io.api.Utils.cloneDeep(this.dbtrAcct, obj, "DbtrAcct");
        obj.ultmtDbtr = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) biz.c24.io.api.Utils.cloneDeep(this.ultmtDbtr, obj, "UltmtDbtr");
        obj.cdtr = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) biz.c24.io.api.Utils.cloneDeep(this.cdtr, obj, "Cdtr");
        obj.cdtrAcct = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount16) biz.c24.io.api.Utils.cloneDeep(this.cdtrAcct, obj, "CdtrAcct");
        obj.ultmtCdtr = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) biz.c24.io.api.Utils.cloneDeep(this.ultmtCdtr, obj, "UltmtCdtr");
        obj.tradgPty = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) biz.c24.io.api.Utils.cloneDeep(this.tradgPty, obj, "TradgPty");
        obj.prtry = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryParty2[]) biz.c24.io.api.Utils.cloneDeep(this.prtry, obj, "Prtry");
    }

    /**
     * Creates, adds and returns a new Cdtr (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 createCdtr() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) getElementDecl("Cdtr").createObject();
        setCdtr(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new CdtrAcct (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount16 createCdtrAcct() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount16 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount16) getElementDecl("CdtrAcct").createObject();
        setCdtrAcct(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Dbtr (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 createDbtr() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) getElementDecl("Dbtr").createObject();
        setDbtr(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new DbtrAcct (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount16 createDbtrAcct() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount16 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount16) getElementDecl("DbtrAcct").createObject();
        setDbtrAcct(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new InitgPty (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 createInitgPty() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) getElementDecl("InitgPty").createObject();
        setInitgPty(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Prtry (0..*).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryParty2 createPrtry() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryParty2 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryParty2) getElementDecl("Prtry").createObject();
        addPrtry(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new TradgPty (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 createTradgPty() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) getElementDecl("TradgPty").createObject();
        setTradgPty(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new UltmtCdtr (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 createUltmtCdtr() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) getElementDecl("UltmtCdtr").createObject();
        setUltmtCdtr(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new UltmtDbtr (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 createUltmtDbtr() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) getElementDecl("UltmtDbtr").createObject();
        setUltmtDbtr(obj);
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
     * Gets the value of Cdtr (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 getCdtr() {
        return this.cdtr;
    }

    /**
     * Gets the value of CdtrAcct (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount16 getCdtrAcct() {
        return this.cdtrAcct;
    }

    /**
     * Gets the value of Dbtr (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 getDbtr() {
        return this.dbtr;
    }

    /**
     * Gets the value of DbtrAcct (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount16 getDbtrAcct() {
        return this.dbtrAcct;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>initgPty,
     * dbtr, dbtrAcct, ultmtDbtr, cdtr, cdtrAcct, ultmtCdtr,
     * tradgPty, prtry</b>.
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
            case 4:
                return getInitgPty();
            case 2:
                return getDbtr();
            case 3:
                return getDbtrAcct();
            case 8:
                return getUltmtDbtr();
            case 0:
                return getCdtr();
            case 1:
                return getCdtrAcct();
            case 7:
                return getUltmtCdtr();
            case 6:
                return getTradgPty();
            case 5:
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
            case 4:
                return this.initgPty == null ? 0 : 1;
            case 2:
                return this.dbtr == null ? 0 : 1;
            case 3:
                return this.dbtrAcct == null ? 0 : 1;
            case 8:
                return this.ultmtDbtr == null ? 0 : 1;
            case 0:
                return this.cdtr == null ? 0 : 1;
            case 1:
                return this.cdtrAcct == null ? 0 : 1;
            case 7:
                return this.ultmtCdtr == null ? 0 : 1;
            case 6:
                return this.tradgPty == null ? 0 : 1;
            case 5:
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
            case 4:
                return this.initgPty != null && this.initgPty.equals(element) ? 0 : -1;
            case 2:
                return this.dbtr != null && this.dbtr.equals(element) ? 0 : -1;
            case 3:
                return this.dbtrAcct != null && this.dbtrAcct.equals(element) ? 0 : -1;
            case 8:
                return this.ultmtDbtr != null && this.ultmtDbtr.equals(element) ? 0 : -1;
            case 0:
                return this.cdtr != null && this.cdtr.equals(element) ? 0 : -1;
            case 1:
                return this.cdtrAcct != null && this.cdtrAcct.equals(element) ? 0 : -1;
            case 7:
                return this.ultmtCdtr != null && this.ultmtCdtr.equals(element) ? 0 : -1;
            case 6:
                return this.tradgPty != null && this.tradgPty.equals(element) ? 0 : -1;
            case 5:
                return getPrtryIndex((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryParty2) element);
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of InitgPty (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 getInitgPty() {
        return this.initgPty;
    }

    /**
     * Gets the value of Prtry (0..*).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryParty2[] getPrtry() {
        if (this.prtry == null)
            return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryParty2[]{};
        else
            return this.prtry;
    }

    /**
     * Gets the value of Prtry by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryParty2 getPrtry(int ordinal) {
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
    public int getPrtryIndex(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryParty2 value) {
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
     * The legal value(s) for <code>name</code> are: <b>initgPty,
     * dbtr, dbtrAcct, ultmtDbtr, cdtr, cdtrAcct, ultmtCdtr,
     * tradgPty, prtry</b>.
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
            case 4:
                return this.initgPty;
            case 2:
                return this.dbtr;
            case 3:
                return this.dbtrAcct;
            case 8:
                return this.ultmtDbtr;
            case 0:
                return this.cdtr;
            case 1:
                return this.cdtrAcct;
            case 7:
                return this.ultmtCdtr;
            case 6:
                return this.tradgPty;
            case 5:
            if (this.prtry == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.prtry[index];
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.initgPty == null ? 0 : 1;
        count += this.dbtr == null ? 0 : 1;
        count += this.dbtrAcct == null ? 0 : 1;
        count += this.ultmtDbtr == null ? 0 : 1;
        count += this.cdtr == null ? 0 : 1;
        count += this.cdtrAcct == null ? 0 : 1;
        count += this.ultmtCdtr == null ? 0 : 1;
        count += this.tradgPty == null ? 0 : 1;
        count += this.prtry == null ? 0 : this.prtry.length;
        return count;
    }

    /**
     * Gets the value of TradgPty (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 getTradgPty() {
        return this.tradgPty;
    }

    /**
     * Gets the value of UltmtCdtr (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 getUltmtCdtr() {
        return this.ultmtCdtr;
    }

    /**
     * Gets the value of UltmtDbtr (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 getUltmtDbtr() {
        return this.ultmtDbtr;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(initgPty);
        result = 31 * result + hashCodeOf(dbtr);
        result = 31 * result + hashCodeOf(dbtrAcct);
        result = 31 * result + hashCodeOf(ultmtDbtr);
        result = 31 * result + hashCodeOf(cdtr);
        result = 31 * result + hashCodeOf(cdtrAcct);
        result = 31 * result + hashCodeOf(ultmtCdtr);
        result = 31 * result + hashCodeOf(tradgPty);
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
            case 4:
                setInitgPty(null);
                return;
            case 2:
                setDbtr(null);
                return;
            case 3:
                setDbtrAcct(null);
                return;
            case 8:
                setUltmtDbtr(null);
                return;
            case 0:
                setCdtr(null);
                return;
            case 1:
                setCdtrAcct(null);
                return;
            case 7:
                setUltmtCdtr(null);
                return;
            case 6:
                setTradgPty(null);
                return;
            case 5:
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
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryParty2[] temp = this.prtry;
        this.prtry = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryParty2[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.prtry, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.prtry, index, temp.length-index-1);
        if (this.prtry.length == 0)
            this.prtry = null;
    }

    /**
     * [Virtual Element] Sets the value of Cdtr (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCdtr(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 value) {
        this.cdtr = value;
        if (this.cdtr != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.cdtr).setParent(this, "Cdtr");
    }

    /**
     * [Virtual Element] Sets the value of CdtrAcct (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCdtrAcct(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount16 value) {
        this.cdtrAcct = value;
        if (this.cdtrAcct != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.cdtrAcct).setParent(this, "CdtrAcct");
    }

    /**
     * [Virtual Element] Sets the value of Dbtr (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setDbtr(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 value) {
        this.dbtr = value;
        if (this.dbtr != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.dbtr).setParent(this, "Dbtr");
    }

    /**
     * [Virtual Element] Sets the value of DbtrAcct (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setDbtrAcct(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount16 value) {
        this.dbtrAcct = value;
        if (this.dbtrAcct != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.dbtrAcct).setParent(this, "DbtrAcct");
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
            case 4:
                setInitgPty((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) value);
                return;
            case 2:
                setDbtr((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) value);
                return;
            case 3:
                setDbtrAcct((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount16) value);
                return;
            case 8:
                setUltmtDbtr((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) value);
                return;
            case 0:
                setCdtr((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) value);
                return;
            case 1:
                setCdtrAcct((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount16) value);
                return;
            case 7:
                setUltmtCdtr((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) value);
                return;
            case 6:
                setTradgPty((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) value);
                return;
            case 5:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryParty2[]) {
                    setPrtry((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryParty2[])value);
                } else if (this.prtry == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.prtry[index] = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryParty2) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.prtry[index]).setParent(this, "Prtry");
                }
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of InitgPty (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setInitgPty(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 value) {
        this.initgPty = value;
        if (this.initgPty != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.initgPty).setParent(this, "InitgPty");
    }

    /**
     * [Virtual Element] Sets the value of Prtry (0..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setPrtry(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryParty2[] value) {
        this.prtry = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryParty2[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.prtry != null && i<this.prtry.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.prtry[i]).setParent(this, "Prtry");
    }

    /**
     * [Virtual Element] Sets the value of TradgPty (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTradgPty(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 value) {
        this.tradgPty = value;
        if (this.tradgPty != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.tradgPty).setParent(this, "TradgPty");
    }

    /**
     * [Virtual Element] Sets the value of UltmtCdtr (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setUltmtCdtr(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 value) {
        this.ultmtCdtr = value;
        if (this.ultmtCdtr != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.ultmtCdtr).setParent(this, "UltmtCdtr");
    }

    /**
     * [Virtual Element] Sets the value of UltmtDbtr (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setUltmtDbtr(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 value) {
        this.ultmtDbtr = value;
        if (this.ultmtDbtr != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.ultmtDbtr).setParent(this, "UltmtDbtr");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.initgPty);
        out.writeObject(this.dbtr);
        out.writeObject(this.dbtrAcct);
        out.writeObject(this.ultmtDbtr);
        out.writeObject(this.cdtr);
        out.writeObject(this.cdtrAcct);
        out.writeObject(this.ultmtCdtr);
        out.writeObject(this.tradgPty);
        out.writeObject(this.prtry);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.initgPty = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) in.readObject();
        this.dbtr = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) in.readObject();
        this.dbtrAcct = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount16) in.readObject();
        this.ultmtDbtr = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) in.readObject();
        this.cdtr = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) in.readObject();
        this.cdtrAcct = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount16) in.readObject();
        this.ultmtCdtr = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) in.readObject();
        this.tradgPty = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) in.readObject();
        this.prtry = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryParty2[]) in.readObject();
    }

}
