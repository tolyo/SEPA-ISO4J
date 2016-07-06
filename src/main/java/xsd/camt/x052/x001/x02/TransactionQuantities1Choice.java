/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * TransactionQuantities1Choice. <p/>
 * 
 * This object is composed of the following <i>element</i>:
 * <ul>
 * <li><b>TransactionQuantities1Choice-SG1</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice.TransactionQuantities1ChoiceSG1}
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
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1ChoiceCls
 */
public class TransactionQuantities1Choice extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"TransactionQuantities1Choice-SG1"};

    /**
     * Field transactionQuantities1ChoiceSG1.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice.TransactionQuantities1ChoiceSG1 transactionQuantities1ChoiceSG1;

    public TransactionQuantities1Choice() {
        this(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1ChoiceCls.getInstance().getNullDefiningElementDecl());
    }

    public TransactionQuantities1Choice(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public TransactionQuantities1Choice(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public TransactionQuantities1Choice(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice clone) {
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
                setTransactionQuantities1ChoiceSG1((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice.TransactionQuantities1ChoiceSG1) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice) clone;
        obj.transactionQuantities1ChoiceSG1 = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice.TransactionQuantities1ChoiceSG1) biz.c24.io.api.Utils.cloneDeep(this.transactionQuantities1ChoiceSG1, obj, "TransactionQuantities1Choice-SG1");
    }

    /**
     * Creates, adds and returns a new
     * TransactionQuantities1Choice-SG1 (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice.TransactionQuantities1ChoiceSG1 createTransactionQuantities1ChoiceSG1() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice.TransactionQuantities1ChoiceSG1 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice.TransactionQuantities1ChoiceSG1) getElementDecl("TransactionQuantities1Choice-SG1").createObject();
        setTransactionQuantities1ChoiceSG1(obj);
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
     * <b>transactionQuantities1ChoiceSG1</b>.
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
                return getTransactionQuantities1ChoiceSG1();
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
                return this.transactionQuantities1ChoiceSG1 == null ? 0 : 1;
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
                return this.transactionQuantities1ChoiceSG1 != null && this.transactionQuantities1ChoiceSG1.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are:
     * <b>transactionQuantities1ChoiceSG1</b>.
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
                return this.transactionQuantities1ChoiceSG1;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.transactionQuantities1ChoiceSG1 == null ? 0 : 1;
        return count;
    }

    /**
     * Gets the value of TransactionQuantities1Choice-SG1 (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice.TransactionQuantities1ChoiceSG1 getTransactionQuantities1ChoiceSG1() {
        return this.transactionQuantities1ChoiceSG1;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(transactionQuantities1ChoiceSG1);
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
                setTransactionQuantities1ChoiceSG1(null);
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
                setTransactionQuantities1ChoiceSG1((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice.TransactionQuantities1ChoiceSG1) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of
     * TransactionQuantities1Choice-SG1 (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTransactionQuantities1ChoiceSG1(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice.TransactionQuantities1ChoiceSG1 value) {
        this.transactionQuantities1ChoiceSG1 = value;
        if (this.transactionQuantities1ChoiceSG1 != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.transactionQuantities1ChoiceSG1).setParent(this, "TransactionQuantities1Choice-SG1");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.transactionQuantities1ChoiceSG1);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.transactionQuantities1ChoiceSG1 = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice.TransactionQuantities1ChoiceSG1) in.readObject();
    }

    /**
     * TransactionQuantities1Choice-SG1. <p/>
     * 
     * This object is composed of the following <i>elements</i>:
     * <ul>
     * <li><b>Qty</b> of type {@link
     * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FinancialInstrumentQuantityChoice}
     * (1)</li>
     * <li><b>Prtry</b> of type {@link
     * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryQuantity1}
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
     * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1ChoiceCls.TransactionQuantities1ChoiceSG1Cls
     */
    public static class TransactionQuantities1ChoiceSG1 extends biz.c24.io.api.data.ComplexDataObject {

        /**
         * Field serialVersionUID.
         */
        private static final long serialVersionUID = 1L;

        /**
         * Field NATIVE_ELEMENTS.
         */
        private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"Prtry", "Qty"};

        /**
         * Field qty.
         */
        private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FinancialInstrumentQuantityChoice qty;

        /**
         * Field prtry.
         */
        private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryQuantity1 prtry;

        public TransactionQuantities1ChoiceSG1() {
            this(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1ChoiceCls.TransactionQuantities1ChoiceSG1Cls.getInstance().getNullDefiningElementDecl());
        }

        public TransactionQuantities1ChoiceSG1(biz.c24.io.api.data.Element definingElementDecl) {
            super(definingElementDecl);
        }

        public TransactionQuantities1ChoiceSG1(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
            super(definingElementDecl, type);
        }

        public TransactionQuantities1ChoiceSG1(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice.TransactionQuantities1ChoiceSG1 clone) {
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
                    setQty((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FinancialInstrumentQuantityChoice) value);
                    return;
                case 0:
                    setPrtry((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryQuantity1) value);
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
            return new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice.TransactionQuantities1ChoiceSG1(this);
        }

        /**
         * Creates and returns a deep clone of this object.
         * 
         * @return The new object.
         * @see #clone()
         */
        public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
            biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice.TransactionQuantities1ChoiceSG1(this);
            cloneDeep(obj);
            return obj;
        }

        /**
         * 
         * 
         * @param clone
         */
        protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
            iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice.TransactionQuantities1ChoiceSG1 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice.TransactionQuantities1ChoiceSG1) clone;
            obj.qty = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FinancialInstrumentQuantityChoice) biz.c24.io.api.Utils.cloneDeep(this.qty, obj, "Qty");
            obj.prtry = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryQuantity1) biz.c24.io.api.Utils.cloneDeep(this.prtry, obj, "Prtry");
        }

        /**
         * Creates, adds and returns a new Prtry (1).
         * 
         * @return The new value.
         */
        public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryQuantity1 createPrtry() {
            iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryQuantity1 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryQuantity1) getElementDecl("Prtry").createObject();
            setPrtry(obj);
            return obj;
        }

        /**
         * Creates, adds and returns a new Qty (1).
         * 
         * @return The new value.
         */
        public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FinancialInstrumentQuantityChoice createQty() {
            iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FinancialInstrumentQuantityChoice obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FinancialInstrumentQuantityChoice) getElementDecl("Qty").createObject();
            setQty(obj);
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
         * The legal value(s) for <code>name</code> are: <b>qty,
         * prtry</b>.
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
                    return getQty();
                case 0:
                    return getPrtry();
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
                    return this.qty == null ? 0 : 1;
                case 0:
                    return this.prtry == null ? 0 : 1;
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
                    return this.qty != null && this.qty.equals(element) ? 0 : -1;
                case 0:
                    return this.prtry != null && this.prtry.equals(element) ? 0 : -1;
                default:
                    return super.getElementIndex(name, element);
            }
        }

        /**
         * Gets the value of Prtry (1).
         * 
         * @return The value.
         */
        public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryQuantity1 getPrtry() {
            return this.prtry;
        }

        /**
         * Gets the value of Qty (1).
         * 
         * @return The value.
         */
        public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FinancialInstrumentQuantityChoice getQty() {
            return this.qty;
        }

        /**
         * Returns the raw element data called <code>name</code> at
         * <code>index</code>.<p>
         * The legal value(s) for <code>name</code> are: <b>qty,
         * prtry</b>.
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
                    return this.qty;
                case 0:
                    return this.prtry;
                default:
                    return super.getElement(name, index);
            }
        }

        /**
         */
        public int getTotalElementCount() {
            int count = 0;
            count += this.qty == null ? 0 : 1;
            count += this.prtry == null ? 0 : 1;
            return count;
        }

        public int hashCode() {
            int result = 17;
            result = 31 * result + hashCodeOf(serialVersionUID);
            result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
            result = 31 * result + hashCodeOf(qty);
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
                case 1:
                    setQty(null);
                    return;
                case 0:
                    setPrtry(null);
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
                    setQty((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FinancialInstrumentQuantityChoice) value);
                    return;
                case 0:
                    setPrtry((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryQuantity1) value);
                    return;
                default:
                    super.setElement(name, index, value);
            }
        }

        /**
         * [Virtual Element] Sets the value of Prtry (1).
         * 
         * @param value
         * @param value The new value.
         */
        public void setPrtry(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryQuantity1 value) {
            this.prtry = value;
            if (this.prtry != null)
                ((biz.c24.io.api.data.ComplexDataObject) this.prtry).setParent(this, "Prtry");
        }

        /**
         * [Virtual Element] Sets the value of Qty (1).
         * 
         * @param value
         * @param value The new value.
         */
        public void setQty(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FinancialInstrumentQuantityChoice value) {
            this.qty = value;
            if (this.qty != null)
                ((biz.c24.io.api.data.ComplexDataObject) this.qty).setParent(this, "Qty");
        }

        /**
         * 
         * 
         * @param out
         */
        private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
            out.writeObject(this.qty);
            out.writeObject(this.prtry);
        }

        /**
         * 
         * 
         * @param in
         */
        private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
            this.qty = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FinancialInstrumentQuantityChoice) in.readObject();
            this.prtry = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryQuantity1) in.readObject();
        }

    }

}
