/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * DateAndDateTimeChoice. <p/>
 * 
 * This object is composed of the following <i>element</i>:
 * <ul>
 * <li><b>DateAndDateTimeChoice-SG1</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.DateAndDateTimeChoice.DateAndDateTimeChoiceSG1}
 * (1)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.DateAndDateTimeChoiceCls
 */
public class DateAndDateTimeChoice extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"DateAndDateTimeChoice-SG1"};

    /**
     * Field dateAndDateTimeChoiceSG1.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.DateAndDateTimeChoice.DateAndDateTimeChoiceSG1 dateAndDateTimeChoiceSG1;

    public DateAndDateTimeChoice() {
        this(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.DateAndDateTimeChoiceCls.getInstance().getNullDefiningElementDecl());
    }

    public DateAndDateTimeChoice(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public DateAndDateTimeChoice(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public DateAndDateTimeChoice(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.DateAndDateTimeChoice clone) {
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
                setDateAndDateTimeChoiceSG1((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.DateAndDateTimeChoice.DateAndDateTimeChoiceSG1) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.DateAndDateTimeChoice(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.DateAndDateTimeChoice(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.DateAndDateTimeChoice obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.DateAndDateTimeChoice) clone;
        obj.dateAndDateTimeChoiceSG1 = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.DateAndDateTimeChoice.DateAndDateTimeChoiceSG1) biz.c24.io.api.Utils.cloneDeep(this.dateAndDateTimeChoiceSG1, obj, "DateAndDateTimeChoice-SG1");
    }

    /**
     * Creates, adds and returns a new DateAndDateTimeChoice-SG1
     * (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.DateAndDateTimeChoice.DateAndDateTimeChoiceSG1 createDateAndDateTimeChoiceSG1() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.DateAndDateTimeChoice.DateAndDateTimeChoiceSG1 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.DateAndDateTimeChoice.DateAndDateTimeChoiceSG1) getElementDecl("DateAndDateTimeChoice-SG1").createObject();
        setDateAndDateTimeChoiceSG1(obj);
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
     * Gets the value of DateAndDateTimeChoice-SG1 (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.DateAndDateTimeChoice.DateAndDateTimeChoiceSG1 getDateAndDateTimeChoiceSG1() {
        return this.dateAndDateTimeChoiceSG1;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are:
     * <b>dateAndDateTimeChoiceSG1</b>.
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
                return getDateAndDateTimeChoiceSG1();
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
                return this.dateAndDateTimeChoiceSG1 == null ? 0 : 1;
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
                return this.dateAndDateTimeChoiceSG1 != null && this.dateAndDateTimeChoiceSG1.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are:
     * <b>dateAndDateTimeChoiceSG1</b>.
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
                return this.dateAndDateTimeChoiceSG1;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.dateAndDateTimeChoiceSG1 == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(dateAndDateTimeChoiceSG1);
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
                setDateAndDateTimeChoiceSG1(null);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of
     * DateAndDateTimeChoice-SG1 (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setDateAndDateTimeChoiceSG1(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.DateAndDateTimeChoice.DateAndDateTimeChoiceSG1 value) {
        this.dateAndDateTimeChoiceSG1 = value;
        if (this.dateAndDateTimeChoiceSG1 != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.dateAndDateTimeChoiceSG1).setParent(this, "DateAndDateTimeChoice-SG1");
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
                setDateAndDateTimeChoiceSG1((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.DateAndDateTimeChoice.DateAndDateTimeChoiceSG1) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.dateAndDateTimeChoiceSG1);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.dateAndDateTimeChoiceSG1 = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.DateAndDateTimeChoice.DateAndDateTimeChoiceSG1) in.readObject();
    }

    /**
     * DateAndDateTimeChoice-SG1. <p/>
     * 
     * This object is composed of the following <i>elements</i>:
     * <ul>
     * <li><b>Dt</b> of type {@link
     * biz.c24.io.api.data.ISO8601Date} (1)</li>
     * <li><b>DtTm</b> of type {@link
     * biz.c24.io.api.data.ISO8601DateTime} (1)</li>
     * </ul>
     * 
     * <br><strong>Produced by C24 Integration Objects
     * (http://www.c24.biz)</br>
     * 
     * 
     * @author C24 Integration Objects;
     * @version $Revision$ $Date$
     * @see
     * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.DateAndDateTimeChoiceCls.DateAndDateTimeChoiceSG1Cls
     */
    public static class DateAndDateTimeChoiceSG1 extends biz.c24.io.api.data.ComplexDataObject {

        /**
         * Field serialVersionUID.
         */
        private static final long serialVersionUID = 1L;

        /**
         * Field NATIVE_ELEMENTS.
         */
        private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"Dt", "DtTm"};

        /**
         * Field dt.
         */
        private biz.c24.io.api.data.ISO8601Date dt;

        /**
         * Field dtTm.
         */
        private biz.c24.io.api.data.ISO8601DateTime dtTm;

        public DateAndDateTimeChoiceSG1() {
            this(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.DateAndDateTimeChoiceCls.DateAndDateTimeChoiceSG1Cls.getInstance().getNullDefiningElementDecl());
        }

        public DateAndDateTimeChoiceSG1(biz.c24.io.api.data.Element definingElementDecl) {
            super(definingElementDecl);
        }

        public DateAndDateTimeChoiceSG1(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
            super(definingElementDecl, type);
        }

        public DateAndDateTimeChoiceSG1(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.DateAndDateTimeChoice.DateAndDateTimeChoiceSG1 clone) {
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
                    setDt((biz.c24.io.api.data.ISO8601Date) value);
                    return;
                case 1:
                    setDtTm((biz.c24.io.api.data.ISO8601DateTime) value);
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
            return new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.DateAndDateTimeChoice.DateAndDateTimeChoiceSG1(this);
        }

        /**
         * Creates and returns a deep clone of this object.
         * 
         * @return The new object.
         * @see #clone()
         */
        public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
            biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.DateAndDateTimeChoice.DateAndDateTimeChoiceSG1(this);
            cloneDeep(obj);
            return obj;
        }

        /**
         * 
         * 
         * @param clone
         */
        protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
            iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.DateAndDateTimeChoice.DateAndDateTimeChoiceSG1 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.DateAndDateTimeChoice.DateAndDateTimeChoiceSG1) clone;
            obj.dt = (biz.c24.io.api.data.ISO8601Date) biz.c24.io.api.Utils.cloneDeep(this.dt, obj, "Dt");
            obj.dtTm = (biz.c24.io.api.data.ISO8601DateTime) biz.c24.io.api.Utils.cloneDeep(this.dtTm, obj, "DtTm");
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
         * Gets the value of Dt (1).
         * 
         * @return The value.
         */
        public biz.c24.io.api.data.ISO8601Date getDt() {
            return this.dt;
        }

        /**
         * Gets the value of DtTm (1).
         * 
         * @return The value.
         */
        public biz.c24.io.api.data.ISO8601DateTime getDtTm() {
            return this.dtTm;
        }

        /**
         * Returns the element called <code>name</code> at
         * <code>index</code>.<p>
         * The legal value(s) for <code>name</code> are: <b>dt,
         * dtTm</b>.
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
                    return getDt();
                case 1:
                    return getDtTm();
                default:
                    return super.getElement(name, index);
            }
        }

        /**
         * Returns the count of elements called
         * <code>name</code>.<p>
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
                    return this.dt == null ? 0 : 1;
                case 1:
                    return this.dtTm == null ? 0 : 1;
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
                    return this.dt != null && this.dt.equals(element) ? 0 : -1;
                case 1:
                    return this.dtTm != null && this.dtTm.equals(element) ? 0 : -1;
                default:
                    return super.getElementIndex(name, element);
            }
        }

        /**
         * Returns the raw element data called <code>name</code> at
         * <code>index</code>.<p>
         * The legal value(s) for <code>name</code> are: <b>dt,
         * dtTm</b>.
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
                    return this.dt;
                case 1:
                    return this.dtTm;
                default:
                    return super.getElement(name, index);
            }
        }

        /**
         */
        public int getTotalElementCount() {
            int count = 0;
            count += this.dt == null ? 0 : 1;
            count += this.dtTm == null ? 0 : 1;
            return count;
        }

        public int hashCode() {
            int result = 17;
            result = 31 * result + hashCodeOf(serialVersionUID);
            result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
            result = 31 * result + hashCodeOf(dt);
            result = 31 * result + hashCodeOf(dtTm);
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
                    setDt(null);
                    return;
                case 1:
                    setDtTm(null);
                    return;
                default:
                super.removeElement(name, index);
            }
        }

        /**
         * [Virtual Element] Sets the value of Dt (1).
         * 
         * @param value
         * @param value The new value.
         */
        public void setDt(biz.c24.io.api.data.ISO8601Date value) {
            this.dt = value;
        }

        /**
         * [Virtual Element] Sets the value of DtTm (1).
         * 
         * @param value
         * @param value The new value.
         */
        public void setDtTm(biz.c24.io.api.data.ISO8601DateTime value) {
            this.dtTm = value;
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
                    setDt((biz.c24.io.api.data.ISO8601Date) value);
                    return;
                case 1:
                    setDtTm((biz.c24.io.api.data.ISO8601DateTime) value);
                    return;
                default:
                    super.setElement(name, index, value);
            }
        }

        /**
         * 
         * 
         * @param out
         */
        private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
            out.writeObject(this.dt);
            out.writeObject(this.dtTm);
        }

        /**
         * 
         * 
         * @param in
         */
        private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
            this.dt = (biz.c24.io.api.data.ISO8601Date) in.readObject();
            this.dtTm = (biz.c24.io.api.data.ISO8601DateTime) in.readObject();
        }

    }

}
