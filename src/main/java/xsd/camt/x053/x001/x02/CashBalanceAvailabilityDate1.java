/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * CashBalanceAvailabilityDate1. <p/>
 * 
 * This object is composed of the following <i>element</i>:
 * <ul>
 * <li><b>CashBalanceAvailabilityDate1-SG1</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailabilityDate1.CashBalanceAvailabilityDate1SG1}
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
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailabilityDate1Cls
 */
public class CashBalanceAvailabilityDate1 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"CashBalanceAvailabilityDate1-SG1"};

    /**
     * Field cashBalanceAvailabilityDate1SG1.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailabilityDate1.CashBalanceAvailabilityDate1SG1 cashBalanceAvailabilityDate1SG1;

    public CashBalanceAvailabilityDate1() {
        this(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailabilityDate1Cls.getInstance().getNullDefiningElementDecl());
    }

    public CashBalanceAvailabilityDate1(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public CashBalanceAvailabilityDate1(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public CashBalanceAvailabilityDate1(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailabilityDate1 clone) {
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
                setCashBalanceAvailabilityDate1SG1((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailabilityDate1.CashBalanceAvailabilityDate1SG1) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailabilityDate1(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailabilityDate1(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailabilityDate1 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailabilityDate1) clone;
        obj.cashBalanceAvailabilityDate1SG1 = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailabilityDate1.CashBalanceAvailabilityDate1SG1) biz.c24.io.api.Utils.cloneDeep(this.cashBalanceAvailabilityDate1SG1, obj, "CashBalanceAvailabilityDate1-SG1");
    }

    /**
     * Creates, adds and returns a new
     * CashBalanceAvailabilityDate1-SG1 (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailabilityDate1.CashBalanceAvailabilityDate1SG1 createCashBalanceAvailabilityDate1SG1() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailabilityDate1.CashBalanceAvailabilityDate1SG1 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailabilityDate1.CashBalanceAvailabilityDate1SG1) getElementDecl("CashBalanceAvailabilityDate1-SG1").createObject();
        setCashBalanceAvailabilityDate1SG1(obj);
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
     * Gets the value of CashBalanceAvailabilityDate1-SG1 (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailabilityDate1.CashBalanceAvailabilityDate1SG1 getCashBalanceAvailabilityDate1SG1() {
        return this.cashBalanceAvailabilityDate1SG1;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are:
     * <b>cashBalanceAvailabilityDate1SG1</b>.
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
                return getCashBalanceAvailabilityDate1SG1();
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
                return this.cashBalanceAvailabilityDate1SG1 == null ? 0 : 1;
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
                return this.cashBalanceAvailabilityDate1SG1 != null && this.cashBalanceAvailabilityDate1SG1.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are:
     * <b>cashBalanceAvailabilityDate1SG1</b>.
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
                return this.cashBalanceAvailabilityDate1SG1;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.cashBalanceAvailabilityDate1SG1 == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(cashBalanceAvailabilityDate1SG1);
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
                setCashBalanceAvailabilityDate1SG1(null);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of
     * CashBalanceAvailabilityDate1-SG1 (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCashBalanceAvailabilityDate1SG1(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailabilityDate1.CashBalanceAvailabilityDate1SG1 value) {
        this.cashBalanceAvailabilityDate1SG1 = value;
        if (this.cashBalanceAvailabilityDate1SG1 != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.cashBalanceAvailabilityDate1SG1).setParent(this, "CashBalanceAvailabilityDate1-SG1");
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
                setCashBalanceAvailabilityDate1SG1((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailabilityDate1.CashBalanceAvailabilityDate1SG1) value);
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
        out.writeObject(this.cashBalanceAvailabilityDate1SG1);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.cashBalanceAvailabilityDate1SG1 = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailabilityDate1.CashBalanceAvailabilityDate1SG1) in.readObject();
    }

    /**
     * CashBalanceAvailabilityDate1-SG1. <p/>
     * 
     * This object is composed of the following <i>elements</i>:
     * <ul>
     * <li><b>NbOfDays</b> of type {@link java.lang.String}
     * (1)</li>
     * <li><b>ActlDt</b> of type {@link
     * biz.c24.io.api.data.ISO8601Date} (1)</li>
     * </ul>
     * 
     * <br><strong>Produced by C24 Integration Objects
     * (http://www.c24.biz)</br>
     * 
     * 
     * @author C24 Integration Objects;
     * @version $Revision$ $Date$
     * @see
     * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailabilityDate1Cls.CashBalanceAvailabilityDate1SG1Cls
     */
    public static class CashBalanceAvailabilityDate1SG1 extends biz.c24.io.api.data.ComplexDataObject {

        /**
         * Field serialVersionUID.
         */
        private static final long serialVersionUID = 1L;

        /**
         * Field NATIVE_ELEMENTS.
         */
        private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"ActlDt", "NbOfDays"};

        /**
         * Field nbOfDays.
         */
        private java.lang.String nbOfDays;

        /**
         * Field actlDt.
         */
        private biz.c24.io.api.data.ISO8601Date actlDt;

        public CashBalanceAvailabilityDate1SG1() {
            this(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailabilityDate1Cls.CashBalanceAvailabilityDate1SG1Cls.getInstance().getNullDefiningElementDecl());
        }

        public CashBalanceAvailabilityDate1SG1(biz.c24.io.api.data.Element definingElementDecl) {
            super(definingElementDecl);
        }

        public CashBalanceAvailabilityDate1SG1(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
            super(definingElementDecl, type);
        }

        public CashBalanceAvailabilityDate1SG1(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailabilityDate1.CashBalanceAvailabilityDate1SG1 clone) {
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
                    setNbOfDays((java.lang.String) value);
                    return;
                case 0:
                    setActlDt((biz.c24.io.api.data.ISO8601Date) value);
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
            return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailabilityDate1.CashBalanceAvailabilityDate1SG1(this);
        }

        /**
         * Creates and returns a deep clone of this object.
         * 
         * @return The new object.
         * @see #clone()
         */
        public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
            biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailabilityDate1.CashBalanceAvailabilityDate1SG1(this);
            cloneDeep(obj);
            return obj;
        }

        /**
         * 
         * 
         * @param clone
         */
        protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
            iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailabilityDate1.CashBalanceAvailabilityDate1SG1 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailabilityDate1.CashBalanceAvailabilityDate1SG1) clone;
            obj.nbOfDays = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.nbOfDays, obj, "NbOfDays");
            obj.actlDt = (biz.c24.io.api.data.ISO8601Date) biz.c24.io.api.Utils.cloneDeep(this.actlDt, obj, "ActlDt");
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
         * Gets the value of ActlDt (1).
         * 
         * @return The value.
         */
        public biz.c24.io.api.data.ISO8601Date getActlDt() {
            return this.actlDt;
        }

        /**
         * Returns the element called <code>name</code> at
         * <code>index</code>.<p>
         * The legal value(s) for <code>name</code> are:
         * <b>nbOfDays, actlDt</b>.
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
                    return getNbOfDays();
                case 0:
                    return getActlDt();
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
                case 1:
                    return this.nbOfDays == null ? 0 : 1;
                case 0:
                    return this.actlDt == null ? 0 : 1;
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
                    return this.nbOfDays != null && this.nbOfDays.equals(element) ? 0 : -1;
                case 0:
                    return this.actlDt != null && this.actlDt.equals(element) ? 0 : -1;
                default:
                    return super.getElementIndex(name, element);
            }
        }

        /**
         * Gets the value of NbOfDays (1).
         * 
         * @return The value.
         */
        public java.lang.String getNbOfDays() {
            return this.nbOfDays;
        }

        /**
         * Returns the raw element data called <code>name</code> at
         * <code>index</code>.<p>
         * The legal value(s) for <code>name</code> are:
         * <b>nbOfDays, actlDt</b>.
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
                    return this.nbOfDays;
                case 0:
                    return this.actlDt;
                default:
                    return super.getElement(name, index);
            }
        }

        /**
         */
        public int getTotalElementCount() {
            int count = 0;
            count += this.nbOfDays == null ? 0 : 1;
            count += this.actlDt == null ? 0 : 1;
            return count;
        }

        public int hashCode() {
            int result = 17;
            result = 31 * result + hashCodeOf(serialVersionUID);
            result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
            result = 31 * result + hashCodeOf(nbOfDays);
            result = 31 * result + hashCodeOf(actlDt);
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
                    setNbOfDays(null);
                    return;
                case 0:
                    setActlDt(null);
                    return;
                default:
                super.removeElement(name, index);
            }
        }

        /**
         * [Virtual Element] Sets the value of ActlDt (1).
         * 
         * @param value
         * @param value The new value.
         */
        public void setActlDt(biz.c24.io.api.data.ISO8601Date value) {
            this.actlDt = value;
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
                    setNbOfDays((java.lang.String) value);
                    return;
                case 0:
                    setActlDt((biz.c24.io.api.data.ISO8601Date) value);
                    return;
                default:
                    super.setElement(name, index, value);
            }
        }

        /**
         * [Virtual Element] Sets the value of NbOfDays (1).
         * 
         * @param value
         * @param value The new value.
         */
        public void setNbOfDays(java.lang.String value) {
            this.nbOfDays = value;
        }

        /**
         * 
         * 
         * @param out
         */
        private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
            out.writeObject(this.nbOfDays);
            out.writeObject(this.actlDt);
        }

        /**
         * 
         * 
         * @param in
         */
        private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
            this.nbOfDays = (java.lang.String) in.readObject();
            this.actlDt = (biz.c24.io.api.data.ISO8601Date) in.readObject();
        }

    }

}
