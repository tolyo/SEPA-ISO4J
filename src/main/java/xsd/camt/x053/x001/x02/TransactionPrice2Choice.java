/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * TransactionPrice2Choice. <p/>
 * 
 * This object is composed of the following <i>element</i>:
 * <ul>
 * <li><b>TransactionPrice2Choice-SG1</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionPrice2Choice.TransactionPrice2ChoiceSG1}
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
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionPrice2ChoiceCls
 */
public class TransactionPrice2Choice extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"TransactionPrice2Choice-SG1"};

    /**
     * Field transactionPrice2ChoiceSG1.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionPrice2Choice.TransactionPrice2ChoiceSG1 transactionPrice2ChoiceSG1;

    public TransactionPrice2Choice() {
        this(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionPrice2ChoiceCls.getInstance().getNullDefiningElementDecl());
    }

    public TransactionPrice2Choice(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public TransactionPrice2Choice(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public TransactionPrice2Choice(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionPrice2Choice clone) {
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
                setTransactionPrice2ChoiceSG1((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionPrice2Choice.TransactionPrice2ChoiceSG1) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionPrice2Choice(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionPrice2Choice(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionPrice2Choice obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionPrice2Choice) clone;
        obj.transactionPrice2ChoiceSG1 = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionPrice2Choice.TransactionPrice2ChoiceSG1) biz.c24.io.api.Utils.cloneDeep(this.transactionPrice2ChoiceSG1, obj, "TransactionPrice2Choice-SG1");
    }

    /**
     * Creates, adds and returns a new TransactionPrice2Choice-SG1
     * (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionPrice2Choice.TransactionPrice2ChoiceSG1 createTransactionPrice2ChoiceSG1() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionPrice2Choice.TransactionPrice2ChoiceSG1 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionPrice2Choice.TransactionPrice2ChoiceSG1) getElementDecl("TransactionPrice2Choice-SG1").createObject();
        setTransactionPrice2ChoiceSG1(obj);
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
     * <b>transactionPrice2ChoiceSG1</b>.
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
                return getTransactionPrice2ChoiceSG1();
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
                return this.transactionPrice2ChoiceSG1 == null ? 0 : 1;
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
                return this.transactionPrice2ChoiceSG1 != null && this.transactionPrice2ChoiceSG1.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are:
     * <b>transactionPrice2ChoiceSG1</b>.
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
                return this.transactionPrice2ChoiceSG1;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.transactionPrice2ChoiceSG1 == null ? 0 : 1;
        return count;
    }

    /**
     * Gets the value of TransactionPrice2Choice-SG1 (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionPrice2Choice.TransactionPrice2ChoiceSG1 getTransactionPrice2ChoiceSG1() {
        return this.transactionPrice2ChoiceSG1;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(transactionPrice2ChoiceSG1);
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
                setTransactionPrice2ChoiceSG1(null);
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
                setTransactionPrice2ChoiceSG1((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionPrice2Choice.TransactionPrice2ChoiceSG1) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of
     * TransactionPrice2Choice-SG1 (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTransactionPrice2ChoiceSG1(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionPrice2Choice.TransactionPrice2ChoiceSG1 value) {
        this.transactionPrice2ChoiceSG1 = value;
        if (this.transactionPrice2ChoiceSG1 != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.transactionPrice2ChoiceSG1).setParent(this, "TransactionPrice2Choice-SG1");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.transactionPrice2ChoiceSG1);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.transactionPrice2ChoiceSG1 = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionPrice2Choice.TransactionPrice2ChoiceSG1) in.readObject();
    }

    /**
     * TransactionPrice2Choice-SG1. <p/>
     * 
     * This object is composed of the following <i>elements</i>:
     * <ul>
     * <li><b>DealPric</b> of type {@link
     * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount}
     * (1)</li>
     * <li><b>Prtry</b> of type {@link
     * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryPrice2}
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
     * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionPrice2ChoiceCls.TransactionPrice2ChoiceSG1Cls
     */
    public static class TransactionPrice2ChoiceSG1 extends biz.c24.io.api.data.ComplexDataObject {

        /**
         * Field serialVersionUID.
         */
        private static final long serialVersionUID = 1L;

        /**
         * Field NATIVE_ELEMENTS.
         */
        private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"DealPric", "Prtry"};

        /**
         * Field dealPric.
         */
        private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount dealPric;

        /**
         * Field prtry.
         */
        private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryPrice2[] prtry;

        public TransactionPrice2ChoiceSG1() {
            this(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionPrice2ChoiceCls.TransactionPrice2ChoiceSG1Cls.getInstance().getNullDefiningElementDecl());
        }

        public TransactionPrice2ChoiceSG1(biz.c24.io.api.data.Element definingElementDecl) {
            super(definingElementDecl);
        }

        public TransactionPrice2ChoiceSG1(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
            super(definingElementDecl, type);
        }

        public TransactionPrice2ChoiceSG1(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionPrice2Choice.TransactionPrice2ChoiceSG1 clone) {
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
                    setDealPric((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) value);
                    return;
                case 1:
                    addPrtry((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryPrice2) value);
                    return;
                default:
                    super.addElement(name, value);
            }
        }

        /**
         * Adds a Prtry (1..*).
         * 
         * @param value
         * @param value The new Prtry.
         */
        public void addPrtry(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryPrice2 value) {
            iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryPrice2[] temp = this.prtry;
            this.prtry = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryPrice2[temp == null ? 1 : (temp.length+1)];
            if (temp != null)
                java.lang.System.arraycopy(temp, 0, this.prtry, 0, temp.length);
            this.prtry[this.prtry.length-1] = value;
            ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "Prtry");
        }

        /**
         * Creates and returns a shallow clone of this object.
         * 
         * @see #cloneDeep()
         */
        public java.lang.Object clone() {
            return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionPrice2Choice.TransactionPrice2ChoiceSG1(this);
        }

        /**
         * Creates and returns a deep clone of this object.
         * 
         * @return The new object.
         * @see #clone()
         */
        public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
            biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionPrice2Choice.TransactionPrice2ChoiceSG1(this);
            cloneDeep(obj);
            return obj;
        }

        /**
         * 
         * 
         * @param clone
         */
        protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
            iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionPrice2Choice.TransactionPrice2ChoiceSG1 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionPrice2Choice.TransactionPrice2ChoiceSG1) clone;
            obj.dealPric = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) biz.c24.io.api.Utils.cloneDeep(this.dealPric, obj, "DealPric");
            obj.prtry = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryPrice2[]) biz.c24.io.api.Utils.cloneDeep(this.prtry, obj, "Prtry");
        }

        /**
         * Creates, adds and returns a new DealPric (1).
         * 
         * @return The new value.
         */
        public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount createDealPric() {
            iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) getElementDecl("DealPric").createObject();
            setDealPric(obj);
            return obj;
        }

        /**
         * Creates, adds and returns a new Prtry (1..*).
         * 
         * @return The new value.
         */
        public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryPrice2 createPrtry() {
            iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryPrice2 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryPrice2) getElementDecl("Prtry").createObject();
            addPrtry(obj);
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
         * Gets the value of DealPric (1).
         * 
         * @return The value.
         */
        public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount getDealPric() {
            return this.dealPric;
        }

        /**
         * Returns the element called <code>name</code> at
         * <code>index</code>.<p>
         * The legal value(s) for <code>name</code> are:
         * <b>dealPric, prtry</b>.
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
                    return getDealPric();
                case 1:
                if (this.prtry == null)
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                else
                    return this.prtry[index];
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
                    return this.dealPric == null ? 0 : 1;
                case 1:
                    return this.prtry == null ? 0 : this.prtry.length;
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
                    return this.dealPric != null && this.dealPric.equals(element) ? 0 : -1;
                case 1:
                    return getPrtryIndex((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryPrice2) element);
                default:
                    return super.getElementIndex(name, element);
            }
        }

        /**
         * Gets the value of Prtry (1..*).
         * 
         * @return The value.
         */
        public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryPrice2[] getPrtry() {
            if (this.prtry == null)
                return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryPrice2[]{};
            else
                return this.prtry;
        }

        /**
         * Gets the value of Prtry by ordinal position in the
         * collection.
         * 
         * @param ordinal
         */
        public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryPrice2 getPrtry(int ordinal) {
            if (this.prtry == null)
                throw new ArrayIndexOutOfBoundsException();
            if(ordinal >= 0 && ordinal < this.prtry.length) {
                return this.prtry[ordinal];
            }
                throw new ArrayIndexOutOfBoundsException();
        }

        /**
         * Gets the index of <code>value</code> (1..*).
         * 
         * @param value
         * @param value The Prtry to get the index of.
         * @return The index.
         */
        public int getPrtryIndex(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryPrice2 value) {
            if (this.prtry == null)
                return -1;
            for (int i=0; i<this.prtry.length; i++)
                if (this.prtry[i] == value)
                    return i;
            return -1;
        }

        /**
         * Returns the raw element data called <code>name</code> at
         * <code>index</code>.<p>
         * The legal value(s) for <code>name</code> are:
         * <b>dealPric, prtry</b>.
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
                    return this.dealPric;
                case 1:
                if (this.prtry == null)
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                else
                    return this.prtry[index];
                default:
                    return super.getElement(name, index);
            }
        }

        /**
         */
        public int getTotalElementCount() {
            int count = 0;
            count += this.dealPric == null ? 0 : 1;
            count += this.prtry == null ? 0 : this.prtry.length;
            return count;
        }

        public int hashCode() {
            int result = 17;
            result = 31 * result + hashCodeOf(serialVersionUID);
            result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
            result = 31 * result + hashCodeOf(dealPric);
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
                case 0:
                    setDealPric(null);
                    return;
                case 1:
                    removePrtry(index);
                    return;
                default:
                super.removeElement(name, index);
            }
        }

        /**
         * Removes a Prtry (1..*).
         * 
         * @param index
         * @param index The index of the Prtry to get.
         */
        public void removePrtry(int index) {
            if (this.prtry == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryPrice2[] temp = this.prtry;
            this.prtry = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryPrice2[temp.length-1];
            java.lang.System.arraycopy(temp, 0, this.prtry, 0, index);
            java.lang.System.arraycopy(temp, index+1, this.prtry, index, temp.length-index-1);
            if (this.prtry.length == 0)
                this.prtry = null;
        }

        /**
         * [Virtual Element] Sets the value of DealPric (1).
         * 
         * @param value
         * @param value The new value.
         */
        public void setDealPric(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount value) {
            this.dealPric = value;
            if (this.dealPric != null)
                ((biz.c24.io.api.data.ComplexDataObject) this.dealPric).setParent(this, "DealPric");
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
                    setDealPric((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) value);
                    return;
                case 1:
                    if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryPrice2[]) {
                        setPrtry((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryPrice2[])value);
                    } else if (this.prtry == null) {
                        throw new java.lang.ArrayIndexOutOfBoundsException();
                    } else if (value == null) {
                        removeElement(name, index);
                    } else {
                        this.prtry[index] = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryPrice2) value;
                        ((biz.c24.io.api.data.ComplexDataObject) this.prtry[index]).setParent(this, "Prtry");
                    }
                    return;
                default:
                    super.setElement(name, index, value);
            }
        }

        /**
         * [Virtual Element] Sets the value of Prtry (1..*).
         * 
         * @param value
         * @param value The new value.
         */
        public void setPrtry(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryPrice2[] value) {
            this.prtry = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryPrice2[]) biz.c24.io.api.Utils.clearNulls(value);
            for (int i=0; this.prtry != null && i<this.prtry.length; i++)
                ((biz.c24.io.api.data.ComplexDataObject) this.prtry[i]).setParent(this, "Prtry");
        }

        /**
         * 
         * 
         * @param out
         */
        private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
            out.writeObject(this.dealPric);
            out.writeObject(this.prtry);
        }

        /**
         * 
         * 
         * @param in
         */
        private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
            this.dealPric = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) in.readObject();
            this.prtry = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryPrice2[]) in.readObject();
        }

    }

}
