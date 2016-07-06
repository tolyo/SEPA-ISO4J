/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * ReferredDocumentInformation3. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>Tp</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ReferredDocumentType2}
 * (0..1)</li>
 * <li><b>Nb</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>RltdDt</b> of type {@link
 * biz.c24.io.api.data.ISO8601Date} (0..1)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ReferredDocumentInformation3Cls
 */
public class ReferredDocumentInformation3 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"Nb", "RltdDt", "Tp"};

    /**
     * Field tp.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ReferredDocumentType2 tp;

    /**
     * Field nb.
     */
    private java.lang.String nb;

    /**
     * Field rltdDt.
     */
    private biz.c24.io.api.data.ISO8601Date rltdDt;

    public ReferredDocumentInformation3() {
        this(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ReferredDocumentInformation3Cls.getInstance().getNullDefiningElementDecl());
    }

    public ReferredDocumentInformation3(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public ReferredDocumentInformation3(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public ReferredDocumentInformation3(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ReferredDocumentInformation3 clone) {
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
            case 2:
                setTp((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ReferredDocumentType2) value);
                return;
            case 0:
                setNb((java.lang.String) value);
                return;
            case 1:
                setRltdDt((biz.c24.io.api.data.ISO8601Date) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ReferredDocumentInformation3(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ReferredDocumentInformation3(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ReferredDocumentInformation3 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ReferredDocumentInformation3) clone;
        obj.tp = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ReferredDocumentType2) biz.c24.io.api.Utils.cloneDeep(this.tp, obj, "Tp");
        obj.nb = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.nb, obj, "Nb");
        obj.rltdDt = (biz.c24.io.api.data.ISO8601Date) biz.c24.io.api.Utils.cloneDeep(this.rltdDt, obj, "RltdDt");
    }

    /**
     * Creates, adds and returns a new Tp (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ReferredDocumentType2 createTp() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ReferredDocumentType2 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ReferredDocumentType2) getElementDecl("Tp").createObject();
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
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>tp, nb,
     * rltdDt</b>.
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
            case 2:
                return getTp();
            case 0:
                return getNb();
            case 1:
                return getRltdDt();
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
            case 2:
                return this.tp == null ? 0 : 1;
            case 0:
                return this.nb == null ? 0 : 1;
            case 1:
                return this.rltdDt == null ? 0 : 1;
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
            case 2:
                return this.tp != null && this.tp.equals(element) ? 0 : -1;
            case 0:
                return this.nb != null && this.nb.equals(element) ? 0 : -1;
            case 1:
                return this.rltdDt != null && this.rltdDt.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of Nb (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getNb() {
        return this.nb;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>tp, nb,
     * rltdDt</b>.
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
            case 2:
                return this.tp;
            case 0:
                return this.nb;
            case 1:
                return this.rltdDt;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of RltdDt (0..1).
     * 
     * @return The value.
     */
    public biz.c24.io.api.data.ISO8601Date getRltdDt() {
        return this.rltdDt;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.tp == null ? 0 : 1;
        count += this.nb == null ? 0 : 1;
        count += this.rltdDt == null ? 0 : 1;
        return count;
    }

    /**
     * Gets the value of Tp (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ReferredDocumentType2 getTp() {
        return this.tp;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(tp);
        result = 31 * result + hashCodeOf(nb);
        result = 31 * result + hashCodeOf(rltdDt);
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
            case 2:
                setTp(null);
                return;
            case 0:
                setNb(null);
                return;
            case 1:
                setRltdDt(null);
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
            case 2:
                setTp((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ReferredDocumentType2) value);
                return;
            case 0:
                setNb((java.lang.String) value);
                return;
            case 1:
                setRltdDt((biz.c24.io.api.data.ISO8601Date) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of Nb (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setNb(java.lang.String value) {
        this.nb = value;
    }

    /**
     * [Virtual Element] Sets the value of RltdDt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setRltdDt(biz.c24.io.api.data.ISO8601Date value) {
        this.rltdDt = value;
    }

    /**
     * [Virtual Element] Sets the value of Tp (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTp(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ReferredDocumentType2 value) {
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
        out.writeObject(this.tp);
        out.writeObject(this.nb);
        out.writeObject(this.rltdDt);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.tp = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ReferredDocumentType2) in.readObject();
        this.nb = (java.lang.String) in.readObject();
        this.rltdDt = (biz.c24.io.api.data.ISO8601Date) in.readObject();
    }

}
