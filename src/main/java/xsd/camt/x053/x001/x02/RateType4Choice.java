/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * RateType4Choice. <p/>
 * 
 * This object is composed of the following <i>element</i>:
 * <ul>
 * <li><b>RateType4Choice-SG1</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RateType4Choice.RateType4ChoiceSG1}
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
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RateType4ChoiceCls
 */
public class RateType4Choice extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"RateType4Choice-SG1"};

    /**
     * Field rateType4ChoiceSG1.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RateType4Choice.RateType4ChoiceSG1 rateType4ChoiceSG1;

    public RateType4Choice() {
        this(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RateType4ChoiceCls.getInstance().getNullDefiningElementDecl());
    }

    public RateType4Choice(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public RateType4Choice(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public RateType4Choice(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RateType4Choice clone) {
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
                setRateType4ChoiceSG1((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RateType4Choice.RateType4ChoiceSG1) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RateType4Choice(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RateType4Choice(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RateType4Choice obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RateType4Choice) clone;
        obj.rateType4ChoiceSG1 = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RateType4Choice.RateType4ChoiceSG1) biz.c24.io.api.Utils.cloneDeep(this.rateType4ChoiceSG1, obj, "RateType4Choice-SG1");
    }

    /**
     * Creates, adds and returns a new RateType4Choice-SG1 (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RateType4Choice.RateType4ChoiceSG1 createRateType4ChoiceSG1() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RateType4Choice.RateType4ChoiceSG1 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RateType4Choice.RateType4ChoiceSG1) getElementDecl("RateType4Choice-SG1").createObject();
        setRateType4ChoiceSG1(obj);
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
     * <b>rateType4ChoiceSG1</b>.
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
                return getRateType4ChoiceSG1();
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
                return this.rateType4ChoiceSG1 == null ? 0 : 1;
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
                return this.rateType4ChoiceSG1 != null && this.rateType4ChoiceSG1.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of RateType4Choice-SG1 (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RateType4Choice.RateType4ChoiceSG1 getRateType4ChoiceSG1() {
        return this.rateType4ChoiceSG1;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are:
     * <b>rateType4ChoiceSG1</b>.
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
                return this.rateType4ChoiceSG1;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.rateType4ChoiceSG1 == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(rateType4ChoiceSG1);
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
                setRateType4ChoiceSG1(null);
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
            case 0:
                setRateType4ChoiceSG1((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RateType4Choice.RateType4ChoiceSG1) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of RateType4Choice-SG1 (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setRateType4ChoiceSG1(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RateType4Choice.RateType4ChoiceSG1 value) {
        this.rateType4ChoiceSG1 = value;
        if (this.rateType4ChoiceSG1 != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.rateType4ChoiceSG1).setParent(this, "RateType4Choice-SG1");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.rateType4ChoiceSG1);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.rateType4ChoiceSG1 = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RateType4Choice.RateType4ChoiceSG1) in.readObject();
    }

    /**
     * RateType4Choice-SG1. <p/>
     * 
     * This object is composed of the following <i>elements</i>:
     * <ul>
     * <li><b>Pctg</b> of type {@link java.math.BigDecimal}
     * (1)</li>
     * <li><b>Othr</b> of type {@link java.lang.String} (1)</li>
     * </ul>
     * 
     * <br><strong>Produced by C24 Integration Objects
     * (http://www.c24.biz)</br>
     * 
     * 
     * @author C24 Integration Objects;
     * @version $Revision$ $Date$
     * @see
     * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RateType4ChoiceCls.RateType4ChoiceSG1Cls
     */
    public static class RateType4ChoiceSG1 extends biz.c24.io.api.data.ComplexDataObject {

        /**
         * Field serialVersionUID.
         */
        private static final long serialVersionUID = 1L;

        /**
         * Field NATIVE_ELEMENTS.
         */
        private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"Othr", "Pctg"};

        /**
         * Field pctg.
         */
        private java.math.BigDecimal pctg;

        /**
         * Field othr.
         */
        private java.lang.String othr;

        public RateType4ChoiceSG1() {
            this(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RateType4ChoiceCls.RateType4ChoiceSG1Cls.getInstance().getNullDefiningElementDecl());
        }

        public RateType4ChoiceSG1(biz.c24.io.api.data.Element definingElementDecl) {
            super(definingElementDecl);
        }

        public RateType4ChoiceSG1(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
            super(definingElementDecl, type);
        }

        public RateType4ChoiceSG1(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RateType4Choice.RateType4ChoiceSG1 clone) {
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
                    setPctg(biz.c24.io.api.Utils.decimalValue(value));
                    return;
                case 0:
                    setOthr((java.lang.String) value);
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
            return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RateType4Choice.RateType4ChoiceSG1(this);
        }

        /**
         * Creates and returns a deep clone of this object.
         * 
         * @return The new object.
         * @see #clone()
         */
        public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
            biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RateType4Choice.RateType4ChoiceSG1(this);
            cloneDeep(obj);
            return obj;
        }

        /**
         * 
         * 
         * @param clone
         */
        protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
            iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RateType4Choice.RateType4ChoiceSG1 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RateType4Choice.RateType4ChoiceSG1) clone;
            obj.pctg = (java.math.BigDecimal) biz.c24.io.api.Utils.cloneDeep(this.pctg, obj, "Pctg");
            obj.othr = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.othr, obj, "Othr");
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
         * The legal value(s) for <code>name</code> are: <b>pctg,
         * othr</b>.
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
                    return getPctg();
                case 0:
                    return getOthr();
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
                    return this.pctg == null ? 0 : 1;
                case 0:
                    return this.othr == null ? 0 : 1;
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
                    return this.pctg != null && this.pctg.equals(element) ? 0 : -1;
                case 0:
                    return this.othr != null && this.othr.equals(element) ? 0 : -1;
                default:
                    return super.getElementIndex(name, element);
            }
        }

        /**
         * Gets the value of Othr (1).
         * 
         * @return The value.
         */
        public java.lang.String getOthr() {
            return this.othr;
        }

        /**
         * Gets the value of Pctg (1).
         * 
         * @return The value.
         */
        public java.math.BigDecimal getPctg() {
            return this.pctg;
        }

        /**
         * Returns the raw element data called <code>name</code> at
         * <code>index</code>.<p>
         * The legal value(s) for <code>name</code> are: <b>pctg,
         * othr</b>.
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
                    return this.pctg;
                case 0:
                    return this.othr;
                default:
                    return super.getElement(name, index);
            }
        }

        /**
         */
        public int getTotalElementCount() {
            int count = 0;
            count += this.pctg == null ? 0 : 1;
            count += this.othr == null ? 0 : 1;
            return count;
        }

        public int hashCode() {
            int result = 17;
            result = 31 * result + hashCodeOf(serialVersionUID);
            result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
            result = 31 * result + hashCodeOf(pctg);
            result = 31 * result + hashCodeOf(othr);
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
                    setPctg(null);
                    return;
                case 0:
                    setOthr(null);
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
                    setPctg(biz.c24.io.api.Utils.decimalValue(value));
                    return;
                case 0:
                    setOthr((java.lang.String) value);
                    return;
                default:
                    super.setElement(name, index, value);
            }
        }

        /**
         * [Virtual Element] Sets the value of Othr (1).
         * 
         * @param value
         * @param value The new value.
         */
        public void setOthr(java.lang.String value) {
            this.othr = value;
        }

        /**
         * [Virtual Element] Sets the value of Pctg (1).
         * 
         * @param value
         * @param value The new value.
         */
        public void setPctg(java.math.BigDecimal value) {
            this.pctg = value;
        }

        /**
         * 
         * 
         * @param out
         */
        private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
            out.writeObject(this.pctg);
            out.writeObject(this.othr);
        }

        /**
         * 
         * 
         * @param in
         */
        private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
            this.pctg = (java.math.BigDecimal) in.readObject();
            this.othr = (java.lang.String) in.readObject();
        }

    }

}
