/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * Party6Choice. <p/>
 * 
 * This object is composed of the following <i>element</i>:
 * <ul>
 * <li><b>Party6Choice-SG1</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Party6Choice.Party6ChoiceSG1}
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
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Party6ChoiceCls
 */
public class Party6Choice extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"Party6Choice-SG1"};

    /**
     * Field party6ChoiceSG1.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Party6Choice.Party6ChoiceSG1 party6ChoiceSG1;

    public Party6Choice() {
        this(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Party6ChoiceCls.getInstance().getNullDefiningElementDecl());
    }

    public Party6Choice(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public Party6Choice(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public Party6Choice(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Party6Choice clone) {
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
                setParty6ChoiceSG1((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Party6Choice.Party6ChoiceSG1) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Party6Choice(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Party6Choice(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Party6Choice obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Party6Choice) clone;
        obj.party6ChoiceSG1 = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Party6Choice.Party6ChoiceSG1) biz.c24.io.api.Utils.cloneDeep(this.party6ChoiceSG1, obj, "Party6Choice-SG1");
    }

    /**
     * Creates, adds and returns a new Party6Choice-SG1 (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Party6Choice.Party6ChoiceSG1 createParty6ChoiceSG1() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Party6Choice.Party6ChoiceSG1 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Party6Choice.Party6ChoiceSG1) getElementDecl("Party6Choice-SG1").createObject();
        setParty6ChoiceSG1(obj);
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
     * <b>party6ChoiceSG1</b>.
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
                return getParty6ChoiceSG1();
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
                return this.party6ChoiceSG1 == null ? 0 : 1;
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
                return this.party6ChoiceSG1 != null && this.party6ChoiceSG1.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of Party6Choice-SG1 (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Party6Choice.Party6ChoiceSG1 getParty6ChoiceSG1() {
        return this.party6ChoiceSG1;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are:
     * <b>party6ChoiceSG1</b>.
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
                return this.party6ChoiceSG1;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.party6ChoiceSG1 == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(party6ChoiceSG1);
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
                setParty6ChoiceSG1(null);
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
                setParty6ChoiceSG1((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Party6Choice.Party6ChoiceSG1) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of Party6Choice-SG1 (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setParty6ChoiceSG1(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Party6Choice.Party6ChoiceSG1 value) {
        this.party6ChoiceSG1 = value;
        if (this.party6ChoiceSG1 != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.party6ChoiceSG1).setParent(this, "Party6Choice-SG1");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.party6ChoiceSG1);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.party6ChoiceSG1 = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Party6Choice.Party6ChoiceSG1) in.readObject();
    }

    /**
     * Party6Choice-SG1. <p/>
     * 
     * This object is composed of the following <i>elements</i>:
     * <ul>
     * <li><b>OrgId</b> of type {@link
     * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.OrganisationIdentification4}
     * (1)</li>
     * <li><b>PrvtId</b> of type {@link
     * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.PersonIdentification5}
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
     * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Party6ChoiceCls.Party6ChoiceSG1Cls
     */
    public static class Party6ChoiceSG1 extends biz.c24.io.api.data.ComplexDataObject {

        /**
         * Field serialVersionUID.
         */
        private static final long serialVersionUID = 1L;

        /**
         * Field NATIVE_ELEMENTS.
         */
        private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"OrgId", "PrvtId"};

        /**
         * Field orgId.
         */
        private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.OrganisationIdentification4 orgId;

        /**
         * Field prvtId.
         */
        private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.PersonIdentification5 prvtId;

        public Party6ChoiceSG1() {
            this(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Party6ChoiceCls.Party6ChoiceSG1Cls.getInstance().getNullDefiningElementDecl());
        }

        public Party6ChoiceSG1(biz.c24.io.api.data.Element definingElementDecl) {
            super(definingElementDecl);
        }

        public Party6ChoiceSG1(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
            super(definingElementDecl, type);
        }

        public Party6ChoiceSG1(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Party6Choice.Party6ChoiceSG1 clone) {
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
                    setOrgId((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.OrganisationIdentification4) value);
                    return;
                case 1:
                    setPrvtId((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.PersonIdentification5) value);
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
            return new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Party6Choice.Party6ChoiceSG1(this);
        }

        /**
         * Creates and returns a deep clone of this object.
         * 
         * @return The new object.
         * @see #clone()
         */
        public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
            biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Party6Choice.Party6ChoiceSG1(this);
            cloneDeep(obj);
            return obj;
        }

        /**
         * 
         * 
         * @param clone
         */
        protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
            iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Party6Choice.Party6ChoiceSG1 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Party6Choice.Party6ChoiceSG1) clone;
            obj.orgId = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.OrganisationIdentification4) biz.c24.io.api.Utils.cloneDeep(this.orgId, obj, "OrgId");
            obj.prvtId = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.PersonIdentification5) biz.c24.io.api.Utils.cloneDeep(this.prvtId, obj, "PrvtId");
        }

        /**
         * Creates, adds and returns a new OrgId (1).
         * 
         * @return The new value.
         */
        public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.OrganisationIdentification4 createOrgId() {
            iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.OrganisationIdentification4 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.OrganisationIdentification4) getElementDecl("OrgId").createObject();
            setOrgId(obj);
            return obj;
        }

        /**
         * Creates, adds and returns a new PrvtId (1).
         * 
         * @return The new value.
         */
        public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.PersonIdentification5 createPrvtId() {
            iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.PersonIdentification5 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.PersonIdentification5) getElementDecl("PrvtId").createObject();
            setPrvtId(obj);
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
         * The legal value(s) for <code>name</code> are: <b>orgId,
         * prvtId</b>.
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
                    return getOrgId();
                case 1:
                    return getPrvtId();
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
                    return this.orgId == null ? 0 : 1;
                case 1:
                    return this.prvtId == null ? 0 : 1;
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
                    return this.orgId != null && this.orgId.equals(element) ? 0 : -1;
                case 1:
                    return this.prvtId != null && this.prvtId.equals(element) ? 0 : -1;
                default:
                    return super.getElementIndex(name, element);
            }
        }

        /**
         * Gets the value of OrgId (1).
         * 
         * @return The value.
         */
        public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.OrganisationIdentification4 getOrgId() {
            return this.orgId;
        }

        /**
         * Gets the value of PrvtId (1).
         * 
         * @return The value.
         */
        public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.PersonIdentification5 getPrvtId() {
            return this.prvtId;
        }

        /**
         * Returns the raw element data called <code>name</code> at
         * <code>index</code>.<p>
         * The legal value(s) for <code>name</code> are: <b>orgId,
         * prvtId</b>.
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
                    return this.orgId;
                case 1:
                    return this.prvtId;
                default:
                    return super.getElement(name, index);
            }
        }

        /**
         */
        public int getTotalElementCount() {
            int count = 0;
            count += this.orgId == null ? 0 : 1;
            count += this.prvtId == null ? 0 : 1;
            return count;
        }

        public int hashCode() {
            int result = 17;
            result = 31 * result + hashCodeOf(serialVersionUID);
            result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
            result = 31 * result + hashCodeOf(orgId);
            result = 31 * result + hashCodeOf(prvtId);
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
                    setOrgId(null);
                    return;
                case 1:
                    setPrvtId(null);
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
                    setOrgId((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.OrganisationIdentification4) value);
                    return;
                case 1:
                    setPrvtId((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.PersonIdentification5) value);
                    return;
                default:
                    super.setElement(name, index, value);
            }
        }

        /**
         * [Virtual Element] Sets the value of OrgId (1).
         * 
         * @param value
         * @param value The new value.
         */
        public void setOrgId(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.OrganisationIdentification4 value) {
            this.orgId = value;
            if (this.orgId != null)
                ((biz.c24.io.api.data.ComplexDataObject) this.orgId).setParent(this, "OrgId");
        }

        /**
         * [Virtual Element] Sets the value of PrvtId (1).
         * 
         * @param value
         * @param value The new value.
         */
        public void setPrvtId(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.PersonIdentification5 value) {
            this.prvtId = value;
            if (this.prvtId != null)
                ((biz.c24.io.api.data.ComplexDataObject) this.prvtId).setParent(this, "PrvtId");
        }

        /**
         * 
         * 
         * @param out
         */
        private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
            out.writeObject(this.orgId);
            out.writeObject(this.prvtId);
        }

        /**
         * 
         * 
         * @param in
         */
        private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
            this.orgId = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.OrganisationIdentification4) in.readObject();
            this.prvtId = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.PersonIdentification5) in.readObject();
        }

    }

}
