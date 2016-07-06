/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * FinancialInstrumentQuantityChoice. <p/>
 * 
 * This object is composed of the following <i>element</i>:
 * <ul>
 * <li><b>FinancialInstrumentQuantityChoice-SG1</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FinancialInstrumentQuantityChoice.FinancialInstrumentQuantityChoiceSG1}
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
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FinancialInstrumentQuantityChoiceCls
 */
public class FinancialInstrumentQuantityChoice extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"FinancialInstrumentQuantityChoice-SG1"};

    /**
     * Field financialInstrumentQuantityChoiceSG1.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FinancialInstrumentQuantityChoice.FinancialInstrumentQuantityChoiceSG1 financialInstrumentQuantityChoiceSG1;

    public FinancialInstrumentQuantityChoice() {
        this(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FinancialInstrumentQuantityChoiceCls.getInstance().getNullDefiningElementDecl());
    }

    public FinancialInstrumentQuantityChoice(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public FinancialInstrumentQuantityChoice(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public FinancialInstrumentQuantityChoice(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FinancialInstrumentQuantityChoice clone) {
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
                setFinancialInstrumentQuantityChoiceSG1((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FinancialInstrumentQuantityChoice.FinancialInstrumentQuantityChoiceSG1) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FinancialInstrumentQuantityChoice(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FinancialInstrumentQuantityChoice(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FinancialInstrumentQuantityChoice obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FinancialInstrumentQuantityChoice) clone;
        obj.financialInstrumentQuantityChoiceSG1 = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FinancialInstrumentQuantityChoice.FinancialInstrumentQuantityChoiceSG1) biz.c24.io.api.Utils.cloneDeep(this.financialInstrumentQuantityChoiceSG1, obj, "FinancialInstrumentQuantityChoice-SG1");
    }

    /**
     * Creates, adds and returns a new
     * FinancialInstrumentQuantityChoice-SG1 (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FinancialInstrumentQuantityChoice.FinancialInstrumentQuantityChoiceSG1 createFinancialInstrumentQuantityChoiceSG1() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FinancialInstrumentQuantityChoice.FinancialInstrumentQuantityChoiceSG1 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FinancialInstrumentQuantityChoice.FinancialInstrumentQuantityChoiceSG1) getElementDecl("FinancialInstrumentQuantityChoice-SG1").createObject();
        setFinancialInstrumentQuantityChoiceSG1(obj);
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
     * <b>financialInstrumentQuantityChoiceSG1</b>.
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
                return getFinancialInstrumentQuantityChoiceSG1();
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
                return this.financialInstrumentQuantityChoiceSG1 == null ? 0 : 1;
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
                return this.financialInstrumentQuantityChoiceSG1 != null && this.financialInstrumentQuantityChoiceSG1.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of FinancialInstrumentQuantityChoice-SG1 (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FinancialInstrumentQuantityChoice.FinancialInstrumentQuantityChoiceSG1 getFinancialInstrumentQuantityChoiceSG1() {
        return this.financialInstrumentQuantityChoiceSG1;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are:
     * <b>financialInstrumentQuantityChoiceSG1</b>.
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
                return this.financialInstrumentQuantityChoiceSG1;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.financialInstrumentQuantityChoiceSG1 == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(financialInstrumentQuantityChoiceSG1);
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
                setFinancialInstrumentQuantityChoiceSG1(null);
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
                setFinancialInstrumentQuantityChoiceSG1((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FinancialInstrumentQuantityChoice.FinancialInstrumentQuantityChoiceSG1) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of
     * FinancialInstrumentQuantityChoice-SG1 (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setFinancialInstrumentQuantityChoiceSG1(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FinancialInstrumentQuantityChoice.FinancialInstrumentQuantityChoiceSG1 value) {
        this.financialInstrumentQuantityChoiceSG1 = value;
        if (this.financialInstrumentQuantityChoiceSG1 != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.financialInstrumentQuantityChoiceSG1).setParent(this, "FinancialInstrumentQuantityChoice-SG1");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.financialInstrumentQuantityChoiceSG1);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.financialInstrumentQuantityChoiceSG1 = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FinancialInstrumentQuantityChoice.FinancialInstrumentQuantityChoiceSG1) in.readObject();
    }

    /**
     * FinancialInstrumentQuantityChoice-SG1. <p/>
     * 
     * This object is composed of the following <i>elements</i>:
     * <ul>
     * <li><b>Unit</b> of type {@link java.math.BigDecimal}
     * (1)</li>
     * <li><b>FaceAmt</b> of type {@link java.math.BigDecimal}
     * (1)</li>
     * <li><b>AmtsdVal</b> of type {@link java.math.BigDecimal}
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
     * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FinancialInstrumentQuantityChoiceCls.FinancialInstrumentQuantityChoiceSG1Cls
     */
    public static class FinancialInstrumentQuantityChoiceSG1 extends biz.c24.io.api.data.ComplexDataObject {

        /**
         * Field serialVersionUID.
         */
        private static final long serialVersionUID = 1L;

        /**
         * Field NATIVE_ELEMENTS.
         */
        private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"AmtsdVal", "FaceAmt", "Unit"};

        /**
         * Field unit.
         */
        private java.math.BigDecimal unit;

        /**
         * Field faceAmt.
         */
        private java.math.BigDecimal faceAmt;

        /**
         * Field amtsdVal.
         */
        private java.math.BigDecimal amtsdVal;

        public FinancialInstrumentQuantityChoiceSG1() {
            this(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FinancialInstrumentQuantityChoiceCls.FinancialInstrumentQuantityChoiceSG1Cls.getInstance().getNullDefiningElementDecl());
        }

        public FinancialInstrumentQuantityChoiceSG1(biz.c24.io.api.data.Element definingElementDecl) {
            super(definingElementDecl);
        }

        public FinancialInstrumentQuantityChoiceSG1(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
            super(definingElementDecl, type);
        }

        public FinancialInstrumentQuantityChoiceSG1(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FinancialInstrumentQuantityChoice.FinancialInstrumentQuantityChoiceSG1 clone) {
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
                    setUnit(biz.c24.io.api.Utils.decimalValue(value));
                    return;
                case 1:
                    setFaceAmt(biz.c24.io.api.Utils.decimalValue(value));
                    return;
                case 0:
                    setAmtsdVal(biz.c24.io.api.Utils.decimalValue(value));
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
            return new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FinancialInstrumentQuantityChoice.FinancialInstrumentQuantityChoiceSG1(this);
        }

        /**
         * Creates and returns a deep clone of this object.
         * 
         * @return The new object.
         * @see #clone()
         */
        public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
            biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FinancialInstrumentQuantityChoice.FinancialInstrumentQuantityChoiceSG1(this);
            cloneDeep(obj);
            return obj;
        }

        /**
         * 
         * 
         * @param clone
         */
        protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
            iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FinancialInstrumentQuantityChoice.FinancialInstrumentQuantityChoiceSG1 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FinancialInstrumentQuantityChoice.FinancialInstrumentQuantityChoiceSG1) clone;
            obj.unit = (java.math.BigDecimal) biz.c24.io.api.Utils.cloneDeep(this.unit, obj, "Unit");
            obj.faceAmt = (java.math.BigDecimal) biz.c24.io.api.Utils.cloneDeep(this.faceAmt, obj, "FaceAmt");
            obj.amtsdVal = (java.math.BigDecimal) biz.c24.io.api.Utils.cloneDeep(this.amtsdVal, obj, "AmtsdVal");
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
         * Gets the value of AmtsdVal (1).
         * 
         * @return The value.
         */
        public java.math.BigDecimal getAmtsdVal() {
            return this.amtsdVal;
        }

        /**
         * Returns the element called <code>name</code> at
         * <code>index</code>.<p>
         * The legal value(s) for <code>name</code> are: <b>unit,
         * faceAmt, amtsdVal</b>.
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
                    return getUnit();
                case 1:
                    return getFaceAmt();
                case 0:
                    return getAmtsdVal();
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
                case 2:
                    return this.unit == null ? 0 : 1;
                case 1:
                    return this.faceAmt == null ? 0 : 1;
                case 0:
                    return this.amtsdVal == null ? 0 : 1;
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
                    return this.unit != null && this.unit.equals(element) ? 0 : -1;
                case 1:
                    return this.faceAmt != null && this.faceAmt.equals(element) ? 0 : -1;
                case 0:
                    return this.amtsdVal != null && this.amtsdVal.equals(element) ? 0 : -1;
                default:
                    return super.getElementIndex(name, element);
            }
        }

        /**
         * Gets the value of FaceAmt (1).
         * 
         * @return The value.
         */
        public java.math.BigDecimal getFaceAmt() {
            return this.faceAmt;
        }

        /**
         * Returns the raw element data called <code>name</code> at
         * <code>index</code>.<p>
         * The legal value(s) for <code>name</code> are: <b>unit,
         * faceAmt, amtsdVal</b>.
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
                    return this.unit;
                case 1:
                    return this.faceAmt;
                case 0:
                    return this.amtsdVal;
                default:
                    return super.getElement(name, index);
            }
        }

        /**
         */
        public int getTotalElementCount() {
            int count = 0;
            count += this.unit == null ? 0 : 1;
            count += this.faceAmt == null ? 0 : 1;
            count += this.amtsdVal == null ? 0 : 1;
            return count;
        }

        /**
         * Gets the value of Unit (1).
         * 
         * @return The value.
         */
        public java.math.BigDecimal getUnit() {
            return this.unit;
        }

        public int hashCode() {
            int result = 17;
            result = 31 * result + hashCodeOf(serialVersionUID);
            result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
            result = 31 * result + hashCodeOf(unit);
            result = 31 * result + hashCodeOf(faceAmt);
            result = 31 * result + hashCodeOf(amtsdVal);
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
                    setUnit(null);
                    return;
                case 1:
                    setFaceAmt(null);
                    return;
                case 0:
                    setAmtsdVal(null);
                    return;
                default:
                super.removeElement(name, index);
            }
        }

        /**
         * [Virtual Element] Sets the value of AmtsdVal (1).
         * 
         * @param value
         * @param value The new value.
         */
        public void setAmtsdVal(java.math.BigDecimal value) {
            this.amtsdVal = value;
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
                    setUnit(biz.c24.io.api.Utils.decimalValue(value));
                    return;
                case 1:
                    setFaceAmt(biz.c24.io.api.Utils.decimalValue(value));
                    return;
                case 0:
                    setAmtsdVal(biz.c24.io.api.Utils.decimalValue(value));
                    return;
                default:
                    super.setElement(name, index, value);
            }
        }

        /**
         * [Virtual Element] Sets the value of FaceAmt (1).
         * 
         * @param value
         * @param value The new value.
         */
        public void setFaceAmt(java.math.BigDecimal value) {
            this.faceAmt = value;
        }

        /**
         * [Virtual Element] Sets the value of Unit (1).
         * 
         * @param value
         * @param value The new value.
         */
        public void setUnit(java.math.BigDecimal value) {
            this.unit = value;
        }

        /**
         * 
         * 
         * @param out
         */
        private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
            out.writeObject(this.unit);
            out.writeObject(this.faceAmt);
            out.writeObject(this.amtsdVal);
        }

        /**
         * 
         * 
         * @param in
         */
        private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
            this.unit = (java.math.BigDecimal) in.readObject();
            this.faceAmt = (java.math.BigDecimal) in.readObject();
            this.amtsdVal = (java.math.BigDecimal) in.readObject();
        }

    }

}
