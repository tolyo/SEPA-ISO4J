/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * GroupHeader42. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>MsgId</b> of type {@link java.lang.String} (1)</li>
 * <li><b>CreDtTm</b> of type {@link
 * biz.c24.io.api.data.ISO8601DateTime} (1)</li>
 * <li><b>MsgRcpt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.PartyIdentification32}
 * (0..1)</li>
 * <li><b>MsgPgntn</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Pagination}
 * (0..1)</li>
 * <li><b>AddtlInf</b> of type {@link java.lang.String} (0..1)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.GroupHeader42Cls
 */
public class GroupHeader42 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"AddtlInf", "CreDtTm", "MsgId", "MsgPgntn", "MsgRcpt"};

    /**
     * Field msgId.
     */
    private java.lang.String msgId;

    /**
     * Field creDtTm.
     */
    private biz.c24.io.api.data.ISO8601DateTime creDtTm;

    /**
     * Field msgRcpt.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.PartyIdentification32 msgRcpt;

    /**
     * Field msgPgntn.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Pagination msgPgntn;

    /**
     * Field addtlInf.
     */
    private java.lang.String addtlInf;

    public GroupHeader42() {
        this(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.GroupHeader42Cls.getInstance().getNullDefiningElementDecl());
    }

    public GroupHeader42(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public GroupHeader42(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public GroupHeader42(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.GroupHeader42 clone) {
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
                setMsgId((java.lang.String) value);
                return;
            case 1:
                setCreDtTm((biz.c24.io.api.data.ISO8601DateTime) value);
                return;
            case 4:
                setMsgRcpt((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.PartyIdentification32) value);
                return;
            case 3:
                setMsgPgntn((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Pagination) value);
                return;
            case 0:
                setAddtlInf((java.lang.String) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.GroupHeader42(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.GroupHeader42(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.GroupHeader42 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.GroupHeader42) clone;
        obj.msgId = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.msgId, obj, "MsgId");
        obj.creDtTm = (biz.c24.io.api.data.ISO8601DateTime) biz.c24.io.api.Utils.cloneDeep(this.creDtTm, obj, "CreDtTm");
        obj.msgRcpt = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.PartyIdentification32) biz.c24.io.api.Utils.cloneDeep(this.msgRcpt, obj, "MsgRcpt");
        obj.msgPgntn = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Pagination) biz.c24.io.api.Utils.cloneDeep(this.msgPgntn, obj, "MsgPgntn");
        obj.addtlInf = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.addtlInf, obj, "AddtlInf");
    }

    /**
     * Creates, adds and returns a new MsgPgntn (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Pagination createMsgPgntn() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Pagination obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Pagination) getElementDecl("MsgPgntn").createObject();
        setMsgPgntn(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new MsgRcpt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.PartyIdentification32 createMsgRcpt() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.PartyIdentification32 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.PartyIdentification32) getElementDecl("MsgRcpt").createObject();
        setMsgRcpt(obj);
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
     * Gets the value of AddtlInf (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getAddtlInf() {
        return this.addtlInf;
    }

    /**
     * Gets the value of CreDtTm (1).
     * 
     * @return The value.
     */
    public biz.c24.io.api.data.ISO8601DateTime getCreDtTm() {
        return this.creDtTm;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>msgId,
     * creDtTm, msgRcpt, msgPgntn, addtlInf</b>.
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
                return getMsgId();
            case 1:
                return getCreDtTm();
            case 4:
                return getMsgRcpt();
            case 3:
                return getMsgPgntn();
            case 0:
                return getAddtlInf();
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
            case 2:
                return this.msgId == null ? 0 : 1;
            case 1:
                return this.creDtTm == null ? 0 : 1;
            case 4:
                return this.msgRcpt == null ? 0 : 1;
            case 3:
                return this.msgPgntn == null ? 0 : 1;
            case 0:
                return this.addtlInf == null ? 0 : 1;
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
                return this.msgId != null && this.msgId.equals(element) ? 0 : -1;
            case 1:
                return this.creDtTm != null && this.creDtTm.equals(element) ? 0 : -1;
            case 4:
                return this.msgRcpt != null && this.msgRcpt.equals(element) ? 0 : -1;
            case 3:
                return this.msgPgntn != null && this.msgPgntn.equals(element) ? 0 : -1;
            case 0:
                return this.addtlInf != null && this.addtlInf.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of MsgId (1).
     * 
     * @return The value.
     */
    public java.lang.String getMsgId() {
        return this.msgId;
    }

    /**
     * Gets the value of MsgPgntn (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Pagination getMsgPgntn() {
        return this.msgPgntn;
    }

    /**
     * Gets the value of MsgRcpt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.PartyIdentification32 getMsgRcpt() {
        return this.msgRcpt;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>msgId,
     * creDtTm, msgRcpt, msgPgntn, addtlInf</b>.
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
                return this.msgId;
            case 1:
                return this.creDtTm;
            case 4:
                return this.msgRcpt;
            case 3:
                return this.msgPgntn;
            case 0:
                return this.addtlInf;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.msgId == null ? 0 : 1;
        count += this.creDtTm == null ? 0 : 1;
        count += this.msgRcpt == null ? 0 : 1;
        count += this.msgPgntn == null ? 0 : 1;
        count += this.addtlInf == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(msgId);
        result = 31 * result + hashCodeOf(creDtTm);
        result = 31 * result + hashCodeOf(msgRcpt);
        result = 31 * result + hashCodeOf(msgPgntn);
        result = 31 * result + hashCodeOf(addtlInf);
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
                setMsgId(null);
                return;
            case 1:
                setCreDtTm(null);
                return;
            case 4:
                setMsgRcpt(null);
                return;
            case 3:
                setMsgPgntn(null);
                return;
            case 0:
                setAddtlInf(null);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of AddtlInf (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAddtlInf(java.lang.String value) {
        this.addtlInf = value;
    }

    /**
     * [Virtual Element] Sets the value of CreDtTm (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCreDtTm(biz.c24.io.api.data.ISO8601DateTime value) {
        this.creDtTm = value;
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
                setMsgId((java.lang.String) value);
                return;
            case 1:
                setCreDtTm((biz.c24.io.api.data.ISO8601DateTime) value);
                return;
            case 4:
                setMsgRcpt((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.PartyIdentification32) value);
                return;
            case 3:
                setMsgPgntn((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Pagination) value);
                return;
            case 0:
                setAddtlInf((java.lang.String) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of MsgId (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setMsgId(java.lang.String value) {
        this.msgId = value;
    }

    /**
     * [Virtual Element] Sets the value of MsgPgntn (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setMsgPgntn(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Pagination value) {
        this.msgPgntn = value;
        if (this.msgPgntn != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.msgPgntn).setParent(this, "MsgPgntn");
    }

    /**
     * [Virtual Element] Sets the value of MsgRcpt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setMsgRcpt(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.PartyIdentification32 value) {
        this.msgRcpt = value;
        if (this.msgRcpt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.msgRcpt).setParent(this, "MsgRcpt");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.msgId);
        out.writeObject(this.creDtTm);
        out.writeObject(this.msgRcpt);
        out.writeObject(this.msgPgntn);
        out.writeObject(this.addtlInf);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.msgId = (java.lang.String) in.readObject();
        this.creDtTm = (biz.c24.io.api.data.ISO8601DateTime) in.readObject();
        this.msgRcpt = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.PartyIdentification32) in.readObject();
        this.msgPgntn = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Pagination) in.readObject();
        this.addtlInf = (java.lang.String) in.readObject();
    }

}
