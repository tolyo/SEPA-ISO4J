/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * ReferredDocumentType1Choice. <p/>
 * 
 * This object is composed of the following <i>element</i>:
 * <ul>
 * <li><b>ReferredDocumentType1Choice-SG1</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ReferredDocumentType1Choice.ReferredDocumentType1ChoiceSG1}
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
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ReferredDocumentType1ChoiceCls
 */
public class ReferredDocumentType1Choice extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"ReferredDocumentType1Choice-SG1"};

    /**
     * Field referredDocumentType1ChoiceSG1.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ReferredDocumentType1Choice.ReferredDocumentType1ChoiceSG1 referredDocumentType1ChoiceSG1;

    public ReferredDocumentType1Choice() {
        this(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ReferredDocumentType1ChoiceCls.getInstance().getNullDefiningElementDecl());
    }

    public ReferredDocumentType1Choice(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public ReferredDocumentType1Choice(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public ReferredDocumentType1Choice(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ReferredDocumentType1Choice clone) {
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
                setReferredDocumentType1ChoiceSG1((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ReferredDocumentType1Choice.ReferredDocumentType1ChoiceSG1) value);
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
        return new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ReferredDocumentType1Choice(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ReferredDocumentType1Choice(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ReferredDocumentType1Choice obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ReferredDocumentType1Choice) clone;
        obj.referredDocumentType1ChoiceSG1 = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ReferredDocumentType1Choice.ReferredDocumentType1ChoiceSG1) biz.c24.io.api.Utils.cloneDeep(this.referredDocumentType1ChoiceSG1, obj, "ReferredDocumentType1Choice-SG1");
    }

    /**
     * Creates, adds and returns a new
     * ReferredDocumentType1Choice-SG1 (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ReferredDocumentType1Choice.ReferredDocumentType1ChoiceSG1 createReferredDocumentType1ChoiceSG1() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ReferredDocumentType1Choice.ReferredDocumentType1ChoiceSG1 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ReferredDocumentType1Choice.ReferredDocumentType1ChoiceSG1) getElementDecl("ReferredDocumentType1Choice-SG1").createObject();
        setReferredDocumentType1ChoiceSG1(obj);
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
     * <b>referredDocumentType1ChoiceSG1</b>.
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
                return getReferredDocumentType1ChoiceSG1();
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
                return this.referredDocumentType1ChoiceSG1 == null ? 0 : 1;
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
                return this.referredDocumentType1ChoiceSG1 != null && this.referredDocumentType1ChoiceSG1.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are:
     * <b>referredDocumentType1ChoiceSG1</b>.
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
                return this.referredDocumentType1ChoiceSG1;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of ReferredDocumentType1Choice-SG1 (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ReferredDocumentType1Choice.ReferredDocumentType1ChoiceSG1 getReferredDocumentType1ChoiceSG1() {
        return this.referredDocumentType1ChoiceSG1;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.referredDocumentType1ChoiceSG1 == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(referredDocumentType1ChoiceSG1);
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
                setReferredDocumentType1ChoiceSG1(null);
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
                setReferredDocumentType1ChoiceSG1((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ReferredDocumentType1Choice.ReferredDocumentType1ChoiceSG1) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of
     * ReferredDocumentType1Choice-SG1 (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setReferredDocumentType1ChoiceSG1(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ReferredDocumentType1Choice.ReferredDocumentType1ChoiceSG1 value) {
        this.referredDocumentType1ChoiceSG1 = value;
        if (this.referredDocumentType1ChoiceSG1 != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.referredDocumentType1ChoiceSG1).setParent(this, "ReferredDocumentType1Choice-SG1");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.referredDocumentType1ChoiceSG1);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.referredDocumentType1ChoiceSG1 = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ReferredDocumentType1Choice.ReferredDocumentType1ChoiceSG1) in.readObject();
    }

    /**
     * ReferredDocumentType1Choice-SG1. <p/>
     * 
     * This object is composed of the following <i>elements</i>:
     * <ul>
     * <li><b>Cd</b> of type {@link java.lang.String} (1)</li>
     * <li><b>Prtry</b> of type {@link java.lang.String} (1)</li>
     * </ul>
     * 
     * <br><strong>Produced by C24 Integration Objects
     * (http://www.c24.biz)</br>
     * 
     * 
     * @author C24 Integration Objects;
     * @version $Revision$ $Date$
     * @see
     * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ReferredDocumentType1ChoiceCls.ReferredDocumentType1ChoiceSG1Cls
     */
    public static class ReferredDocumentType1ChoiceSG1 extends biz.c24.io.api.data.ComplexDataObject {

        /**
         * Field serialVersionUID.
         */
        private static final long serialVersionUID = 1L;

        /**
         * Field NATIVE_ELEMENTS.
         */
        private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"Cd", "Prtry"};

        /**
         * Field cd.
         */
        private java.lang.String cd;

        /**
         * Field prtry.
         */
        private java.lang.String prtry;

        public ReferredDocumentType1ChoiceSG1() {
            this(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ReferredDocumentType1ChoiceCls.ReferredDocumentType1ChoiceSG1Cls.getInstance().getNullDefiningElementDecl());
        }

        public ReferredDocumentType1ChoiceSG1(biz.c24.io.api.data.Element definingElementDecl) {
            super(definingElementDecl);
        }

        public ReferredDocumentType1ChoiceSG1(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
            super(definingElementDecl, type);
        }

        public ReferredDocumentType1ChoiceSG1(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ReferredDocumentType1Choice.ReferredDocumentType1ChoiceSG1 clone) {
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
                    setCd((java.lang.String) value);
                    return;
                case 1:
                    setPrtry((java.lang.String) value);
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
            return new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ReferredDocumentType1Choice.ReferredDocumentType1ChoiceSG1(this);
        }

        /**
         * Creates and returns a deep clone of this object.
         * 
         * @return The new object.
         * @see #clone()
         */
        public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
            biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ReferredDocumentType1Choice.ReferredDocumentType1ChoiceSG1(this);
            cloneDeep(obj);
            return obj;
        }

        /**
         * 
         * 
         * @param clone
         */
        protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
            iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ReferredDocumentType1Choice.ReferredDocumentType1ChoiceSG1 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ReferredDocumentType1Choice.ReferredDocumentType1ChoiceSG1) clone;
            obj.cd = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.cd, obj, "Cd");
            obj.prtry = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.prtry, obj, "Prtry");
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
         * Gets the value of Cd (1).
         * 
         * @return The value.
         */
        public java.lang.String getCd() {
            return this.cd;
        }

        /**
         * Returns the element called <code>name</code> at
         * <code>index</code>.<p>
         * The legal value(s) for <code>name</code> are: <b>cd,
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
                case 0:
                    return getCd();
                case 1:
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
                case 0:
                    return this.cd == null ? 0 : 1;
                case 1:
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
                case 0:
                    return this.cd != null && this.cd.equals(element) ? 0 : -1;
                case 1:
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
        public java.lang.String getPrtry() {
            return this.prtry;
        }

        /**
         * Returns the raw element data called <code>name</code> at
         * <code>index</code>.<p>
         * The legal value(s) for <code>name</code> are: <b>cd,
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
                case 0:
                    return this.cd;
                case 1:
                    return this.prtry;
                default:
                    return super.getElement(name, index);
            }
        }

        /**
         */
        public int getTotalElementCount() {
            int count = 0;
            count += this.cd == null ? 0 : 1;
            count += this.prtry == null ? 0 : 1;
            return count;
        }

        public int hashCode() {
            int result = 17;
            result = 31 * result + hashCodeOf(serialVersionUID);
            result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
            result = 31 * result + hashCodeOf(cd);
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
                    setCd(null);
                    return;
                case 1:
                    setPrtry(null);
                    return;
                default:
                super.removeElement(name, index);
            }
        }

        /**
         * [Virtual Element] Sets the value of Cd (1).
         * 
         * @param value
         * @param value The new value.
         */
        public void setCd(java.lang.String value) {
            this.cd = value;
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
                    setCd((java.lang.String) value);
                    return;
                case 1:
                    setPrtry((java.lang.String) value);
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
        public void setPrtry(java.lang.String value) {
            this.prtry = value;
        }

        /**
         * 
         * 
         * @param out
         */
        private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
            out.writeObject(this.cd);
            out.writeObject(this.prtry);
        }

        /**
         * 
         * 
         * @param in
         */
        private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
            this.cd = (java.lang.String) in.readObject();
            this.prtry = (java.lang.String) in.readObject();
        }

    }

}
