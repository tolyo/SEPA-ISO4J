/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * SecurityIdentification4Choice. <p/>
 * 
 * This object is composed of the following <i>element</i>:
 * <ul>
 * <li><b>SecurityIdentification4Choice-SG1</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.SecurityIdentification4Choice.SecurityIdentification4ChoiceSG1}
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
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.SecurityIdentification4ChoiceCls
 */
public class SecurityIdentification4Choice extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"SecurityIdentification4Choice-SG1"};

    /**
     * Field securityIdentification4ChoiceSG1.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.SecurityIdentification4Choice.SecurityIdentification4ChoiceSG1 securityIdentification4ChoiceSG1;

    public SecurityIdentification4Choice() {
        this(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.SecurityIdentification4ChoiceCls.getInstance().getNullDefiningElementDecl());
    }

    public SecurityIdentification4Choice(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public SecurityIdentification4Choice(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public SecurityIdentification4Choice(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.SecurityIdentification4Choice clone) {
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
                setSecurityIdentification4ChoiceSG1((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.SecurityIdentification4Choice.SecurityIdentification4ChoiceSG1) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.SecurityIdentification4Choice(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.SecurityIdentification4Choice(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.SecurityIdentification4Choice obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.SecurityIdentification4Choice) clone;
        obj.securityIdentification4ChoiceSG1 = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.SecurityIdentification4Choice.SecurityIdentification4ChoiceSG1) biz.c24.io.api.Utils.cloneDeep(this.securityIdentification4ChoiceSG1, obj, "SecurityIdentification4Choice-SG1");
    }

    /**
     * Creates, adds and returns a new
     * SecurityIdentification4Choice-SG1 (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.SecurityIdentification4Choice.SecurityIdentification4ChoiceSG1 createSecurityIdentification4ChoiceSG1() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.SecurityIdentification4Choice.SecurityIdentification4ChoiceSG1 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.SecurityIdentification4Choice.SecurityIdentification4ChoiceSG1) getElementDecl("SecurityIdentification4Choice-SG1").createObject();
        setSecurityIdentification4ChoiceSG1(obj);
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
     * <b>securityIdentification4ChoiceSG1</b>.
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
                return getSecurityIdentification4ChoiceSG1();
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
                return this.securityIdentification4ChoiceSG1 == null ? 0 : 1;
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
                return this.securityIdentification4ChoiceSG1 != null && this.securityIdentification4ChoiceSG1.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are:
     * <b>securityIdentification4ChoiceSG1</b>.
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
                return this.securityIdentification4ChoiceSG1;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of SecurityIdentification4Choice-SG1 (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.SecurityIdentification4Choice.SecurityIdentification4ChoiceSG1 getSecurityIdentification4ChoiceSG1() {
        return this.securityIdentification4ChoiceSG1;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.securityIdentification4ChoiceSG1 == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(securityIdentification4ChoiceSG1);
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
                setSecurityIdentification4ChoiceSG1(null);
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
                setSecurityIdentification4ChoiceSG1((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.SecurityIdentification4Choice.SecurityIdentification4ChoiceSG1) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of
     * SecurityIdentification4Choice-SG1 (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setSecurityIdentification4ChoiceSG1(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.SecurityIdentification4Choice.SecurityIdentification4ChoiceSG1 value) {
        this.securityIdentification4ChoiceSG1 = value;
        if (this.securityIdentification4ChoiceSG1 != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.securityIdentification4ChoiceSG1).setParent(this, "SecurityIdentification4Choice-SG1");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.securityIdentification4ChoiceSG1);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.securityIdentification4ChoiceSG1 = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.SecurityIdentification4Choice.SecurityIdentification4ChoiceSG1) in.readObject();
    }

    /**
     * SecurityIdentification4Choice-SG1. <p/>
     * 
     * This object is composed of the following <i>elements</i>:
     * <ul>
     * <li><b>ISIN</b> of type {@link java.lang.String} (1)</li>
     * <li><b>Prtry</b> of type {@link
     * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AlternateSecurityIdentification2}
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
     * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.SecurityIdentification4ChoiceCls.SecurityIdentification4ChoiceSG1Cls
     */
    public static class SecurityIdentification4ChoiceSG1 extends biz.c24.io.api.data.ComplexDataObject {

        /**
         * Field serialVersionUID.
         */
        private static final long serialVersionUID = 1L;

        /**
         * Field NATIVE_ELEMENTS.
         */
        private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"ISIN", "Prtry"};

        /**
         * Field iSIN.
         */
        private java.lang.String iSIN;

        /**
         * Field prtry.
         */
        private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AlternateSecurityIdentification2 prtry;

        public SecurityIdentification4ChoiceSG1() {
            this(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.SecurityIdentification4ChoiceCls.SecurityIdentification4ChoiceSG1Cls.getInstance().getNullDefiningElementDecl());
        }

        public SecurityIdentification4ChoiceSG1(biz.c24.io.api.data.Element definingElementDecl) {
            super(definingElementDecl);
        }

        public SecurityIdentification4ChoiceSG1(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
            super(definingElementDecl, type);
        }

        public SecurityIdentification4ChoiceSG1(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.SecurityIdentification4Choice.SecurityIdentification4ChoiceSG1 clone) {
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
                    setISIN((java.lang.String) value);
                    return;
                case 1:
                    setPrtry((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AlternateSecurityIdentification2) value);
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
            return new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.SecurityIdentification4Choice.SecurityIdentification4ChoiceSG1(this);
        }

        /**
         * Creates and returns a deep clone of this object.
         * 
         * @return The new object.
         * @see #clone()
         */
        public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
            biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.SecurityIdentification4Choice.SecurityIdentification4ChoiceSG1(this);
            cloneDeep(obj);
            return obj;
        }

        /**
         * 
         * 
         * @param clone
         */
        protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
            iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.SecurityIdentification4Choice.SecurityIdentification4ChoiceSG1 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.SecurityIdentification4Choice.SecurityIdentification4ChoiceSG1) clone;
            obj.iSIN = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.iSIN, obj, "ISIN");
            obj.prtry = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AlternateSecurityIdentification2) biz.c24.io.api.Utils.cloneDeep(this.prtry, obj, "Prtry");
        }

        /**
         * Creates, adds and returns a new Prtry (1).
         * 
         * @return The new value.
         */
        public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AlternateSecurityIdentification2 createPrtry() {
            iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AlternateSecurityIdentification2 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AlternateSecurityIdentification2) getElementDecl("Prtry").createObject();
            setPrtry(obj);
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
         * The legal value(s) for <code>name</code> are: <b>iSIN,
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
                    return getISIN();
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
                    return this.iSIN == null ? 0 : 1;
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
                    return this.iSIN != null && this.iSIN.equals(element) ? 0 : -1;
                case 1:
                    return this.prtry != null && this.prtry.equals(element) ? 0 : -1;
                default:
                    return super.getElementIndex(name, element);
            }
        }

        /**
         * Gets the value of ISIN (1).
         * 
         * @return The value.
         */
        public java.lang.String getISIN() {
            return this.iSIN;
        }

        /**
         * Gets the value of Prtry (1).
         * 
         * @return The value.
         */
        public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AlternateSecurityIdentification2 getPrtry() {
            return this.prtry;
        }

        /**
         * Returns the raw element data called <code>name</code> at
         * <code>index</code>.<p>
         * The legal value(s) for <code>name</code> are: <b>iSIN,
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
                    return this.iSIN;
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
            count += this.iSIN == null ? 0 : 1;
            count += this.prtry == null ? 0 : 1;
            return count;
        }

        public int hashCode() {
            int result = 17;
            result = 31 * result + hashCodeOf(serialVersionUID);
            result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
            result = 31 * result + hashCodeOf(iSIN);
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
                    setISIN(null);
                    return;
                case 1:
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
                case 0:
                    setISIN((java.lang.String) value);
                    return;
                case 1:
                    setPrtry((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AlternateSecurityIdentification2) value);
                    return;
                default:
                    super.setElement(name, index, value);
            }
        }

        /**
         * [Virtual Element] Sets the value of ISIN (1).
         * 
         * @param value
         * @param value The new value.
         */
        public void setISIN(java.lang.String value) {
            this.iSIN = value;
        }

        /**
         * [Virtual Element] Sets the value of Prtry (1).
         * 
         * @param value
         * @param value The new value.
         */
        public void setPrtry(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AlternateSecurityIdentification2 value) {
            this.prtry = value;
            if (this.prtry != null)
                ((biz.c24.io.api.data.ComplexDataObject) this.prtry).setParent(this, "Prtry");
        }

        /**
         * 
         * 
         * @param out
         */
        private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
            out.writeObject(this.iSIN);
            out.writeObject(this.prtry);
        }

        /**
         * 
         * 
         * @param in
         */
        private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
            this.iSIN = (java.lang.String) in.readObject();
            this.prtry = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AlternateSecurityIdentification2) in.readObject();
        }

    }

}
