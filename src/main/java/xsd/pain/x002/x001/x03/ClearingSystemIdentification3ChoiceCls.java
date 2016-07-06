/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03;

/**
 * Class ClearingSystemIdentification3ChoiceCls.The
 * ClearingSystemIdentification3Choice complex data type.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ClearingSystemIdentification3Choice
 */
public class ClearingSystemIdentification3ChoiceCls extends biz.c24.io.api.data.ComplexDataType {

    /**
     * Field instance.
     */
    protected static volatile ClearingSystemIdentification3ChoiceCls instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected ClearingSystemIdentification3ChoiceCls() {
    }

    /**
     * Gets the singleton instance of this type.
     * 
     * @return The type, or its supertype if present.
     */
    public static biz.c24.io.api.data.DataType getInstance() {
        if (!initialized)
        {
            synchronized (biz.c24.io.api.data.ComplexDataType.class)
            {
                if (instance == null)
                {
                    instance = new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ClearingSystemIdentification3ChoiceCls();
                    instance.init();
                    initialized = true;
                }
            }
        }
        return instance;
    }

    /**
     * Called internally to initialize this type.
     */
    protected void init() {
        setName("ClearingSystemIdentification3Choice");
        setModel(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Pain00200103DataModel.getInstance());
        setValidObjectClass(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ClearingSystemIdentification3Choice.class);
        setContentModel(biz.c24.io.api.data.ContentModelEnum.SEQUENCE);
        biz.c24.io.api.data.Element element = null;
        addElementDecl(element = new biz.c24.io.api.data.Element("ClearingSystemIdentification3Choice-SG1", 1, 1, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ClearingSystemIdentification3ChoiceCls.ClearingSystemIdentification3ChoiceSG1Cls.class, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Pain00200103DataModel.getInstance()));
        element.setGroup(true);
        element.setIgnoredElement(false);
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

    /**
     * Class ClearingSystemIdentification3ChoiceSG1Cls.The
     * ClearingSystemIdentification3Choice-SG1 complex data type.
     * 
     * 
     * <br><strong>Produced by C24 Integration Objects
     * (http://www.c24.biz)</br>
     * 
     * 
     * @author C24 Integration Objects;
     * @version $Revision$ $Date$
     * @see
     * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ClearingSystemIdentification3Choice.ClearingSystemIdentification3ChoiceSG1
     */
    public static class ClearingSystemIdentification3ChoiceSG1Cls extends biz.c24.io.api.data.ComplexDataType {

        /**
         * Field instance.
         */
        protected static volatile iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ClearingSystemIdentification3ChoiceCls.ClearingSystemIdentification3ChoiceSG1Cls instance;

        /**
         * Field initialized.
         */
        private static volatile boolean initialized;

        protected ClearingSystemIdentification3ChoiceSG1Cls() {
        }

        /**
         * Gets the singleton instance of this type.
         * 
         * @return The type, or its supertype if present.
         */
        public static biz.c24.io.api.data.DataType getInstance() {
            if (!initialized)
            {
                synchronized (biz.c24.io.api.data.ComplexDataType.class)
                {
                    if (instance == null)
                    {
                        instance = new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ClearingSystemIdentification3ChoiceCls.ClearingSystemIdentification3ChoiceSG1Cls();
                        instance.init();
                        initialized = true;
                    }
                }
            }
            return instance;
        }

        /**
         * Called internally to initialize this type.
         */
        protected void init() {
            setName("ClearingSystemIdentification3ChoiceSG1");
            setModel(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Pain00200103DataModel.getInstance());
            setOriginalName("ClearingSystemIdentification3Choice-SG1");
            setDatabaseColumnName("ClearingSystemIdentification3Choice-SG1");
            setLocal(true);
            setValidObjectClass(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ClearingSystemIdentification3Choice.ClearingSystemIdentification3ChoiceSG1.class);
            setElementGroup(true);
            setContentModel(biz.c24.io.api.data.ContentModelEnum.CHOICE);
            biz.c24.io.api.data.Element element = null;
            addElementDecl(element = new biz.c24.io.api.data.Element("Cd", 1, 1, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ExternalCashClearingSystem1CodeCls.class, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Pain00200103DataModel.getInstance()));
            element.setIgnoredElement(false);
            addElementDecl(element = new biz.c24.io.api.data.Element("Prtry", 1, 1, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Max35TextCls.class, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Pain00200103DataModel.getInstance()));
            element.setIgnoredElement(false);
        }

        /**
         */
        private java.lang.Object readResolve() {
            return getInstance();
        }

    }

}
