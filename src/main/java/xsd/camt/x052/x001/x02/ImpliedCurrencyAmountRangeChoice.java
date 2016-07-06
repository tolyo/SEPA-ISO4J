/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * ImpliedCurrencyAmountRangeChoice. <p/>
 * 
 * This object is composed of the following <i>element</i>:
 * <ul>
 * <li><b>ImpliedCurrencyAmountRangeChoice-SG1</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ImpliedCurrencyAmountRangeChoice.ImpliedCurrencyAmountRangeChoiceSG1}
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
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ImpliedCurrencyAmountRangeChoiceCls
 */
public class ImpliedCurrencyAmountRangeChoice extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"ImpliedCurrencyAmountRangeChoice-SG1"};

    /**
     * Field impliedCurrencyAmountRangeChoiceSG1.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ImpliedCurrencyAmountRangeChoice.ImpliedCurrencyAmountRangeChoiceSG1 impliedCurrencyAmountRangeChoiceSG1;

    public ImpliedCurrencyAmountRangeChoice() {
        this(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ImpliedCurrencyAmountRangeChoiceCls.getInstance().getNullDefiningElementDecl());
    }

    public ImpliedCurrencyAmountRangeChoice(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public ImpliedCurrencyAmountRangeChoice(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public ImpliedCurrencyAmountRangeChoice(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ImpliedCurrencyAmountRangeChoice clone) {
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
                setImpliedCurrencyAmountRangeChoiceSG1((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ImpliedCurrencyAmountRangeChoice.ImpliedCurrencyAmountRangeChoiceSG1) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ImpliedCurrencyAmountRangeChoice(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ImpliedCurrencyAmountRangeChoice(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ImpliedCurrencyAmountRangeChoice obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ImpliedCurrencyAmountRangeChoice) clone;
        obj.impliedCurrencyAmountRangeChoiceSG1 = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ImpliedCurrencyAmountRangeChoice.ImpliedCurrencyAmountRangeChoiceSG1) biz.c24.io.api.Utils.cloneDeep(this.impliedCurrencyAmountRangeChoiceSG1, obj, "ImpliedCurrencyAmountRangeChoice-SG1");
    }

    /**
     * Creates, adds and returns a new
     * ImpliedCurrencyAmountRangeChoice-SG1 (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ImpliedCurrencyAmountRangeChoice.ImpliedCurrencyAmountRangeChoiceSG1 createImpliedCurrencyAmountRangeChoiceSG1() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ImpliedCurrencyAmountRangeChoice.ImpliedCurrencyAmountRangeChoiceSG1 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ImpliedCurrencyAmountRangeChoice.ImpliedCurrencyAmountRangeChoiceSG1) getElementDecl("ImpliedCurrencyAmountRangeChoice-SG1").createObject();
        setImpliedCurrencyAmountRangeChoiceSG1(obj);
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
     * <b>impliedCurrencyAmountRangeChoiceSG1</b>.
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
                return getImpliedCurrencyAmountRangeChoiceSG1();
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
                return this.impliedCurrencyAmountRangeChoiceSG1 == null ? 0 : 1;
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
                return this.impliedCurrencyAmountRangeChoiceSG1 != null && this.impliedCurrencyAmountRangeChoiceSG1.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of ImpliedCurrencyAmountRangeChoice-SG1 (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ImpliedCurrencyAmountRangeChoice.ImpliedCurrencyAmountRangeChoiceSG1 getImpliedCurrencyAmountRangeChoiceSG1() {
        return this.impliedCurrencyAmountRangeChoiceSG1;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are:
     * <b>impliedCurrencyAmountRangeChoiceSG1</b>.
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
                return this.impliedCurrencyAmountRangeChoiceSG1;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.impliedCurrencyAmountRangeChoiceSG1 == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(impliedCurrencyAmountRangeChoiceSG1);
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
                setImpliedCurrencyAmountRangeChoiceSG1(null);
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
                setImpliedCurrencyAmountRangeChoiceSG1((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ImpliedCurrencyAmountRangeChoice.ImpliedCurrencyAmountRangeChoiceSG1) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of
     * ImpliedCurrencyAmountRangeChoice-SG1 (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setImpliedCurrencyAmountRangeChoiceSG1(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ImpliedCurrencyAmountRangeChoice.ImpliedCurrencyAmountRangeChoiceSG1 value) {
        this.impliedCurrencyAmountRangeChoiceSG1 = value;
        if (this.impliedCurrencyAmountRangeChoiceSG1 != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.impliedCurrencyAmountRangeChoiceSG1).setParent(this, "ImpliedCurrencyAmountRangeChoice-SG1");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.impliedCurrencyAmountRangeChoiceSG1);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.impliedCurrencyAmountRangeChoiceSG1 = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ImpliedCurrencyAmountRangeChoice.ImpliedCurrencyAmountRangeChoiceSG1) in.readObject();
    }

    /**
     * ImpliedCurrencyAmountRangeChoice-SG1. <p/>
     * 
     * This object is composed of the following <i>elements</i>:
     * <ul>
     * <li><b>FrAmt</b> of type {@link
     * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1}
     * (1)</li>
     * <li><b>ToAmt</b> of type {@link
     * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1}
     * (1)</li>
     * <li><b>FrToAmt</b> of type {@link
     * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FromToAmountRange}
     * (1)</li>
     * <li><b>EQAmt</b> of type {@link java.math.BigDecimal}
     * (1)</li>
     * <li><b>NEQAmt</b> of type {@link java.math.BigDecimal}
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
     * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ImpliedCurrencyAmountRangeChoiceCls.ImpliedCurrencyAmountRangeChoiceSG1Cls
     */
    public static class ImpliedCurrencyAmountRangeChoiceSG1 extends biz.c24.io.api.data.ComplexDataObject {

        /**
         * Field serialVersionUID.
         */
        private static final long serialVersionUID = 1L;

        /**
         * Field NATIVE_ELEMENTS.
         */
        private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"EQAmt", "FrAmt", "FrToAmt", "NEQAmt", "ToAmt"};

        /**
         * Field frAmt.
         */
        private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1 frAmt;

        /**
         * Field toAmt.
         */
        private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1 toAmt;

        /**
         * Field frToAmt.
         */
        private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FromToAmountRange frToAmt;

        /**
         * Field eQAmt.
         */
        private java.math.BigDecimal eQAmt;

        /**
         * Field nEQAmt.
         */
        private java.math.BigDecimal nEQAmt;

        public ImpliedCurrencyAmountRangeChoiceSG1() {
            this(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ImpliedCurrencyAmountRangeChoiceCls.ImpliedCurrencyAmountRangeChoiceSG1Cls.getInstance().getNullDefiningElementDecl());
        }

        public ImpliedCurrencyAmountRangeChoiceSG1(biz.c24.io.api.data.Element definingElementDecl) {
            super(definingElementDecl);
        }

        public ImpliedCurrencyAmountRangeChoiceSG1(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
            super(definingElementDecl, type);
        }

        public ImpliedCurrencyAmountRangeChoiceSG1(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ImpliedCurrencyAmountRangeChoice.ImpliedCurrencyAmountRangeChoiceSG1 clone) {
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
                    setFrAmt((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1) value);
                    return;
                case 4:
                    setToAmt((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1) value);
                    return;
                case 2:
                    setFrToAmt((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FromToAmountRange) value);
                    return;
                case 0:
                    setEQAmt(biz.c24.io.api.Utils.decimalValue(value));
                    return;
                case 3:
                    setNEQAmt(biz.c24.io.api.Utils.decimalValue(value));
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
            return new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ImpliedCurrencyAmountRangeChoice.ImpliedCurrencyAmountRangeChoiceSG1(this);
        }

        /**
         * Creates and returns a deep clone of this object.
         * 
         * @return The new object.
         * @see #clone()
         */
        public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
            biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ImpliedCurrencyAmountRangeChoice.ImpliedCurrencyAmountRangeChoiceSG1(this);
            cloneDeep(obj);
            return obj;
        }

        /**
         * 
         * 
         * @param clone
         */
        protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
            iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ImpliedCurrencyAmountRangeChoice.ImpliedCurrencyAmountRangeChoiceSG1 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ImpliedCurrencyAmountRangeChoice.ImpliedCurrencyAmountRangeChoiceSG1) clone;
            obj.frAmt = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1) biz.c24.io.api.Utils.cloneDeep(this.frAmt, obj, "FrAmt");
            obj.toAmt = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1) biz.c24.io.api.Utils.cloneDeep(this.toAmt, obj, "ToAmt");
            obj.frToAmt = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FromToAmountRange) biz.c24.io.api.Utils.cloneDeep(this.frToAmt, obj, "FrToAmt");
            obj.eQAmt = (java.math.BigDecimal) biz.c24.io.api.Utils.cloneDeep(this.eQAmt, obj, "EQAmt");
            obj.nEQAmt = (java.math.BigDecimal) biz.c24.io.api.Utils.cloneDeep(this.nEQAmt, obj, "NEQAmt");
        }

        /**
         * Creates, adds and returns a new FrAmt (1).
         * 
         * @return The new value.
         */
        public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1 createFrAmt() {
            iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1) getElementDecl("FrAmt").createObject();
            setFrAmt(obj);
            return obj;
        }

        /**
         * Creates, adds and returns a new FrToAmt (1).
         * 
         * @return The new value.
         */
        public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FromToAmountRange createFrToAmt() {
            iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FromToAmountRange obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FromToAmountRange) getElementDecl("FrToAmt").createObject();
            setFrToAmt(obj);
            return obj;
        }

        /**
         * Creates, adds and returns a new ToAmt (1).
         * 
         * @return The new value.
         */
        public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1 createToAmt() {
            iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1) getElementDecl("ToAmt").createObject();
            setToAmt(obj);
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
         * Gets the value of EQAmt (1).
         * 
         * @return The value.
         */
        public java.math.BigDecimal getEQAmt() {
            return this.eQAmt;
        }

        /**
         * Returns the element called <code>name</code> at
         * <code>index</code>.<p>
         * The legal value(s) for <code>name</code> are: <b>frAmt,
         * toAmt, frToAmt, eQAmt, nEQAmt</b>.
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
                    return getFrAmt();
                case 4:
                    return getToAmt();
                case 2:
                    return getFrToAmt();
                case 0:
                    return getEQAmt();
                case 3:
                    return getNEQAmt();
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
                    return this.frAmt == null ? 0 : 1;
                case 4:
                    return this.toAmt == null ? 0 : 1;
                case 2:
                    return this.frToAmt == null ? 0 : 1;
                case 0:
                    return this.eQAmt == null ? 0 : 1;
                case 3:
                    return this.nEQAmt == null ? 0 : 1;
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
                    return this.frAmt != null && this.frAmt.equals(element) ? 0 : -1;
                case 4:
                    return this.toAmt != null && this.toAmt.equals(element) ? 0 : -1;
                case 2:
                    return this.frToAmt != null && this.frToAmt.equals(element) ? 0 : -1;
                case 0:
                    return this.eQAmt != null && this.eQAmt.equals(element) ? 0 : -1;
                case 3:
                    return this.nEQAmt != null && this.nEQAmt.equals(element) ? 0 : -1;
                default:
                    return super.getElementIndex(name, element);
            }
        }

        /**
         * Gets the value of FrAmt (1).
         * 
         * @return The value.
         */
        public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1 getFrAmt() {
            return this.frAmt;
        }

        /**
         * Gets the value of FrToAmt (1).
         * 
         * @return The value.
         */
        public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FromToAmountRange getFrToAmt() {
            return this.frToAmt;
        }

        /**
         * Gets the value of NEQAmt (1).
         * 
         * @return The value.
         */
        public java.math.BigDecimal getNEQAmt() {
            return this.nEQAmt;
        }

        /**
         * Returns the raw element data called <code>name</code> at
         * <code>index</code>.<p>
         * The legal value(s) for <code>name</code> are: <b>frAmt,
         * toAmt, frToAmt, eQAmt, nEQAmt</b>.
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
                    return this.frAmt;
                case 4:
                    return this.toAmt;
                case 2:
                    return this.frToAmt;
                case 0:
                    return this.eQAmt;
                case 3:
                    return this.nEQAmt;
                default:
                    return super.getElement(name, index);
            }
        }

        /**
         * Gets the value of ToAmt (1).
         * 
         * @return The value.
         */
        public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1 getToAmt() {
            return this.toAmt;
        }

        /**
         */
        public int getTotalElementCount() {
            int count = 0;
            count += this.frAmt == null ? 0 : 1;
            count += this.toAmt == null ? 0 : 1;
            count += this.frToAmt == null ? 0 : 1;
            count += this.eQAmt == null ? 0 : 1;
            count += this.nEQAmt == null ? 0 : 1;
            return count;
        }

        public int hashCode() {
            int result = 17;
            result = 31 * result + hashCodeOf(serialVersionUID);
            result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
            result = 31 * result + hashCodeOf(frAmt);
            result = 31 * result + hashCodeOf(toAmt);
            result = 31 * result + hashCodeOf(frToAmt);
            result = 31 * result + hashCodeOf(eQAmt);
            result = 31 * result + hashCodeOf(nEQAmt);
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
                    setFrAmt(null);
                    return;
                case 4:
                    setToAmt(null);
                    return;
                case 2:
                    setFrToAmt(null);
                    return;
                case 0:
                    setEQAmt(null);
                    return;
                case 3:
                    setNEQAmt(null);
                    return;
                default:
                super.removeElement(name, index);
            }
        }

        /**
         * [Virtual Element] Sets the value of EQAmt (1).
         * 
         * @param value
         * @param value The new value.
         */
        public void setEQAmt(java.math.BigDecimal value) {
            this.eQAmt = value;
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
                    setFrAmt((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1) value);
                    return;
                case 4:
                    setToAmt((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1) value);
                    return;
                case 2:
                    setFrToAmt((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FromToAmountRange) value);
                    return;
                case 0:
                    setEQAmt(biz.c24.io.api.Utils.decimalValue(value));
                    return;
                case 3:
                    setNEQAmt(biz.c24.io.api.Utils.decimalValue(value));
                    return;
                default:
                    super.setElement(name, index, value);
            }
        }

        /**
         * [Virtual Element] Sets the value of FrAmt (1).
         * 
         * @param value
         * @param value The new value.
         */
        public void setFrAmt(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1 value) {
            this.frAmt = value;
            if (this.frAmt != null)
                ((biz.c24.io.api.data.ComplexDataObject) this.frAmt).setParent(this, "FrAmt");
        }

        /**
         * [Virtual Element] Sets the value of FrToAmt (1).
         * 
         * @param value
         * @param value The new value.
         */
        public void setFrToAmt(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FromToAmountRange value) {
            this.frToAmt = value;
            if (this.frToAmt != null)
                ((biz.c24.io.api.data.ComplexDataObject) this.frToAmt).setParent(this, "FrToAmt");
        }

        /**
         * [Virtual Element] Sets the value of NEQAmt (1).
         * 
         * @param value
         * @param value The new value.
         */
        public void setNEQAmt(java.math.BigDecimal value) {
            this.nEQAmt = value;
        }

        /**
         * [Virtual Element] Sets the value of ToAmt (1).
         * 
         * @param value
         * @param value The new value.
         */
        public void setToAmt(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1 value) {
            this.toAmt = value;
            if (this.toAmt != null)
                ((biz.c24.io.api.data.ComplexDataObject) this.toAmt).setParent(this, "ToAmt");
        }

        /**
         * 
         * 
         * @param out
         */
        private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
            out.writeObject(this.frAmt);
            out.writeObject(this.toAmt);
            out.writeObject(this.frToAmt);
            out.writeObject(this.eQAmt);
            out.writeObject(this.nEQAmt);
        }

        /**
         * 
         * 
         * @param in
         */
        private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
            this.frAmt = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1) in.readObject();
            this.toAmt = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1) in.readObject();
            this.frToAmt = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FromToAmountRange) in.readObject();
            this.eQAmt = (java.math.BigDecimal) in.readObject();
            this.nEQAmt = (java.math.BigDecimal) in.readObject();
        }

    }

}
