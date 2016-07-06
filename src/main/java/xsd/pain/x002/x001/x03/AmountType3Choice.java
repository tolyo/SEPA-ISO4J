/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * AmountType3Choice. <p/>
 * 
 * This object is composed of the following <i>element</i>:
 * <ul>
 * <li><b>AmountType3Choice-SG1</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmountType3Choice.AmountType3ChoiceSG1}
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
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmountType3ChoiceCls
 */
public class AmountType3Choice extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"AmountType3Choice-SG1"};

    /**
     * Field amountType3ChoiceSG1.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmountType3Choice.AmountType3ChoiceSG1 amountType3ChoiceSG1;

    public AmountType3Choice() {
        this(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmountType3ChoiceCls.getInstance().getNullDefiningElementDecl());
    }

    public AmountType3Choice(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public AmountType3Choice(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public AmountType3Choice(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmountType3Choice clone) {
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
                setAmountType3ChoiceSG1((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmountType3Choice.AmountType3ChoiceSG1) value);
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
        return new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmountType3Choice(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmountType3Choice(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmountType3Choice obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmountType3Choice) clone;
        obj.amountType3ChoiceSG1 = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmountType3Choice.AmountType3ChoiceSG1) biz.c24.io.api.Utils.cloneDeep(this.amountType3ChoiceSG1, obj, "AmountType3Choice-SG1");
    }

    /**
     * Creates, adds and returns a new AmountType3Choice-SG1 (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmountType3Choice.AmountType3ChoiceSG1 createAmountType3ChoiceSG1() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmountType3Choice.AmountType3ChoiceSG1 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmountType3Choice.AmountType3ChoiceSG1) getElementDecl("AmountType3Choice-SG1").createObject();
        setAmountType3ChoiceSG1(obj);
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
     * Gets the value of AmountType3Choice-SG1 (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmountType3Choice.AmountType3ChoiceSG1 getAmountType3ChoiceSG1() {
        return this.amountType3ChoiceSG1;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are:
     * <b>amountType3ChoiceSG1</b>.
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
                return getAmountType3ChoiceSG1();
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
                return this.amountType3ChoiceSG1 == null ? 0 : 1;
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
                return this.amountType3ChoiceSG1 != null && this.amountType3ChoiceSG1.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are:
     * <b>amountType3ChoiceSG1</b>.
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
                return this.amountType3ChoiceSG1;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.amountType3ChoiceSG1 == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(amountType3ChoiceSG1);
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
                setAmountType3ChoiceSG1(null);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of AmountType3Choice-SG1
     * (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAmountType3ChoiceSG1(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmountType3Choice.AmountType3ChoiceSG1 value) {
        this.amountType3ChoiceSG1 = value;
        if (this.amountType3ChoiceSG1 != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.amountType3ChoiceSG1).setParent(this, "AmountType3Choice-SG1");
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
                setAmountType3ChoiceSG1((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmountType3Choice.AmountType3ChoiceSG1) value);
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
        out.writeObject(this.amountType3ChoiceSG1);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.amountType3ChoiceSG1 = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmountType3Choice.AmountType3ChoiceSG1) in.readObject();
    }

    /**
     * AmountType3Choice-SG1. <p/>
     * 
     * This object is composed of the following <i>elements</i>:
     * <ul>
     * <li><b>InstdAmt</b> of type {@link
     * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ActiveOrHistoricCurrencyAndAmount}
     * (1)</li>
     * <li><b>EqvtAmt</b> of type {@link
     * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.EquivalentAmount2}
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
     * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmountType3ChoiceCls.AmountType3ChoiceSG1Cls
     */
    public static class AmountType3ChoiceSG1 extends biz.c24.io.api.data.ComplexDataObject {

        /**
         * Field serialVersionUID.
         */
        private static final long serialVersionUID = 1L;

        /**
         * Field NATIVE_ELEMENTS.
         */
        private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"EqvtAmt", "InstdAmt"};

        /**
         * Field instdAmt.
         */
        private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ActiveOrHistoricCurrencyAndAmount instdAmt;

        /**
         * Field eqvtAmt.
         */
        private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.EquivalentAmount2 eqvtAmt;

        public AmountType3ChoiceSG1() {
            this(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmountType3ChoiceCls.AmountType3ChoiceSG1Cls.getInstance().getNullDefiningElementDecl());
        }

        public AmountType3ChoiceSG1(biz.c24.io.api.data.Element definingElementDecl) {
            super(definingElementDecl);
        }

        public AmountType3ChoiceSG1(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
            super(definingElementDecl, type);
        }

        public AmountType3ChoiceSG1(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmountType3Choice.AmountType3ChoiceSG1 clone) {
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
                    setInstdAmt((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ActiveOrHistoricCurrencyAndAmount) value);
                    return;
                case 0:
                    setEqvtAmt((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.EquivalentAmount2) value);
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
            return new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmountType3Choice.AmountType3ChoiceSG1(this);
        }

        /**
         * Creates and returns a deep clone of this object.
         * 
         * @return The new object.
         * @see #clone()
         */
        public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
            biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmountType3Choice.AmountType3ChoiceSG1(this);
            cloneDeep(obj);
            return obj;
        }

        /**
         * 
         * 
         * @param clone
         */
        protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
            iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmountType3Choice.AmountType3ChoiceSG1 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmountType3Choice.AmountType3ChoiceSG1) clone;
            obj.instdAmt = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ActiveOrHistoricCurrencyAndAmount) biz.c24.io.api.Utils.cloneDeep(this.instdAmt, obj, "InstdAmt");
            obj.eqvtAmt = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.EquivalentAmount2) biz.c24.io.api.Utils.cloneDeep(this.eqvtAmt, obj, "EqvtAmt");
        }

        /**
         * Creates, adds and returns a new EqvtAmt (1).
         * 
         * @return The new value.
         */
        public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.EquivalentAmount2 createEqvtAmt() {
            iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.EquivalentAmount2 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.EquivalentAmount2) getElementDecl("EqvtAmt").createObject();
            setEqvtAmt(obj);
            return obj;
        }

        /**
         * Creates, adds and returns a new InstdAmt (1).
         * 
         * @return The new value.
         */
        public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ActiveOrHistoricCurrencyAndAmount createInstdAmt() {
            iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ActiveOrHistoricCurrencyAndAmount obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ActiveOrHistoricCurrencyAndAmount) getElementDecl("InstdAmt").createObject();
            setInstdAmt(obj);
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
         * <b>instdAmt, eqvtAmt</b>.
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
                    return getInstdAmt();
                case 0:
                    return getEqvtAmt();
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
                    return this.instdAmt == null ? 0 : 1;
                case 0:
                    return this.eqvtAmt == null ? 0 : 1;
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
                    return this.instdAmt != null && this.instdAmt.equals(element) ? 0 : -1;
                case 0:
                    return this.eqvtAmt != null && this.eqvtAmt.equals(element) ? 0 : -1;
                default:
                    return super.getElementIndex(name, element);
            }
        }

        /**
         * Gets the value of EqvtAmt (1).
         * 
         * @return The value.
         */
        public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.EquivalentAmount2 getEqvtAmt() {
            return this.eqvtAmt;
        }

        /**
         * Gets the value of InstdAmt (1).
         * 
         * @return The value.
         */
        public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ActiveOrHistoricCurrencyAndAmount getInstdAmt() {
            return this.instdAmt;
        }

        /**
         * Returns the raw element data called <code>name</code> at
         * <code>index</code>.<p>
         * The legal value(s) for <code>name</code> are:
         * <b>instdAmt, eqvtAmt</b>.
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
                    return this.instdAmt;
                case 0:
                    return this.eqvtAmt;
                default:
                    return super.getElement(name, index);
            }
        }

        /**
         */
        public int getTotalElementCount() {
            int count = 0;
            count += this.instdAmt == null ? 0 : 1;
            count += this.eqvtAmt == null ? 0 : 1;
            return count;
        }

        public int hashCode() {
            int result = 17;
            result = 31 * result + hashCodeOf(serialVersionUID);
            result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
            result = 31 * result + hashCodeOf(instdAmt);
            result = 31 * result + hashCodeOf(eqvtAmt);
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
                    setInstdAmt(null);
                    return;
                case 0:
                    setEqvtAmt(null);
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
                    setInstdAmt((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ActiveOrHistoricCurrencyAndAmount) value);
                    return;
                case 0:
                    setEqvtAmt((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.EquivalentAmount2) value);
                    return;
                default:
                    super.setElement(name, index, value);
            }
        }

        /**
         * [Virtual Element] Sets the value of EqvtAmt (1).
         * 
         * @param value
         * @param value The new value.
         */
        public void setEqvtAmt(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.EquivalentAmount2 value) {
            this.eqvtAmt = value;
            if (this.eqvtAmt != null)
                ((biz.c24.io.api.data.ComplexDataObject) this.eqvtAmt).setParent(this, "EqvtAmt");
        }

        /**
         * [Virtual Element] Sets the value of InstdAmt (1).
         * 
         * @param value
         * @param value The new value.
         */
        public void setInstdAmt(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ActiveOrHistoricCurrencyAndAmount value) {
            this.instdAmt = value;
            if (this.instdAmt != null)
                ((biz.c24.io.api.data.ComplexDataObject) this.instdAmt).setParent(this, "InstdAmt");
        }

        /**
         * 
         * 
         * @param out
         */
        private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
            out.writeObject(this.instdAmt);
            out.writeObject(this.eqvtAmt);
        }

        /**
         * 
         * 
         * @param in
         */
        private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
            this.instdAmt = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ActiveOrHistoricCurrencyAndAmount) in.readObject();
            this.eqvtAmt = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.EquivalentAmount2) in.readObject();
        }

    }

}
