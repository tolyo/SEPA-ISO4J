/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * Pagination. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>PgNb</b> of type {@link java.lang.String} (1)</li>
 * <li><b>LastPgInd</b> of type <code>boolean</code> (1)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.PaginationCls
 */
public class Pagination extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"LastPgInd", "PgNb"};

    /**
     * Field pgNb.
     */
    private java.lang.String pgNb;

    /**
     * Field lastPgInd.
     */
    private boolean lastPgInd;

    /**
     * Field islastPgIndSet.
     */
    private boolean islastPgIndSet;

    public Pagination() {
        this(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.PaginationCls.getInstance().getNullDefiningElementDecl());
    }

    public Pagination(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public Pagination(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public Pagination(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Pagination clone) {
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
                setPgNb((java.lang.String) value);
                return;
            case 0:
                setLastPgInd(biz.c24.io.api.Utils.booleanValue(value));
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
        return new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Pagination(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Pagination(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Pagination obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Pagination) clone;
        obj.pgNb = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.pgNb, obj, "PgNb");
        obj.islastPgIndSet = this.islastPgIndSet;
        obj.lastPgInd = this.lastPgInd;
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
     * The legal value(s) for <code>name</code> are: <b>pgNb,
     * lastPgInd</b>.
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
                return getPgNb();
            case 0:
                return getLastPgInd();
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
                return this.pgNb == null ? 0 : 1;
            case 0:
                return this.islastPgIndSet ? 1 : 0;
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
                return this.pgNb != null && this.pgNb.equals(element) ? 0 : -1;
            case 0:
                return this.islastPgIndSet ? (this.lastPgInd == biz.c24.io.api.Utils.booleanValue(element) ? 0 : -1) : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of LastPgInd (1).
     * 
     * @return The value.
     */
    public boolean getLastPgInd() {
        return this.lastPgInd;
    }

    /**
     * Gets the value of PgNb (1).
     * 
     * @return The value.
     */
    public java.lang.String getPgNb() {
        return this.pgNb;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>pgNb,
     * lastPgInd</b>.
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
                return this.pgNb;
            case 0:
                return this.lastPgInd;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.pgNb == null ? 0 : 1;
        count += this.islastPgIndSet ? 1 : 0;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(pgNb);
        result = 31 * result + hashCodeOf(lastPgInd);
        result = 31 * result + hashCodeOf(islastPgIndSet);
        return result;
    }

    /**
     * Tests whether LastPgInd has been set.
     */
    public boolean isLastPgIndSet() {
        return islastPgIndSet;
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
                setPgNb(null);
                return;
            case 0:
                setLastPgInd(false);
                this.islastPgIndSet = false;
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
            case 1:
                setPgNb((java.lang.String) value);
                return;
            case 0:
                setLastPgInd(biz.c24.io.api.Utils.booleanValue(value));
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of LastPgInd (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setLastPgInd(boolean value) {
        this.lastPgInd = value;
        this.islastPgIndSet = true;
    }

    /**
     * [Virtual Element] Sets the value of PgNb (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setPgNb(java.lang.String value) {
        this.pgNb = value;
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.pgNb);
        out.writeBoolean(this.islastPgIndSet);
        if (this.islastPgIndSet)
            out.writeBoolean(this.lastPgInd);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.pgNb = (java.lang.String) in.readObject();
        this.islastPgIndSet = in.readBoolean();
        if (this.islastPgIndSet)
            this.lastPgInd = in.readBoolean();
    }

}
