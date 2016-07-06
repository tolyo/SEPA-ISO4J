/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * BankToCustomerStatementV02. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>GrpHdr</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.GroupHeader42}
 * (1)</li>
 * <li><b>Stmt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountStatement2}
 * (1..*)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankToCustomerStatementV02Cls
 */
public class BankToCustomerStatementV02 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"GrpHdr", "Stmt"};

    /**
     * Field grpHdr.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.GroupHeader42 grpHdr;

    /**
     * Field stmt.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountStatement2[] stmt;

    public BankToCustomerStatementV02() {
        this(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankToCustomerStatementV02Cls.getInstance().getNullDefiningElementDecl());
    }

    public BankToCustomerStatementV02(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public BankToCustomerStatementV02(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public BankToCustomerStatementV02(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankToCustomerStatementV02 clone) {
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
                setGrpHdr((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.GroupHeader42) value);
                return;
            case 1:
                addStmt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountStatement2) value);
                return;
            default:
                super.addElement(name, value);
        }
    }

    /**
     * Adds a Stmt (1..*).
     * 
     * @param value
     * @param value The new Stmt.
     */
    public void addStmt(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountStatement2 value) {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountStatement2[] temp = this.stmt;
        this.stmt = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountStatement2[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.stmt, 0, temp.length);
        this.stmt[this.stmt.length-1] = value;
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "Stmt");
    }

    /**
     * Creates and returns a shallow clone of this object.
     * 
     * @see #cloneDeep()
     */
    public java.lang.Object clone() {
        return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankToCustomerStatementV02(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankToCustomerStatementV02(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankToCustomerStatementV02 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankToCustomerStatementV02) clone;
        obj.grpHdr = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.GroupHeader42) biz.c24.io.api.Utils.cloneDeep(this.grpHdr, obj, "GrpHdr");
        obj.stmt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountStatement2[]) biz.c24.io.api.Utils.cloneDeep(this.stmt, obj, "Stmt");
    }

    /**
     * Creates, adds and returns a new GrpHdr (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.GroupHeader42 createGrpHdr() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.GroupHeader42 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.GroupHeader42) getElementDecl("GrpHdr").createObject();
        setGrpHdr(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Stmt (1..*).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountStatement2 createStmt() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountStatement2 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountStatement2) getElementDecl("Stmt").createObject();
        addStmt(obj);
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
     * The legal value(s) for <code>name</code> are: <b>grpHdr,
     * stmt</b>.
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
                return getGrpHdr();
            case 1:
            if (this.stmt == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.stmt[index];
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
                return this.grpHdr == null ? 0 : 1;
            case 1:
                return this.stmt == null ? 0 : this.stmt.length;
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
                return this.grpHdr != null && this.grpHdr.equals(element) ? 0 : -1;
            case 1:
                return getStmtIndex((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountStatement2) element);
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of GrpHdr (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.GroupHeader42 getGrpHdr() {
        return this.grpHdr;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>grpHdr,
     * stmt</b>.
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
                return this.grpHdr;
            case 1:
            if (this.stmt == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.stmt[index];
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of Stmt (1..*).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountStatement2[] getStmt() {
        if (this.stmt == null)
            return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountStatement2[]{};
        else
            return this.stmt;
    }

    /**
     * Gets the value of Stmt by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountStatement2 getStmt(int ordinal) {
        if (this.stmt == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.stmt.length) {
            return this.stmt[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (1..*).
     * 
     * @param value
     * @param value The Stmt to get the index of.
     * @return The index.
     */
    public int getStmtIndex(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountStatement2 value) {
        if (this.stmt == null)
            return -1;
        for (int i=0; i<this.stmt.length; i++)
            if (this.stmt[i] == value)
                return i;
        return -1;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.grpHdr == null ? 0 : 1;
        count += this.stmt == null ? 0 : this.stmt.length;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(grpHdr);
        result = 31 * result + hashCodeOf(stmt);
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
                setGrpHdr(null);
                return;
            case 1:
                removeStmt(index);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * Removes a Stmt (1..*).
     * 
     * @param index
     * @param index The index of the Stmt to get.
     */
    public void removeStmt(int index) {
        if (this.stmt == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountStatement2[] temp = this.stmt;
        this.stmt = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountStatement2[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.stmt, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.stmt, index, temp.length-index-1);
        if (this.stmt.length == 0)
            this.stmt = null;
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
                setGrpHdr((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.GroupHeader42) value);
                return;
            case 1:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountStatement2[]) {
                    setStmt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountStatement2[])value);
                } else if (this.stmt == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.stmt[index] = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountStatement2) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.stmt[index]).setParent(this, "Stmt");
                }
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of GrpHdr (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setGrpHdr(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.GroupHeader42 value) {
        this.grpHdr = value;
        if (this.grpHdr != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.grpHdr).setParent(this, "GrpHdr");
    }

    /**
     * [Virtual Element] Sets the value of Stmt (1..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setStmt(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountStatement2[] value) {
        this.stmt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountStatement2[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.stmt != null && i<this.stmt.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.stmt[i]).setParent(this, "Stmt");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.grpHdr);
        out.writeObject(this.stmt);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.grpHdr = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.GroupHeader42) in.readObject();
        this.stmt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountStatement2[]) in.readObject();
    }

}
